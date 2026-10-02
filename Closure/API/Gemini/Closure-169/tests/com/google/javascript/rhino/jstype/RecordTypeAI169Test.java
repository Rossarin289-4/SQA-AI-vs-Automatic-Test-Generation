package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class RecordTypeAI169Test {

  @Test(expected = IllegalStateException.class)
  public void testNullRecordPropertyThrowsIllegalStateException() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    props.put("a", null);
    new RecordType(registry, props, true);
  }

  @Test
  public void testIsSynthetic() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    props.put("name", new RecordProperty(stringType, null));

    RecordType declaredRecord = new RecordType(registry, props, true);
    assertFalse(declaredRecord.isSynthetic());

    RecordType syntheticRecord = new RecordType(registry, props, false);
    assertTrue(syntheticRecord.isSynthetic());
  }

  @Test
  public void testDefinePropertyFailsWhenFrozen() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    props.put("name", new RecordProperty(stringType, null));

    RecordType record = new RecordType(registry, props, true);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    
    boolean defined = record.defineProperty("age", numberType, false, null);
    assertFalse(defined);
    assertFalse(record.hasProperty("age"));
  }
}
