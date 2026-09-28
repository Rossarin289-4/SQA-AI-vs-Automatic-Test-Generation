# แผนทดลองทุกบั๊กที่ยังใช้งานได้ใน Lang

โครงงานเดิมทดลอง `Lang-3` กับ ChatGPT, Gemini และ SA ส่วนโฟลเดอร์นี้เตรียมการทดลอง **61 active bug IDs** ของโปรเจกต์ Apache Commons Lang ใน Defects4J รายการอ้างอิงมาจาก `framework/projects/Lang/active-bugs.csv` ของ Defects4J (ตรวจสอบกับรุ่นที่ใช้จริงอีกครั้งก่อนรัน) โดยข้ามบั๊กที่ deprecated ได้แก่ 2, 18, 25 และ 48 โฟลเดอร์ส่งงานตามภาพตัวอย่างอยู่ใน [`Lang/`](../Lang/README.md)

**สถานะ ณ การสร้างโครงสร้างนี้:** `bug-index.csv` และ `bugs/Lang-*/STATUS.md` เป็นรายการงาน `pending` ไม่ใช่ผลการทดลอง ไม่มีการอ้างว่า 61 บั๊กผ่านการรันแล้ว ผลเดิมของ Lang-3 ยังอยู่ที่ `ai-tests/` และ `results/` ในระดับบนสุด และยังไม่ย้ายเข้ามารวมโดยอัตโนมัติ

## โครงสร้าง

```text
lang-study/
├── README.md                 วิธีทำซ้ำและสถานะ
├── bug-index.csv             61 active IDs และสถานะของแต่ละวิธี
├── bugs/
│   └── Lang-<id>/STATUS.md   บันทึกงานของบั๊กนั้น
└── runs/                    ผลรันจริง สร้างเมื่อรันสคริปต์
    └── Lang-<id>/baseline/   logs และ summary.json ของ triggering tests เดิม

scripts/
└── run_lang_baseline.py      ตรวจสภาพแวดล้อมด้วย triggering tests เดิม

Lang/                         โครงสร้างส่งงานตามตัวอย่างในภาพ (SA, BPSO, ChatGPT, Gemini)

ai-tests/                    ชุดทดสอบเดิมจากแต่ละวิธีสำหรับ Lang-3
algorithms/                  SA สำหรับ Lang-3 (ยังต้องออกแบบสำหรับบั๊กอื่น)
results/                     ผลทดลองเดิมสำหรับ Lang-3
projects/                    checkout ระหว่างรัน; ไม่ใส่ใน Git/ZIP
```

PDF ของอาจารย์ไม่ได้กำหนดชื่อโฟลเดอร์เฉพาะ แต่ต้องจัด GitHub อย่างเป็นระบบและส่ง source code, test code, prompt, configuration และผลให้คนอื่นทำซ้ำได้ โครงสร้างนี้เป็นการจัดตามข้อกำหนดดังกล่าว ไม่ใช่รูปแบบที่อาจารย์ระบุไว้ตายตัว

## ขั้นแรก: ตรวจ baseline ของทั้ง 61 บั๊ก

ใช้บนเครื่องที่ติดตั้ง Defects4J พร้อม dependency ครบและตั้ง `PATH` แล้ว README ของ Defects4J 3.0.1 ระบุ Java 11 สำหรับการทำซ้ำที่ตรวจสอบไว้ ควรใช้ Java 11 และบันทึกรุ่น Defects4J ด้วย เครื่องที่ใช้ Java รุ่นอื่นอาจได้ผลต่างกัน

```bash
cd /path/to/SQA-AI-vs-Automatic-Test-Generation
defects4j info -p Lang
python3 scripts/run_lang_baseline.py --all --list
python3 scripts/run_lang_baseline.py --ids 3 --dry-run
python3 scripts/run_lang_baseline.py --ids 3
python3 scripts/run_lang_baseline.py --all --resume
```

สคริปต์จะ checkout รุ่น `b` และ `f` ของแต่ละบั๊ก, compile, ขอชื่อ `tests.trigger`, รันทดสอบเดิมทีละเคสทั้งสองรุ่น และบันทึก log กับ `summary.json` ที่ `lang-study/runs/Lang-<id>/baseline/` พร้อมอัปเดตสถานะ baseline ในดัชนี ถ้ามีปัญหาจะเก็บสถานะ `error` และไปบั๊กถัดไป; `--resume` ข้ามเฉพาะบั๊กที่มีผล `verified` แล้ว ส่วน `unexpected_result` ยังต้องตรวจ log ไม่ใช่ผลตรวจพบบั๊กของวิธีใด

**ข้อสำคัญ:** การรัน baseline ใช้ **triggering tests ที่ Defects4J ให้มา** จึงใช้พิสูจน์ว่าระบบทดลองทำงานและบั๊กทำซ้ำได้เท่านั้น **ห้ามนับเป็น test ที่ ChatGPT, Gemini, SA หรือ BPSO สร้าง**

## ขั้นต่อไป: สร้างและวัดชุดทดสอบใหม่

สำหรับ **แต่ละ Bug ID** ให้ศึกษาคลาสและเมธอดที่แก้จริง (ใช้ `defects4j query` หรือ `export -p classes.modified`), เตรียม prompt ที่บันทึกได้, สร้างชุดทดสอบใหม่จากทั้ง 4 วิธี, รันชุดเดียวกันบนรุ่น `b` และ `f`, วัด coverage และเวลา พร้อมบันทึกจำนวน test และการตั้งค่า SA/BPSO แต่ละวิธีต้องมีบันทึกผลและ test code ของตัวเอง โดยไม่ปะปนกับ baseline

เมื่อผลวิธีใดพร้อม จึงแก้สถานะของวิธีนั้นใน `bug-index.csv` และ `bugs/Lang-<id>/STATUS.md` พร้อมระบุ path ของหลักฐาน ห้ามเปลี่ยนสถานะเป็นเสร็จจากการมีโฟลเดอร์หรือการรัน baseline เพียงอย่างเดียว

การวัดทั้งหมด 61 บั๊กด้วยทั้ง 4 วิธี **ยังไม่เสร็จ** เพราะตัวสร้าง SA เดิมผูกกับ `NumberUtils.createNumber(String)` ของ Lang-3 และใน ZIP เดิมไม่มี BPSO งานต่อจึงรวมถึงการทำ generator สำหรับบั๊กอื่นและนำ BPSO ที่เคยพัฒนาบนเครื่องของกลุ่มมาเก็บเป็นไฟล์จริง ก่อนวัดผลและเปรียบเทียบอย่างเป็นธรรม
