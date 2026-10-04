package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Comparator;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.testing.EmptyScope;
// Removed import for TypeInference as it's not used and likely inaccessible
import com.google.javascript.rhino.Node; // Added for Node in createObjectType

public class JSTypeTest {

    // Dummy objects needed for testing JSType methods that interact with JSTypeRegistry
    // and ErrorReporter. These are minimal implementations to satisfy method signatures.
    private EmptyScope scope = new EmptyScope();

    // Mock ErrorReporter to avoid actual reporting during tests.
















































    @Test
    public void testCompareAlphabeticalOrder() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Comparator<JSType> alphaComparator = JSType.ALPHA;
        // "string" comes after "number" alphabetically.
        assertTrue(alphaComparator.compare(stringType, numberType) > 0);
        assertTrue(alphaComparator.compare(numberType, stringType) < 0);
    }

    @Test
    public void testCompareSameTypesAlphabeticalOrder() {
        JSType stringType1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType stringType2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Comparator<JSType> alphaComparator = JSType.ALPHA;
        assertEquals(0, alphaComparator.compare(stringType1, stringType2));
    }
}





