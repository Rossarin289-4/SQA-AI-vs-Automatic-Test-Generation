# TestBench — AI vs Search-based Test Generation on Defects4J

### สมาชิกกลุ่ม

| ลำดับ | ชื่อ-นามสกุล | รหัสนักศึกษา |
|:---:|---|:---:|
| 1 | นางสาวกัญญาวี ศรีเหรา | 673380026-6 |
| 2 | นางสาวรสริน เมืองหงษ์ | 673380289-4 |
| 3 | นางสาวสโรชา เสาทอง | 673380296-7 |

เครื่องมือเปรียบเทียบการสร้าง unit test ด้วย **AI (LLM)** กับ **algorithm ค้นหา (Simulated Annealing / Binary PSO)** บนชุดข้อมูล **Defects4J 3.0.1** — วัดว่า test ที่สร้างได้ตรวจพบ bug จริงหรือไม่ (FAIL บนเวอร์ชัน buggy และ PASS บนเวอร์ชัน fixed) พร้อม line coverage, เวลา และค่าใช้จ่าย AI

โค้ดทั้งหมดอยู่ใน [`testbench/`](testbench/) · คู่มือฉบับเต็ม: [`testbench/README.md`](testbench/README.md) · แผนภาพการทำงาน: [`testbench/docs/ARCHITECTURE.md`](testbench/docs/ARCHITECTURE.md)

ผลการทดลองอยู่ในโฟลเดอร์ `<Project>/<Method>/…` และ `master_results.csv` ที่ root — **วิธีอ่าน: [`วิธีอ่านผลการทดลอง.md`](วิธีอ่านผลการทดลอง.md)**

## รันใน 4 บรรทัด (ต้องมีแค่ Docker)

```bash
git clone -b rossarin/AI-testbench https://github.com/Rossarin289-4/SQA-AI-vs-Automatic-Test-Generation.git
cd SQA-AI-vs-Automatic-Test-Generation/testbench
cp .env.example .env
docker compose up --build -d
```

เปิด **http://localhost:8081** — ครั้งแรก build 10–20 นาที (ดาวน์โหลด Defects4J และ dependency ใน image) ครั้งต่อไป `docker compose up -d` ขึ้นใน 1 นาที · ไม่ต้องติดตั้ง Java, Maven หรือ Defects4J เอง

ลองครั้งแรกโดยไม่เสียเงิน: หน้าแรก → **Algorithms เท่านั้น** → Project `Lang` Bug `1` → เริ่มการทดลอง (3–5 นาที ควรขึ้น "ตรวจพบ")
ใช้ AI: Settings → เพิ่ม AI (OpenRouter / Google / OpenAI / Anthropic / local) → ทดสอบ → บันทึก

## มีอะไรใน `testbench/`

| โฟลเดอร์ | เนื้อหา |
|---|---|
| `src/main/java/edu/kku/sqa/` | แอป Spring Boot: SA/BPSO (`GenericSearchTestGenerator`), ขั้นประเมินกับ Defects4J (`Defects4jRunner`), pipeline ฝั่ง AI (`GenerationController`, `AiProviderService`) |
| `prompts/` | Master Prompt ทุกเวอร์ชัน, prompt รอบแก้ compile/reference และ `CHANGELOG.md` |
| `docs/` | `ARCHITECTURE.md` (แผนภาพ), `COMPATIBILITY.md` (บันทึกการพัฒนา algorithm) |
| `scripts/` | `export_team_layout.py` แปลงผลเป็นโครง `<Project>/<Method>/` ของ repo กลุ่ม, `export_submission.py` |
| `README.md`, `Dockerfile`, `docker-compose.yml`, `.env.example` | การติดตั้งและค่าตั้งต้น (`BENCH_PARALLELISM`, `TESTBENCH_CPUS`, port) |

## นิยามผล

- **ตรวจพบ (detected)** = test เดียวกัน FAIL บน buggy และ PASS บน fixed (ยืนยันด้วยการรันซ้ำ)
- ทั้ง AI และ algorithm สร้าง test จากเวอร์ชัน fixed (เวอร์ชันอ้างอิง) ตามวิธีของ Defects4J; test ที่ไม่ผ่านบน fixed ถูกตัดด้วย `fix_test_suite.pl` ก่อนวัดผล
- **FDR** = จำนวน test ที่ตรวจพบ ÷ จำนวน test × 100 · coverage วัดบน fixed เฉพาะคลาสที่ถูกแก้

ผลการทดลองที่กลั่นแล้ว (ตามโครงใบงาน) อยู่ในโฟลเดอร์ `<Project>/<Method>/…` และ `master_results.csv` ที่ root ของ branch นี้ ส่วนผลดิบทั้งหมด (`testbench/output/`) ไม่อยู่ใน git · สร้างชุดผลใหม่ได้จากปุ่ม **ส่งออกโครง repo (zip)** ในหน้าแรก หรือ `scripts/export_team_layout.py` · รายงานสรุปการทดลอง: [`รายงานสรุป-นำเสนอ.html`](รายงานสรุป-นำเสนอ.html)

## ผลการทดลอง

การทดลองเปรียบเทียบการสร้าง Test Case ทั้ง 4 วิธี ได้แก่ **Simulated Annealing (SA), Binary Particle Swarm Optimization (BPSO), ChatGPT และ Gemini** โดยทดสอบกับ Bug จาก Defects4J จำนวน **854 Bugs ต่อวิธี**

| Method | Bugs Tested | Bugs Detected | Detection Rate | Avg. Line Coverage | Avg. Condition Coverage |
|---|---:|---:|---:|---:|---:|
| **SA** | 854 | 281 | 32.90% | 61.80% | 49.60% |
| **BPSO** | 854 | 296 | 34.70% | 64.20% | 52.10% |
| **ChatGPT** | 854 | **327** | **38.30%** | 68.70% | 58.40% |
| **Gemini** | 854 | 315 | 36.90% | **70.10%** | **60.20%** |

### สรุปผล

- **ChatGPT** ตรวจจับ Bug ได้สูงสุด จำนวน **327 Bugs (38.30%)**
- **Gemini** ให้ Code Coverage สูงสุด โดยมี **Line Coverage 70.10%** และ **Condition Coverage 60.20%**
- **BPSO** ให้ผลสูงกว่า SA เล็กน้อย ทั้งด้าน Fault Detection และ Coverage
- ผลการทดลองแสดงให้เห็นว่า **Coverage สูงไม่ได้หมายความว่าจะตรวจจับ Bug ได้มากที่สุดเสมอไป** เนื่องจาก Gemini มี Coverage สูงกว่า ChatGPT แต่ ChatGPT สามารถตรวจจับ Bug ได้มากกว่า
- ดังนั้นการประเมินประสิทธิภาพของวิธีสร้าง Test ควรพิจารณาร่วมกันทั้ง **Fault Detection, Code Coverage และ Generation Time**
