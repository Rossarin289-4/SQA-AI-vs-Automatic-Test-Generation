## 📊 สถานะการดำเนินงาน Defects4J Dataset

| ผู้รับผิดชอบ | Dataset Project | Project Name | Active Bugs | Bug IDs | สถานะ |
|---|---|---|---:|---|---|
| **สโรชา เสาทอง** | **Chart** | jfreechart | **26** | Chart-1 ถึง Chart-26 | ✅ ดำเนินการแล้ว|
| **สโรชา**| Cli | commons-cli | 39 | 1-5, 7-40 | ✅ ดำเนินการแล้ว |
|  **สโรชา** | Closure | closure-compiler | 174 | 1-62, 64-92, 94-176 |✅ ดำเนินการแล้ว |
|  **สโรชา** | Codec | commons-codec | 18 | 1-18 | ✅ ดำเนินการแล้ว |
| **สโรชา**  | Collections | commons-collections | 28 | 1-28 | ✅ ดำเนินการแล้ว |
| -**สโรชา** | Compress | commons-compress | 47 | 1-47 | ✅ ดำเนินการแล้ว |
| **สโรชา**  | Csv | commons-csv | 16 | 1-16 | ✅ ดำเนินการแล้ว |
| **สโรชา**  | Gson | gson | 18 | 1-18 | ✅ ดำเนินการแล้ว |
| **สโรชา** | JacksonCore | jackson-core | 26 | 1-26 | ✅ ดำเนินการแล้ว |
| - | JacksonDatabind | jackson-databind | 110 | 1-64, 66-88, 90-112 | ⏳ ยังไม่ดำเนินการ |
| **สโรชา** | JacksonXml | jackson-dataformat-xml | 6 | 1-6 | ✅ ดำเนินการแล้ว |
| - | Jsoup | jsoup | 93 | 1-93 | ⏳ ยังไม่ดำเนินการ |
| **กัญญาวี ศรีเหรา** | JxPath | commons-jxpath | 22 | 1-22 | ⏳ กำลังดำเนินการ |
| - | Lang | commons-lang | 61 | 1, 3-17, 19-24, 26-47, 49-65 | ⏳ ยังไม่ดำเนินการ |
| - | Math | commons-math | 106 | 1-106 | ⏳ ยังไม่ดำเนินการ |
| **กัญญาวี ศรีเหรา** | Mockito | mockito | 38 | 1-38 | ⏳ กำลังดำเนินการ |
| **กัญญาวี ศรีเหรา** | Time | joda-time | 26 | 1-20, 22-27 | ✅ ดำเนินการแล้ว |

# 1. ข้อมูลโครงงาน

## ชื่อโครงงาน

**AI-Assisted Testing vs. Automatic Test Case Generation Algorithms: A Benchmark and Test Coverage Evaluation**

**รายวิชา:** CP353201 Software Quality Assurance  
**ปีการศึกษา:** 1/2569

โครงงานนี้ศึกษาและเปรียบเทียบการสร้าง Test Case แบบอัตโนมัติด้วย 2 แนวทาง ได้แก่

1. **Generative AI / AI-Assisted Testing**
2. **Automatic Test Case Generation Algorithms**

โดยใช้ **ChatGPT, Gemini, Simulated Annealing (SA) และ Particle Swarm Optimization (PSO)** ในการสร้าง Test Case และนำผลลัพธ์มาทดลองกับ Java Project เดียวกัน เพื่อประเมินและเปรียบเทียบผลการทำงานของแต่ละแนวทาง

--- 
# 2. สมาชิกกลุ่ม

## Group 10

| ลำดับ | ชื่อ | รหัสนักศึกษา |
|:---:|---|:---:|
| 1 | นางสาวกัญญาวี ศรีเหรา | 673380026-6 |
| 2 | นางสาวรสริน เมืองหงษ์ | 673380289-4 |
| 3 | นางสาวสโรชา เสาทอง | 673380296-7 |

---

# 3. Repository Structure

โครงสร้าง Repository ของโครงงานแบ่งออกเป็นส่วนหลัก ได้แก่

```text
SQA_Project/
│
├── README.md
├── .gitignore
│
├── algorithms/
│   ├── sa/
│   │   └── SimulatedAnnealingGenerator.java
│   │
│   └── pso/
│
├── ai-tests/
│   ├── chatgpt/
│   ├── gemini/
│   │
│   ├── sa/
│   │   ├── suite/
│   │   │   └── org/apache/commons/lang3/math/
│   │   │       └── NumberUtilsCreateNumberSATest.java
│   │   │
│   │   └── Lang-3b-sa.1.tar.bz2
│   │
│   └── pso/
│
├── results/
│   ├── chatgpt/
│   ├── gemini/
│   ├── sa/
│   ├── pso/
│   │
│   └── summary/
│       ├── ai_results.txt
│       └── sa_result.txt
│
└── projects/
    ├── Lang-3/
    └── Lang-3-fixed/
```

## Folder Description

| Folder | รายละเอียด |
|---|---|
| `algorithms/` | Source Code ของ Automatic Test Case Generation Algorithms |
| `algorithms/sa/` | Implementation ของ Simulated Annealing |
| `algorithms/pso/` | Implementation ของ Particle Swarm Optimization |
| `ai-tests/` | Generated Test Cases จากแต่ละวิธี |
| `ai-tests/chatgpt/` | Test Cases ที่สร้างโดย ChatGPT |
| `ai-tests/gemini/` | Test Cases ที่สร้างโดย Gemini |
| `ai-tests/sa/` | Test Suite ที่สร้างโดย SA |
| `ai-tests/pso/` | Test Suite ที่สร้างโดย PSO |
| `results/` | ผลการทดลองทั้งหมด |
| `results/chatgpt/` | ผลการ Execute และ Coverage ของ ChatGPT |
| `results/gemini/` | ผลการ Execute และ Coverage ของ Gemini |
| `results/sa/` | ผลการทดลองของ SA |
| `results/pso/` | ผลการทดลองของ PSO |
| `results/summary/` | Summary Results |
| `projects/` | Local Defects4J Project สำหรับการทดลอง |

> **หมายเหตุ:** `projects/` เป็นพื้นที่สำหรับเก็บ Defects4J Project ที่ใช้ในการทดลองบนเครื่อง Local และอาจถูกกำหนดให้ไม่ถูก Commit ขึ้น Repository ตาม `.gitignore`

---

# 4. ที่มาและแนวคิดของโครงงาน

การสร้าง Test Case เป็นขั้นตอนสำคัญของ Software Testing แต่การออกแบบ Test Case ด้วยวิธีการ Manual อาจใช้เวลาและทรัพยากรจำนวนมาก โดยเฉพาะเมื่อระบบมีจำนวน Branch, Condition และ Input ที่หลากหลาย

ในปัจจุบันมีทั้ง Generative AI และ Automatic Test Case Generation Algorithms ที่สามารถนำมาใช้ช่วยสร้าง Test Case ได้ ดังนั้นโครงงานนี้จึงมุ่งศึกษาความสามารถของทั้งสองแนวทาง และเปรียบเทียบผลลัพธ์จากการนำไปใช้กับ Software Project จริง

โครงงานเลือกใช้ทั้ง AI และ Algorithm เพื่อให้สามารถศึกษาความแตกต่างในด้านการสร้าง Test Case, Test Coverage, Fault Detection และเวลาที่ใช้ในการสร้าง Test Case

แนวทางที่นำมาเปรียบเทียบประกอบด้วย

- ChatGPT
- Gemini
- Simulated Annealing (SA)
- Particle Swarm Optimization (PSO)

ทั้ง 4 แนวทางจะถูกนำไปใช้กับ Java Project และ Method Under Test เดียวกัน และ Test Case ที่สร้างขึ้นจะถูกนำไป Compile และ Execute กับ Project จริง

---

# 5. วัตถุประสงค์

โครงงานมีวัตถุประสงค์ดังต่อไปนี้

1. ศึกษาการใช้ Automatic Test Case Generation Algorithms เพื่อสร้าง Test Input และ Test Case แบบอัตโนมัติ
2. ศึกษาการใช้ Generative AI หรือ AI-Assisting Tools เพื่อสร้าง Unit Test
3. ตรวจสอบความถูกต้องของ Test Case ที่สร้างขึ้นโดยการ Compile และ Execute กับ Java Project จริง
4. วัด Test Coverage และ Code Coverage ของ Test Case ที่สร้างขึ้น
5. เปรียบเทียบความสามารถในการตรวจพบ Fault ของแต่ละแนวทาง
6. เปรียบเทียบจำนวน Test Case ที่สร้างขึ้น
7. เปรียบเทียบเวลาที่ใช้ในการสร้าง Test Case
8. เปรียบเทียบเวลาที่ใช้ในการ Execute Test Case
9. ศึกษาความแตกต่างระหว่าง AI-Assisted Testing และ Algorithm-Based Automatic Test Case Generation

---

# 6. วิธีการที่ใช้ในการทดลอง

โครงงานเลือกใช้ทั้งหมด **4 วิธี**

## 6.1 ChatGPT

ใช้ Generative AI ในการวิเคราะห์ Source Code และสร้าง JUnit Test Case โดยใช้ Prompt ที่ออกแบบขึ้นสำหรับการทดลอง

ChatGPT จะได้รับข้อมูลเกี่ยวกับ

- Project
- Bug ID
- Class
- Method Under Test
- Source Code
- Testing Requirements
- ขอบเขตของ Input
- เงื่อนไขของการทดลอง

จากนั้น AI จะสร้าง Test Case และ JUnit Test Code สำหรับนำไปทดลองจริง

---

## 6.2 Gemini

Gemini ถูกนำมาใช้ในลักษณะเดียวกับ ChatGPT เพื่อให้การเปรียบเทียบมีความเป็นธรรม

Gemini ได้รับข้อมูลของ Project, Bug, Class และ Method เดียวกัน และใช้ Prompt ที่ออกแบบให้มีวัตถุประสงค์เดียวกัน

ผลลัพธ์ที่ได้จะถูกนำไป Compile และ Execute กับ Project จริงเช่นเดียวกับ ChatGPT

---

## 6.3 Simulated Annealing (SA)

Simulated Annealing เป็น Search-Based Algorithm ที่นำมาใช้สำหรับค้นหาชุด Test Case จาก Candidate Input Pool ที่กำหนดไว้

ค่าที่ใช้ในการทดลอง SA ได้แก่

| รายการ | ค่า |
|---|---:|
| Random Seed | `20260923` |
| Candidate Pool | `36` |
| Test Suite Size | `12` |
| Iterations | `5,000` |
| Initial Temperature | `10.0` |
| Cooling Rate | `0.995` |

Algorithm จะเริ่มจาก Test Suite เริ่มต้น จากนั้นทำการเปลี่ยน Test Input ภายในชุดและประเมินค่า Fitness เพื่อค้นหาชุด Test Case ที่เหมาะสม

การทดลองนี้ใช้ **Feature-Based Surrogate Fitness** โดยพิจารณาคุณลักษณะของ Input เช่น

- Null
- Integer
- Hexadecimal
- Decimal
- Exponent
- Numeric Suffix
- Underflow
- Overflow
- Floating-Point Precision
- Invalid Input

Fitness ดังกล่าวเป็นค่า Heuristic ที่ใช้ช่วยนำทางการค้นหา และไม่ได้คำนวณ Runtime Coverage ในทุก Iteration

---

## 6.4 Particle Swarm Optimization (PSO)

Particle Swarm Optimization เป็น Algorithm ที่มีแนวคิดมาจากการเคลื่อนที่ร่วมกันของกลุ่มอนุภาค โดยแต่ละ Particle จะค้นหาคำตอบที่เหมาะสมจาก Search Space

ในโครงงานนี้ PSO ถูกกำหนดให้ใช้สำหรับการค้นหา Test Suite จาก Candidate Test Inputs เช่นเดียวกับ SA เพื่อให้สามารถเปรียบเทียบ Algorithm ทั้งสองได้

> **สถานะปัจจุบันของ Repository:** ส่วน PSO อยู่ในขั้นตอนการพัฒนา/ทดลอง และยังไม่ถือเป็นผลการทดลองที่เสร็จสมบูรณ์

---

# 7. Dataset และ Software Project

โครงงานเลือกใช้ **Defects4J** ซึ่งเป็น Dataset สำหรับการทดลอง Software Testing และ Fault Detection บน Java Projects จริง

Project ที่เลือกคือ

**Apache Commons Lang**

และ Bug ที่เลือกคือ

**Lang-3**

รายละเอียดของ Bug ได้แก่

| รายการ | รายละเอียด |
|---|---|
| Project | Apache Commons Lang |
| Bug ID | Lang-3 |
| Bug Report | LANG-693 |
| Buggy Version | Lang-3b |
| Fixed Version | Lang-3f |
| Class | `org.apache.commons.lang3.math.NumberUtils` |
| Method Under Test | `createNumber(String)` |
| Testing Framework | JUnit 4.12 |

Bug Report ที่เกี่ยวข้องคือ

**LANG-693**

และ Trigger Test ของ Defects4J คือ

```text
org.apache.commons.lang3.math.NumberUtilsTest::testStringCreateNumberEnsureNoPrecisionLoss
```

---

# 8. Version ที่ใช้ในการทดลอง

การทดลองใช้ Defects4J Buggy Version และ Fixed Version เพื่อเปรียบเทียบความสามารถในการตรวจพบ Fault

## Buggy Version

```text
Lang-3b
```

เป็น Version ที่มี Bug ของ LANG-693

## Fixed Version

```text
Lang-3f
```

เป็น Version ที่ Bug ได้รับการแก้ไขแล้ว

หลักการตรวจ Fault Detection คือ Test Case จะถือว่าสามารถตรวจพบ Bug ได้เมื่อ

```text
Buggy Version  -> Test FAIL
Fixed Version  -> Test PASS
```

รูปแบบนี้ช่วยตรวจสอบว่า Test Case สามารถตรวจพบพฤติกรรมที่แตกต่างระหว่าง Buggy และ Fixed Version ได้หรือไม่

---

# 9. Method Under Test

Method ที่ใช้ในการทดลองคือ

```java
NumberUtils.createNumber(String)
```

Method นี้อยู่ใน Class

```text
org.apache.commons.lang3.math.NumberUtils
```

Method `createNumber(String)` ทำหน้าที่แปลง String ที่เป็นตัวแทนของตัวเลขให้เป็นชนิด `Number` ที่เหมาะสม เช่น

- Integer
- Long
- BigInteger
- Float
- Double
- BigDecimal

และมีการจัดการ Input หลายรูปแบบ เช่น

- Null
- Blank String
- Integer
- Floating Point
- Exponent
- Hexadecimal
- Long suffix
- Float suffix
- Double suffix
- Invalid Input

ดังนั้น Method นี้จึงมีหลาย Branch และ Condition ซึ่งเหมาะสำหรับนำมาใช้ในการทดลอง Automatic Test Case Generation

---

# 10. Metrics ที่ใช้ในการประเมินผล

โครงงานใช้ Metrics หลักในการเปรียบเทียบผลลัพธ์ของแต่ละวิธี ดังนี้

## 10.1 Test Coverage

ใช้ตรวจสอบว่าชุด Test Case สามารถเข้าถึงส่วนต่าง ๆ ของ Program ได้มากน้อยเพียงใด

---

## 10.2 Code Coverage Ratio

ใช้วัดสัดส่วนของ Code ที่ถูก Execute โดย Test Case

ในการทดลองมีการเก็บข้อมูล เช่น

- Line Coverage
- Condition Coverage

โดยรายงานทั้งจำนวนที่ Covered และจำนวนทั้งหมด

ตัวอย่าง

```text
Line Coverage = Lines Covered / Lines Total × 100
```

---

## 10.3 Fault Detection Rate

ใช้วัดความสามารถของ Test Suite ในการตรวจพบ Bug ที่กำหนด

สำหรับการทดลองที่มี Bug จำนวน 1 ตัว

```text
Fault Detection Rate =
Number of detected faults / Total faults × 100
```

หาก Test Suite ทำให้ Buggy Version FAIL และ Fixed Version PASS จะถือว่าสามารถตรวจพบ Fault ได้

---

## 10.4 Number of Test Cases

ใช้วัดจำนวน Test Case ที่ถูกสร้างขึ้นโดยแต่ละวิธี

ผลการทดลองปัจจุบัน

```text
ChatGPT = 26 Test Cases
Gemini = 15 Test Cases
SA = 12 Test Cases
```

---

## 10.5 Generation Time

เวลาที่ใช้ในการสร้าง Test Case หรือ Test Suite โดยแต่ละวิธี

สำหรับ Algorithm จะวัดเวลาที่ใช้ในการทำงานของ Generator

---

## 10.6 Execution Time

เวลาที่ใช้ในการ Compile และ Execute Generated Test Suite กับ Defects4J Project

สำหรับการทดลอง SA ใช้ค่า `real` จาก Command Line เป็น Elapsed Execution Time

---

# 11. AI Prompt Design

เพื่อให้การเปรียบเทียบระหว่าง ChatGPT และ Gemini มีความเป็นธรรม จึงออกแบบ Prompt ให้มีโครงสร้างและข้อมูลหลักเหมือนกัน

Prompt ประกอบด้วยข้อมูลสำคัญ ได้แก่

1. Project Information
2. Defects4J Bug Information
3. Class Information
4. Method Under Test
5. Source Code
6. Testing Requirements
7. Input Domain
8. Boundary Cases
9. Invalid Cases
10. Special Cases
11. Precision Cases
12. Bug-oriented Test Cases
13. JUnit Requirements

AI ถูกกำหนดให้

- วิเคราะห์ Source Code ก่อน
- ระบุ Branch ที่สำคัญ
- วิเคราะห์ Input Domain
- ออกแบบ Normal Cases
- ออกแบบ Boundary Cases
- ออกแบบ Invalid Cases
- ออกแบบ Special Cases
- ให้ความสำคัญกับ LANG-693
- ไม่แก้ไข Source Code
- ไม่สร้าง API ที่ไม่มีอยู่จริง
- ไม่อ้างพฤติกรรมของ Method โดยไม่มีหลักฐาน
- แยกสิ่งที่วิเคราะห์จากผลการทดลองจริง
- ไม่ใช้ Original Defects4J Trigger Test โดยตรงเป็น Test Case ที่สร้างขึ้นใหม่

---

# 12. AI-Generated Test Cases

## 12.1 ChatGPT

ChatGPT ใช้ Source Code และ Prompt ที่กำหนดเพื่อวิเคราะห์ Method และสร้าง JUnit Test Case

จำนวน Test Case ที่สร้างได้คือ

```text
26 Test Cases
```

Test Cases ครอบคลุม Input หลายประเภท เช่น

- Null
- Blank
- Integer
- Long
- BigInteger
- Hexadecimal
- Floating Point
- Exponent
- Float Suffix
- Double Suffix
- Long Suffix
- Invalid Input
- Precision-related Input
- Overflow
- Underflow

---

## 12.2 Gemini

Gemini ใช้ข้อมูล Project, Bug, Class และ Method เดียวกับ ChatGPT และใช้ Prompt ที่มีวัตถุประสงค์เดียวกัน

จำนวน Test Case ที่สร้างได้คือ

```text
15 Test Cases
```

Test Cases ครอบคลุม Input หลายประเภท เช่น

- Null
- Blank
- Integer
- Long
- BigInteger
- Hexadecimal
- Float
- Double
- Exponent
- Overflow
- Underflow
- Invalid Suffix
- Precision-related Input

---

# 13. ผลการทดลอง ChatGPT

## 13.1 Buggy Version - Lang-3b

ChatGPT Generated Test Suite:

```text
Tests run: 26
Failures: 3
```

Test ที่ Fail ได้แก่

```text
testFloatingPointPrecisionDecimal
testFloatingPointPrecisionNearFloatMaximum
testFloatingPointPrecisionLargeDecimal
```

Coverage:

```text
Lines Total        = 373
Lines Covered      = 119
Line Coverage      = 31.9%

Conditions Total   = 334
Conditions Covered = 80
Condition Coverage = 24.0%
```

---

## 13.2 Fixed Version - Lang-3f

```text
Tests run: 26
Failures: 1
```

เหลือ Failure ใน

```text
testFloatingPointPrecisionLargeDecimal
```

Coverage:

```text
Lines Total        = 375
Lines Covered      = 121
Line Coverage      = 32.3%

Conditions Total   = 338
Conditions Covered = 82
Condition Coverage = 24.3%
```

ผลลัพธ์ของ ChatGPT จึงต้องพิจารณาจากการ Execute จริงทั้ง Buggy และ Fixed Version ไม่ควรสรุปจากการวิเคราะห์ Source Code เพียงอย่างเดียว

---

# 14. ผลการทดลอง Gemini

## 14.1 Buggy Version - Lang-3b

```text
Tests run: 15
Failures: 3
```

Failures ประกอบด้วย

```text
testCreateNumber_HexadecimalLong
testCreateNumberPrecisionLoss_LANG_693_Double
testCreateNumberPrecisionLoss_LANG_693_BigDecimal
```

Coverage:

```text
Lines Total        = 373
Lines Covered      = 110
Line Coverage      = 29.5%

Conditions Total   = 334
Conditions Covered = 71
Condition Coverage = 21.3%
```

---

## 14.2 Fixed Version - Lang-3f

```text
Tests run: 15
Failures: 1
```

Failure ที่เหลือคือ

```text
testCreateNumber_HexadecimalLong
```

Coverage:

```text
Lines Total        = 375
Lines Covered      = 112
Line Coverage      = 29.9%

Conditions Total   = 338
Conditions Covered = 75
Condition Coverage = 22.2%
```

Test Case ที่เกี่ยวข้องกับ LANG-693 ทั้งสองกรณี Fail ใน Buggy Version และ Pass ใน Fixed Version จึงแสดงให้เห็นว่า Test Case เหล่านี้สามารถตรวจพบความแตกต่างของ Bug ที่กำหนดได้

ส่วน `testCreateNumber_HexadecimalLong` พบ Failure ทั้งใน Buggy และ Fixed Version จึงไม่ถือว่าเป็นการตรวจพบ LANG-693

---

# 15. Simulated Annealing (SA)

Simulated Annealing ถูกพัฒนาขึ้นเพื่อเลือก Test Input จาก Candidate Pool และสร้าง Test Suite สำหรับนำไป Execute กับ Defects4J Project

## Configuration

| Parameter | Value |
|---|---:|
| Random Seed | `20260923` |
| Candidate Pool | `36` |
| Suite Size | `12` |
| Iterations | `5,000` |
| Initial Temperature | `10.0` |
| Cooling Rate | `0.995` |

Generation Time:

```text
0.015136833 seconds
```

Generated Test Suite:

```text
ai-tests/sa/suite/org/apache/commons/lang3/math/NumberUtilsCreateNumberSATest.java
```

---

## 15.1 SA Selected Test Inputs

Test Input ที่ SA เลือก ได้แก่

| # | Test Input |
|---:|---|
| 1 | `<NULL>` |
| 2 | `0` |
| 3 | `9223372036854775808` |
| 4 | `0x0` |
| 5 | `0x1000000000000000` |
| 6 | `1e-500` |
| 7 | `1.79769313486231585e+308` |
| 8 | `1.5F` |
| 9 | `1.5D` |
| 10 | `1.2L` |
| 11 | `1.2Q` |
| 12 | `-` |

รวมทั้งหมด **12 Test Cases**

---

# 16. ผลการทดลอง Simulated Annealing

## 16.1 Buggy Version - Lang-3b

Generated Test Suite:

```text
Tests run: 12
Failures: 0
```

Coverage:

```text
Lines Total        = 373
Lines Covered      = 107
Line Coverage      = 28.7%

Conditions Total   = 334
Conditions Covered = 68
Condition Coverage = 20.4%
```

Fault Detection:

```text
Fault Detected       = No
Fault Detection Rate = 0%
```

Execution Time:

```text
real = 3.28 seconds
```

---

## 16.2 Fixed Version - Lang-3f

Generated Test Suite:

```text
Tests run: 12
Failures: 0
```

Coverage:

```text
Lines Total        = 375
Lines Covered      = 109
Line Coverage      = 29.1%

Conditions Total   = 338
Conditions Covered = 70
Condition Coverage = 20.7%
```

Fault Detection:

```text
Fault Detected = No
```

Execution Time:

```text
real = 3.19 seconds
```

ดังนั้นสำหรับการทดลอง Lang-3 ที่มี Fault จำนวน 1 ตัว

```text
Fault Detection Rate = 0%
```

---

# 17. Particle Swarm Optimization (PSO)

Particle Swarm Optimization เป็น Automatic Test Case Generation Algorithm อีกตัวที่เลือกใช้ในการทดลอง

แนวคิดของ PSO คือการใช้กลุ่ม Particle เพื่อค้นหา Solution ที่เหมาะสมใน Search Space โดยแต่ละ Particle จะมีตำแหน่งและความเร็วในการเคลื่อนที่ และมีการปรับตำแหน่งตามประสบการณ์ของตนเองและของกลุ่ม

สำหรับโครงงานนี้ PSO จะถูกนำมาใช้ค้นหา Test Suite จาก Candidate Test Inputs เช่นเดียวกับ SA เพื่อให้สามารถเปรียบเทียบ Algorithm ทั้งสองภายใต้เงื่อนไขที่ใกล้เคียงกัน

> **สถานะปัจจุบัน: PSO อยู่ในขั้นตอนการพัฒนาและทดลอง**

ยังไม่มีผลการทดลอง Coverage, Fault Detection และ Execution Time ของ PSO ที่บันทึกเป็นผลการทดลองอย่างเป็นทางการใน Repository

---

# 18. เปรียบเทียบ Coverage เบื้องต้น

| Method | Version | Test Cases | Line Coverage | Condition Coverage |
|---|---|---:|---:|---:|
| ChatGPT | Lang-3b | 26 | 31.9% | 24.0% |
| ChatGPT | Lang-3f | 26 | 32.3% | 24.3% |
| Gemini | Lang-3b | 15 | 29.5% | 21.3% |
| Gemini | Lang-3f | 15 | 29.9% | 22.2% |
| SA | Lang-3b | 12 | 28.7% | 20.4% |
| SA | Lang-3f | 12 | 29.1% | 20.7% |

> **หมายเหตุ:** ตัวเลขเป็นผลจากการทดลองกับ Lang-3 และ Method `NumberUtils.createNumber(String)` เท่านั้น ไม่ควรนำไปสรุปเป็นประสิทธิภาพทั่วไปของแต่ละวิธีในทุก Software Project

---

# 19. เปรียบเทียบ Fault Detection

สำหรับ Fault **Lang-3 / LANG-693**

| Method | Buggy Version | Fixed Version | ผลการตรวจพบ Fault |
|---|---|---|---|
| ChatGPT | 3 Failures | 1 Failure | ต้องพิจารณา Test Case ที่แยก Buggy/Fixed ได้ |
| Gemini | LANG-693 Tests Fail | LANG-693 Tests Pass | ตรวจพบ LANG-693 |
| SA | Tests Pass | Tests Pass | ไม่ตรวจพบ Lang-3 |

สำหรับ Gemini มี Test Case ที่สามารถแยกความแตกต่างระหว่าง Buggy และ Fixed Version ได้ โดย Test Case ที่เกี่ยวข้องกับ LANG-693 จะ Fail ใน Buggy Version และ Pass ใน Fixed Version

ส่วน SA Generated Test Suite ไม่มี Failure ทั้งใน Buggy และ Fixed Version ดังนั้นไม่สามารถตรวจพบ Fault ในการทดลองนี้

---

# 20. Reproducibility

เพื่อให้สามารถทำซ้ำการทดลองได้ Repository จัดเก็บข้อมูลสำคัญ ได้แก่

- Source Code ของ Algorithm
- Generated Test Suite
- Test Execution Results
- Coverage Results
- Fault Detection Results
- Generation Configuration
- Random Seed
- Generation Time
- Execution Time
- Summary Results

สำหรับ SA ใช้ Seed

```text
20260923
```

เพื่อให้สามารถทำซ้ำการทดลองด้วย Random Sequence เดิมได้

---

# 21. ขั้นตอนการทดลองโดยรวม

```text
Select Project
      │
      ▼
Select Defects4J Bug
      │
      ▼
Select Method Under Test
      │
      ▼
Prepare Buggy and Fixed Versions
      │
      ▼
Generate Test Cases
      │
      ├──────────────────┐
      │                  │
      ▼                  ▼
  AI Methods         Algorithms
      │                  │
 ChatGPT/Gemini       SA/PSO
      │                  │
      └────────┬─────────┘
               ▼
       Compile Test Cases
               │
               ▼
       Execute Test Cases
               │
               ▼
        Measure Coverage
               │
               ▼
       Check Fault Detection
               │
               ▼
       Record Execution Time
               │
               ▼
        Compare Results
```

---

# 22. การตรวจสอบความถูกต้องของ Test Case

Generated Test Case ทุกชุดจะผ่านขั้นตอนการตรวจสอบดังนี้

### ขั้นที่ 1: Compile

ตรวจสอบว่า Test Case สามารถ Compile กับ Project จริงได้หรือไม่

### ขั้นที่ 2: Execute

นำ Test Case ไป Execute กับ Buggy และ Fixed Version

### ขั้นที่ 3: Coverage

เก็บข้อมูล Code Coverage

### ขั้นที่ 4: Fault Detection

เปรียบเทียบผลลัพธ์ระหว่าง Buggy และ Fixed Version

### ขั้นที่ 5: Record Results

จัดเก็บผลลัพธ์ลงใน Repository

---

# 23. Git และ Version Control

Git ถูกใช้สำหรับจัดเก็บ Source Code, Generated Test Cases, Configuration และ Experiment Results

การใช้ Git ช่วยให้สามารถ

- ตรวจสอบประวัติการเปลี่ยนแปลง
- ติดตาม Source Code
- ติดตาม Generated Test Cases
- ติดตามผลการทดลอง
- ย้อนกลับไปยัง Version ก่อนหน้าได้

Commit ที่สำคัญของโครงงานจะครอบคลุมขั้นตอนต่าง ๆ เช่น

- Initial project setup
- Add AI-generated tests
- Add coverage results
- Add Simulated Annealing implementation
- Add SA experiment results
- Reorganize experiment results
- Update README

---

# 24. ข้อจำกัดของการทดลอง

การทดลองปัจจุบันมีข้อจำกัดดังต่อไปนี้

1. ใช้ Defects4J เพียง Project และ Bug ที่เลือกไว้
2. Method Under Test ที่ใช้ในการทดลองมีเพียง `NumberUtils.createNumber(String)`
3. จำนวน Test Case ของแต่ละวิธีไม่เท่ากัน
4. AI-generated Test Cases อาจมี Test Case ที่ไม่สามารถตรวจพบ Fault ได้
5. Algorithm-based Test Generation ใช้ Candidate Pool ที่กำหนดไว้
6. Coverage ที่ได้ขึ้นอยู่กับ Test Case และ Configuration ของแต่ละวิธี
7. ผลการทดลองจาก Bug เดียวไม่สามารถใช้แทนประสิทธิภาพของทุก Software Project ได้
8. PSO ยังอยู่ในขั้นตอนการพัฒนาและทดลอง

---

# 25. สถานะการดำเนินงาน

## Completed

- [x] เลือก Project จาก Defects4J
- [x] เลือก Bug Lang-3
- [x] เตรียม Buggy Version
- [x] เตรียม Fixed Version
- [x] Compile Project
- [x] Execute Original Test Suite
- [x] ออกแบบ Prompt สำหรับ AI
- [x] Generate Test Cases ด้วย ChatGPT
- [x] Generate Test Cases ด้วย Gemini
- [x] Execute ChatGPT Test Suite
- [x] Execute Gemini Test Suite
- [x] เก็บ Coverage ของ ChatGPT
- [x] เก็บ Coverage ของ Gemini
- [x] พัฒนา Simulated Annealing
- [x] Generate Test Suite ด้วย SA
- [x] Execute SA Test Suite
- [x] เก็บ Coverage ของ SA
- [x] ตรวจสอบ Fault Detection ของ SA
- [x] เก็บ Generation Time ของ SA
- [x] เก็บ Execution Time ของ SA
- [x] จัดเก็บผลการทดลองใน Repository
- [x] จัดทำ README

## In Progress

- [ ] พัฒนา Particle Swarm Optimization
- [ ] Generate Test Suite ด้วย PSO
- [ ] Execute PSO Test Suite
- [ ] เก็บ Coverage ของ PSO
- [ ] ตรวจสอบ Fault Detection ของ PSO
- [ ] เก็บ Generation Time ของ PSO
- [ ] เก็บ Execution Time ของ PSO
- [ ] เปรียบเทียบผลการทดลองทั้ง 4 วิธี
- [ ] จัดทำ Final Comparison
- [ ] จัดทำรายงานผลการทดลองฉบับสมบูรณ์
