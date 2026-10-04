package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;

public class FunctionToBlockMutatorTest {
    @Test
    public void testLabelNameSupplierPrefix() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            public String get() { return "x"; }
        };
        FunctionToBlockMutator.LabelNameSupplier supplier =
                new FunctionToBlockMutator.LabelNameSupplier(ids);
        assertEquals("JSCompiler_inline_label_x", supplier.get());
    }

    @Test
    public void testLabelNameSupplierUsesEachSuppliedId() throws Exception {
        Supplier<String> ids = new Supplier<String>() {
            int count;
            public String get() { return count++ == 0 ? "a" : "b"; }
        };
        FunctionToBlockMutator.LabelNameSupplier supplier =
                new FunctionToBlockMutator.LabelNameSupplier(ids);
        assertEquals("JSCompiler_inline_label_a", supplier.get());
        assertEquals("JSCompiler_inline_label_b", supplier.get());
    }
}
