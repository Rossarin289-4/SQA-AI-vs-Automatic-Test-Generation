package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CommandLineRunnerAI101Test {

  @Test
  public void testCreationWithValidArgs() throws Exception {
    String[] args = new String[] { "--js=test.js" };
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
  }

  @Test(expected = org.kohsuke.args4j.CmdLineException.class)
  public void testInvalidFlagThrowsException() throws Exception {
    String[] args = new String[] { "--nonexistent_flag_xyz=true" };
    new CommandLineRunner(args);
  }

  @Test
  public void testCreateOptions() throws Exception {
    String[] args = new String[] { "--compilation_level=SIMPLE_OPTIMIZATIONS" };
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue(options.closurePass);
  }
}
