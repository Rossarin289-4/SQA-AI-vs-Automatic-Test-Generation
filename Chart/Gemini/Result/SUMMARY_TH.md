# Gemini Results — Round 1 & Round 2

การทดลองใช้ **Gemini** เพื่อสร้าง Test Case สำหรับทดสอบ Defects4J Chart จำนวน 26 Bug IDs

เกณฑ์การตรวจพบข้อบกพร่อง:

> **Buggy = FAIL และ Fixed = PASS → Fault Detected**

---

## Round 1

- Result: `results-20260929-132702`
- Total Test Methods: **29**
- Detected Faults: **16 / 26**
- Fault Detection Rate: **61.54%**

ดังนั้น Round 1 ตรวจพบข้อบกพร่องทั้งหมด **16 จาก 26 Bugs**

---

## Round 2

- Result: `results-20260929-134620`
- Total Test Methods: **29**
- Detected Faults: **16 / 26**
- Fault Detection Rate: **61.54%**

ดังนั้น Round 2 ตรวจพบข้อบกพร่องทั้งหมด **16 จาก 26 Bugs**

---

## สรุปผล

| Round | Total Test Methods | Detected Faults | Total Bugs | Detection Rate |
|------:|-------------------:|----------------:|-----------:|---------------:|
| 1 | 29 | 16 | 26 | **61.54%** |
| 2 | 29 | 16 | 26 | **61.54%** |

### ค่าเฉลี่ย Round 1–2

- Average Test Methods: **29**
- Average Detected Faults: **16**
- Average Fault Detection Rate: **61.54%**

ทั้ง Round 1 และ Round 2 ให้ผลการตรวจจับข้อบกพร่องเท่ากัน โดยตรวจพบ **16 จาก 26 Bugs (61.54%)**

แม้ผลการตรวจจับจะเท่ากัน แต่ Execution Time ของแต่ละ Test Case สามารถมีความแตกต่างกันในแต่ละรอบ

---

## หมายเหตุ

Test Case ที่ไม่เป็นไปตามเงื่อนไข **Buggy = FAIL และ Fixed = PASS**
จะถูกจัดเป็น **NOT_DETECTED**

ตัวอย่างเช่น:

- Buggy = PASS / Fixed = PASS → **NOT_DETECTED**
- Buggy = FAIL / Fixed = FAIL → **NOT_DETECTED**
- COMPILE_ERROR → **NOT_DETECTED**