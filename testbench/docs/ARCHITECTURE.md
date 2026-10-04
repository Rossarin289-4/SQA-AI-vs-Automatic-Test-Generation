# สถาปัตยกรรมและ diagram

diagram ทั้งหมดเขียนด้วย [Mermaid](https://mermaid.js.org/) (แสดงผลบน GitHub ได้โดยตรง) ตรงกับโค้ดปัจจุบัน

## 1. ภาพรวมระบบ

```mermaid
flowchart LR
  user["ผู้ใช้ (เว็บเบราว์เซอร์)"] --> ui["หน้าเว็บ Thymeleaf<br/>Settings, เริ่มการทดลอง, Run, Campaign, History"]
  ui --> ctl["GenerationController<br/>run และ campaign (คิว, หยุด/ทำต่อ, ความขนาน)"]
  ctl --> ai["AiProviderService / OpenRouterService<br/>AI หลาย provider (cloud และ local)"]
  ctl --> gen["GenericSearchTestGenerator<br/>SA, BPSO, GA, Random"]
  gen --> worker["worker JVM<br/>เรียก method เป้าหมายผ่าน reflection"]
  ctl --> run["Defects4jRunner<br/>checkout, compile, test, coverage, ตัดสิน detection"]
  ai --> run
  gen --> run
  run --> d4j["Defects4J 3.0.1 (CLI)<br/>buggy และ fixed checkout"]
  ctl --> out[("output/ai-runs<br/>metadata, test, log, coverage")]
  run --> out
  ctl --> cfg[("config/<br/>AI providers และ key")]
  ctl --> pr[("prompts/<br/>template, skill, เวอร์ชัน")]
  out --> exp["Export<br/>CSV, Excel, JSON, โฟลเดอร์ส่งงาน"]
```

## 2. ขั้นตอนของหนึ่ง run (ต่อหนึ่ง bug ต่อหนึ่งรอบ)

AI และ algorithm เริ่มพร้อมกัน แยกกันสร้าง suite แล้วเข้าขั้นประเมินคู่เดียวกัน

```mermaid
flowchart TD
  start["เลือก Project, Bug, AI, algorithm, budget, รอบ, oracle"] --> prep["checkout buggy และอ่านคลาสใน classes.modified"]
  prep --> ai1["AI: ประกอบ prompt<br/>template + skill + source ของ buggy เท่านั้น"]
  prep --> al1["Algorithm: ค้นหา input (ดูข้อ 3)"]
  ai1 --> ai2["เรียก AI แต่ละตัวแยกกัน<br/>บันทึกคำตอบดิบ, tokens, cost"]
  ai2 --> ai3{"มีคลาส JUnit ที่ใช้ได้<br/>และอ้างคลาสเป้าหมาย?"}
  ai3 -- ไม่ --> bad["INVALID_OUTPUT หรือ NO_SUITE<br/>หยุด ไม่รัน Defects4J"]
  ai3 -- ใช่ --> suite["test suite (ไฟล์เดียว, SHA-256 เดียว)"]
  al1 --> suite
  suite --> evalb["รันบน buggy: defects4j test และ coverage"]
  suite --> evalf["รันบน fixed: defects4j test และ coverage"]
  evalb --> cls["ตัดสินผล (ดูข้อ 4)"]
  evalf --> cls
  cls --> save["บันทึก benchmark.json, log, coverage, metadata"]
  save --> report["หน้า run, สรุป campaign, export"]
```

## 3. Pipeline ของ algorithm (SA, BPSO, GA, Random ใช้ร่วมกัน)

```mermaid
flowchart TD
  a["checkout และ compile เวอร์ชัน oracle<br/>(buggy ค่าเริ่มต้น หรือ fixed)"] --> b["worker JVM ค้นหาเป้าหมาย<br/>method ที่ประกาศในคลาสที่แก้, คลาส abstract ใช้ subclass, คลาสที่ไม่ public"]
  b --> c["อ่านค่าคงที่ (สตริงและตัวเลข) จาก bytecode ของคลาสเป้าหมาย"]
  c --> d["สร้าง domain ของพารามิเตอร์<br/>ค่าขอบ, null, ค่าคงที่, สตริงตั้งต้นทั่วไป"]
  d --> e["ค้นหาด้วย SA / BPSO / GA / Random<br/>จนหมด budget (เวลาจริง)"]
  e --> f["เก็บ test ที่ให้ผลใหม่<br/>สูงสุด 150 test, 10 ต่อ method"]
  f --> g["replay ใน JVM ใหม่ (เรียงย้อนกลับ)<br/>เก็บเฉพาะผลที่ทำซ้ำได้"]
  g --> h["สร้างคลาส JUnit 4.12<br/>+ SearchInputFactory_scaffolding.java"]
  h --> i["tar.bz2 → ประเมินบน buggy และ fixed"]
```

### 3.1 Simulated Annealing

```mermaid
flowchart TD
  s0["เริ่มจาก candidate สุ่ม<br/>T = 8, epoch = max(1 s, budget/5)"] --> s1{"หมด budget<br/>หรือ suite เต็ม?"}
  s1 -- ใช่ --> send["จบ → replay"]
  s1 -- ไม่ --> s2{"จบ epoch หรือ 3000 รอบ<br/>ไม่พบสิ่งใหม่?"}
  s2 -- ใช่ --> s3["รีสตาร์ตจาก candidate สุ่ม<br/>เริ่ม epoch ใหม่"] --> s1
  s2 -- ไม่ --> s4["neighbour: เปลี่ยน 1-2 ยีนของ method ปัจจุบัน<br/>รันจริงและคำนวณ fitness"]
  s4 --> s5{"fitness ดีขึ้น<br/>หรือ rand < exp((f' - f) / T)?"}
  s5 -- ใช่ --> s6["รับ candidate ใหม่"]
  s5 -- ไม่ --> s7["คงของเดิม"]
  s6 --> s8["T = 8 x (0.05/8)^(เวลาใน epoch / ความยาว epoch)"]
  s7 --> s8
  s8 --> s1
```

### 3.2 Binary PSO

```mermaid
flowchart TD
  p0["12 particle เริ่มจากตำแหน่งสุ่ม<br/>ตำแหน่ง = ยีนเข้ารหัสเป็นบิต"] --> p1{"หมด budget<br/>หรือ suite เต็ม?"}
  p1 -- ใช่ --> pend["จบ → replay"]
  p1 -- ไม่ --> p2["หา gBest จาก pBest ทุกตัว (คำนวณใหม่ทุกรอบ)"]
  p2 --> p3{"3000 รอบ ไม่พบสิ่งใหม่?"}
  p3 -- ใช่ --> p4["สุ่มตำแหน่งใหม่ครึ่งฝูง<br/>รีเซ็ต velocity"]
  p3 -- ไม่ --> p5
  p4 --> p5["แต่ละ particle: v = 0.68 v + 1.45 r1 (pBest - x) + 1.45 r2 (gBest - x)<br/>จำกัด v ที่ ±6"]
  p5 --> p6["แต่ละบิต = 1 ด้วยความน่าจะเป็น sigmoid(v)"]
  p6 --> p7["ถอดรหัสเป็น candidate → รันจริง → fitness"]
  p7 --> p8{"ดีกว่า pBest?"}
  p8 -- ใช่ --> p9["อัปเดต pBest"] --> p1
  p8 -- ไม่ --> p1
```

## 4. การตัดสินผลหลังรัน buggy และ fixed

```mermaid
flowchart TD
  r["ผลรันบน buggy และ fixed"] --> q1{"ทั้งสองเวอร์ชันรัน test ได้จริง?<br/>(PASS/FAIL และมี test ที่ถูกรัน)"}
  q1 -- ไม่ --> nd["NOT_DETERMINED<br/>พร้อมเหตุผล เช่น compile ไม่ผ่าน"]
  q1 -- ใช่ --> q2["หา test method ที่ FAIL บน buggy แต่ไม่ FAIL บน fixed<br/>และกลุ่มกลับกัน (PASS บน buggy, FAIL บน fixed)"]
  q2 --> q3{"มีตัวเข้าเงื่อนไข?"}
  q3 -- ไม่ --> nd2["NOT_DETECTED<br/>(versionsDiffer = false)"]
  q3 -- ใช่ --> q4["รัน suite เดิมซ้ำบน buggy และ fixed"]
  q4 --> q5{"ผลเหมือนเดิมทั้งสองรอบ?"}
  q5 -- "FAIL บน buggy, PASS บน fixed" --> det["BUGGY_FAIL_FIXED_PASS<br/>ตรวจพบ defect"]
  q5 -- "PASS บน buggy, FAIL บน fixed" --> diff["NOT_DETECTED แต่ versionsDiffer = true<br/>(แยกสองเวอร์ชันได้ ไม่นับเป็นการตรวจพบ)"]
  q5 -- ไม่เหมือนเดิม --> nd2
```

## 5. Campaign (หลาย bug / หลายรอบ)

```mermaid
sequenceDiagram
  participant U as ผู้ใช้
  participant C as Controller
  participant W as Worker (BENCH_PARALLELISM ตัว)
  participant R as Defects4jRunner
  participant S as สรุป
  U->>C: POST /dispatch (Project, bugs, รอบ, budget, oracle)
  C->>U: เปิดหน้า campaign
  loop จนครบทุก target
    W->>C: รับ target ถัดไป (bug x รอบ)
    C->>W: สร้าง run (โฟลเดอร์, metadata)
    W->>R: สร้าง suite และประเมินบน Defects4J (จำกัดตามจำนวนขนาน)
    R-->>W: benchmark.json
    W->>S: เขียน campaign-summary.json ใหม่
  end
  U->>C: GET /campaign-summary ทุก ~2.5 วินาที
  C-->>U: ตารางสรุปสด (ต่อวิธี, แยก Project, รายบัก)
  U->>C: GET /campaign-export (xlsx, csv, json)
```

## 6. การประกอบ prompt ของ AI

```mermaid
flowchart LR
  t["prompts/Master_Prompt.md<br/>(template)"] --> m["แทน placeholder ในรอบเดียว"]
  v["Project, Bug, target class/method, report ID"] --> m
  s["source ของคลาสใน classes.modified<br/>จาก buggy checkout เท่านั้น"] --> m
  m --> p["prompt ที่ใช้จริง → prompt-used.txt"]
  k["prompts/TestGeneration_Skill.md<br/>(system instruction)"] --> send["ส่งให้ AI แต่ละตัว"]
  p --> send
  send --> rec["บันทึก promptVersion และ promptSha256 ใน metadata.json"]
```

ไม่มี patch, ไม่มี source ของ fixed และไม่มี test เดิมของ Defects4J อยู่ในข้อมูลที่ส่งให้ AI
