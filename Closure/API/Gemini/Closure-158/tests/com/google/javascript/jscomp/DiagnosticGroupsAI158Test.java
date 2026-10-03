package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DiagnosticGroupsAI158Test {

  @Test
  public void testForNameValid() {
    DiagnosticGroups groups = new DiagnosticGroups();
    DiagnosticGroup group = groups.forName("globalThis");
    assertNotNull(group);
  }

  @Test
  public void testForNameInvalid() {
    DiagnosticGroups groups = new DiagnosticGroups();
    DiagnosticGroup group = groups.forName("nonExistentGroup");
    assertNull(group);
  }

  @Test
  public void testSetWarningLevelValid() {
    DiagnosticGroups groups = new DiagnosticGroups();
    CompilerOptions options = new CompilerOptions();
    groups.setWarningLevel(options, "globalThis", CheckLevel.ERROR);
  }
}
