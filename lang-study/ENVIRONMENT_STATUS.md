# ผลตรวจสภาพแวดล้อมและขอบเขตผลจริง

วันที่จัดเตรียม: 2026-09-28

## สิ่งที่ตรวจแล้วในสภาพแวดล้อมจัดไฟล์นี้

- `bug-index.csv` มี 61 active Lang IDs ไม่รวม deprecated IDs 2, 18, 25, 48
- สคริปต์ Python ผ่านการตรวจ syntax และแสดงครบ 61 IDs ด้วย `--all --list`
- ทดสอบการควบคุมคำสั่งกับ Defects4J **จำลอง** หนึ่งบั๊กเพื่อเช็กการสร้าง log, การแยกผล b/f, และ `--resume`; ผลจำลองนี้ไม่ได้อยู่ในผลทดลองโครงงาน
- คำสั่ง Defects4J จริงจากสำเนาที่ดาวน์โหลดมาในสภาพแวดล้อมนี้หยุดด้วยข้อความ `Java 11 is required!` เพราะ Java ที่มีคือ OpenJDK 17; ยังไม่ได้ initialize dependencies ของ Defects4J และไม่มีผล baseline ของ 61 บั๊กใน ZIP นี้

## สถานะการทดลองจริง

ผล Lang-3 เดิมของ ChatGPT, Gemini และ SA อยู่ใน `ai-tests/` กับ `results/` ตามไฟล์เดิม ส่วน 60 บั๊ก Lang ที่เหลือยังไม่มีชุดทดสอบใหม่จาก 4 วิธีในไฟล์นี้ BPSO ไม่อยู่ใน ZIP ต้นฉบับ อย่านำ baseline ที่ใช้ triggering test เดิมมานับเป็นผลของวิธีสร้าง test ใหม่

## บน WSL เครื่องที่ติดตั้ง Defects4J ของกลุ่ม

1. ตรวจ `java -version` และ `defects4j info -p Lang`; ตามคู่มือ Defects4J 3.0.1 ใช้ Java 11 สำหรับสภาพแวดล้อมที่ตรวจรับรอง
2. เริ่มด้วย `python3 scripts/run_lang_baseline.py --ids 3` และตรวจ `lang-study/runs/Lang-3/baseline/summary.json` กับ log
3. เมื่อถูกต้องจึงใช้ `python3 scripts/run_lang_baseline.py --all --resume`; ใช้เวลามากและอาจพบปัญหาเฉพาะบั๊ก
4. สร้าง test ใหม่ด้วย ChatGPT, Gemini, SA และ BPSO สำหรับแต่ละบั๊ก แล้ววัดผลแยกจาก baseline
