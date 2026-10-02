package com.google.javascript.rhino.jstype;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RecordTypeAI46Test {

  @Test(expected = IllegalStateException.class)
  public void testConstructorThrowsOnNullProperty() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    Map<String, RecordTypeBuilder.RecordProperty> props = new HashMap<String, RecordTypeBuilder.RecordProperty>();
    props.put("a", null);
    new RecordType(registry, props);
  }

  @Test
  public void testDefinePropertyWhenFrozen() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    Map<String, RecordTypeBuilder.RecordProperty> props = new HashMap<String, RecordTypeBuilder.RecordProperty>();
    RecordType recordType = new RecordType(registry, props);

    boolean defined = recordType.defineProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertFalse(defined);
  }

  @Test
  public void testIsEquivalentTo() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    Map<String, RecordTypeBuilder.RecordProperty> props1 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
    props1.put("a", new RecordTypeBuilder.RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));

    Map<String, RecordTypeBuilder.RecordProperty> props2 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
    props2.put("a", new RecordTypeBuilder.RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));

    RecordType record1 = new RecordType(registry, props1);
    RecordType record2 = new RecordType(registry, props2);

    assertTrue(record1.isEquivalentTo(record2));
  }
}
