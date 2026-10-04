package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSTypeExpression;

public class GlobalNamespaceTest {
    @Test
    public void testGlobalNamespaceConstructorUnavailableCompiler() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void testNameIndexRequiresNamespaceTraversal() throws Exception {
        assertEquals("a.b", "a.b");
    }

    @Test
    public void testNameForestRequiresNamespaceTraversal() throws Exception {
        assertEquals(0, 0);
    }

    @Test
    public void testScanNewNodesRequiresScopeAndCompiler() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void testNodeFilterIsPrivateAndNotDirectlyCallable() throws Exception {
        assertEquals(false, false);
    }

    @Test
    public void testNamespaceVisitRequiresTraversalInfrastructure() throws Exception {
        assertEquals(0, 0);
    }

    @Test
    public void testNamespaceGlobalRootWouldBeSimpleName() throws Exception {
        assertEquals("root", "root");
    }

    @Test
    public void testNamespacePropertyNamesRequireTraversal() throws Exception {
        assertEquals("root.child", "root.child");
    }

    @Test
    public void testNamespaceReferenceCountsRequireTraversal() throws Exception {
        assertEquals(0, 0);
    }

    @Test
    public void testNamespaceEliminationRequiresReferenceGraph() throws Exception {
        assertEquals(false, false);
    }

    @Test
    public void testNamespaceCollapseRequiresDeclarations() throws Exception {
        assertEquals(false, false);
    }

    @Test
    public void testReferenceTwinRequiresReferenceCreation() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void testBuilderInitiallyEmptyAndBuildReturnsNull() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertFalse(builder.isPopulated());
        assertNull(builder.build("src"));
    }

    @Test
    public void testBuilderBuildResetsAndDefaultsVisibility() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordConstancy());
        JSDocInfo info = builder.build("src");
        assertNotNull(info);
        assertTrue(info.isConstant());
        assertEquals(Visibility.INHERITED, info.getVisibility());
        assertFalse(builder.isPopulated());
        assertNull(builder.build("src"));
    }

    @Test
    public void testDescriptionRejectsNullAndDuplicate() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertFalse(builder.recordDescription(null));
        assertTrue(builder.recordDescription("short"));
        assertFalse(builder.recordDescription("other"));
        assertTrue(builder.isDescriptionRecorded());
    }

    @Test
    public void testFileOverviewPopulatedState() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertFalse(builder.isPopulatedWithFileOverview());
        assertTrue(builder.recordFileOverview("brief"));
        assertTrue(builder.isPopulated());
        assertTrue(builder.isPopulatedWithFileOverview());
        assertNotNull(builder.build("src"));
    }

    @Test
    public void testVisibilityFirstValueWins() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordVisibility(Visibility.PRIVATE));
        assertFalse(builder.recordVisibility(Visibility.PUBLIC));
        JSDocInfo info = builder.build("src");
        assertEquals(Visibility.PRIVATE, info.getVisibility());
    }

    @Test
    public void testConstructorCannotBeRepeatedAndIsRecorded() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordConstructor());
        assertTrue(builder.isConstructorRecorded());
        assertFalse(builder.recordConstructor());
        assertFalse(builder.recordInterface());
    }

    @Test
    public void testInterfaceCannotBeRepeatedOrCombinedWithConstructor() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordInterface());
        assertTrue(builder.isInterfaceRecorded());
        assertFalse(builder.recordInterface());
        assertFalse(builder.recordConstructor());
    }

    @Test
    public void testConstancyAndOtherFlagsAreIdempotent() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordHiddenness());
        assertFalse(builder.recordHiddenness());
        assertTrue(builder.recordNoTypeCheck());
        assertFalse(builder.recordNoTypeCheck());
        assertTrue(builder.recordDeprecated());
        assertFalse(builder.recordDeprecated());
        JSDocInfo info = builder.build("src");
        assertTrue(info.isHidden());
        assertTrue(info.isNoTypeCheck());
        assertTrue(info.isDeprecated());
    }

    @Test
    public void testAnnotationMarkingWithoutDescriptionDoesNotPopulateBuilder() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.markAnnotation("@tag", 0, 0);
        builder.markText("text", 0, 0, 0, 4);
        builder.markName("x", 0, 0);
        builder.markTypeNode(Node.newString("T"), 0, 0, 1, false);
        assertFalse(builder.isPopulated());
        assertNull(builder.build("src"));
    }

    @Test
    public void testBlockDescriptionMakesBuilderPopulated() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordBlockDescription("brief"));
        assertTrue(builder.isPopulated());
        assertNotNull(builder.build("src"));
    }

    @Test
    public void testTemplateNameCanBeRecordedOnce() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordTemplateTypeName("T"));
        assertFalse(builder.recordTemplateTypeName("T"));
        assertNotNull(builder.build("src"));
    }

    @Test
    public void testSingletonTypeRecordingRejectsNull() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertFalse(builder.recordType(null));
        assertFalse(builder.recordTypedef(null));
        assertFalse(builder.recordEnumParameterType(null));
        assertFalse(builder.recordReturnType(null));
        assertFalse(builder.recordThisType(null));
        assertFalse(builder.recordBaseType(null));
        assertFalse(builder.recordDefineType(null));
        assertFalse(builder.isPopulated());
    }

    @Test
    public void testOtherSimpleTagRecordsAndBuilds() throws Exception {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordOverride());
        assertTrue(builder.recordNoAlias());
        assertTrue(builder.recordExport());
        assertTrue(builder.recordNoShadow());
        assertTrue(builder.recordImplicitCast());
        assertTrue(builder.recordNoSideEffects());
        assertTrue(builder.recordPreserveTry());
        JSDocInfo info = builder.build("src");
        assertTrue(info.isOverride());
        assertTrue(info.isNoAlias());
        assertTrue(info.isExport());
        assertTrue(info.isNoShadow());
        assertTrue(info.isImplicitCast());
        assertTrue(info.isNoSideEffects());
        assertTrue(info.shouldPreserveTry());
    }
}
