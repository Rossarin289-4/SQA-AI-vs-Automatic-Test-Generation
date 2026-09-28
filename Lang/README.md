# โครงสร้างการทดลองโปรเจกต์ Lang

จัดตามตัวอย่างโฟลเดอร์ในภาพโจทย์: `ProjectName` → `Lang`; `AlgorithmName1/2` → `SA`/`BPSO`; ส่วน AI → `ChatGPT`/`Gemini` โฟลเดอร์เหล่านี้เป็น **พื้นที่เตรียมงาน** ยังไม่มีผลการทดลองใหม่

```text
Lang/
├── SA/
│   ├── Code/             โค้ดอัลกอริทึม
│   ├── Configuration/    seed, budget, candidate pool และเงื่อนไขรัน
│   ├── Result_Round1/   ผลการทดลองรอบที่ 1
│   ├── Result_Round2/   ผลการทดลองรอบที่ 2
│   └── Test/             JUnit Test Case ที่ SA สร้าง
├── BPSO/
│   ├── Code/
│   ├── Configuration/
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── Test/
├── ChatGPT/
│   ├── Prompt/           คำสั่งที่ใช้ให้ AI สร้าง test
│   ├── Result/           log, coverage, เวลา และสรุปผล
│   └── TestCode/         JUnit Test Case ที่ AI สร้าง
└── Gemini/
    ├── Prompt/
    ├── Result/
    └── TestCode/
```

เมื่อเริ่มแต่ละบั๊ก ให้แยกย่อยเป็น `Lang-<id>/` ใต้ `Test`, `TestCode`, `Prompt` และ `Result*` ของวิธีนั้น เช่น `Lang/SA/Test/Lang-3/` และ `Lang/Gemini/Result/Lang-4/` ทำให้ไฟล์ 61 บั๊กไม่ปะปนกัน รายการบั๊กที่ต้องทำอยู่ใน `lang-study/bug-index.csv`; โฟลเดอร์ `lang-study/bugs/` เป็นรายการสถานะ ส่วน `scripts/run_lang_baseline.py` ใช้ triggering tests เดิมเพื่อตรวจระบบก่อนสร้างชุดทดสอบใหม่

โค้ดและผล `Lang-3` จาก ZIP เดิมยังอยู่ใน `algorithms/`, `ai-tests/`, `results/` เพื่อคงหลักฐานต้นฉบับไว้ ยังไม่ได้ย้ายหรืออ้างว่าโฟลเดอร์ใหม่มีผลทดลองแล้ว
