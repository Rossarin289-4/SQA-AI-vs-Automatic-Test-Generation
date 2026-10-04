```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.LimitInputStream;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class CommandLineRunnerTest {
    @Test
    public void testDefaultExternsAreOrderedAndComplete() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertEquals(39, externs.size());
        assertEquals("externs.zip//es3.js", externs.get(0).getName());
        assertEquals("externs.zip//webkit_notifications.js",
                externs.get(38).getName());
    }

    @Test
    public void testDefaultExternsReturnsMutableList() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        externs.clear();
        assertEquals(0, externs.size());
    }
}
```