# โครงสร้างสำหรับทุกโปรเจกต์ใน Defects4J

อ้างอิงตาราง Defects4J 3.0.1 ในภาพที่แนบมา: **17 โปรเจกต์, 854 active bugs** (ไม่นับ 10 deprecated bugs) รายการโปรเจกต์และจำนวนอยู่ใน `PROJECTS_INDEX.csv` แต่ละโปรเจกต์เป็นโฟลเดอร์ชื่อเดียวกับ Identifier เช่น `Chart/`, `Lang/`, `Time/`

ภายในทุกโปรเจกต์มีรูปแบบตามภาพตัวอย่างของอาจารย์ โดยแทนชื่ออัลกอริทึม/เครื่องมือด้วยวิธีที่กลุ่มเลือก:

```text
ProjectIdentifier/
├── SA/
│   ├── Code/
│   ├── Configuration/
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── Test/
├── BPSO/
│   ├── Code/
│   ├── Configuration/
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── Test/
├── ChatGPT/
│   ├── Prompt/
│   ├── Result/
│   └── TestCode/
└── Gemini/
    ├── Prompt/
    ├── Result/
    └── TestCode/
```

ไฟล์ `bug-index.csv` ของแต่ละโปรเจกต์แสดง active Bug IDs และสถานะ `pending` สำหรับทุกวิธี โดย `Lang` ใช้รายการที่ `lang-study/bug-index.csv` ซึ่งจัดไว้ก่อนแล้ว

**โฟลเดอร์เปล่าเป็นเพียงที่เตรียมเก็บงาน** ไม่ใช่หลักฐานว่าทดสอบ 854 บั๊กแล้ว โค้ดและผลเดิมของ `Lang-3` ยังเก็บที่ `algorithms/`, `ai-tests/`, `results/` โครงสร้างใหม่ยังต้องเติม prompt, test code, ผล buggy/fixed, coverage, เวลาทดลอง และการตั้งค่าจริงสำหรับแต่ละบั๊ก

เริ่มจากทำซ้ำ Lang-3 ให้เข้ารูปแบบนี้ แล้วเลือกบั๊กถัดไปทีละรายการ เมื่อได้ผลจริงจึงแก้สถานะและเก็บ log ลงในโฟลเดอร์ของวิธีนั้น
