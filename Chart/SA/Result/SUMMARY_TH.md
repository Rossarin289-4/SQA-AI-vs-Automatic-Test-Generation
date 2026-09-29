# สรุปผล SA — Round 1

จากการทดลอง Simulated Annealing (SA) กับ Defects4J Chart จำนวนทั้งหมด **26 Bugs**

เมื่อนับในระดับ Bug ID พบว่าสามารถตรวจจับได้ **21 จาก 26 Bugs**

- **Detected Bugs:** 21 Bugs
- **Total Bugs:** 26 Bugs
- **Fault Detection Rate (FDR): 21 / 26 = 80.77%**
- Chart-6 ถึง Chart-9 มีผล `PASS/PASS` จึงไม่สามารถตรวจจับ Fault ได้
- Chart-17 มีผล `FAIL/FAIL` คือ Test ล้มเหลวทั้ง Buggy และ Fixed Version จึงไม่ถือว่าสามารถตรวจจับ Fault ได้

## ตารางสรุป

| Round | Detected Bugs | Total Bugs | FDR |
|---|---:|---:|---:|
| Round 1 | 21 | 26 | 80.77% |

**สรุป:** SA ใน Round 1 สามารถตรวจจับข้อบกพร่องได้ **21 จาก 26 Bugs** คิดเป็น **Fault Detection Rate 80.77%**

## ค่าเฉลี่ย

ขณะนี้มีผลการทดลอง SA ที่รันสำเร็จครบ Chart-1 ถึง Chart-26 จำนวน **1 รอบ** ดังนั้นยังไม่คำนวณค่าเฉลี่ย Round 1–2 จนกว่าจะมีผล Round 2

หลังจากรัน Round 2 แล้วจะคำนวณด้วย:

**Average Detected Bugs = (Round 1 + Round 2) / 2**

**Average FDR = (Round 1 FDR + Round 2 FDR) / 2**