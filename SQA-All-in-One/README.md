# SQA All-in-One — API + SA + BPSO

โฟลเดอร์เดียวสำหรับสร้าง JUnit 4 ด้วยโมเดล API 2 ตัว, SA และ BPSO แล้วประเมิน fixed/buggy, coverage และบันทึก CSV อัตโนมัติ เริ่มที่ **Closure-1** และใช้ **SA/BPSO 30 วินาทีต่อคลาส** เท่ากัน

## เริ่มใช้บน WSL

1. แตก ZIP แล้วเข้าโฟลเดอร์ `SQA-All-in-One` ที่มี `run.sh` (ถ้า `ls` เห็นชื่อโฟลเดอร์อีกชั้น ให้ `cd SQA-All-in-One` อีกครั้ง)
2. รอโปรแกรมชุดเดิมจบรอบก่อน เพื่อลดภาระคอม
3. รัน:

```bash
bash run.sh
```

ครั้งแรกโปรแกรมจะขอ KKU API key แบบไม่แสดงบนจอ แล้วแสดง model IDs จากบัญชี เลือก GPT และ Gemini ที่ต้องการอย่างละตัว เช่น IDs ที่บัญชีเดิมเคยเลือก `gpt-5.6-luna` และ `gemini-3.7-flash` โดยตรวจจากรายการจริงอีกครั้ง ตั้งค่าแล้วบันทึกใน `.env` จึงไม่ต้องใส่ใหม่ทุกครั้ง

โปรแกรมใช้ Defects4J ที่ติดตั้งไว้และค้นหา custom EvoSuite JAR เดิมใต้ `$HOME/SQA/evosuite/master/target` อัตโนมัติ หากมีซอร์สแต่ไม่มี JAR ที่มีคลาส SA/BPSO จะใช้สคริปต์ที่แนบมา build จากซอร์สเดิม ต้องมี Maven และ Python 3

**ไม่ข้าม Chart-1:** ก่อนรันงานที่มี SA/BPSO จะสร้างและตรวจเทส Chart-1 ด้วยทั้งสองอัลกอริทึมก่อน ถ้าจุดตรวจนี้ไม่ผ่านจะหยุดเพื่อให้ตรวจ log ถ้าผ่านและค่าตั้งเดิม โปรแกรมจะ resume จุดตรวจในครั้งถัดไป ผล Chart แยกจาก Closure

จากนั้นทำ Closure-1 ตามลำดับ โมเดล API ตัวที่ 1 → ตัวที่ 2 → SA → BPSO โดยแต่ละวิธีสร้างเทสแล้วตรวจ fixed/buggy และ coverage ทันที ไม่มีการรันหลายวิธีพร้อมกัน

## ผลอยู่ตรงไหน

- `results/Closure/combined_results.csv`: ตารางรวมทุกวิธีและทุกรอบของ Closure
- `results/Closure/<ชื่อวิธีพร้อมรหัส>/round1/results.csv`: ผลเฉพาะวิธี
- `results/Closure/<ชื่อวิธีพร้อมรหัส>/round1/summary.json`: สรุป FDR และจำนวน bug ที่วางแผน/ตรวจได้
- `results/Closure/<ชื่อวิธีพร้อมรหัส>/round1/Closure-1/tests/`: ไฟล์ Java ที่สร้างจริง
- โฟลเดอร์เดียวกับ `tests` มี `result.json`, suite archives และ logs
- API มี `evidence/` เก็บ prompt/คำตอบ/การแก้เทส
- SA/BPSO มี `generation/` เก็บคำสั่งจริงและ `terminal.log`
- `results/Chart/` เก็บจุดตรวจ Chart-1 แยกต่างหาก

ค่า `RESULT_BASE` ที่ค้างมาจากการ source ชุดเก่าจะไม่เปลี่ยนตำแหน่งผลของชุดใหม่ ค่าเริ่มต้นใช้ `results` ข้าง `run.sh` แน่นอน ส่วน checkout สำหรับ compile อยู่ที่ `~/SQA/all-in-one-work` เพื่อลดงานบน OneDrive

ชุดนี้ไม่ย้ายหรือรวมผลเก่าบนเครื่องให้อัตโนมัติ จึงไม่ปะปนกับผลการทดลองใหม่

## คำสั่งที่ใช้บ่อย

```bash
# ทดลอง Closure-1 ทั้ง 4 วิธี (หลังจุดตรวจ Chart-1)
bash run.sh

# ทำทุก active bug ของ Closure
bash run.sh --all

# ทำช่วงที่ต้องการ
bash run.sh --start 2 --end 5

# เฉพาะ API ตามโมเดลที่เลือก
bash run.sh --methods AI

# เฉพาะ SA/BPSO ไม่ต้องใส่ API key
bash run.sh --methods SA BPSO

# เปลี่ยนโปรเจกต์โดยใช้ ID ของ Defects4J
bash run.sh --project Cli --all
bash run.sh --project Chart --all

# รอบใหม่ เมื่อเปลี่ยนงบเวลาหรือค่าการทดลอง
bash run.sh --round 2 --search-budget 30

# ตรวจค่าตั้ง / เลือกโมเดลใหม่
bash run.sh check
bash run.sh setup

# ทดสอบตัวโปรแกรมแบบออฟไลน์ ไม่เรียก KKU API
bash run.sh selftest
```

`Ctrl+C` หยุดได้ แล้วใช้คำสั่งเดิมทำต่อ งานที่เสร็จและ coverage ครบจะถูกข้าม งานที่เปลี่ยน configuration ต้องใช้ `--round` ใหม่ งานล้มเหลวที่ต้องการสร้างเทสใหม่ใช้ `--retry-failed` (สำรองเทสเดิมไว้)

หากต้องตั้ง path เอง ให้แก้ `.env` หลัง setup เช่น:

```dotenv
EVOSUITE_SOURCE="/home/test/SQA/evosuite"
EVOSUITE_JAR="/home/test/SQA/evosuite/master/target/evosuite-master-1.2.1-SNAPSHOT.jar"
DEFECTS4J_BIN="/home/test/defects4j/framework/bin/defects4j"
SEARCH_BUDGET="30"
```

ใช้ absolute paths จริงบนเครื่อง ชุดนี้ไม่ขยาย `$HOME` ภายในค่าที่เขียนเป็นข้อความใน `.env` ถ้าต้อง override จาก terminal ให้ใช้ prefix `SQA_` เช่น `SQA_RESULT_BASE=/home/test/results bash run.sh`

## อ่านผลอย่างถูกต้อง

- `DETECTED`: เทสเดียวกันผ่าน fixed แต่ล้มเหลวบน buggy โดยผ่านการตรวจความเสถียร
- `NOT_DETECTED`: เทสผ่านทั้ง fixed และ buggy ไม่ได้แปลว่าโปรแกรมสร้างเทสเสีย
- `INVALID_FIXED` / `INVALID_BUGGY` / `UNSTABLE_*`: ยังนับเป็นผลตรวจพบ bug ไม่ได้
- build error, timeout, API error หรือไม่มี JUnit file เป็นงานไม่สมบูรณ์ ไม่ใช่ fault detection
- Coverage วัดบน fixed version เฉพาะ `classes.modified` ด้วย external suite ที่สร้างเอง ค่า condition เป็นค่าที่ Defects4J รายงาน
- FDR รายงานทั้งฐาน bug ที่วางแผนทั้งหมดและฐาน bug ที่มีคู่ตรวจใช้ได้ งานผิดพลาดจึงไม่หายไปจากตัวหารแบบ all-planned
- จำนวน `declared_test_methods` คือจำนวนประกาศ @Test ไม่ใช่การรับรองจำนวนเทสที่ execution engine รันจริง

ทุกวิธีสร้างจาก **fixed version** แล้วนำ suite เดียวกันไปตรวจ buggy เพื่อเปรียบเทียบภายใต้ protocol เดียวกัน API แก้ได้เฉพาะจาก feedback ของ fixed ไม่ส่ง buggy failures หรือ triggering tests ให้โมเดล SA/BPSO ไม่ใช้ API แก้เทส

**30 วินาทีเป็น search budget ต่อคลาส** ไม่ใช่เวลารวมของ bug หนึ่งตัว ยังมี checkout, compile, initialization, minimization, assertions, validation และ coverage ส่วน API มีเวลาเรียกโมเดลของตนเอง ไม่บังคับจบที่ 30 วินาที CSV แยก API/generation/setup/test/coverage time ให้

## สิ่งที่ต้องมีและข้อจำกัด

ต้องมี WSL/Linux, Python 3, JDK ที่ใช้กับ Defects4J บนเครื่องได้, Defects4J พร้อม dependencies และ custom EvoSuite source/JAR ที่รองรับ SA/BPSO จริง ZIP นี้รวมโค้ดตัวควบคุมและ overlay แต่ไม่รวม Defects4J, JDK หรือ EvoSuite binary

โปรเจกต์อื่นใช้โครงสร้างเดียวกันผ่าน `--project` แต่ต้องทดลอง bug แรกของแต่ละโปรเจกต์ก่อนรันทั้งหมด เพราะ API ของคลาส ขนาด source และ dependencies ต่างกัน ไม่มีการรับรองว่าจะสร้างเทสผ่านทุก bug

`.env` มี API key ห้ามแชร์หรือ commit มี `.gitignore` ให้แล้ว ไม่มี key จริงหรือผล benchmark จำลองอยู่ใน ZIP สำหรับส่งงาน

ดู `VERIFICATION.md` สำหรับขอบเขตการตรวจชุดนี้
