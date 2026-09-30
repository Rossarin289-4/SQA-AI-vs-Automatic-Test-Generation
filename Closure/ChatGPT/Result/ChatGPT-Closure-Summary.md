# สรุปผลการทดสอบ Closure ด้วย ChatGPT

## ข้อมูลการทดลอง

| รายการ | ผลลัพธ์ |
|---|---:|
| Dataset | Defects4J Closure |
| ช่วง Bug ID ที่จัดทำรายงาน | Closure-1 ถึง Closure-170 |
| Bug ID ที่มีผลทดสอบ | 168 |
| Bug ID ที่ไม่มีผลทดสอบ | Closure-63, Closure-93 |
| จำนวนกรณีทดสอบทั้งหมด | 531 |
| กรณีทดสอบที่ตรวจพบบั๊ก | 512 |
| Bug ID ที่ตรวจพบบั๊ก | 166 |
| Fault Detection Rate ต่อ Bug ID ที่มีผล | 98.81% |
| Coverage ที่วัดสำเร็จ | 495 กรณีทดสอบ |
| Coverage ที่ไม่มีข้อมูล | 36 กรณีทดสอบ |
| Line Coverage เฉลี่ย | 41.56% |
| Condition Coverage เฉลี่ย | 30.05% |
| เวลาประมวลผลรวมที่มีข้อมูล | 5,376,370 ms (ประมาณ 89.61 นาที) |
| เวลาเฉลี่ยต่อกรณีที่มีข้อมูล | 10,459.86 ms |

## ผลการทำงานบน Buggy และ Fixed Version

| สถานะ | จำนวน |
|---|---:|
| Buggy version: FAIL | 512 |
| Buggy version: PASS | 2 |
| Buggy version: COMPILE_ERROR | 17 |
| Fixed version: PASS | 531 |

เกณฑ์การตรวจพบบั๊กคือกรณีทดสอบเดียวกันต้องให้ผล `FAIL` บน Buggy version และ `PASS` บน Fixed version จึงนับเป็น `detected=YES`

## สถานะการทดลองแต่ละรอบ

| รอบ | สถานะ | คำอธิบาย |
|---|---|---|
| Result_Round1 | VERIFIED_RESULTS | ผลจริงจาก `chatgpt-results.csv` |
| Result_Round2 | NOT_RUN | ไม่มีไฟล์ผลการรันรอบที่สอง จึงไม่คัดลอกผลรอบแรกมานับซ้ำ |

## ตำแหน่งไฟล์ผลลัพธ์

```text
Closure/ChatGPT/
├── Data/uploaded_results.csv
├── Result_Round1/Closure-1 ... Closure-170
├── Result_Round2/Closure-1 ... Closure-170
├── round1_results.csv
├── round1_tests.csv
├── round2_results.csv
└── round2_tests.csv
```

ภายในแต่ละโฟลเดอร์ Closure มี `result.csv` สำหรับผลสรุปรายบั๊ก และ `selected_tests.csv` สำหรับรายละเอียดแต่ละกรณีทดสอบ

## หมายเหตุการใช้ผล

- ค่า Coverage เฉลี่ยคำนวณจาก 495 กรณีที่วัดสำเร็จเท่านั้น
- เวลารวมและเวลาเฉลี่ยคำนวณจาก 514 กรณีที่มีเวลาของทั้ง Buggy และ Fixed version
- กรณี `COMPILE_ERROR` ถือเป็นข้อผิดพลาดในการคอมไพล์ ไม่ถือเป็นการตรวจพบบั๊ก
- ผล Closure-171 ถึง Closure-176 ถูกแยกออก เพราะรายงานชุดนี้กำหนดช่วง Closure-1 ถึง Closure-170

