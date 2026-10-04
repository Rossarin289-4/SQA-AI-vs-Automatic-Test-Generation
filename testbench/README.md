# TestBench · SQA Project 2026 (Java)

เว็บแอปสำหรับเปรียบเทียบการสร้าง JUnit 4.12 tests ด้วย **AI (กี่ตัวก็ได้)** และ **search algorithms (SA, Binary PSO, GA, Random Search)** บน **Defects4J ทุก Project** แล้วรัน suite ชุดเดียวกันกับ buggy และ fixed เพื่อวัด coverage, fault detection และประสิทธิภาพ ตามใบงาน CP353201 *AI-Assisted Testing vs. Automatic Test Case Generation Algorithms*

- เลือก AI และ algorithm ได้ไม่จำกัดจำนวน ผ่านหน้า Settings (ไม่มีค่าตายตัว)
- รันได้ทั้ง bug เดียว, หลาย bug ใน Project เดียว หรือ **ทุก Project / ทุก bug** (Auto)
- ทำซ้ำหลายรอบ (seed ต่างกัน) แล้วเฉลี่ยผล, ปรับ budget การค้นหาได้
- ตารางสรุปอัปเดตสดบนหน้า campaign และ export เป็น Excel / CSV / JSON ได้
- เก็บ prompt, source ที่ส่งให้ AI, test ที่สร้าง, log และ coverage ของทุกชุดเพื่อให้ทำซ้ำได้

เอกสารเพิ่มเติม: [`docs/ARCHITECTURE.md`](docs/ARCHITECTURE.md) (diagram) · [`docs/COMPATIBILITY.md`](docs/COMPATIBILITY.md) (Project ที่รองรับ/ข้อจำกัด) · [`prompts/CHANGELOG.md`](prompts/CHANGELOG.md) (เวอร์ชัน prompt)

## 1. ติดตั้งและเปิดระบบ

ต้องมี Docker (Docker Compose) แอปรันใน container ที่ติดตั้ง JDK 11, Maven และ **Defects4J 3.0.1** ให้เอง (image ประมาณ 3 GB, build ครั้งแรกใช้เวลาหลายนาที)

```sh
cp .env.example .env          # แก้ค่าถ้าต้องการ
docker compose up --build     # เปิด http://localhost:8081
```

macOS ที่ไม่มี Docker Desktop ใช้ Colima ได้: `brew install colima docker docker-compose` แล้ว `colima start`

| ตัวแปรใน `.env` | ความหมาย |
|---|---|
| `TESTBENCH_PORT` / `TESTBENCH_BIND_ADDRESS` | พอร์ต (ค่าเริ่มต้น 8081) และที่อยู่ที่เปิดรับ (`127.0.0.1` = เครื่องนี้เท่านั้น; ตั้งเป็น IP ของเครื่องหรือ `0.0.0.0` เพื่อให้คนอื่นเข้าได้ — **ระบบไม่มีการล็อกอิน**) |
| `OPENROUTER_API_KEY` | (ไม่บังคับ) key OpenRouter ตั้งผ่านหน้า Settings ก็ได้ |
| `TESTBENCH_OUTPUT_DIR` | `./output` | ที่เก็บผลและ checkout ชั่วคราวของ Defects4J — ชี้ไป SSD/NVMe ถ้าโฟลเดอร์โปรเจกต์อยู่บน HDD (I/O เป็นคอขวดเมื่อรันขนานมาก) |
| `BENCH_TEST_SEEDING` | `false` | รอบที่ 2 ของ algorithm: seed จาก test suite ของ project (ตัด trigger test) + object factory · ใช้คู่กับ "ทำเฉพาะที่ยังไม่ตรวจพบ" |
| `BENCH_PARALLELISM` | จำนวนงาน Defects4J ที่รันพร้อมกัน (ค่าเริ่มต้น `1` = ทีละงาน) ใช้ลดเวลาเมื่อรันทั้ง dataset กติกาคร่าว ๆ: **คอร์ ÷ 3 และมี RAM ว่าง ~1.5 GB ต่องาน** (laptop 8 คอร์/16 GB → `2`, server 32 คอร์ → `6`–`8`) ตั้งสูงเกินแล้ว algorithm จะได้รอบค้นหาน้อยลงใน budget เวลาจริง → ตรวจพบน้อยลงโดยไม่มี error · จำนวน thread ของงาน AI และช่องคอมไพล์สั้น ๆ สเกลตามค่านี้อัตโนมัติ |
| `TESTBENCH_CPUS` | เพดานจำนวนคอร์ที่ container ใช้ได้ (ค่าเริ่มต้น `0` = ไม่จำกัด) ใช้บนเครื่องที่มี service อื่นร่วมอยู่ เช่น `24` บนเครื่อง 32 คอร์ ห้ามตั้งเกินจำนวนคอร์จริง (Docker จะไม่สตาร์ท) · container มีน้ำหนัก CPU ต่ำกว่าปกติอยู่แล้ว (`cpu_shares: 512`) จึงหลบให้ service อื่นเมื่อแย่งกัน |
| `BENCH_KEEP_WORKSPACES` | ค่าเริ่มต้น `false`: หลังประเมินแต่ละงานระบบลบ checkout buggy/fixed (หลายร้อย MB ต่อ bug) และเก็บเฉพาะหลักฐาน (suite, log, test ที่ FAIL, coverage, patch) ตั้ง `true` ถ้าต้องการเก็บ checkout ไว้ |
| `BENCH_JUNIT3_PROJECTS` | ค่าเริ่มต้น `Cli`: Project ที่ใช้ test แบบ JUnit 3 (`TestCase`) แทน JUnit 4 เพราะ Defects4J ไม่ใส่ hamcrest ให้ JUnit 4 (ใช้กับทั้ง algorithm และ AI) |

ผลทั้งหมดอยู่ที่ `./output/` (ถูก mount ออกมานอก container) และการตั้งค่า (key, รายการ AI) ที่ `./config/` — **อย่าเผยแพร่ `config/`** (อยู่ใน `.gitignore` แล้ว) ไฟล์ที่ container สร้างตั้ง `umask 000` ให้ผู้ใช้เครื่องลบได้โดยตรง

การรันโดยไม่ใช้ Docker: ต้องมี JDK 11+, Maven และติดตั้ง Defects4J (`defects4j` ต้องอยู่ใน `PATH`) แล้ว `mvn spring-boot:run`

## 2. ตั้งค่า (หน้า `/settings`)

1. **AI providers** — เพิ่มได้หลายรายการและเลือกใช้กี่ตัวก็ได้ รองรับ OpenRouter, Google (Gemini), OpenAI, Anthropic และ **local / OpenAI-compatible** (เช่น llama.cpp, Ollama) ระบุ address, API key, model ID, ราคาต่อล้าน token (input / cached / output) และ reasoning effort ปุ่ม "ทดสอบ" ส่งคำขอสั้น ๆ (ไม่เกิน 16 tokens) เพื่อตรวจการเชื่อมต่อ
   - model ID ที่ลงท้าย `:batch` (OpenRouter) ใช้ Batch API รอผลเบื้องหลัง
   - โมเดลที่อยู่ใน localhost / เครือข่ายส่วนตัวถือเป็น local (ไม่มีค่าใช้จ่าย); อย่างอื่นถือเป็น cloud
2. **Algorithms** — เลือก SA, BPSO, GA, Random Search กี่ตัวก็ได้ (แต่ละตัวสร้าง suite แยกกัน)
3. **Master Prompt** — template ของ prompt (ต้องมี `{{PROJECT_ID}}`, `{{BUG_ID}}`, `{{BUGGY_SOURCE}}`; ใช้ `{{TARGET_CLASS}}`, `{{TARGET_METHOD}}`, `{{BUG_REPORT_ID}}` เพิ่มได้) บันทึกใน `prompts/Master_Prompt.md` มีผลกับ run ใหม่เท่านั้น

## 3. เริ่มการทดลอง (หน้าแรก)

| ตัวเลือก | ความหมาย |
|---|---|
| วิธีสร้าง test | **AI + algorithms** หรือ **algorithms อย่างเดียว** (ไม่เรียก AI ไม่มี token) |
| ขอบเขต | **Auto** = ทุก Project / ทุก bug ใน Defects4J (campaign), หรือ **ระบุเอง** = เลือก Project แล้วติ๊ก bug ได้หลายตัว |
| Search budget | เวลา (วินาที) ที่ algorithm ใช้ค้นหาต่อ bug ต่อวิธี (10–3600) เป็นเวลาจริง ไม่รวมเวลารัน test/coverage |
| จำนวนรอบทำซ้ำ | 1–50 แต่ละรอบใช้ seed ต่างกัน และ **AI ที่เลือกจะถูกเรียกใหม่ทุกรอบ** |
| แหล่งค่าคาดหวังของ algorithm (oracle) | **`อัตโนมัติ` (ค่าเริ่มต้นในหน้าเว็บ)**: algorithm รันสองชุดแยกกัน คือ oracle `buggy` กับ `fixed` (ชุด fixed เป็น run/campaign เพิ่มแบบ algorithms-only ต่อคิวหลังชุดแรก; AI รันครั้งเดียวในชุด buggy จึงไม่เพิ่มค่าใช้จ่าย); หรือเลือกเองเป็น `buggy` (ไม่ใช้ข้อมูลของ fixed) หรือ `fixed` (reference oracle — ใช้เฉพาะ algorithm ดูข้อ 6) |
| เพดาน output tokens | จำกัดความยาวคำตอบของ AI (ช่วยกันโมเดลพูดยาวและลดค่าใช้จ่าย) |

**ประเมินค่าใช้จ่ายก่อนเริ่ม:** กล่อง "ประเมินค่าใช้จ่าย" แสดงจำนวนคำขอ (bug × รอบ) ต่อ AI, tokens เฉลี่ยจากรอบก่อนหน้า และยอดรวมของโมเดล cloud ถ้ามี AI แบบ cloud ระบบจะขอให้ยืนยันก่อนเริ่ม และ **server ปฏิเสธการเริ่มถ้าไม่ได้ยืนยัน** (local และโหมด algorithms-only ไม่มีค่าใช้จ่าย)

## 4. ดูผล

- **หน้า run** (`/run`) — การ์ดของแต่ละ AI/algorithm: สถานะ, จำนวน test, coverage buggy/fixed, เวลา, tokens/cached/cost, ลิงก์ดาวน์โหลด `.java`, คำตอบดิบ, รายงาน, benchmark JSON, log ปุ่ม **ดูตำแหน่ง defect และวิธีแก้** แสดง diff buggy→fixed จาก Defects4J (ใช้อธิบายผลหลังรัน ไม่ถูกส่งให้ AI)
- **หน้า campaign** (`/campaign`) — **สรุปอัปเดตสดทุก ~2.5 วินาที** ตั้งแต่ bug แรกที่เสร็จ: ตารางต่อวิธี, ตารางแยก Project, รายการ bug ที่ตรวจพบ/แยกสองเวอร์ชันได้/ไม่ถูกนับ (พร้อมเหตุผล), ตารางผลรายบัก (กรองตาม Project) หยุดชั่วคราวและทำต่อได้ (รวมหลัง restart) ปุ่ม export: **Excel (.xlsx 3 ชีต)**, CSV (ผลรายบัก / สรุปต่อวิธี / สรุปแยก Project), JSON
- **หน้าค่าใช้จ่าย AI** (`/usage`) — ยอดรวมของทุก run ตามช่วงเวลา (วันนี้/7 วัน/30 วัน/ทั้งหมด) และกรองตาม Project: ค่าใช้จ่าย, จำนวนคำขอ, เวลา AI, tokens เข้า→ออก, สัดส่วนที่มาจาก cache แยกตาม AI และตาม Project/bug (กดชื่อ Project เพื่อดูรายบัก) และเวลาสร้าง test ของ algorithm (ไม่คิดเงิน) ราคาเป็น USD ตามที่ provider รายงาน ค่าเงินบาทเป็นค่าประมาณ (ตั้งอัตราด้วย `BENCH_USD_TO_THB`, ค่าเริ่มต้น 33)
- **หน้า History** (`/history`) — campaign เป็นแถว **พับ/ขยายได้** (ข้างในแบ่งตาม Project และรอบ), run เดี่ยวอยู่อีกกลุ่ม ลบ run หรือ **ลบทั้ง campaign** ได้ (ต้องยืนยัน; ลบไม่ได้ขณะยังมีงานทำงาน)

## 5. นิยามผล

ชุด test **เดียวกัน (SHA-256 เดียวกัน)** ถูกรันบน buggy และ fixed ด้วย `defects4j test -s` และวัด coverage ด้วย `defects4j coverage -s`

| ผล | ความหมาย |
|---|---|
| `BUGGY_FAIL_FIXED_PASS` | **ตรวจพบ defect:** มี test method เดียวกันที่ FAIL บน buggy และ PASS บน fixed (ยืนยันด้วยการรันซ้ำอีกครั้งทั้งสองเวอร์ชัน) |
| `NOT_DETECTED` | รันได้ครบทั้งสองเวอร์ชันแต่ไม่มี test ที่เข้าเงื่อนไขข้างบน |
| `NOT_DETERMINED` | ตัดสินไม่ได้: compile/รัน suite ไม่สำเร็จบนเวอร์ชันใดเวอร์ชันหนึ่ง (เช่น suite ไม่ได้รันเลย) |
| `INVALID_OUTPUT` | AI ส่งคำตอบที่ไม่ตรงขอบเขต (ไม่มี `@Test`, อ้างคลาสเป้าหมายไม่ถูก) หยุดก่อนรัน Defects4J |
| `NO_SUITE` | AI ตอบกลับโดยไม่มีคลาส JUnit ที่ใช้ได้ |

ตัวชี้วัดอื่น: `fixedSuitePasses` (suite ผ่านทั้งชุดบน fixed หรือไม่), **"แยกสองเวอร์ชันได้"** (มี test ที่ PASS บน buggy แต่ FAIL บน fixed — แสดงว่าพฤติกรรมต่างกัน แต่ **ไม่นับเป็นการตรวจพบ**), จำนวน test ที่รันจริง (จาก `all_tests`), line/branch coverage ของ buggy และ fixed, เวลาสร้าง, เวลารัน test, tokens/cached/cost ต่อ AI

สรุป campaign นับ **ทุกการทดลองที่พยายามรัน** ในตัวหาร (suite ที่ใช้ไม่ได้ไม่ถูกตัดทิ้ง) และแยกจำนวน invalid / error / ตัดสินไม่ได้

## 6. Algorithms ทำงานอย่างไร

ทั้ง 4 วิธีใช้ pipeline เดียวกัน (diagram: [`docs/ARCHITECTURE.md`](docs/ARCHITECTURE.md)):

1. checkout และ compile Project เวอร์ชัน oracle (buggy หรือ fixed) แล้วหาเป้าหมาย: method ที่ประกาศในคลาสที่ Defects4J ระบุใน `classes.modified` (รวมคลาสซ้อน, method แบบ protected/package, คลาส abstract ที่ใช้ subclass ที่สร้างได้, คลาสที่ไม่ public) ผ่าน worker JVM แยก พร้อมรายงานเหตุผลของเป้าหมายที่ข้าม
2. ค้นหา input: candidate = (method เป้าหมาย, ค่าของแต่ละพารามิเตอร์จาก domain ของชนิดนั้น: ค่าขอบ, `null`, ค่าคงที่/ตัวเลขที่อ่านจาก bytecode ของคลาสเป้าหมาย, และชุดสตริงตั้งต้นทั่วไป) fitness = ความ "ใหม่" ของ (method, partition ของพารามิเตอร์, ชนิด/ค่าผลลัพธ์แบบสั้น)
   - **SA:** neighbour = เปลี่ยน 1–2 ยีนของ method ปัจจุบัน, อุณหภูมิ 8 → 0.05 ตามเวลา, รีสตาร์ตเมื่อจบ epoch หรือ 3,000 evaluation ไม่พบสิ่งใหม่
   - **BPSO:** 12 particle, ยีนเข้ารหัสเป็นบิต, v = 0.68 v + 1.45 r₁(pBest−x) + 1.45 r₂(gBest−x) จำกัด ±6, ค่าบิตจาก sigmoid(v)
   - **GA:** population 16, tournament selection, uniform crossover, mutation
   - **Random:** สุ่มอย่างสม่ำเสมอ (baseline)
   - ทุกวิธีใช้ **budget เป็นเวลาจริง** เป็นเงื่อนไขหยุด (pause ไม่กินเวลา) suite สูงสุด 150 test (10 ต่อ method)
3. **replay** suite ใน JVM ใหม่ (เรียงย้อนกลับ) แล้วเก็บเฉพาะผลที่ทำซ้ำได้ → ได้ JUnit class + ไฟล์ช่วย `SearchInputFactory_scaffolding.java` (ต้องลงท้าย `_scaffolding` มิฉะนั้น Defects4J จะรันเป็น test class)
4. รัน suite บน buggy และ fixed

**oracle:** ค่าคาดหวังใน test มาจากเวอร์ชัน `buggy` (ค่าเริ่มต้น) → test ผ่านบน buggy เสมอ ตรวจพบแบบ "FAIL บน buggy · PASS บน fixed" ไม่ได้ แต่วัด "แยกสองเวอร์ชันได้" ได้ หรือ `fixed` (reference oracle แบบที่งานวิจัยบน Defects4J ทั่วไปใช้) → test ผ่านบน fixed และ FAIL บน buggy เมื่อพฤติกรรมต่างกัน = ตรวจพบ defect ผลถูกติดป้าย `oracle` เสมอ และ **ข้อมูลของ fixed ถูกใช้เฉพาะกับ algorithm ไม่เคยถูกส่งให้ AI**

## 7. AI ทำงานอย่างไร

- ส่ง **เฉพาะ source ของเวอร์ชัน buggy** (คลาสใน `classes.modified`; Lang-3 ตัดเหลือ method เป้าหมาย) ไม่ส่ง patch, fixed หรือ test เดิม พร้อม prompt เดียวกันกับ AI ทุกตัว
- prompt = `prompts/Master_Prompt.md` (template ต่อ bug) + `prompts/TestGeneration_Skill.md` (system instruction คงที่) มี **หมายเลขเวอร์ชัน** (`prompts/prompt-version.txt`, ประวัติใน `prompts/CHANGELOG.md`, ฉบับเก่าใน `prompts/versions/`) และทุก run บันทึก `promptVersion` กับ `promptSha256`
- ดึงคลาส JUnit จากคำตอบ → ตรวจขอบเขต (มี `@Test`, อ้างคลาสเป้าหมาย) → รันบน Defects4J ไม่มีการแก้ test หรือค่าคาดหวังหลังเห็นผล fixed ขั้น "review" ของโมเดลปิดเป็นค่าเริ่มต้น
- เก็บคำตอบดิบ, tokens (input/output/cached), cost, เวลา; ถ้า provider ไม่ส่งราคามา ระบบคำนวณจากราคาที่ตั้งไว้ (ส่วนที่ cache คิดราคา cached)
- ผลของโมเดลไม่คงที่ระหว่างรอบ จึงควรทำซ้ำหลายรอบ การปรับ prompt หลังเห็นผลถือเป็น exploratory ต้องแยกเวอร์ชัน

## 8. โครงสร้างไฟล์ผล

```text
output/ai-runs/<Project>-<Bug>/<run-id>/
  metadata.json                  # ผลทุกวิธี, prompt version/hash, repetition, oracle, modelFolders
  prompt-used.txt  user-prompt.txt  system-skill-used.md  buggy-source*.txt  models.txt
  model-<n>-<ชื่อ AI>/           # โฟลเดอร์ตั้งชื่อตามชื่อ AI ที่ตั้งใน Settings
    generated/original/          # response.md, response.json, <Class>.java
    evaluation/{buggy,fixed}/    # logs/, workspace/ (failing_tests, all_tests, summary.csv), test-suite.tar.bz2
    report/                      # benchmark.json, ai-report.md, bug-analysis.json, fix.patch
  algorithm-<sa|pso|ga|random>/  # generated/original/ (suite-root/, test-inputs.csv), evaluation/{fitness,buggy,fixed}/, report/{benchmark,generation}.json
output/ai-runs/campaigns/<campaign-id>/   # campaign.json, campaign-summary.json (เขียนใหม่ทุกครั้งที่ bug เสร็จ)
```

## 9. โฟลเดอร์ส่งงานตามใบงาน

สร้างอัตโนมัติจากผลทดลองจริงด้วยสคริปต์ (ไม่ต้องจัดเอง):

```sh
python3 scripts/export_submission.py --dest submission   # --prompt-version v4 | --all-versions
```

ได้ `submission/TestBench-SQA-2026/` ตามตัวอย่างในใบงาน: `<Algorithm>/{Code, Configuration, Result_Round1..N, Test}`, `<ชื่อ AI>/{Prompt, Result, TestCode}`, `Summary/` (results.csv และ campaign summary), `TestBench-App/` (แอป, prompt, สคริปต์, เอกสาร) และ `README.md` (สมาชิก, โครงสร้าง, วิธีทำซ้ำ, ตารางสรุป) `Round<N>` = รอบทำซ้ำที่ N ข้อมูลกลุ่มและชื่อโครงการแก้ที่ `submission-info.json` รัน algorithm แบบ oracle `fixed` จะแยกเป็น `<Project>-<Bug>__oracle-fixed/`

## 10. ข้อจำกัดที่ทราบ

รายละเอียดและตารางความรองรับของแต่ละ Project: [`docs/COMPATIBILITY.md`](docs/COMPATIBILITY.md)

- **Cli:** Defects4J ตั้ง classpath ทดสอบเป็น `junit-4.12.jar` ที่ไม่มี hamcrest จึงใช้ test แบบ **JUnit 3** (`TestCase`) กับ Cli ทั้งฝั่ง algorithm และ AI (prompt v5 เติมกติกาให้ AI) ไม่มี timeout ต่อ test
- **คลาสเป้าหมายที่สร้างอ็อบเจ็กต์ยาก** (เช่น Closure, Gson): ระบบลองหลาย constructor, คลาสลูกของ abstract, เมธอด `init*` และสุดท้ายอ็อบเจ็กต์ที่ฟิลด์เป็นค่าเริ่มต้น → รันได้ทุก Project แต่ coverage ต่ำและ test ส่วนมากตรวจ exception
- algorithm ทดสอบผ่าน public/protected/package API ของคลาสใน `classes.modified` ไม่ได้ทดสอบ method ที่ต้องมี state ซับซ้อนทั้งหมด
- AI เห็นเฉพาะ source ของคลาสที่ถูกแก้ จึงอาจเดา API ของคลาสอื่นผิด (compile ไม่ผ่าน → `NOT_DETERMINED`)
- ผลของ AI ไม่นิ่งระหว่างรอบและระหว่าง bug ต้องทำซ้ำและรายงานค่าเฉลี่ย
- การรันทีละงาน (`BENCH_PARALLELISM=1`) ใช้เวลาประมาณ 2 นาทีต่อ bug ต่อ algorithm ทั้ง dataset ใช้เวลาเป็นวัน ปรับ `BENCH_PARALLELISM` เพื่อเร่ง
- ระบบไม่มีการล็อกอินและแสดงไฟล์ใน `output/` ผ่านหน้าเว็บ ใช้บนเครือข่ายที่เชื่อถือได้เท่านั้น

## 11. แก้ปัญหาเบื้องต้น

| อาการ | ทางแก้ |
|---|---|
| เริ่มการทดลองแล้วขึ้น "ต้องยืนยันค่าใช้จ่าย" | เลือก AI แบบ cloud ไว้ กดเริ่มจากหน้าแรกแล้วยืนยันในกล่องข้อความ หรือเลือกเฉพาะ local AI ใน Settings |
| campaign หยุดหลัง restart | โหลดกลับมาเป็น paused กด "ทำต่อ" (คำขอ AI ที่บันทึกคำตอบไว้แล้วไม่ถูกเรียกซ้ำ) |
| run ค้างที่ "กำลังทำงาน" นานผิดปกติ | ดู `docker compose logs evaluator` และ log ใน `evaluation/*/logs/` ของ run นั้น |
| อยากหยุดถาวร (ไม่ใช่แค่พัก) | ปุ่ม **ยกเลิก** ที่หน้า run (run เดี่ยว), หน้า campaign หรือหน้า History: งานที่ยังไม่เสร็จหยุดทันที (process ของ Defects4J/algorithm ถูกปิด) ผลที่เสร็จแล้วยังอยู่และ export ได้ ยกเลิกแล้วทำต่อไม่ได้ (ต้องเริ่มใหม่); คำขอที่ส่งถึง AI ไปแล้วเรียกคืนไม่ได้ |
| ลบ run ไม่ได้ | run ที่อยู่ใน campaign ลบแยกไม่ได้ ให้ลบทั้ง campaign จากหน้า History |
| ไฟล์ใน `output/` ลบไม่ได้ | ไฟล์ที่สร้างก่อนตั้ง `umask 000` เป็นของ root: ลบผ่าน `docker compose exec evaluator rm -rf ...` |

## 12. โครงสร้างโค้ด

| ไฟล์ | หน้าที่ |
|---|---|
| `GenerationController.java` | หน้าเว็บ, run/campaign (คิว, หยุด/ทำต่อ, ความขนาน), ประกอบ prompt, สรุปและ export, History |
| `AiProviderService.java`, `OpenRouterService.java` | เรียก AI (OpenAI-compatible, Anthropic, OpenRouter + batch), tokens/cache/cost |
| `GenericSearchTestGenerator.java` | SA/BPSO/GA/Random: encoding, fitness (coverage + branch distance), archive, สร้าง JUnit |
| `src/main/resources/generator/` | worker JVM ที่เรียก method เป้าหมาย และไฟล์ช่วยของ suite (`*_scaffolding`) |
| `Defects4jRunner.java` | checkout/compile/test/coverage, ตัดสิน detection, ล็อกจำนวนงานขนาน |
| `TableExport.java` | เขียน CSV และ Excel (.xlsx) |
| `prompts/` | Master Prompt (เวอร์ชันปัจจุบันและเก่า), Repair Prompt, system skill, CHANGELOG |
| `scripts/export_submission.py` | สร้างโฟลเดอร์ส่งงาน |
| `submission-info.json` | ชื่อโครงการและสมาชิกกลุ่มสำหรับ README ที่ส่งออก |
