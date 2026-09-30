# Prompt: Closure-47

Project: Defects4J Closure, Bug ID 47. Bug report reference: https://storage.googleapis.com/google-code-archive/v2/code.google.com/closure-compiler/issues/issue-575.json (reference only; its content was not supplied).

Official trigger methods available as orientation, not test cases to copy:
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testBasicMapping1`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testBasicMapping2`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testBasicMappingGoldenOutput`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput0a`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput1`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput2`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput3`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput4`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput5`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testLiteralMappings`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testLiteralMappingsGoldenOutput`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testMultiFunctionMapping`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testMultilineMapping`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testMultilineMapping2`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testParseSourceMetaMap`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testSourceMapMerging`

Create a **new** JUnit 3 `TestCase` class `com.google.javascript.jscomp.Closure47ChatGPTTest` with multiple independent test methods targeting the changed behavior of Closure-47. First inspect the actual buggy/fixed source and the original test harness in both Defects4J checkouts. Explain the input, expected output, and rationale of each new test. Use APIs that exist in this historical revision. Do not call, inherit, wrap, or rename an existing test method. Do not use the official trigger's expected result as an invented oracle.

Compile the class in both checkouts with `defects4j compile`, then run each method with `defects4j test -t ...::testXX`. Record observed FAIL/PASS, time, and coverage only after execution. If source or oracle is unavailable, say so instead of making up test code/results.

## ฉบับภาษาไทย

**โครงการ:** Defects4J Closure, บั๊กหมายเลข 47  
**ข้อมูลอ้างอิงบั๊ก:** https://storage.googleapis.com/google-code-archive/v2/code.google.com/closure-compiler/issues/issue-575.json (ใช้เป็นข้อมูลอ้างอิงเท่านั้น ยังไม่ได้รับเนื้อหารายงานบั๊ก)

**เมธอดทดสอบที่กระตุ้นบั๊กอย่างเป็นทางการ:** ใช้เพื่อทำความเข้าใจปัญหาเท่านั้น ห้ามคัดลอกมาเป็นกรณีทดสอบใหม่
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testBasicMapping1`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testBasicMapping2`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testBasicMappingGoldenOutput`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput0a`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput1`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput2`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput3`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput4`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testGoldenOutput5`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testLiteralMappings`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testLiteralMappingsGoldenOutput`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testMultiFunctionMapping`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testMultilineMapping`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testMultilineMapping2`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testParseSourceMetaMap`
- `com.google.debugging.sourcemap.SourceMapGeneratorV3Test::testSourceMapMerging`

สร้างคลาสทดสอบ JUnit 3 **ขึ้นใหม่** ชื่อ `com.google.javascript.jscomp.Closure47ChatGPTTest` โดยมีหลายเมธอดทดสอบที่เป็นอิสระต่อกันและมุ่งตรวจพฤติกรรมที่เปลี่ยนไปของ Closure-47 ก่อนเขียนเทสต์ ให้ตรวจซอร์สโค้ดเวอร์ชัน buggy และ fixed รวมถึงโครงสร้างเทสต์เดิมใน checkout ทั้งสองเวอร์ชัน

สำหรับแต่ละกรณีทดสอบ ให้อธิบายข้อมูลนำเข้า ผลลัพธ์ที่คาดหวัง และเหตุผลที่เลือกทดสอบ ใช้เฉพาะ API ที่มีอยู่ใน Closure เวอร์ชันนั้น ห้ามเรียก สืบทอด ห่อ หรือเปลี่ยนชื่อเมธอดทดสอบเดิม และห้ามสมมติผลลัพธ์ที่คาดหวังจาก trigger test โดยไม่มีหลักฐานรองรับ

คอมไพล์คลาสทดสอบใน checkout ทั้งสองเวอร์ชันด้วย `defects4j compile` แล้วรันแต่ละเมธอดด้วย `defects4j test -t ...::testXX` บันทึกผล FAIL/PASS เวลา และ coverage จากการรันจริงเท่านั้น หากไม่มีซอร์สโค้ดหรือไม่สามารถยืนยันผลลัพธ์ที่คาดหวังได้ ให้ระบุข้อจำกัดนั้นแทนการสร้างโค้ดหรือผลทดสอบขึ้นเอง
