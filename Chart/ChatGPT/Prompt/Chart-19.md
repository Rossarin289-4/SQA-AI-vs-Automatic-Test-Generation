# ChatGPT Test Generation - Chart-19

ฉันกำลังทำโปรเจกต์ Software Quality Assurance โดยใช้ชุดข้อมูล Defects4J
และต้องการสร้าง Test Case สำหรับโปรเจกต์ Chart (JFreeChart)

## ข้อมูลการทดลอง

- Dataset: Defects4J
- Project: Chart
- Bug ID: Chart-19
- Buggy Version: Chart-19b
- Fixed Version: Chart-19f

## สิ่งที่ต้องการ

ช่วยวิเคราะห์ Bug นี้จาก Source Code Diff ด้านล่าง
และสร้าง JUnit Test Case ที่เหมาะสมสำหรับตรวจสอบพฤติกรรม
ที่เกี่ยวข้องกับข้อผิดพลาด

## เงื่อนไข

1. Test ต้องใช้กับ JFreeChart version ของ Defects4J Chart-19 ได้
2. ใช้ JUnit ที่เข้ากันได้กับโปรเจกต์
3. Test ต้องสามารถ compile และรันด้วย Defects4J ได้
4. ห้ามแก้ไข Production Source Code
5. ต้องมี assertion ที่ตรวจสอบพฤติกรรมของโปรแกรม
6. ให้สร้าง Test Case จากการวิเคราะห์ของ ChatGPT เอง
7. ห้ามใช้ Test Case จาก SA หรือ BPSO

## Source Code Diff

```diff
diff -ru /home/test/SQA/projects/Chart-19b/source/org/jfree/chart/plot/CategoryPlot.java /home/test/SQA/projects/Chart-19f/source/org/jfree/chart/plot/CategoryPlot.java
--- /home/test/SQA/projects/Chart-19b/source/org/jfree/chart/plot/CategoryPlot.java	2026-09-29 02:29:29.014418722 +0700
+++ /home/test/SQA/projects/Chart-19f/source/org/jfree/chart/plot/CategoryPlot.java	2026-09-28 22:50:07.789387278 +0700
@@ -695,6 +695,9 @@
      * @since 1.0.3
      */
     public int getDomainAxisIndex(CategoryAxis axis) {
+        if (axis == null) {
+            throw new IllegalArgumentException("Null 'axis' argument.");
+        }
         return this.domainAxes.indexOf(axis);
     }
     
@@ -970,6 +973,9 @@
      * @since 1.0.7
      */
     public int getRangeAxisIndex(ValueAxis axis) {
+        if (axis == null) {
+            throw new IllegalArgumentException("Null 'axis' argument.");
+        }
         int result = this.rangeAxes.indexOf(axis);
         if (result < 0) { // try the parent plot
             Plot parent = getParent();
```

## Output ที่ต้องการ

ช่วยวิเคราะห์สั้น ๆ ว่า Bug นี้เกี่ยวข้องกับพฤติกรรมอะไร

จากนั้นสร้าง Java JUnit Test Code แบบเต็มไฟล์ ประกอบด้วย:

- package
- imports
- class
- test methods
- assertions

Test Code ต้องพร้อมนำไปใส่ใน Defects4J และทดลองจริง

ไม่ต้องปรับ Test ตามผลการทดลองเพื่อบังคับให้ตรวจพบ Bug
ฉันจะนำ Test Case ที่สร้างครั้งแรกไปทดลองกับทั้ง Buggy และ Fixed Version
แล้วบันทึกผลที่เกิดขึ้นจริง

## Fault Detection Criterion

Buggy = FAIL และ Fixed = PASS → DETECTED

PASS / PASS → NOT_DETECTED

FAIL / FAIL → NOT_DETECTED
