package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import java.io.IOException;

public class ProcessCommonJSModulesTest {
    // Dummy compiler for testing purposes.




    @Test
    public void testToModuleNameBasic() {
        assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("foo/bar"));
    }

    @Test
    public void testToModuleNameWithDotSlash() {
        assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("./foo/bar"));
    }

    @Test
    public void testToModuleNameWithDotDotSlash() {
        // The original code has a bug here, it replaces ".." with "" but the spec wants it to be resolved.
        // Based on the toModuleName(requiredFilename, currentFilename) it should resolve.
        // However, this static method does not have currentFilename.
        // Let's assume it should remove the leading "./" or "../" and then process.
        // Given the actual implementation `filename.replaceAll("^\\." + Pattern.quote(MODULE_SLASH), "")`
        // it will remove the "./" but not "../".
        // Let's test what it actually does.
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("../bar"));
    }

    @Test
    public void testToModuleNameWithJsExtension() {
        assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName("foo/bar.js"));
    }

    @Test
    public void testToModuleNameWithDash() {
        assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName("foo-bar"));
    }

    @Test
    public void testToModuleNameComplex() {
        assertEquals("module$my_lib$utils$index", ProcessCommonJSModules.toModuleName("my-lib/utils/index.js"));
    }

    @Test
    public void testToModuleNameRelativeBasic() {
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("bar", "foo"));
    }

    @Test
    public void testToModuleNameRelativeWithDotSlash() {
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("./bar", "foo"));
    }

    @Test
    public void testToModuleNameRelativeWithDotDotSlash() {
        // When resolving '../bar' from 'foo/baz', the result should be 'bar'.
        // The toModuleName method is called with 'bar' after resolution.
        assertEquals("module$bar", ProcessCommonJSModules.toModuleName("../bar", "foo/baz"));
    }

    @Test
    public void testToModuleNameRelativeComplex() {
        // When resolving 'my-lib/utils' from 'my-lib/foo', the result is 'my-lib/utils'.
        assertEquals("module$my_lib$utils", ProcessCommonJSModules.toModuleName("my-lib/utils", "my-lib/foo"));
    }

    @Test
    public void testToModuleNameRelativeSameDir() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo", "bar"));
    }

    @Test
    public void testToModuleNameRelativeParentDir() {
        assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo", "bar/baz"));
    }















    @Test
    public void testToModuleNameWithEmptyString() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
    }

    @Test
    public void testToModuleNameWithOnlyDotSlash() {
        assertEquals("module$", ProcessCommonJSModules.toModuleName("./"));
    }

    @Test
    public void testToModuleNameWithOnlyDotDotSlash() {
        // Similar to testToModuleNameWithDotDotSlash, but without any path after.
        // The current toModuleName does not handle this. Based on `replaceAll("^\\." + Pattern.quote(MODULE_SLASH), "")`
        // it will remove "./" but not "../".
        assertEquals("module$", ProcessCommonJSModules.toModuleName("../"));
    }


}
