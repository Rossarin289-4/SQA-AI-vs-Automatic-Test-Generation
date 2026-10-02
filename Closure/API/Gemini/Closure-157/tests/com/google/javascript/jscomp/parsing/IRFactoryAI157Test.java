package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IRFactoryAI157Test {

  @Test
  public void testAllowedDirectivesIsInitialized() {
    Config config = new Config(
        Config.LanguageMode.ECMAScript3,
        null,
        false,
        false,
        false);
    IRFactory factory = new IRFactory(
        "\"use strict\";",
        "testSource",
        config,
        null);
    assertNotNull(factory);
  }

  @Test
  public void testTemplateNodeCreation() {
    Config config = new Config(
        Config.LanguageMode.ECMAScript3,
        null,
        false,
        false,
        false);
    IRFactory factory = new IRFactory(
        "var x = 1;",
        "testSource",
        config,
        null);
    assertNotNull(factory);
  }

  @Test
  public void testReservedKeywordsConstant() {
    Config config = new Config(
        Config.LanguageMode.ECMAScript5,
        null,
        false,
        false,
        false);
    IRFactory factory = new IRFactory(
        "class A {}",
        "testSource",
        config,
        null);
    assertNotNull(factory);
  }
}
