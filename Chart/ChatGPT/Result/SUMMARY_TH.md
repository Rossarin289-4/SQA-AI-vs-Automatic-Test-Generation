# สรุปผล ChatGPT — Round 1 และ Round 2

## Round 1

จากการรัน Test Case ที่สร้างโดย ChatGPT กับ Defects4J Chart-1 ถึง Chart-26 พบว่าสามารถตรวจจับได้ **14 จาก 26 Bugs**

- Fault Detection Rate (FDR): **14 / 26 = 53.85%**
- Chart-4, Chart-6 ถึง Chart-9, Chart-11, Chart-21 และ Chart-25 มีผล `PASS/PASS` จึงไม่ตรวจพบ fault
- Chart-1, Chart-13, Chart-14 และ Chart-26 มีผล `COMPILE_ERROR/COMPILE_ERROR` จึงไม่สามารถใช้เป็น test ตรวจจับ fault ได้
- Chart-18 มี 2 test methods ที่มีผล `buggy FAIL / fixed PASS` แต่เมื่อนับในระดับ Bug ID จะนับเป็น **1 Bug**

## Round 2

จากการรัน Test Case ที่สร้างโดย ChatGPT กับ Defects4J Chart-1 ถึง Chart-26 พบว่าสามารถตรวจจับได้ **14 จาก 26 Bugs**

- Fault Detection Rate (FDR): **14 / 26 = 53.85%**
- Chart-4, Chart-6 ถึง Chart-9, Chart-11, Chart-21 และ Chart-25 มีผล `PASS/PASS` จึงไม่ตรวจพบ fault
- Chart-1, Chart-13, Chart-14 และ Chart-26 มีผล `COMPILE_ERROR/COMPILE_ERROR` จึงไม่สามารถใช้เป็น test ตรวจจับ fault ได้
- Chart-18 มี 2 test methods ที่มีผล `buggy FAIL / fixed PASS` แต่เมื่อนับในระดับ Bug ID จะนับเป็น **1 Bug**

## ค่าเฉลี่ย Round 1–2

จำนวน Bug ที่ตรวจจับได้เฉลี่ย:

**(14 + 14) / 2 = 14 Bugs**

Fault Detection Rate เฉลี่ย:

**(53.85% + 53.85%) / 2 = 53.85%**

ดังนั้น ChatGPT สามารถตรวจจับ fault ได้เฉลี่ย **14 จาก 26 Bugs** หรือมี **Average Fault Detection Rate = 53.85%**

| Round | Detected Bugs | Total Bugs | FDR |
|---|---:|---:|---:|
| Round 1 | 14 | 26 | 53.85% |
| Round 2 | 14 | 26 | 53.85% |
| **Average** | **14** | **26** | **53.85%** |

**สรุป:** จากการทดลอง ChatGPT จำนวน 2 รอบ สามารถตรวจจับข้อบกพร่องได้เฉลี่ย **14 จาก 26 Bugs** คิดเป็น **Fault Detection Rate เฉลี่ย 53.85%**