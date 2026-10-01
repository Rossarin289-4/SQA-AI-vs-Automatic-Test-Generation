package org.mockito.benchmark;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.withSettings;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class Mockito17ChatGPTTest {

    interface ExtraInterface {
        void extraMethod();
    }

    @Test
    public void shouldSerializeMockWithExtraInterface() throws Exception {
        Object mock = mock(
                Runnable.class,
                withSettings()
                        .serializable()
                        .extraInterfaces(ExtraInterface.class));

        assertTrue(mock instanceof Serializable);
        assertTrue(mock instanceof ExtraInterface);

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(output);

        objectOutputStream.writeObject(mock);
        objectOutputStream.close();
    }
}
