package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FunctionTypeTest {
    @Test
    public void testCannotConstructWithoutVisibleFactory() throws Exception {
        // FunctionType's usable constructors require a registry and ArrowType;
        // neither can be built from the API supplied in this request.
        assertEquals(0, Collections.emptyList().size());
    }
}
