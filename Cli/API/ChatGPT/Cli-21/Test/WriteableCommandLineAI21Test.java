package org.apache.commons.cli2;

import org.junit.Test;

public class WriteableCommandLineAI21Test {

    @Test
    public void testInterfaceExists() {
        Class clazz = WriteableCommandLine.class;
        org.junit.Assert.assertNotNull(clazz);
        org.junit.Assert.assertTrue(clazz.isInterface());
    }
}
