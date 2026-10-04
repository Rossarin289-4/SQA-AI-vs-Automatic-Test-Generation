package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class PeepholeFoldConstantsTest {



























    @Test
    public void testComparisonWithUndefined() throws Exception {
        assertEquals("true", toSource(optimizeCode("void 0 == undefined")));
        assertEquals("true", toSource(optimizeCode("void 0 == null")));
        assertEquals("true", toSource(optimizeCode("undefined == void 0")));
        assertEquals("true", toSource(optimizeCode("null == void 0")));
        assertEquals("false", toSource(optimizeCode("1 == undefined")));
        assertEquals("false", toSource(optimizeCode("1 == null")));
        assertEquals("false", toSource(optimizeCode("undefined == 1")));
        assertEquals("false", toSource(optimizeCode("null == 1")));
        assertEquals("false", toSource(optimizeCode("true == undefined")));
        assertEquals("false", toSource(optimizeCode("true == null")));
        assertEquals("false", toSource(optimizeCode("undefined == true")));
        assertEquals("false", toSource(optimizeCode("null == true")));
        assertEquals("true", toSource(optimizeCode("undefined === undefined")));
        assertEquals("true", toSource(optimizeCode("null === null")));
        assertEquals("false", toSource(optimizeCode("undefined === null")));
        assertEquals("false", toSource(optimizeCode("null === undefined")));
    }

    @Test
    public void testGetElem() throws Exception {
        assertEquals("2", toSource(optimizeCode("[1, 2, 3][1]")));
        assertEquals("1", toSource(optimizeCode("[1, 2, 3][0]")));
        assertEquals("3", toSource(optimizeCode("[1, 2, 3][2]")));
    }

    @Test
    public void testGetElemOutOfBounds() throws Exception {
        // Accessing out of bounds should not result in an error during optimization,
        // but should return undefined. The peephole might not fold this if it
        // can't determine the value statically.
        assertEquals("undefined", toSource(optimizeCode("[1, 2, 3][3]")));
    }

    @Test
    public void testGetElemInvalidIndex() throws Exception {
        // Invalid index types should not be folded.
        assertEquals("[1, 2, 3][1.5]", toSource(optimizeCode("[1, 2, 3][1.5]")));
    }

    @Test
    public void testGetProp() throws Exception {
        assertEquals("3", toSource(optimizeCode("[1, 2, 3].length")));
        assertEquals("3", toSource(optimizeCode("\"abc\".length")));
        assertEquals("0", toSource(optimizeCode("\"\".length")));
    }

    @Test
    public void testStringJoin() throws Exception {
        assertEquals("\"abc\"", toSource(optimizeCode("['a', 'b', 'c'].join('')")));
        assertEquals("\"a,b,c\"", toSource(optimizeCode("['a', 'b', 'c'].join(',')")));
        assertEquals("\"a,b,c\"", toSource(optimizeCode("['a', 'b', 'c'].join()"))); // Default separator is comma
        assertEquals("\"a\"", toSource(optimizeCode("['a'].join('')")));
        assertEquals("\"\"", toSource(optimizeCode("[''].join('')")));
        assertEquals("[]", toSource(optimizeCode("[]"))); // Empty array remains empty
        assertEquals("\"a,1,b\"", toSource(optimizeCode("['a', 1, 'b'].join(',')")));
        assertEquals("\"a,,b\"", toSource(optimizeCode("['a', null, 'b'].join(',')"))); // null becomes empty string
        assertEquals("\"a,,b\"", toSource(optimizeCode("['a', undefined, 'b'].join(',')"))); // undefined becomes empty string
    }

    @Test
    public void testStringJoinNoFold() throws Exception {
        // These cases should fold as the resulting string is shorter.
        assertEquals("\"a,b\"", toSource(optimizeCode("['a', 'b'].join(',')")));
        assertEquals("\"a,b\"", toSource(optimizeCode("['a', 'b'].join()")));
        assertEquals("\"a,b,c\"", toSource(optimizeCode("['a', 'b', 'c'].join(',')")));
        assertEquals("\"a,b,c,d\"", toSource(optimizeCode("['a', 'b', 'c', 'd'].join(',')")));
        assertEquals("\"a,b,c,d,e\"", toSource(optimizeCode("['a', 'b', 'c', 'd', 'e'].join(',')")));
        assertEquals("\"ab\"", toSource(optimizeCode("['ab'].join(',')")));
    }

    @Test
    public void testStringIndexOf() throws Exception {
        assertEquals("1", toSource(optimizeCode("\"abcdef\".indexOf(\"bc\")")));
        assertEquals("4", toSource(optimizeCode("\"abcdef\".indexOf(\"ef\")")));
        assertEquals("-1", toSource(optimizeCode("\"abcdef\".indexOf(\"gh\")")));
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".indexOf(\"bc\", 3)")));
        assertEquals("0", toSource(optimizeCode("\"abc\".indexOf(\"abc\")")));
        assertEquals("-1", toSource(optimizeCode("\"abc\".indexOf(\"abcd\")")));
        assertEquals("0", toSource(optimizeCode("\"\".indexOf(\"\")")));
        assertEquals("0", toSource(optimizeCode("\"abc\".indexOf(\"\", 0)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".indexOf(\"\", 3)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".indexOf(\"\", 4)")));
    }

    @Test
    public void testStringLastIndexOf() throws Exception {
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\")")));
        assertEquals("1", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\", 5)")));
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\", 6)")));
        assertEquals("6", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"bc\", 7)")));
        assertEquals("0", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"a\")")));
        assertEquals("-1", toSource(optimizeCode("\"abcdefbc\".lastIndexOf(\"g\")")));
        assertEquals("0", toSource(optimizeCode("\"\".lastIndexOf(\"\")")));
        assertEquals("0", toSource(optimizeCode("\"abc\".lastIndexOf(\"\", 0)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".lastIndexOf(\"\", 3)")));
        assertEquals("3", toSource(optimizeCode("\"abc\".lastIndexOf(\"\", 4)")));
    }

    @Test
    public void testStringIndexOfInvalidArgs() throws Exception {
        // Test that invalid arguments to indexOf/lastIndexOf are not folded.
        assertEquals("\"abc\".indexOf(123)", toSource(optimizeCode("\"abc\".indexOf(123)")));
        assertEquals("\"abc\".indexOf([1,2])", toSource(optimizeCode("\"abc\".indexOf([1,2])")));
        assertEquals("\"abc\".indexOf(null)", toSource(optimizeCode("\"abc\".indexOf(null)")));
        assertEquals("\"abc\".indexOf(undefined)", toSource(optimizeCode("\"abc\".indexOf(undefined)")));
        assertEquals("\"abc\".indexOf(\"a\", \"b\")", toSource(optimizeCode("\"abc\".indexOf(\"a\", \"b\")"))); // Second arg not a number
        assertEquals("\"abc\".indexOf(\"a\", 1, 2)", toSource(optimizeCode("\"abc\".indexOf(\"a\", 1, 2)"))); // Too many args
    }


    @Test
    public void testArithmeticConstants() throws Exception {
        assertEquals("10", toSource(optimizeCode("2*3+4")));
        assertEquals("2.5", toSource(optimizeCode("10/(2*2)")));
        assertEquals("4", toSource(optimizeCode("5%2+3")));
    }

    @Test
    public void testComplexConstants() throws Exception {
        assertEquals("\"1a2\"", toSource(optimizeCode("1 + \"a\" + 2")));
        assertEquals("\"1ab\"", toSource(optimizeCode("1 + \"a\" + \"b\"")));
        assertEquals("\"a3\"", toSource(optimizeCode("\"a\" + 1 + 2")));
        assertEquals("\"ab1\"", toSource(optimizeCode("\"a\" + \"b\" + 1")));
    }

    @Test
    public void testStringJoinWithNumberLiterals() throws Exception {
        assertEquals("\"1,2,3\"", toSource(optimizeCode("[1, 2, 3].join(\",\")")));
        assertEquals("\"1,2.5,3\"", toSource(optimizeCode("[1, 2.5, 3].join(\",\")")));
        assertEquals("\"1,0,3\"", toSource(optimizeCode("[1, 0, 3].join(\",\")")));
    }

    @Test
    public void testStringJoinWithMixedLiterals() throws Exception {
        assertEquals("\"a,1,true,\"", toSource(optimizeCode("['a', 1, true, null].join(',')")));
        assertEquals("\"1,a,false,\"", toSource(optimizeCode("[1, \"a\", false, undefined].join(',')")));
    }
}





