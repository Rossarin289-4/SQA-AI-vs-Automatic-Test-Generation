package edu.kku.sqa;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class OpenRouterService {
    private final ObjectMapper mapper;
    private final AtomicReference<String> apiKey;
    private final String endpoint;
    private final String batchEndpoint;
    private final Path keyFile;
    private final String systemInstruction;
    /** Recorded with every run: no temperature/top_p is sent, so each model runs at its provider's recommended sampling. */
    public static final String SAMPLING = "model default (temperature not sent; provider or local-server recommended values)";

    public OpenRouterService(ObjectMapper mapper,
            @Value("${openrouter.api-key:}") String apiKey,
            @Value("${openrouter.endpoint:https://openrouter.ai/api/v1/chat/completions}") String endpoint,
            @Value("${openrouter.key-file:config/openrouter-api-key}") String keyFile,
            @Value("${openrouter.batch-endpoint:https://openrouter.ai/api/v1/batches}") String batchEndpoint,
            @Value("${bench.skill-template:prompts/TestGeneration_Skill.md}") String skillTemplate) {
        this.mapper = mapper;
        this.keyFile = Paths.get(keyFile).toAbsolutePath().normalize();
        this.apiKey = new AtomicReference<>(loadApiKey(apiKey));
        this.endpoint = endpoint;
        this.batchEndpoint = batchEndpoint;
        this.systemInstruction = loadSystemInstruction(skillTemplate);
    }

    public boolean isConfigured() {
        String key = apiKey.get();
        return key != null && !key.isBlank();
    }

    String apiKeyForInternalUse() { return apiKey.get() == null ? "" : apiKey.get(); }

    public String getSystemInstruction() { return systemInstruction; }

    public void saveApiKey(String key) throws IOException {
        String normalized = key == null ? "" : key.trim();
        if (normalized.isBlank()) throw new IllegalArgumentException("กรุณากรอก OpenRouter API key");
        Path parent = keyFile.getParent();
        if (parent != null) Files.createDirectories(parent);
        Set<PosixFilePermission> ownerOnly = EnumSet.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE);
        try {
            if (Files.exists(keyFile)) Files.setPosixFilePermissions(keyFile, ownerOnly);
            else Files.createFile(keyFile, PosixFilePermissions.asFileAttribute(ownerOnly));
        } catch (UnsupportedOperationException ignored) {
            if (!Files.exists(keyFile)) Files.createFile(keyFile);
        }
        Files.writeString(keyFile, normalized, StandardCharsets.UTF_8);
        apiKey.set(normalized);
    }

    public void clearApiKey() throws IOException {
        Files.deleteIfExists(keyFile);
        apiKey.set("");
    }

    private String loadApiKey(String environmentKey) {
        try {
            if (Files.isRegularFile(keyFile)) {
                String saved = Files.readString(keyFile, StandardCharsets.UTF_8).trim();
                if (!saved.isEmpty()) return saved;
            }
        } catch (IOException ignored) {
            // Fall back to the configured environment variable if the saved key is unreadable.
        }
        return environmentKey == null ? "" : environmentKey.trim();
    }

    private String loadSystemInstruction(String skillTemplate) {
        try {
            return Files.readString(Paths.get(skillTemplate).toAbsolutePath().normalize(), StandardCharsets.UTF_8).trim();
        } catch (IOException e) {
            return "Follow the user's test-generation instructions. Be concise, use only the supplied buggy source and public API, and never claim unexecuted results.";
        }
    }

    public ModelResult generate(String model, String prompt, int maxTokens) {
        return generate(model, prompt, maxTokens, apiKey.get());
    }

    public ModelResult generate(String model, String prompt, int maxTokens, String providerApiKey) {
        return generate(model, prompt, maxTokens, providerApiKey, "medium");
    }

    public ModelResult generate(String model, String prompt, int maxTokens, String providerApiKey, String reasoningEffort) {
        String currentApiKey = providerApiKey;
        if (currentApiKey == null || currentApiKey.trim().isEmpty()) {
            throw new IllegalStateException("ตั้งค่า OPENROUTER_API_KEY ก่อนเริ่มสร้าง test");
        }
        if (model == null || model.trim().isEmpty()) throw new IllegalArgumentException("กรุณาระบุ OpenRouter model ID");
        Instant started = Instant.now();
        String effort = reasoningEffort == null || reasoningEffort.isBlank() ? "medium" : reasoningEffort;
        if (isBatchModel(model)) return generateBatch(model, prompt, maxTokens, started, currentApiKey, effort);
        Map<String, Object> request = new LinkedHashMap<>();
        request.put("model", model.trim());
        // No temperature: each model uses its provider's recommended default sampling (see SAMPLING).
        if (maxTokens > 0) request.put("max_tokens", maxTokens);
        request.put("stream", false);
        if (!"default".equalsIgnoreCase(effort)) request.put("reasoning", reasoningParameter(effort));
        request.put("messages", messages(prompt, true));
        // Follow-up rounds of a run start with the same composed prompt: a stable key routes them to the same cache so the
        // provider charges the repeated prefix at its cached price (OpenAI prompt_cache_key; also sent as the user id).
        String cacheKey = promptCacheKey(prompt);
        request.put("prompt_cache_key", cacheKey);
        request.put("user", cacheKey);

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(currentApiKey.trim());
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-OpenRouter-Title", "SQA Defects4J Test Bench");
        RestTemplate http = createHttpClient(240000);
        try {
            String body = mapper.writeValueAsString(request);
            String responseText = http.postForObject(endpoint, new HttpEntity<>(body, headers), String.class);
            JsonNode response = mapper.readTree(responseText);
            // OpenRouter can answer HTTP 200 with finish_reason "error" and a partial (or empty) message when the upstream
            // provider failed mid-request (e.g. a 429 rate limit). That is a failed call, not an answer to evaluate.
            JsonNode choiceError = response.path("choices").path(0).path("error");
            if ("error".equals(response.path("choices").path(0).path("finish_reason").asText("")) || !choiceError.isMissingNode()) {
                throw new IllegalStateException("OpenRouter provider error HTTP " + choiceError.path("code").asText("?") + ": "
                        + safeMessage(choiceError.path("message").asText("upstream provider failed (finish_reason=error)")));
            }
            JsonNode message = response.path("choices").path(0).path("message");
            String content = responseText(message.path("content"));
            if (content.isBlank()) {
                String finishReason = response.path("choices").path(0).path("finish_reason").asText("unknown");
                int completionTokens = response.path("usage").path("completion_tokens").asInt(-1);
                List<String> fieldNames = new ArrayList<>();
                if (message.isObject()) message.fieldNames().forEachRemaining(fieldNames::add);
                String fields = fieldNames.isEmpty() ? "none" : String.join(",", fieldNames);
                throw new IllegalStateException("OpenRouter ตอบกลับแต่ไม่มีข้อความสำหรับแสดง (finish_reason="
                        + finishReason + ", completion_tokens=" + completionTokens + ", message_fields=" + fields + ")");
            }
            return new ModelResult(model, response.path("model").asText(model),
                    response.path("id").asText(""), content, response,
                    response.path("usage").path("prompt_tokens").asInt(-1),
                    response.path("usage").path("completion_tokens").asInt(-1),
                    response.path("usage").path("cost").asDouble(Double.NaN),
                    Duration.between(started, Instant.now()).toMillis(), false, "");
        } catch (HttpStatusCodeException e) {
            throw new IllegalStateException("OpenRouter HTTP " + e.getStatusCode().value() + ": " + safeMessage(e.getResponseBodyAsString()), e);
        } catch (Exception e) {
            if (e instanceof IllegalStateException) throw (IllegalStateException) e;
            throw new IllegalStateException("เรียก OpenRouter ไม่สำเร็จ: " + e.getMessage(), e);
        }
    }

    private String responseText(JsonNode content) {
        if (content == null || content.isNull()) return "";
        if (content.isTextual()) return content.asText();
        if (content.isArray()) {
            StringBuilder text = new StringBuilder();
            for (JsonNode part : content) {
                if (part.isTextual()) text.append(part.asText());
                else if (part.hasNonNull("text")) text.append(part.path("text").asText());
            }
            return text.toString();
        }
        return "";
    }

    public ModelResult testConnection(String model) {
        return testConnection(model, apiKey.get());
    }

    public ModelResult testConnection(String model, String providerApiKey) {
        if (isBatchModel(model)) {
            Instant started = Instant.now();
            JsonNode response = submitBatch(model, "Reply with OK only.", 16, false, providerApiKey);
            String batchId = response.path("id").asText("");
            if (batchId.isBlank()) throw new IllegalStateException("OpenRouter รับ batch ทดสอบโดยไม่มี batch ID");
            return new ModelResult(model, baseModel(model), batchId, "", response, -1, -1,
                    Double.NaN, Duration.between(started, Instant.now()).toMillis(), true, batchId);
        }
        return generate(model, "Reply with OK only.", 16, providerApiKey);
    }

    /** OpenRouter's reasoning object: "none" turns thinking off ({"enabled": false}); low/medium/high set the effort. */
    static Map<String, Object> reasoningParameter(String effort) {
        return "none".equalsIgnoreCase(effort) ? Map.of("enabled", false) : Map.of("effort", effort);
    }

    /** "tb-" + hash of the first 4000 characters of the prompt: identical for every round of one run and model. */
    static String promptCacheKey(String prompt) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
            byte[] h = md.digest(prompt.substring(0, Math.min(4000, prompt.length())).getBytes(java.nio.charset.StandardCharsets.UTF_8));
            StringBuilder b = new StringBuilder("tb-");
            for (int i = 0; i < 8; i++) b.append(String.format("%02x", h[i]));
            return b.toString();
        } catch (Exception e) { return "tb-default"; }
    }

    public boolean isBatchModel(String model) {
        return model != null && model.trim().toLowerCase(java.util.Locale.ROOT).endsWith(":batch");
    }

    /** Receives batch progress lines ("accepted", "status changed") from the thread that runs a batch call; set by the caller. */
    public static final ThreadLocal<java.util.function.Consumer<String>> BATCH_PROGRESS = new ThreadLocal<>();

    private static void batchProgress(String message) {
        java.util.function.Consumer<String> sink = BATCH_PROGRESS.get();
        if (sink != null) { try { sink.accept(message); } catch (RuntimeException ignored) { } }
    }

    private static String batchStateText(JsonNode batch) {
        String text = batch.path("status").asText("?");
        JsonNode counts = batch.path("request_counts");
        if (counts.isObject()) text += " · เสร็จ " + counts.path("completed").asInt(0) + "/" + counts.path("total").asInt(0)
                + (counts.path("failed").asInt(0) > 0 ? " · ล้มเหลว " + counts.path("failed").asInt(0) : "");
        return text;
    }

    private ModelResult generateBatch(String model, String prompt, int maxTokens, Instant started, String providerApiKey, String reasoningEffort) {
        String batchId = "";
        try {
            JsonNode created = submitBatch(model, prompt, maxTokens, true, providerApiKey, reasoningEffort);
            batchId = created.path("id").asText("");
            if (batchId.isBlank()) throw new IllegalStateException("OpenRouter รับ batch โดยไม่มี batch ID");
            batchProgress("ส่ง batch สำเร็จ ผู้ให้บริการรับงานแล้ว (สถานะ: " + batchStateText(created) + ") · ระบบตรวจสถานะทุก 10 วินาที");
            String lastState = "";
            Instant deadline = Instant.now().plus(Duration.ofHours(25));
            Instant notFoundUntil = Instant.now().plus(NEW_BATCH_NOT_FOUND_GRACE);
            int transientFailures = 0;
            JsonNode batch;
            String status;
            while (true) {
                if (Thread.currentThread().isInterrupted()) throw new IllegalStateException("การรอ batch ถูกยกเลิก");
                try {
                    batch = getBatch(batchId, providerApiKey);
                    transientFailures = 0;
                } catch (BatchStatusException e) {
                    // A just-accepted batch may not be visible to the status endpoint yet, and 429/5xx/network errors are
                    // temporary: keep polling instead of losing a batch that OpenRouter already accepted (and may bill).
                    if (e.statusCode == 404 && Instant.now().isBefore(notFoundUntil)) { Thread.sleep(5000L); continue; }
                    if (e.statusCode == 404) throw new IllegalStateException("OpenRouter ไม่พบ batch นี้แม้รอ "
                            + NEW_BATCH_NOT_FOUND_GRACE.toMinutes() + " นาทีหลังสร้าง (batch ID: " + batchId
                            + ") · คำขอถูกรับแล้ว งานอาจยังอยู่ที่ OpenRouter ตรวจที่หน้า Batches ของบัญชี/workspace เดียวกับ API key นี้ · " + e.getMessage(), e);
                    if ((e.statusCode == 429 || e.statusCode >= 500 || e.statusCode < 0) && ++transientFailures <= 12) { Thread.sleep(15000L); continue; }
                    throw e;
                }
                status = batch.path("status").asText("");
                String state = batchStateText(batch);
                if (!state.equals(lastState)) { batchProgress("สถานะ batch: " + state); lastState = state; }
                if ("completed".equals(status) || "failed".equals(status) || "expired".equals(status) || "cancelled".equals(status)) break;
                if (Instant.now().isAfter(deadline)) throw new IllegalStateException("Batch ยังไม่เสร็จภายใน 25 ชั่วโมง (batch ID: " + batchId + ")");
                Thread.sleep(10000L);
            }
            if (!"completed".equals(status)) {
                throw new IllegalStateException("OpenRouter batch " + status + ": " + batch.path("error").toString());
            }
            JsonNode item = batch.path("results").path(0);
            if (!item.path("error").isMissingNode() && !item.path("error").isNull()) {
                throw new IllegalStateException("Batch request ล้มเหลว: " + item.path("error").toString());
            }
            JsonNode response = item.path("response");
            int statusCode = response.path("status_code").asInt(200);
            if (statusCode < 200 || statusCode >= 300) {
                throw new IllegalStateException("Batch request HTTP " + statusCode + ": " + response.path("body").toString());
            }
            JsonNode body = response.path("body");
            String content = body.path("choices").path(0).path("message").path("content").asText("");
            if (content.isBlank()) throw new IllegalStateException("Batch สำเร็จแต่ไม่มีเนื้อหา");
            JsonNode usage = body.path("usage").isMissingNode() || body.path("usage").isNull()
                    ? batch.path("usage") : body.path("usage");
            String normalizedModel = model.trim();
            return new ModelResult(normalizedModel, body.path("model").asText(baseModel(normalizedModel)),
                    body.path("id").asText(response.path("request_id").asText(batchId)), content, body,
                    usage.path("prompt_tokens").asInt(-1), usage.path("completion_tokens").asInt(-1),
                    usage.path("cost").asDouble(Double.NaN), Duration.between(started, Instant.now()).toMillis(), false, batchId);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("การรอ OpenRouter batch ถูกขัดจังหวะ (batch ID: " + batchId + ")", e);
        } catch (HttpStatusCodeException e) {
            throw new IllegalStateException("OpenRouter batch HTTP " + e.getStatusCode().value() + ": " + safeMessage(e.getResponseBodyAsString()), e);
        }
    }

    private JsonNode submitBatch(String model, String prompt, int maxTokens, boolean includeSkill, String providerApiKey) {
        return submitBatch(model, prompt, maxTokens, includeSkill, providerApiKey, "medium");
    }

    private JsonNode submitBatch(String model, String prompt, int maxTokens, boolean includeSkill, String providerApiKey, String reasoningEffort) {
        if (providerApiKey == null || providerApiKey.isBlank()) throw new IllegalStateException("ตั้งค่า OpenRouter API key ก่อนเริ่มสร้าง test");
        String normalizedModel = baseModel(model);
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("endpoint", "/v1/chat/completions");
        body.put("model", normalizedModel);
        Map<String,Object> completion = new LinkedHashMap<>();
        completion.put("messages", messages(prompt, includeSkill));
        if (maxTokens > 0) completion.put("max_tokens", maxTokens);
        completion.put("stream", false);
        if (reasoningEffort != null && !"default".equalsIgnoreCase(reasoningEffort)) completion.put("reasoning", reasoningParameter(reasoningEffort));
        body.put("requests", List.of(Map.of("custom_id", "testbench-" + java.util.UUID.randomUUID(), "body", completion)));
        try {
            String response = createHttpClient(60000).postForObject(batchEndpoint, request(body, providerApiKey), String.class);
            return mapper.readTree(response);
        } catch (HttpStatusCodeException e) {
            throw new IllegalStateException("OpenRouter Batch HTTP " + e.getStatusCode().value() + ": " + safeMessage(e.getResponseBodyAsString()), e);
        } catch (Exception e) {
            if (e instanceof IllegalStateException) throw (IllegalStateException) e;
            throw new IllegalStateException("ส่ง OpenRouter batch ไม่สำเร็จ: " + e.getMessage(), e);
        }
    }

    /** A failed batch status call; statusCode is -1 for network errors. */
    private static final class BatchStatusException extends IllegalStateException {
        final int statusCode;
        BatchStatusException(int statusCode, String message, Throwable cause) { super(message, cause); this.statusCode = statusCode; }
    }
    private static final Duration NEW_BATCH_NOT_FOUND_GRACE = Duration.ofMinutes(3);

    private JsonNode getBatch(String batchId, String providerApiKey) {
        try {
            String url = batchEndpoint.replaceAll("/$", "") + "/" + batchId;
            String response = createHttpClient(30000).exchange(url, HttpMethod.GET, request(null, providerApiKey), String.class).getBody();
            return mapper.readTree(response);
        } catch (HttpStatusCodeException e) {
            throw new BatchStatusException(e.getStatusCode().value(),
                    "OpenRouter batch status HTTP " + e.getStatusCode().value() + ": " + safeMessage(e.getResponseBodyAsString()), e);
        } catch (Exception e) {
            if (e instanceof IllegalStateException) throw (IllegalStateException) e;
            throw new BatchStatusException(-1, "ตรวจสถานะ OpenRouter batch ไม่สำเร็จ: " + e.getMessage(), e);
        }
    }

    private HttpEntity<String> request(Map<String, Object> body, String providerApiKey) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(providerApiKey.trim());
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-OpenRouter-Title", "SQA Defects4J Test Bench");
        return new HttpEntity<>(body == null ? null : mapper.writeValueAsString(body), headers);
    }

    /**
     * Marker between the composed prompt and the text a follow-up round appends to it. The part before it is sent as its own
     * content block with a cache_control breakpoint, so every round of a run reads the provider's cached prefix (measured:
     * the repeated prefix is charged at 25% on OpenAI and Gemini) instead of paying the full input price again.
     */
    public static final String CACHE_BREAK = "\n<<<TESTBENCH-CACHE-BREAK>>>\n";

    /** The prompt as one plain text, for files and providers without content blocks. */
    public static String flatten(String prompt) { return prompt.replace(CACHE_BREAK, "\n\n"); }

    private List<Map<String, Object>> messages(String prompt, boolean includeSkill) {
        int at = prompt.indexOf(CACHE_BREAK);
        String prefix = at < 0 ? prompt : prompt.substring(0, at), suffix = at < 0 ? "" : "\n\n" + prompt.substring(at + CACHE_BREAK.length());
        List<Map<String, Object>> parts = new ArrayList<>();
        parts.add(Map.of("type", "text", "text", prefix, "cache_control", Map.of("type", "ephemeral")));
        if (!suffix.isBlank()) parts.add(Map.of("type", "text", "text", suffix));
        Map<String, Object> user = Map.of("role", "user", "content", parts);
        if (includeSkill && !systemInstruction.isBlank()) return List.of(Map.of("role", "system", "content", systemInstruction), user);
        return List.of(user);
    }

    private RestTemplate createHttpClient(int readTimeout) {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(15000);
        factory.setReadTimeout(readTimeout);
        return new RestTemplate(factory);
    }

    private String baseModel(String model) {
        String trimmed = model.trim();
        return isBatchModel(trimmed) ? trimmed.substring(0, trimmed.length() - ":batch".length()) : trimmed;
    }

    private String safeMessage(String raw) {
        String hint = "ตรวจสอบ API key, model ID และโควตา";
        try {
            String message = mapper.readTree(raw).path("error").path("message").asText("");
            if (!message.isBlank()) return message;
        } catch (Exception ignored) { }
        // The provider's body had no error.message: show what it did send (trimmed) instead of only the generic hint.
        String text = raw == null ? "" : raw.replaceAll("\\s+", " ").trim();
        return text.isEmpty() ? hint + " (provider ไม่ได้ส่งรายละเอียดมา)" : hint + " · provider ตอบ: " + (text.length() > 300 ? text.substring(0, 300) + "…" : text);
    }

    public static final class ModelResult {
        public final String requestedModel, actualModel, generationId, content;
        public final JsonNode rawResponse;
        public final int promptTokens, completionTokens;
        public final double cost;
        public final long elapsedMs;
        public final boolean batchAccepted;
        public final String batchId;
        ModelResult(String requestedModel, String actualModel, String generationId, String content,
                    JsonNode rawResponse, int promptTokens, int completionTokens, double cost, long elapsedMs,
                    boolean batchAccepted, String batchId) {
            this.requestedModel = requestedModel; this.actualModel = actualModel; this.generationId = generationId;
            this.content = content; this.rawResponse = rawResponse; this.promptTokens = promptTokens;
            this.completionTokens = completionTokens; this.cost = cost; this.elapsedMs = elapsedMs;
            this.batchAccepted = batchAccepted;
            this.batchId = batchId;
        }
    }
}
