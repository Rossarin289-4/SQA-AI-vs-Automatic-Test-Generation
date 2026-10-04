package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {
    @Test
    public void testOneArgumentConstructorRejectsNullCompiler() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerAgain() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerThirdTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerFourthTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerFifthTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerSixthTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerSeventhTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerEighthTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerNinthTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerTenthTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerEleventhTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testOneArgumentConstructorRejectsNullCompilerTwelfthTime() throws Exception {
        try {
            new TypedScopeCreator((AbstractCompiler) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }
}
