package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecordTypeAI165Test {

  @Test
  public void testIsSynthetic() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordType declaredRecord = builder.build();
    assertFalse(declaredRecord.isSynthetic());

    RecordTypeBuilder synthBuilder = new RecordTypeBuilder(registry);
    synthBuilder.setSynthesized(true);
    RecordType synthRecord = synthBuilder.build();
    assertTrue(synthRecord.isSynthetic());
  }

  @Test
  public void testGetImplicitPrototype() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordType record = builder.build();
    assertNotNull(record.getImplicitPrototype());
  }

  @Test
  public void testToMaybeRecordType() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordType record = builder.build();
    assertSame(record, record.toMaybeRecordType());
  }
}
