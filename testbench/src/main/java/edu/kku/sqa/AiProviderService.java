package edu.kku.sqa;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Service
public class AiProviderService {
    private final ObjectMapper mapper;
    private final OpenRouterService openRouter;
    private final Path settingsFile;
    private final List<AiModel> models = new ArrayList<>();
    private final List<String> selectedIds = new ArrayList<>();
    private final String systemInstruction;

    public AiProviderService(ObjectMapper mapper, OpenRouterService openRouter,
            @Value("${bench.ai-settings-file:config/ai-providers.json}") String settingsFile,
            @Value("${bench.skill-template:prompts/TestGeneration_Skill.md}") String skillTemplate) {
        this.mapper = mapper; this.openRouter = openRouter;
        this.settingsFile = Paths.get(settingsFile).toAbsolutePath().normalize();
        String skill;
        try { skill = Files.readString(Paths.get(skillTemplate).toAbsolutePath().normalize(), StandardCharsets.UTF_8).trim(); }
        catch (IOException e) { skill = "Use only supplied buggy source and public API. Never claim unexecuted results."; }
        this.systemInstruction = skill;
        load();
    }

    public synchronized List<AiModel> selected() {
        List<AiModel> result = new ArrayList<>();
        for (String id : selectedIds) { AiModel item = find(id); if (item != null) result.add(item.copy()); }
        return result;
    }
    public synchronized List<Map<String,Object>> safeList() {
        List<Map<String,Object>> result = new ArrayList<>();
        for (AiModel item : models) result.add(item.safeMap(selectedIds.contains(item.id),hasKey(item)));
        return result;
    }
    public synchronized boolean isReady() {
        if(selectedIds.isEmpty())return false;
        for (String id : selectedIds) { AiModel item = find(id); if (item == null || !hasKey(item)) return false; }
        return true;
    }
    /** True when any selected AI is not a local server, i.e. a request may cost money. */
    public synchronized boolean hasCloudSelected() {
        for (String id : selectedIds) if (!isLocalModel(id)) return true;
        return false;
    }
    public synchronized boolean isBatch(String id){AiModel m=find(id);return m==null?openRouter.isBatchModel(id):"openrouter".equals(m.provider)&&openRouter.isBatchModel(m.model);}
    public synchronized boolean isLocalModel(String id) {
        AiModel model = find(id);
        if (model == null || !"other".equals(model.provider)) return false;
        String address = model.address == null ? "" : model.address.toLowerCase(java.util.Locale.ROOT);
        return address.matches("https?://(localhost|host\\.docker\\.internal|127\\.0\\.0\\.1|\\[::1\\]|172\\.(1[6-9]|2[0-9]|3[01])\\.[0-9]+\\.[0-9]+|10\\.[0-9]+\\.[0-9]+\\.[0-9]+|192\\.168\\.[0-9]+\\.[0-9]+)(:[0-9]+)?(/.*)?");
    }
    /** The name the user gave this AI in Settings (falls back to the raw id for legacy OpenRouter model ids). */
    public synchronized String displayName(String id){AiModel m=find(id);return m==null||m.name==null||m.name.isBlank()?id:m.name;}
    public synchronized String label(String id){AiModel m=find(id);return m==null?"OpenRouter · "+id:m.name+" · "+m.provider+"/"+m.model;}
    public synchronized boolean isConfigured(String id){AiModel m=find(id);return m==null?openRouter.isConfigured():hasKey(m);}
    public synchronized boolean isBatchSelected() {
        for (AiModel item : selected()) if (item.provider.equals("openrouter") && openRouter.isBatchModel(item.model)) return true;
        return false;
    }
    public synchronized List<String> selectedModelIds() {
        List<String> result = new ArrayList<>(); for (AiModel item : selected()) result.add(item.id); return result;
    }

    public synchronized String save(String id, String provider, String address, String apiKey, String model,
            String name, String inputPrice, String cachedPrice, String outputPrice, String reasoningEffort) throws IOException {
        String type = normalizeProvider(provider);
        String normalizedModel = required(model, "กรุณาระบุ Model ID");
        String displayName = required(name, "กรุณาระบุชื่อที่ใช้แสดง");
        String baseUrl = normalizeAddress(address, type);
        AiModel existing = id == null || id.isBlank() ? null : find(id);
        boolean noNewKey = apiKey == null || apiKey.isBlank();
        boolean noStoredKey = existing == null || existing.apiKey == null || existing.apiKey.isBlank();
        // A blank key reuses the one already saved for the same provider and address (never another host's key).
        String reused = noNewKey && noStoredKey ? reusableKey(id, type, baseUrl) : "";
        // Only a legacy OpenRouter model may rely on the global OpenRouter key; any other provider/address needs its own key,
        // otherwise the OpenRouter key would be sent to an arbitrary host.
        if (noNewKey && noStoredKey && reused.isBlank() && !("openrouter".equals(type) && existing != null))
            throw new IllegalArgumentException("กรุณากรอก API key สำหรับ provider นี้ (ยังไม่มี key ที่บันทึกไว้ของ provider/address เดียวกันให้ใช้ซ้ำ)");
        AiModel item = new AiModel(); item.id = existing == null ? UUID.randomUUID().toString() : existing.id;
        item.provider = type; item.address = baseUrl; item.apiKey = apiKey == null || apiKey.isBlank()
                ? (noStoredKey ? reused : existing.apiKey) : apiKey.trim();
        item.model = normalizedModel; item.name = displayName;
        item.reasoningEffort = normalizeReasoningEffort(reasoningEffort);
        item.inputPrice = price(inputPrice); item.cachedInputPrice = price(cachedPrice); item.outputPrice = price(outputPrice);
        if (existing == null) { models.add(item); selectedIds.add(item.id); }
        else { models.set(models.indexOf(existing), item); }
        persist(); return item.id;
    }

    public synchronized void setSelected(List<String> ids) throws IOException {
        LinkedHashSet<String> next = new LinkedHashSet<>();
        if (ids != null) for (String id : ids) if (find(id) != null) next.add(id);
        selectedIds.clear(); selectedIds.addAll(next); persist();
    }
    public synchronized void remove(String id) throws IOException {
        models.removeIf(item -> item.id.equals(id)); selectedIds.removeIf(item -> item.equals(id)); persist();
    }

    public List<Map<String,Object>> listModels(String provider, String address, String apiKey) {
        String type = normalizeProvider(provider);
        String base = normalizeAddress(address, type);
        String key = required(apiKey == null || apiKey.isBlank() ? reusableKey("", type, base) : apiKey, "กรุณากรอก API key ก่อนโหลด models (หรือบันทึก AI ของ provider นี้ไว้ก่อนเพื่อใช้ key ซ้ำ)");
        try {
            String url = base + ("anthropic".equals(type) ? "/models?limit=1000" : "/models");
            JsonNode json = rest(30000).exchange(url, org.springframework.http.HttpMethod.GET,
                    new HttpEntity<String>(requestHeaders(type,key)), JsonNode.class).getBody();
            JsonNode data = json == null ? mapper.createArrayNode() : json.path("data");
            List<Map<String,Object>> result = new ArrayList<>();
            for (JsonNode node : data) {
                String modelId = node.path("id").asText(""); if (modelId.isBlank()) continue;
                Map<String,Object> row = new LinkedHashMap<>(); row.put("id", modelId); row.put("name", node.path("name").asText(modelId));
                JsonNode pricing = node.path("pricing");
                row.put("inputPrice", perMillion(pricing.path("prompt").asText("")));
                row.put("cachedInputPrice", perMillion(pricing.path("input_cache_read").asText("")));
                row.put("outputPrice", perMillion(pricing.path("completion").asText("")));
                result.add(row);
            }
            return result;
        } catch (Exception e) { throw providerError(type, e); }
    }

    /**
     * The API key a blank key field stands for: the key of the saved AI being edited, else of another saved AI with the same
     * provider and address. Never a key of a different host, so a key is not sent anywhere the user did not enter it for.
     */
    private synchronized String reusableKey(String id, String type, String baseUrl) {
        AiModel editing = id == null || id.isBlank() ? null : find(id);
        if (editing != null && type.equals(editing.provider) && baseUrl.equals(editing.address)
                && editing.apiKey != null && !editing.apiKey.isBlank()) return editing.apiKey;
        for (AiModel other : models)
            if (type.equals(other.provider) && baseUrl.equals(other.address) && other.apiKey != null && !other.apiKey.isBlank()) return other.apiKey;
        return "";
    }

    /** True when the saved AI with this id already uses exactly this model id (so a test of the saved entry is the same test). */
    public synchronized boolean sameModel(String id, String model) {
        AiModel found = id == null || id.isBlank() ? null : find(id);
        return found != null && found.model != null && found.model.equals(model == null ? "" : model.trim());
    }

    public ProviderResult test(String provider, String address, String apiKey, String model, String inputPrice, String outputPrice, String reasoningEffort) {
        return test("", provider, address, apiKey, model, inputPrice, outputPrice, reasoningEffort);
    }

    public ProviderResult test(String id, String provider, String address, String apiKey, String model, String inputPrice, String outputPrice, String reasoningEffort) {
        AiModel temporary = new AiModel(); temporary.provider = normalizeProvider(provider);
        temporary.address = normalizeAddress(address, temporary.provider);
        temporary.apiKey = required(apiKey == null || apiKey.isBlank() ? reusableKey(id, temporary.provider, temporary.address) : apiKey,
                "กรุณากรอก API key (หรือบันทึก AI ของ provider นี้ไว้ก่อนเพื่อใช้ key ซ้ำ)");
        temporary.model = required(model, "กรุณาระบุ Model ID"); temporary.inputPrice = price(inputPrice); temporary.outputPrice = price(outputPrice);
        temporary.reasoningEffort = normalizeReasoningEffort(reasoningEffort);
        return testCall(temporary);
    }
    public ProviderResult test(String id){
        AiModel model;
        synchronized (this) { AiModel found = find(id); if (found == null) return generate(id,"Reply with OK only.",256); model = found.copy(); }
        return testCall(model);
    }

    /**
     * A batch model is only checked up to "the provider accepted the batch": waiting for its result (minutes to hours)
     * would leave the Settings page stuck on "testing". Other models get a real 256-token call, which leaves enough output
     * budget for models that spend part of max_tokens on reasoning.
     */
    private ProviderResult testCall(AiModel model) {
        if ("openrouter".equals(model.provider) && openRouter.isBatchModel(model.model)) {
            boolean ownKey = model.apiKey != null && !model.apiKey.isBlank();
            String key = ownKey ? model.apiKey
                    : AiProviderService.defaultAddress("openrouter").equals(model.address) ? openRouter.apiKeyForInternalUse() : "";
            if (key == null || key.isBlank()) throw new IllegalStateException("ยังไม่ได้ตั้ง API key สำหรับ " + model.name);
            OpenRouterService.ModelResult accepted = openRouter.testConnection(model.model, key);
            return new ProviderResult(model.model, accepted.actualModel, accepted.generationId, "", accepted.rawResponse,
                    -1, -1, 0.0, accepted.elapsedMs, true, accepted.batchId, -1);
        }
        return generate(model, "Reply with OK only.", 256);
    }

    public ProviderResult generate(String id, String prompt, int maxTokens) {
        AiModel model;
        synchronized (this) { AiModel found = find(id); if (found == null) {model=new AiModel();model.id=id;model.provider="openrouter";model.address=defaultAddress("openrouter");model.model=id;model.name="OpenRouter · "+id;}
            else model = found.copy(); }
        return generate(model, prompt, maxTokens);
    }

    private ProviderResult generate(AiModel model, String prompt, int maxTokens) {
        boolean ownKey = model.apiKey != null && !model.apiKey.isBlank();
        String key = ownKey ? model.apiKey
                : "openrouter".equals(model.provider) && AiProviderService.defaultAddress("openrouter").equals(model.address)
                        ? openRouter.apiKeyForInternalUse() : "";
        if (key == null || key.isBlank()) throw new IllegalStateException("ยังไม่ได้ตั้ง API key สำหรับ " + model.name);
        if ("openrouter".equals(model.provider)) {
            final String routerKey = key;
            OpenRouterService.ModelResult result = openRouter.isBatchModel(model.model)
                    ? openRouter.generate(model.model, prompt, maxTokens, routerKey, model.reasoningEffort)
                    : withTransientRetry(() -> openRouter.generate(model.model, prompt, maxTokens, routerKey, model.reasoningEffort));
            int cachedTokens = cachedTokens(result.rawResponse == null ? null : result.rawResponse.path("usage"));
            if (cachedTokens < 0) cachedTokens = cachedTokens(result.rawResponse);
            double cost = Double.isNaN(result.cost) ? estimate(result.promptTokens, result.completionTokens, cachedTokens,
                    model.inputPrice, model.cachedInputPrice, model.outputPrice) : result.cost;
            return new ProviderResult(model.model, result.actualModel, result.generationId, result.content, result.rawResponse,
                    result.promptTokens, result.completionTokens, cost, result.elapsedMs, result.batchAccepted,result.batchId, cachedTokens);
        }
        Instant started = Instant.now();
        try {
            Map<String,Object> body = new LinkedHashMap<>(); body.put("model", model.model);
            Map<String,Object> user = Map.of("role", "user", "content", OpenRouterService.flatten(prompt));
            String content; JsonNode usage; String actual; String generation;
            if ("anthropic".equals(model.provider)) {
                // Anthropic requires max_tokens; use an API-compatible fallback when the UI
                // leaves output length to the provider/model.
                body.put("max_tokens", maxTokens > 0 ? maxTokens : 8192);
                if (!"default".equals(model.reasoningEffort) && !"none".equals(model.reasoningEffort)) {   // "none": no thinking block at all
                    body.put("thinking", Map.of("type", "adaptive"));
                    body.put("output_config", Map.of("effort", model.reasoningEffort));
                }
                body.put("system", systemInstruction); body.put("messages", List.of(user));
                JsonNode response = postJson(model.address + "/messages", body, requestHeaders(model.provider,key), 240000);
                JsonNode blocks = response == null ? mapper.createArrayNode() : response.path("content");
                StringBuilder text = new StringBuilder(); for (JsonNode block : blocks) if ("text".equals(block.path("type").asText())) text.append(block.path("text").asText(""));
                JsonNode safe = response == null ? mapper.createObjectNode() : response;
                content = text.toString(); usage = safe.path("usage"); actual = safe.path("model").asText(model.model); generation = safe.path("id").asText("");
            } else {
                if (maxTokens > 0) body.put("max_tokens", maxTokens);
                // Local OpenAI-compatible servers such as llama.cpp do not necessarily
                // implement the provider-specific reasoning_effort extension.
                if (!"other".equals(model.provider) && !"default".equals(model.reasoningEffort))
                    body.put("reasoning_effort", model.reasoningEffort);
                // No temperature: the model's recommended sampling applies (provider default, or the local server's preset).
                body.put("stream", "other".equals(model.provider));
                // Without include_usage an OpenAI-compatible server sends no token counts while streaming.
                if ("other".equals(model.provider)) body.put("stream_options", Map.of("include_usage", true));
                body.put("messages", List.of(Map.of("role","system","content",systemInstruction), user));
                if ("openai".equals(model.provider)) { String cacheKey = OpenRouterService.promptCacheKey(prompt); body.put("prompt_cache_key", cacheKey); body.put("user", cacheKey); }
                JsonNode response;
                if ("other".equals(model.provider)) {
                    response = streamChatCompletion(model.address + "/chat/completions", mapper.writeValueAsString(body), requestHeaders(model.provider,key));
                } else {
                    response = postJson(model.address + "/chat/completions", body, requestHeaders(model.provider,key), 240000);
                }
                JsonNode safe = response == null ? mapper.createObjectNode() : response;
                content = responseText(safe.path("choices").path(0).path("message").path("content"));
                usage = safe.path("usage"); actual = safe.path("model").asText(model.model); generation = safe.path("id").asText("");
            }
            if (content.isBlank()) throw new IllegalStateException(model.provider + " ตอบกลับโดยไม่มีเนื้อหา");
            int input = usage.path("prompt_tokens").asInt(usage.path("input_tokens").asInt(-1));
            int output = usage.path("completion_tokens").asInt(usage.path("output_tokens").asInt(-1));
            double cost = usage.path("cost").asDouble(Double.NaN);
            int cachedTokens = cachedTokens(usage);
            if (Double.isNaN(cost)) cost = estimate(input, output, cachedTokens, model.inputPrice, model.cachedInputPrice, model.outputPrice);
            return new ProviderResult(model.model, actual, generation, content, usage, input, output, cost,
                    Duration.between(started, Instant.now()).toMillis(), false,"", cachedTokens);
        } catch (Exception e) { throw providerError(model.provider, e); }
    }

    /**
     * POST with automatic recovery: a parameter the model rejects (reasoning_effort, temperature, thinking, stream_options,
     * max_tokens vs max_completion_tokens) is dropped or renamed and the call repeated; 429/5xx are retried after a pause.
     */
    private JsonNode postJson(String url, Map<String,Object> body, HttpHeaders headers, int timeoutMs) throws Exception {
        int transientRetries = 0;
        for (int attempt = 0; attempt < 7; attempt++) {
            try {
                return rest(timeoutMs).postForObject(url, new HttpEntity<>(mapper.writeValueAsString(body), headers), JsonNode.class);
            } catch (HttpStatusCodeException e) {
                int status = e.getStatusCode().value();
                String detail = String.valueOf(e.getResponseBodyAsString()).toLowerCase(java.util.Locale.ROOT);
                if ((status == 400 || status == 422) && adjustRejectedParameters(body, detail)) continue;
                if ((status == 429 || status >= 500) && transientRetries < 2) { transientRetries++; Thread.sleep(transientRetries * 4000L); continue; }
                throw e;
            }
        }
        throw new IllegalStateException("provider ปฏิเสธคำขอซ้ำหลายรอบหลังปรับพารามิเตอร์แล้ว");
    }

    private static boolean adjustRejectedParameters(Map<String,Object> body, String detail) {
        if (detail.contains("max_tokens") && detail.contains("max_completion_tokens") && body.containsKey("max_tokens")) {
            body.put("max_completion_tokens", body.remove("max_tokens")); return true;
        }
        if (detail.contains("reasoning_effort") && body.remove("reasoning_effort") != null) return true;
        if (detail.contains("thinking") && body.remove("thinking") != null) { body.remove("output_config"); return true; }
        if (detail.contains("output_config") && body.remove("output_config") != null) return true;
        if (detail.contains("temperature") && body.remove("temperature") != null) return true;
        if (detail.contains("stream_options") && body.remove("stream_options") != null) return true;
        return false;
    }

    /** Retries a provider call (up to 4 attempts, 10/20/30 s apart) when it failed with a rate limit or a server error. */
    private <T> T withTransientRetry(java.util.function.Supplier<T> call) {
        RuntimeException last = null;
        for (int attempt = 0; attempt < 4; attempt++) {
            try { return call.get(); }
            catch (RuntimeException e) {
                last = e;
                String message = String.valueOf(e.getMessage());
                boolean transientFailure = message.contains("429") || message.contains("HTTP 5") || message.contains("timed out");
                if (!transientFailure || attempt == 3) throw e;
                try { Thread.sleep((attempt + 1) * 10000L); } catch (InterruptedException interrupted) { Thread.currentThread().interrupt(); throw e; }
            }
        }
        throw last;
    }

    private JsonNode streamChatCompletion(String url, String body, HttpHeaders headers) throws IOException {
        return rest(600000).execute(url, org.springframework.http.HttpMethod.POST,
                request -> {
                    request.getHeaders().putAll(headers);
                    request.getBody().write(body.getBytes(StandardCharsets.UTF_8));
                }, response -> {
                    com.fasterxml.jackson.databind.node.ObjectNode result = mapper.createObjectNode();
                    com.fasterxml.jackson.databind.node.ObjectNode usage = mapper.createObjectNode();
                    StringBuilder content = new StringBuilder();
                    JsonNode timings = null;
                    String finishReason = "";
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(response.getBody(), StandardCharsets.UTF_8))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            if (!line.startsWith("data:")) continue;
                            String data = line.substring(5).trim();
                            if (data.isEmpty() || "[DONE]".equals(data)) continue;
                            JsonNode chunk = mapper.readTree(data);
                            if (result.path("id").isMissingNode() && chunk.hasNonNull("id")) result.set("id", chunk.path("id"));
                            if (result.path("model").isMissingNode() && chunk.hasNonNull("model")) result.set("model", chunk.path("model"));
                            if (chunk.hasNonNull("usage")) usage.setAll((com.fasterxml.jackson.databind.node.ObjectNode) chunk.path("usage"));
                            if (chunk.hasNonNull("timings")) timings = chunk.path("timings");   // llama.cpp reports counts here
                            JsonNode choice = chunk.path("choices").path(0);
                            JsonNode deltaContent = choice.path("delta").path("content");
                            if (deltaContent.isMissingNode()) deltaContent = choice.path("text");
                            content.append(responseText(deltaContent));
                            if (choice.hasNonNull("finish_reason")) finishReason = choice.path("finish_reason").asText();
                        }
                    }
                    if (!usage.has("prompt_tokens") && timings != null && timings.has("prompt_n")) {
                        usage.put("prompt_tokens", timings.path("prompt_n").asInt(-1) + timings.path("cache_n").asInt(0));
                        usage.put("completion_tokens", timings.path("predicted_n").asInt(-1));
                        if (timings.has("cache_n")) usage.put("cached_tokens", timings.path("cache_n").asInt(0));
                    }
                    com.fasterxml.jackson.databind.node.ObjectNode message = mapper.createObjectNode();
                    message.put("content", content.toString());
                    com.fasterxml.jackson.databind.node.ObjectNode choice = mapper.createObjectNode();
                    choice.set("message", message);
                    if (!finishReason.isEmpty()) choice.put("finish_reason", finishReason);
                    result.set("choices", mapper.createArrayNode().add(choice));
                    result.set("usage", usage);
                    return result;
                });
    }

    private String responseText(JsonNode value) {
        if (value == null || value.isNull()) return "";
        if (value.isTextual()) return value.asText();
        if (value.isArray()) {
            StringBuilder text = new StringBuilder();
            for (JsonNode part : value) {
                if (part.isTextual()) text.append(part.asText());
                else if (part.hasNonNull("text")) text.append(part.path("text").asText());
            }
            return text.toString();
        }
        return "";
    }

    private HttpHeaders requestHeaders(String provider, String key) {
        HttpHeaders headers = new HttpHeaders(); headers.setContentType(MediaType.APPLICATION_JSON);
        if ("anthropic".equals(provider)) { headers.set("x-api-key",key); headers.set("anthropic-version","2023-06-01"); }
        else { headers.setBearerAuth(key); if ("openrouter".equals(provider)) headers.set("X-OpenRouter-Title","SQA Defects4J Test Bench"); }
        return headers;
    }
    private RestTemplate rest(int readTimeout) {
        SimpleClientHttpRequestFactory f = new SimpleClientHttpRequestFactory(); f.setConnectTimeout(15000); f.setReadTimeout(readTimeout); return new RestTemplate(f);
    }
    private RuntimeException providerError(String provider, Exception e) {
        if (e instanceof HttpStatusCodeException) {
            HttpStatusCodeException http = (HttpStatusCodeException)e;
            String detail; try { detail = mapper.readTree(http.getResponseBodyAsString()).path("error").path("message").asText("ตรวจ API key, endpoint, model ID และ quota"); }
            catch (Exception ignored) { detail = "ตรวจ API key, endpoint, model ID และ quota"; }
            return new IllegalStateException(provider + " HTTP " + http.getStatusCode().value() + ": " + detail, e);
        }
        if (e instanceof RuntimeException) return (RuntimeException)e;
        return new IllegalStateException("เรียก " + provider + " ไม่สำเร็จ: " + e.getMessage(),e);
    }
    private synchronized boolean hasKey(AiModel model) { return !(model.apiKey == null || model.apiKey.isBlank()) || ("openrouter".equals(model.provider) && openRouter.isConfigured()); }
    private AiModel find(String id) { for (AiModel item : models) if (item.id.equals(id)) return item; return null; }
    private static String normalizeProvider(String provider) {
        String value = provider == null ? "" : provider.trim().toLowerCase();
        if (!Set.of("openrouter","google","openai","anthropic","other").contains(value)) throw new IllegalArgumentException("เลือก AI provider ที่รองรับ"); return value;
    }
    private static String normalizeAddress(String address, String provider) {
        String value = address == null ? "" : address.trim();
        if (value.isBlank()) value = defaultAddress(provider);
        while (value.endsWith("/")) value = value.substring(0,value.length()-1);
        for (String suffix : List.of("/chat/completions","/messages")) if (value.endsWith(suffix)) value=value.substring(0,value.length()-suffix.length());
        if (!(value.startsWith("https://") || value.startsWith("http://"))) throw new IllegalArgumentException("Address ต้องเป็น URL ที่ขึ้นต้นด้วย http:// หรือ https://");
        String host;
        try { host = java.net.URI.create(value).getHost(); } catch (RuntimeException e) { throw new IllegalArgumentException("Address ไม่ถูกต้อง"); }
        if (host == null) throw new IllegalArgumentException("Address ไม่ถูกต้อง");
        String h = host.toLowerCase(java.util.Locale.ROOT);
        // cloud metadata endpoints hand out credentials to whoever can make the server call them
        if (h.startsWith("169.254.") || h.equals("metadata.google.internal") || h.equals("fd00:ec2::254"))
            throw new IllegalArgumentException("Address นี้ไม่อนุญาต (endpoint metadata ของ cloud)");
        return value;
    }
    public static String defaultAddress(String provider) {
        switch (provider == null ? "" : provider.toLowerCase()) {
            case "openrouter": return "https://openrouter.ai/api/v1";
            case "google": return "https://generativelanguage.googleapis.com/v1beta/openai";
            case "openai": return "https://api.openai.com/v1";
            case "anthropic": return "https://api.anthropic.com/v1";
            default: return "";
        }
    }
    private static String required(String value,String message){if(value==null||value.trim().isEmpty())throw new IllegalArgumentException(message);return value.trim();}
    private static double price(String value){if(value==null||value.isBlank())return 0;double p=Double.parseDouble(value.trim());if(!Double.isFinite(p)||p<0)throw new IllegalArgumentException("ราคา token ต้องเป็นตัวเลขตั้งแต่ 0 ขึ้นไป");return p;}
    private static String normalizeReasoningEffort(String value){String effort=value==null||value.isBlank()?"medium":value.trim().toLowerCase();if(!Set.of("default","none","low","medium","high").contains(effort))throw new IllegalArgumentException("เลือก reasoning effort ที่รองรับ");return effort;}
    private static double perMillion(String perToken){try{return Double.parseDouble(perToken)*1_000_000.0;}catch(Exception e){return 0;}}
    private static double estimate(int input,int output,double inPrice,double outPrice){if(input<0||output<0)return Double.NaN;return input*inPrice/1_000_000.0+output*outPrice/1_000_000.0;}
    /** Input tokens served from the provider's prompt cache are billed at the (cheaper) cached price. */
    private static double estimate(int input,int output,int cached,double inPrice,double cachedPrice,double outPrice){
        if(input<0||output<0)return Double.NaN;
        int hit=cached<0?0:Math.min(cached,input);
        double cachedRate=cachedPrice>0?cachedPrice:inPrice;
        return (input-hit)*inPrice/1_000_000.0+hit*cachedRate/1_000_000.0+output*outPrice/1_000_000.0;
    }
    /** Cached prompt tokens as reported by OpenAI-compatible, OpenRouter or Anthropic usage objects; -1 when unknown. */
    static int cachedTokens(JsonNode usage){
        if(usage==null||usage.isMissingNode()||usage.isNull())return -1;
        JsonNode details=usage.path("prompt_tokens_details");
        if(details.has("cached_tokens"))return details.path("cached_tokens").asInt(-1);
        if(usage.has("cache_read_input_tokens"))return usage.path("cache_read_input_tokens").asInt(-1);
        if(usage.has("cached_tokens"))return usage.path("cached_tokens").asInt(-1);
        return -1;
    }

    private synchronized void load() {
        try {
            if (!Files.isRegularFile(settingsFile)) return;
            JsonNode root = mapper.readTree(settingsFile.toFile());
            root.path("models").forEach(n -> models.add(mapper.convertValue(n,AiModel.class)));
            root.path("selectedIds").forEach(n -> { if (find(n.asText()) != null) selectedIds.add(n.asText()); });
        } catch(Exception e){
            try {   // keep the unreadable file: it may hold the only copy of the saved keys
                if (Files.isRegularFile(settingsFile)) Files.copy(settingsFile,
                        settingsFile.resolveSibling(settingsFile.getFileName() + ".corrupt-" + System.currentTimeMillis()));
            } catch (IOException ignored) { }
        }
    }
    private synchronized void persist() throws IOException {
        Path parent=settingsFile.getParent(); if(parent!=null)Files.createDirectories(parent);
        Set<PosixFilePermission> permissions=EnumSet.of(PosixFilePermission.OWNER_READ,PosixFilePermission.OWNER_WRITE);
        Path temp=settingsFile.resolveSibling(settingsFile.getFileName()+".tmp");
        Files.deleteIfExists(temp);
        try{Files.createFile(temp,PosixFilePermissions.asFileAttribute(permissions));}   // owner-only before any key is written
        catch(UnsupportedOperationException ignored){Files.createFile(temp);}
        Map<String,Object> data=new LinkedHashMap<>();data.put("models",models);data.put("selectedIds",selectedIds);
        mapper.writerWithDefaultPrettyPrinter().writeValue(temp.toFile(),data);
        try{Files.move(temp,settingsFile,java.nio.file.StandardCopyOption.ATOMIC_MOVE,java.nio.file.StandardCopyOption.REPLACE_EXISTING);}
        catch(java.nio.file.AtomicMoveNotSupportedException e){Files.move(temp,settingsFile,java.nio.file.StandardCopyOption.REPLACE_EXISTING);}
    }

    public static class AiModel {
        public String id="", provider="", address="", apiKey="", model="", name="", reasoningEffort="medium";
        public double inputPrice, cachedInputPrice, outputPrice;
        AiModel copy(){AiModel m=new AiModel();m.id=id;m.provider=provider;m.address=address;m.apiKey=apiKey;m.model=model;m.name=name;m.reasoningEffort=reasoningEffort==null||reasoningEffort.isBlank()?"medium":reasoningEffort;m.inputPrice=inputPrice;m.cachedInputPrice=cachedInputPrice;m.outputPrice=outputPrice;return m;}
        Map<String,Object> safeMap(boolean selected,boolean keySaved){Map<String,Object> m=new LinkedHashMap<>();m.put("id",id);m.put("provider",provider);m.put("address",address);m.put("model",model);m.put("name",name);m.put("reasoningEffort",reasoningEffort==null||reasoningEffort.isBlank()?"medium":reasoningEffort);m.put("inputPrice",inputPrice);m.put("cachedInputPrice",cachedInputPrice);m.put("outputPrice",outputPrice);m.put("keySaved",keySaved);m.put("selected",selected);return m;}
    }
    public static final class ProviderResult {
        public final String requestedModel,actualModel,generationId,content,batchId; public final JsonNode rawResponse;
        public final int promptTokens,completionTokens,cachedTokens; public final double cost; public final long elapsedMs; public final boolean batchAccepted;
        ProviderResult(String req,String actual,String gen,String content,JsonNode raw,int in,int out,double cost,long ms,boolean batch,String batchId,int cached){this.requestedModel=req;this.actualModel=actual;this.generationId=gen;this.content=content;this.rawResponse=raw;this.promptTokens=in;this.completionTokens=out;this.cost=cost;this.elapsedMs=ms;this.batchAccepted=batch;this.batchId=batchId;this.cachedTokens=cached;}
    }
}
