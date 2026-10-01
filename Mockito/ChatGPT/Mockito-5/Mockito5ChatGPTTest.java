package org.mockito.benchmark;

import static org.junit.Assert.fail;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

import org.junit.Test;

public class Mockito5ChatGPTTest {

    @Test
    public void verificationOverTimeImplShouldNotDependOnJUnit() throws Exception {
        File classesDir = new File("build/classes/main");

        ClassLoader filteringParent =
                new ClassLoader(Mockito5ChatGPTTest.class.getClassLoader()) {
                    @Override
                    protected Class<?> loadClass(String name, boolean resolve)
                            throws ClassNotFoundException {

                        if (name.startsWith("org.junit.")
                                || name.startsWith("junit.")
                                || name.startsWith("org.mockito.exceptions.verification.junit.")) {
                            throw new ClassNotFoundException(
                                    "JUnit dependency intentionally unavailable: " + name);
                        }

                        return super.loadClass(name, resolve);
                    }
                };

        URLClassLoader isolatedLoader =
                new URLClassLoader(
                        new URL[] {classesDir.toURI().toURL()},
                        filteringParent);

        try {
            Class.forName(
                    "org.mockito.internal.verification.VerificationOverTimeImpl",
                    true,
                    isolatedLoader);
        } catch (Throwable e) {
            fail("VerificationOverTimeImpl should not depend on JUnit: " + e);
        } finally {
            isolatedLoader.close();
        }
    }
}
