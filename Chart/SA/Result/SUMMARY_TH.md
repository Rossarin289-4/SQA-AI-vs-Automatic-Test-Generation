# SA Results — Round 3 & Round 4

การทดลองใช้ **Simulated Annealing (SA)** เพื่อคัดเลือก Test Case สำหรับทดสอบ Defects4J Chart จำนวน 26 Bug IDs

เกณฑ์การตรวจพบข้อบกพร่อง:

> **Buggy = FAIL และ Fixed = PASS → Fault Detected**

---

## Round 3

- Result: `results-20260929-125951`
- Selected Scenarios: **26**
- Detected Faults: **21 / 26**
- Fault Detection Rate: **80.77%**

### Bugs ที่ตรวจไม่พบ

- Chart-6 → PASS / PASS
- Chart-7 → PASS / PASS
- Chart-8 → PASS / PASS
- Chart-9 → PASS / PASS
- Chart-17 → FAIL / FAIL

ดังนั้น Round 3 ตรวจพบข้อบกพร่องทั้งหมด **21 จาก 26 Bugs**

---

## Round 4

- Result: `results-20260929-131025`
- Selected Scenarios: **26**
- Detected Faults: **21 / 26**
- Fault Detection Rate: **80.77%**

### Bugs ที่ตรวจไม่พบ

- Chart-6 → PASS / PASS
- Chart-7 → PASS / PASS
- Chart-8 → PASS / PASS
- Chart-9 → PASS / PASS
- Chart-17 → FAIL / FAIL

ดังนั้น Round 4 ตรวจพบข้อบกพร่องทั้งหมด **21 จาก 26 Bugs**

---

## สรุปผล

| Round | Selected Scenarios | Detected Faults | Total Bugs | Detection Rate |
|------:|-------------------:|----------------:|-----------:|---------------:|
| 3 | 26 | 21 | 26 | **80.77%** |
| 4 | 26 | 21 | 26 | **80.77%** |

### ค่าเฉลี่ย Round 3–4

- Average Selected Scenarios: **26**
- Average Detected Faults: **21**
- Average Fault Detection Rate: **80.77%**

ทั้ง Round 3 และ Round 4 ให้ผลการตรวจจับข้อบกพร่องเท่ากัน โดยตรวจพบ **21 จาก 26 Bugs (80.77%)**

แม้ผลการตรวจจับจะเท่ากัน แต่ Execution Time ของแต่ละ Test Case มีความแตกต่างกันในแต่ละรอบ