package com.google.javascript.rhino;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JSDocInfoBuilderAI106Test {

  @Test
  public void testInitialStateUnpopulated() {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    assertFalse(builder.isPopulated());
    assertNull(builder.build("test.js"));
  }

  @Test
  public void testRecordConstructorAndInterfaceCompatibility() {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    assertTrue(builder.recordConstructor());
    assertTrue(builder.isConstructorRecorded());
    assertFalse(builder.recordInterface());
    assertFalse(builder.isInterfaceRecorded());
  }

  @Test
  public void testRecordDeprecatedAndBuild() {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    assertTrue(builder.recordDeprecated());
    assertTrue(builder.isPopulated());

    JSDocInfo info = builder.build("test.js");
    assertNotNull(info);
    assertTrue(info.isDeprecated());
    assertFalse(builder.isPopulated());
    assertNull(builder.build("test.js"));
  }
}
