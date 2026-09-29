# สรุปผล BPSO — Round 1 และ Round 2

## Round 1

Script รายงาน `Detected faults: 24` หมายถึงพบ **24 test methods** ที่มีผลเป็น `buggy FAIL / fixed PASS`

เมื่อนับในระดับ Bug ID พบว่าสามารถตรวจจับได้ **21 จาก 26 Bugs**

- Fault Detection Rate (FDR): **21 / 26 = 80.77%**
- Chart-6 ถึง Chart-9 มีผล `PASS/PASS` จึงไม่ตรวจพบ fault
- Chart-17 มีผล `FAIL/FAIL` จึงยังไม่สามารถใช้เป็น test ตรวจจับ fault ได้

## Round 2

Script รายงาน `Detected faults: 24` หมายถึงพบ **24 test methods** ที่มีผลเป็น `buggy FAIL / fixed PASS`

เมื่อนับในระดับ Bug ID พบว่าสามารถตรวจจับได้ **21 จาก 26 Bugs**

- Fault Detection Rate (FDR): **21 / 26 = 80.77%**
- Chart-6 ถึง Chart-9 มีผล `PASS/PASS` จึงไม่ตรวจพบ fault
- Chart-17 มีผล `FAIL/FAIL` จึงยังไม่สามารถใช้เป็น test ตรวจจับ fault ได้

## ค่าเฉลี่ย Round 1–2

จำนวน Bug ที่ตรวจจับได้เฉลี่ย:

**(21 + 21) / 2 = 21 Bugs**

Fault Detection Rate เฉลี่ย:

**(80.77% + 80.77%) / 2 = 80.77%**

ดังนั้น BPSO สามารถตรวจจับ fault ได้เฉลี่ย **21 จาก 26 Bugs** หรือมี **Average Fault Detection Rate = 80.77%**

| Round | Detected Bugs | Total Bugs | FDR |
|---|---:|---:|---:|
| Round 1 | 21 | 26 | 80.77% |
| Round 2 | 21 | 26 | 80.77% |
| **Average** | **21** | **26** | **80.77%** |

**สรุป:** จากการทดลอง BPSO จำนวน 2 รอบ สามารถตรวจจับข้อบกพร่องได้เฉลี่ย **21 จาก 26 Bugs** คิดเป็น **Fault Detection Rate เฉลี่ย 80.77%**