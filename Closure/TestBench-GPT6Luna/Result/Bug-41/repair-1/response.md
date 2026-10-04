```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class FunctionTypeBuilderTest {
    @Test
    public void testContentsSourceNode() throws Exception {
        Node source = IR.name("f");
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(source);
        assertSame(source, contents.getSourceNode());
    }

    @Test
    public void testContentsNoNonEmptyReturnInitially() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        assertFalse(contents.mayHaveNonEmptyReturns());
    }

    @Test
    public void testContentsRecordNonEmptyReturn() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        contents.recordNonEmptyReturn();
        assertTrue(contents.mayHaveNonEmptyReturns());
    }

    @Test
    public void testContentsRecordReturnRemainsTrue() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        contents.recordNonEmptyReturn();
        contents.recordNonEmptyReturn();
        assertTrue(contents.mayHaveNonEmptyReturns());
    }

    @Test
    public void testContentsNotExternByDefault() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        assertFalse(contents.mayBeFromExterns());
    }

    @Test
    public void testContentsExternSource() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        assertFalse(contents.mayBeFromExterns());
    }

    @Test
    public void testContentsEscapedNamesInitiallyEmpty() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        assertEquals(0, Sets.newHashSet(contents.getEscapedVarNames()).size());
    }

    @Test
    public void testContentsRecordsEscapedName() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        contents.recordEscapedVarName("x");
        assertEquals(Sets.newHashSet("x"),
                Sets.newHashSet(contents.getEscapedVarNames()));
    }

    @Test
    public void testContentsDuplicateEscapedNameIsUnique() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        contents.recordEscapedVarName("x");
        contents.recordEscapedVarName("x");
        assertEquals(1, Sets.newHashSet(contents.getEscapedVarNames()).size());
    }

    @Test
    public void testContentsMultipleEscapedNames() throws Exception {
        FunctionTypeBuilder.AstFunctionContents contents =
                new FunctionTypeBuilder.AstFunctionContents(IR.name("f"));
        contents.recordEscapedVarName("x");
        contents.recordEscapedVarName("y");
        assertEquals(Sets.newHashSet("x", "y"),
                Sets.newHashSet(contents.getEscapedVarNames()));
    }

    @Test
    public void testUnknownContentsSourceIsNull() throws Exception {
        assertNull(FunctionTypeBuilder.UnknownFunctionContents.get().getSourceNode());
    }

    @Test
    public void testUnknownContentsMayBeExterns() throws Exception {
        assertTrue(FunctionTypeBuilder.UnknownFunctionContents.get().mayBeFromExterns());
    }

    @Test
    public void testUnknownContentsMayHaveNonEmptyReturns() throws Exception {
        assertTrue(FunctionTypeBuilder.UnknownFunctionContents.get()
                .mayHaveNonEmptyReturns());
    }

    @Test
    public void testUnknownContentsEscapedNamesEmpty() throws Exception {
        assertEquals(0, Sets.newHashSet(
                FunctionTypeBuilder.UnknownFunctionContents.get().getEscapedVarNames())
                .size());
    }
}
```