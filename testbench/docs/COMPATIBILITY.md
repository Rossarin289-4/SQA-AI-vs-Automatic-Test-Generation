# ความรองรับของแต่ละ Project (algorithm)

ผลจากการตรวจสอบความสามารถ (capability check) บน server: ทุก Project ของ Defects4J 3.0.1 ที่ติดตั้ง (17 Project) ใช้ SA และ BPSO กับ **5 bug แรกของแต่ละ Project** (budget 10 วินาที, 1 รอบ, oracle `buggy`) เพื่อดูว่าสายงานทำงานได้ครบหรือไม่ **ไม่ใช่ผลเปรียบเทียบ algorithm** (ตัวอย่างน้อยและ budget สั้นเกินไป) ผลการทดลองจริงต้องรันเองด้วย campaign ในแอป

"ประเมินได้" = suite ถูกสร้าง รันบนทั้ง buggy และ fixed สำเร็จ และมีค่า coverage; line coverage คือค่าบน buggy ตัวเลขเฉลี่ยของ 2 วิธี × 5 bug

| Project | ประเมินได้ (จาก 10) | test เฉลี่ย | line cov เฉลี่ย (buggy) | หมายเหตุ |
|---|---|---|---|---|
| Chart | 10 | 90.2 | 32.0% | |
| Cli | 10 | 22.2 | 58.2% | ใช้ test แบบ JUnit 3 (ดูด้านล่าง) |
| Closure | 10 | 35.8 | 13.8% | coverage ต่ำ: คลาสเป้าหมายต้องมี compiler ที่เตรียมสถานะไว้ |
| Codec | 10 | 51.3 | 71.9% | |
| Collections | 10 | 39.3 | 39.1% | |
| Compress | 10 | 28.4 | 42.5% | |
| Csv | 10 | 17.3 | 49.0% | |
| Gson | 10 | 14.0 | 14.7% | coverage ต่ำ: ผลลัพธ์ส่วนมากเป็นอ็อบเจ็กต์ที่ตรวจได้แค่ว่าไม่ใช่ null |
| JacksonCore | 10 | 92.5 | 41.4% | |
| JacksonDatabind | 10 | 64.2 | 30.6% | |
| JacksonXml | 10 | 103.7 | 26.8% | |
| Jsoup | 10 | 53.6 | 42.5% | |
| JxPath | 10 | 49.0 | 31.5% | |
| Lang | 10 | 56.5 | 61.5% | |
| Math | 10 | 61.5 | 57.1% | |
| Mockito | 10 | 24.8 | 70.9% | |
| Time | 10 | 94.2 | 47.9% | |

ไม่มีงานใดจบด้วย error หรือ `NOT_DETERMINED` ในชุดตรวจนี้ อย่างไรก็ตามนี่เป็นแค่ 5 bug แรกต่อ Project: bug อื่นอาจเจอปัญหาใหม่ ระบบจะรายงานเป็น error/`NOT_DETERMINED` พร้อมเหตุผลและแยกออกจากอัตราการตรวจพบ

## สิ่งที่พัฒนาเพิ่มเพื่อให้รองรับทุก Project

ก่อนหน้านี้ 6 Project ใช้ไม่ได้หรือใช้ได้บางส่วน (Cli, Closure, JacksonDatabind, JacksonXml, Math, Gson) แก้ดังนี้:

1. **Cli — test แบบ JUnit 3:** Defects4J ให้ Cli ใช้ `junit-4.12.jar` ที่ไม่มี hamcrest ทำให้ JUnit 4 ทุกคลาสเริ่มรันไม่ได้ (`NoClassDefFoundError: org/hamcrest/SelfDescribing`) ระบบสร้าง suite เป็น `junit.framework.TestCase` สำหรับ Project ในรายการ `bench.junit3-projects` (ค่าเริ่มต้น `Cli`, ตั้งผ่าน `BENCH_JUNIT3_PROJECTS` ได้) โดยไม่แตะ dataset หรือ build ของ Defects4J; ข้อเสีย: ไม่มี timeout ต่อ test
2. **Cli — ฝั่ง AI เท่าเทียมกัน:** prompt v5 มีช่อง `{{FRAMEWORK_NOTE}}` เติมกติกา JUnit 3 ให้ AI เฉพาะ Project เหล่านี้ และระบบตรวจ/นับ test แบบ JUnit 3 ได้ ทำให้ AI กับ algorithm ใช้ framework เดียวกัน
3. **สร้างอ็อบเจ็กต์ที่ยาก** (ตัวช่วย `SearchInputFactory_scaffolding`, ใช้ทั้งตอนค้นหาและใน test ที่สร้าง จึงทำซ้ำได้):
   - ลองทุก constructor ไม่ใช่แค่ตัวแรก (ตัวแรกมักปฏิเสธ `null`)
   - พารามิเตอร์เป็นคลาส abstract: ใช้คลาสลูกที่สร้างได้ในแพ็กเกจเดียวกัน (เรียงตามชื่อ)
   - เรียกเมธอดชื่อขึ้นต้น `init` หลังสร้าง เช่น `Compiler.initOptions` ของ Closure
   - ลองค่าตัวอย่างหลายแบบสำหรับ receiver (บาง constructor ปฏิเสธค่าแรก เช่น ขนาดติดลบ ใน Math)
   - ถ้าทุกวิธีล้มเหลว สร้างอ็อบเจ็กต์ที่ฟิลด์เป็นค่าเริ่มต้นโดยไม่รัน constructor (ใช้กับ receiver เท่านั้น) test ที่ได้ส่วนใหญ่ลงเอยด้วย exception แต่ยังเป็นผลที่ทำซ้ำได้
4. **Gson — ผลลัพธ์เป็นคลาสนิรนาม:** ชื่อคลาสนิรนาม/lambda/proxy (`Foo$29`) ต่างกันได้ระหว่าง buggy กับ fixed ระบบเคยข้ามทุกผลจึงไม่มี test ตอนนี้บันทึกแค่ว่า "ได้ค่าที่ไม่ใช่ null" โดยไม่ตรวจชื่อคลาส

## ข้อจำกัดที่รู้ (ใช้เขียนรายงาน)

1. coverage ของ Closure และ Gson ต่ำ (ราว 14%) เพราะต้องมีอ็อบเจ็กต์ที่เตรียมสถานะซับซ้อน การเพิ่มต้องพัฒนาการสร้างอ็อบเจ็กต์ต่อ
2. test ที่สร้างจากอ็อบเจ็กต์ที่ไม่ได้รัน constructor ส่วนมากเป็นการตรวจ exception: วัดได้ แต่ไม่ลึก
3. oracle ค่าเริ่มต้น (`buggy`) ทำให้ algorithm ตรวจพบแบบ "FAIL บน buggy · PASS บน fixed" ไม่ได้ ใช้ตัวชี้วัด "แยกสองเวอร์ชันได้" หรือเลือก oracle `fixed`/อัตโนมัติ (ดู README)
4. ผลนี้ตรวจกับ SA และ BPSO เท่านั้น (GA/Random ใช้ตัวช่วยสร้างอ็อบเจ็กต์ชุดเดียวกัน แต่ไม่ได้อยู่ในชุดตรวจนี้)

## Search algorithms, revision of 2026-10-03 (SA / BPSO)

Both algorithms were rebuilt around the same evaluation harness; the search strategies (annealing acceptance with geometric
cooling; binary particle swarm with sigmoid bit updates toward pBest/gBest) are unchanged.

- Fitness: JaCoCo probes (branch/line blocks) of the modified classes executed by the input, weighted by rarity among the
  kept tests; a probe no kept test reaches yet weighs most. Previously only outcome kinds and parameter partitions counted.
- Inputs: concrete values with typed small moves (numbers ±d, ×2, sign, 2^k; strings: replace/insert/delete/±char/append/
  truncate; wrapped scalars for Object parameters). SA uses them as its neighbourhood; BPSO decodes bits into a pool value
  plus up to two moves. Values that reached new code join the pool.
- Test shape: receiver construction variant, up to three set-up calls on the receiver, the observed call, up to three
  follow-up calls on the returned object (continuing on a returned object, staying after a plain value), optionally under
  another default locale (tr, de, fr). Assertions: scalar value, text form of arrays/collections/maps/objects with toString
  (hash-ordered sets/maps sorted), and the receiver's state after the call.
- Input factory: real readers/streams with sample texts, W3C DOM nodes from a small parsed document, reflection samples
  (Class/Type/Field/Method incl. a generic hierarchy), small numbers, stand-ins for interfaces that answer per variant,
  objects from the project's own factory/parser methods (even variants ≥ 4), subclass choice per variant. A long-standing
  defect was fixed: the variant number of `<sample:k>` was never parsed (every object variant was variant 0).
- Robustness: a call is abandoned after 400 ms inside the worker (no JVM restart); the suite is repaired on the fixed
  version with Defects4J's fix_test_suite.pl before the paired run; at most 300 tests chosen by greedy probe cover, then
  locale tests, then discovery order; `patchCoverage` in benchmark.json records whether the suite executed the fix lines.

Development set: the first bug of every project (17). Result at budget 30-60 s, one run: 13 of 17 detected by at least one
algorithm (Chart, Cli, Codec, Collections, Compress, Csv, Gson, JacksonCore, JxPath, Lang, Math, Mockito, Time); not
detected: Jsoup-1 (fix lines reached, order of nodes), JacksonXml-1, JacksonDatabind-1, Closure-1 (fix lines not reached:
inputs need the library's own pipeline). The 17 are development bugs; the full-dataset run is the measurement.

### Addendum 2026-10-03 (later the same day)

- Inspector assertions: the observed text of a returned object and of the receiver now includes the values of its public
  no-argument getters (`{getA=.., isB=..}`, at most 16), so a change inside an object is asserted even when toString is unchanged.
- Branch distance: `BranchAgent` (a -javaagent built at worker start with the JDK's internal ASM) instruments the conditional
  jumps of the target classes; `BranchRecorder` reports, per jump, how far the operands were from the untaken outcome. The
  fitness adds (1 - distance) for every outcome no kept test has taken (capped at 30), so SA/BPSO moves have a gradient.
  Without the JDK export (`--add-exports java.base/jdk.internal.org.objectweb.asm`) the search runs without distances.
- Hash-ordered sets/maps are rendered sorted in observed state (order is not part of their contract).
- Learning sample, 5 first bugs of every project (85 bugs, budget 60 s, one run, before branch distance): detected by at
  least one algorithm 50/85 (59%); on the 68 bugs never used during development 37/68 (54%); SA 43, BPSO 41 suites.
  Misses: 20 bugs reached the fix lines without a behaviour difference, 15 did not reach them (Closure 0/5, Compress-5,
  Csv-2, JacksonXml-1/3, Chart-2, Cli-4, Lang-6, Mockito-5, JacksonDatabind-1, JxPath-5, Math-5, Gson-3).

## รอบที่ 2 ของ algorithm: seeding จาก test suite ของ project + object factory (3 ต.ค. 2569, ปิดเป็นค่าเริ่มต้น)

เปิดด้วย `BENCH_TEST_SEEDING=true` (`bench.test-seeding`) ใช้กับ campaign แบบ "ทำเฉพาะที่ยังไม่ตรวจพบ" เพื่อให้รอบที่ 1 (ไม่ seed) และรอบที่ 2 เทียบกันได้ชัด

- **ที่มาของ seed**: string literal จาก test suite ของ project ที่เวอร์ชันอ้างอิง (`dir.src.tests`) — input จริงของโค้ด เช่น JavaScript ของ Closure, HTML ของ Jsoup, JSON ของ Jackson, option ของ Cli — โดย**ตัด method ของ trigger test** (`tests.trigger`) ออกก่อนขุด เหลือเฉพาะ test ที่มีอยู่ก่อน bug ถูกแก้ test ของคลาสที่ถูกแก้มาก่อน (สูงสุด 400 ค่า บันทึกใน `search-test-seeds.txt/.log`) เป็นเทคนิค "seeding from existing tests" แบบเดียวกับ EvoSuite
- **object factory จาก text**: ค่าใหม่ `<make:k|text>` ให้ scaffolding สร้าง object ของ project (AST, Document, JsonNode…) ผ่าน parser/factory ของ project เอง โดยส่ง seed text เข้าไป; การค้นหา factory ขยายจาก package เดียวกันเป็นทั้ง project (3 segment แรก, คลาสชื่อ Parser/Compiler/Factory/Builder ก่อน) ตัวแก้ไข (SA/BPSO) กลายพันธุ์ text ด้วย move ของ String
- **ผลทดลองก่อนเปิดใช้** (budget 60 s): Jsoup-1 จาก "ไม่ถึงบรรทัดที่แก้" → ถึง 2/2 และ BPSO ตรวจพบ; Closure-172 test 75/78 ใช้ AST จริงแต่ยังไม่ถึงบรรทัดที่แก้ (คลาส TypedScopeCreator ต้องการ Compiler ที่ตั้งค่าครบ); JacksonXml-1, JacksonDatabind-1 ยังไม่ถึง
- บันทึกใน `report/generation.json`: `testSeeding`, `testSeeds`, `pools` (ขนาด pool และจำนวน `<make:>` ต่อชนิด)
