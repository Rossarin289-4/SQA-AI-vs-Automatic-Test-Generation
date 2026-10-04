package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ScopedAliasesTest {
    @Test
    public void testEmptyScriptProcessesWithoutChange() throws Exception {
        Node script = new Node(Token.SCRIPT);
        ScopedAliases pass = new ScopedAliases(null, null, null);
        pass.process(null, script);
        assertEquals(Token.SCRIPT, script.getType());
        assertEquals(0, script.getChildCount());
    }

    @Test
    public void testEmptyScriptHotSwapDoesNotChangeTree() throws Exception {
        Node script = new Node(Token.SCRIPT);
        ScopedAliases pass = new ScopedAliases(null, null, null);
        pass.hotSwapScript(script, null);
        assertEquals(Token.SCRIPT, script.getType());
        assertEquals(0, script.getChildCount());
    }
}
