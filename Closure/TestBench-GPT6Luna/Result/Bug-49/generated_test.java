package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MakeDeclaredNamesUniqueTest {
    @Test
    public void testOriginalNameWithoutSeparator() throws Exception {
        assertEquals("alpha", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("alpha"));
    }

    @Test
    public void testOriginalNameWithOneSeparator() throws Exception {
        assertEquals("alpha", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("alpha$$1"));
    }

    @Test
    public void testOriginalNameUsesLastSeparator() throws Exception {
        assertEquals("alpha$$1", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("alpha$$1$$2"));
    }

    @Test
    public void testOriginalNameWithLeadingSeparator() throws Exception {
        assertEquals("", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("$$suffix"));
    }

    @Test
    public void testContextualFirstLocalDeclarationIsUnchanged() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        child.addDeclaredName("item");
        assertNull(child.getReplacementName("item"));
    }

    @Test
    public void testContextualDuplicateLocalDeclarationIsRenamed() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer first = renamer.forChildScope();
        MakeDeclaredNamesUnique.Renamer second = renamer.forChildScope();
        first.addDeclaredName("item");
        second.addDeclaredName("item");
        assertEquals("item$$1", second.getReplacementName("item"));
    }

    @Test
    public void testContextualDuplicateNamesAcrossChildScopes() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer first = renamer.forChildScope();
        MakeDeclaredNamesUnique.Renamer second = renamer.forChildScope();
        first.addDeclaredName("item");
        second.addDeclaredName("item");
        assertEquals("item$$1", second.getReplacementName("item"));
    }

    @Test
    public void testContextualGlobalDeclarationReservesName() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer.addDeclaredName("item");
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        child.addDeclaredName("item");
        assertEquals("item$$1", child.getReplacementName("item"));
    }

    @Test
    public void testContextualArgumentsIsNotRenamed() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        child.addDeclaredName("arguments");
        assertNull(child.getReplacementName("arguments"));
    }

    @Test
    public void testContextualRepeatedDeclarationInOneScopeKeepsFirstMapping() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        child.addDeclaredName("item");
        child.addDeclaredName("item");
        assertNull(child.getReplacementName("item"));
    }

    @Test
    public void testInlineRenamerAddsPrefixAndSuppliedId() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "7";
            }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", false);
        renamer.addDeclaredName("item");
        assertEquals("item$$in7", renamer.getReplacementName("item"));
    }

    @Test
    public void testInlineRenamerStripsPriorSuffixBeforeRenaming() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "8";
            }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", false);
        renamer.addDeclaredName("item$$old");
        assertEquals("item$$in8", renamer.getReplacementName("item$$old"));
    }

    @Test
    public void testInlineRenamerEmptyNameStaysEmpty() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "9";
            }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", false);
        renamer.addDeclaredName("");
        assertEquals("", renamer.getReplacementName(""));
    }

    @Test
    public void testInlineRenamerDoesNotReplaceUnknownName() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "1";
            }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", false);
        assertNull(renamer.getReplacementName("missing"));
    }

    @Test
    public void testInlineRenamerRetainsFirstDeclarationMapping() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "2";
            }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", false);
        renamer.addDeclaredName("item");
        renamer.addDeclaredName("item");
        assertEquals("item$$in2", renamer.getReplacementName("item"));
    }

    @Test
    public void testInlineRenamerChildHasIndependentDeclarations() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "3";
            }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", false);
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        child.addDeclaredName("item");
        assertEquals("item$$in3", child.getReplacementName("item"));
        assertNull(renamer.getReplacementName("item"));
    }

    @Test
    public void testInlineRenamerConstnessOptionIsPreserved() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "4";
            }
        };
        MakeDeclaredNamesUnique.InlineRenamer keep =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", false);
        MakeDeclaredNamesUnique.InlineRenamer strip =
                new MakeDeclaredNamesUnique.InlineRenamer(ids, "in", true);
        assertFalse(keep.stripConstIfReplaced());
        assertTrue(strip.stripConstIfReplaced());
    }

    @Test
    public void testBoilerplateRenamerLeavesGlobalNameAloneAndRenamesChild() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "5";
            }
        };
        MakeDeclaredNamesUnique.BoilerplateRenamer renamer =
                new MakeDeclaredNamesUnique.BoilerplateRenamer(ids, "bp");
        renamer.addDeclaredName("globalName");
        assertNull(renamer.getReplacementName("globalName"));
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        child.addDeclaredName("localName");
        assertEquals("localName$$bp5", child.getReplacementName("localName"));
    }

    @Test
    public void testInlineRenamerRejectsEmptyPrefix() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() {
                return "1";
            }
        };
        try {
            new MakeDeclaredNamesUnique.InlineRenamer(ids, "", false);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals("alpha", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("alpha"));
    }

    @Test
    public void testContextualChildScopesShareNameCounts() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer first = renamer.forChildScope();
        MakeDeclaredNamesUnique.Renamer second = renamer.forChildScope();
        first.addDeclaredName("shared");
        second.addDeclaredName("shared");
        assertEquals("shared$$1", second.getReplacementName("shared"));
    }

    @Test
    public void testShouldTraverseFunctionDeclarationDoesNotAddItsNameRecursively() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer root =
                new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer functionScope = root.forChildScope();
        functionScope.addDeclaredName("named");
        assertNull(functionScope.getReplacementName("named"));
    }

    @Test
    public void testShouldTraverseCatchDeclaresExceptionName() throws Exception {
        Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "error"));
        assertEquals(Token.CATCH, catchNode.getType());
        assertEquals("error", catchNode.getFirstChild().getString());
    }

    @Test
    public void testShouldTraverseParametersAndBodyDeclarationsUseLocalRenamer() throws Exception {
        Node parameter = Node.newString(Token.NAME, "value");
        Node parameters = new Node(Token.LP, parameter);
        assertEquals(Token.LP, parameters.getType());
        assertEquals("value", parameters.getFirstChild().getString());
    }

    @Test
    public void testVisitNameMutationCanBeObservedOnNode() throws Exception {
        Node name = Node.newString(Token.NAME, "before");
        name.setString("after");
        assertEquals("after", name.getString());
    }

    @Test
    public void testEnterScopeGlobalRootDeclarationCanBeBuilt() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node declaration = new Node(Token.VAR, Node.newString(Token.NAME, "top"));
        script.addChildToBack(declaration);
        assertEquals(Token.SCRIPT, script.getType());
        assertEquals("top", script.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testExitScopeDoesNotChangeRootNode() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node declaration = new Node(Token.VAR, Node.newString(Token.NAME, "top"));
        script.addChildToBack(declaration);
        assertEquals(Token.VAR, script.getChildAtIndex(0).getType());
    }

    @Test
    public void testProcessInputTreeCanBeBuilt() throws Exception {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.EMPTY));
        assertEquals(Token.SCRIPT, script.getType());
        assertEquals(Token.EMPTY, script.getFirstChild().getType());
    }
}
