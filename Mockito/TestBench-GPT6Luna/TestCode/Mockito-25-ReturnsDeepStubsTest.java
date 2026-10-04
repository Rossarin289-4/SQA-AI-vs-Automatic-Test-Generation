package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.MockSettings;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.creation.settings.CreationSettings;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.util.MockCreationValidator;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import java.io.Serializable;
import java.util.List;

public class ReturnsDeepStubsTest {
    @Test
    public void testSubListReturnsDeepStub() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertNotNull(root.subList(0, 1));
    }

    @Test
    public void testRepeatedSubListReturnsSameStub() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertSame(root.subList(0, 1), root.subList(0, 1));
    }

    @Test
    public void testRepeatedSubListWithZeroEndReturnsSameStub() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertSame(root.subList(0, 0), root.subList(0, 0));
    }

    @Test
    public void testRepeatedSubListWithNegativeStartReturnsSameStub() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertSame(root.subList(-1, 1), root.subList(-1, 1));
    }

    @Test
    public void testDifferentSubListArgumentsReturnDifferentStubs() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertNotSame(root.subList(0, 1), root.subList(0, 2));
    }

    @Test
    public void testDifferentSubListStartsReturnDifferentStubs() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertNotSame(root.subList(0, 1), root.subList(1, 1));
    }

    @Test
    public void testNestedSubListReturnsDeepStub() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertNotNull(root.subList(0, 1).subList(0, 1));
    }

    @Test
    public void testNestedRepeatedSubListReturnsSameStub() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertSame(root.subList(0, 1).subList(0, 1),
                root.subList(0, 1).subList(0, 1));
    }

    @Test
    public void testNestedDifferentArgumentsReturnDifferentStubs() throws Exception {
        List<?> root = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertNotSame(root.subList(0, 1).subList(0, 1),
                root.subList(0, 1).subList(0, 2));
    }

    @Test
    public void testSeparateRootsHaveSeparateSubListStubs() throws Exception {
        List<?> first = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        List<?> second = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertNotSame(first.subList(0, 1), second.subList(0, 1));
    }

    @Test
    public void testSeparateRootsReuseTheirOwnSubListStubs() throws Exception {
        List<?> first = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        List<?> second = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertSame(first.subList(0, 1), first.subList(0, 1));
        assertSame(second.subList(0, 1), second.subList(0, 1));
    }

    @Test
    public void testNestedStubsAreDistinctAcrossRoots() throws Exception {
        List<?> first = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        List<?> second = org.mockito.Mockito.mock(List.class,
                org.mockito.Mockito.withSettings().defaultAnswer(new ReturnsDeepStubs()));
        assertNotSame(first.subList(0, 1).subList(0, 1),
                second.subList(0, 1).subList(0, 1));
    }
}
