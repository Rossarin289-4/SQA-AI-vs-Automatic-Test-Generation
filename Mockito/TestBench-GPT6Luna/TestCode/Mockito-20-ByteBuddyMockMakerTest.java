package org.mockito.internal.creation.bytebuddy;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.configuration.GlobalConfiguration;
import org.mockito.internal.creation.instance.*;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.SerializableMode;
import org.mockito.plugins.MockMaker;

public class ByteBuddyMockMakerTest {
    @Test
    public void testGetHandlerForNull() throws Exception {
        ByteBuddyMockMaker maker = new ByteBuddyMockMaker();
        assertNull(maker.getHandler(null));
    }

    @Test
    public void testGetHandlerForOrdinaryObject() throws Exception {
        ByteBuddyMockMaker maker = new ByteBuddyMockMaker();
        assertNull(maker.getHandler(new Object()));
    }
}
