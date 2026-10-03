package org.apache.commons.lang3.math;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

public class Lang36GeneratedTestBPSO {

    @Test
    public void test01_null_boundary() throws Exception {
        caseInvoke(0);
    }

    @Test
    public void test02_empty_boundary() throws Exception {
        caseInvoke(1);
    }

    @Test
    public void test03_positive_boundary() throws Exception {
        caseInvoke(4);
    }

    @Test
    public void test04_max_boundary() throws Exception {
        caseInvoke(6);
    }

    @Test
    public void test05_fraction_negative() throws Exception {
        caseInvoke(9);
    }

    @Test
    public void test06_fraction_positive() throws Exception {
        caseInvoke(11);
    }

    @Test
    public void test07_boolean_true() throws Exception {
        caseInvoke(13);
    }

    @Test
    public void test08_long_zero() throws Exception {
        caseInvoke(15);
    }

    @Test
    public void test09_empty_array() throws Exception {
        caseInvoke(18);
    }

    @Test
    public void test10_object_null() throws Exception {
        caseInvoke(19);
    }

    @Test
    public void test11_object_boundary() throws Exception {
        caseInvoke(20);
    }

    @Test
    public void test12_mixed_boundary() throws Exception {
        caseInvoke(22);
    }

    private static void caseInvoke(int index) throws Exception {
        Class<?> c = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Method selected = null;
        for (Method m : c.getDeclaredMethods()) {
            if (m.getName().equals("createNumber")) {
                selected = m;
                break;
            }
        }
        if (selected == null) {
            throw new NoSuchMethodException("createNumber");
        }
        selected.setAccessible(true);
        Object[] args = values(selected.getParameterTypes(), index);
        Object receiver = null;
        if (!Modifier.isStatic(selected.getModifiers())) {
            Constructor<?>[] ctors = c.getDeclaredConstructors();
            for (Constructor<?> ctor : ctors) {
                if (ctor.getParameterTypes().length == 0) {
                    ctor.setAccessible(true);
                    receiver = ctor.newInstance();
                    break;
                }
            }
        }
        selected.invoke(receiver, args);
    }

    private static Object[] values(Class<?>[] types, int index) {
        Object[] result = new Object[types.length];
        for (int i = 0; i < types.length; i++) {
            result[i] = value(types[i], index, i);
        }
        return result;
    }

    private static Object value(Class<?> t, int index, int position) {
        if (t == String.class) {
            switch (index) {
                case 0: return null;
                case 1: return "";
                case 2: return "0";
                case 3: return "-1";
                case 4: return "1";
                case 5: return String.valueOf(Integer.MIN_VALUE);
                case 6: return String.valueOf(Integer.MAX_VALUE);
                case 7: return "a";
                case 8: return "abcdefghijklmnopqrstuvwxyz";
                case 9: return "-1.25";
                case 10: return "0.0";
                case 11: return "1.25";
                case 12: return "999999999.999999";
                case 13: return "true";
                case 14: return "false";
                default: return "boundary";
            }
        }
        if (t == boolean.class || t == Boolean.class) {
            return (index % 2) == 0;
        }
        if (t == int.class || t == Integer.class) {
            if (index == 3) return -1;
            if (index == 5) return Integer.MIN_VALUE;
            if (index == 6) return Integer.MAX_VALUE;
            return index == 4 ? 1 : 0;
        }
        if (t == long.class || t == Long.class) {
            if (index == 16) return Long.MAX_VALUE;
            if (index == 3) return -1L;
            return index == 4 ? 1L : 0L;
        }
        if (t == double.class || t == Double.class) {
            if (index == 9) return -1.25d;
            if (index == 12) return 999999999.999999d;
            return index == 11 ? 1.25d : 0.0d;
        }
        if (t == float.class || t == Float.class) {
            return 1.25f;
        }
        if (t == short.class || t == Short.class) {
            return (short)0;
        }
        if (t == byte.class || t == Byte.class) {
            return (byte)0;
        }
        if (t == char.class || t == Character.class) {
            return index % 2 == 0 ? 'a' : 'Z';
        }
        if (t.isArray()) {
            return Array.newInstance(t.getComponentType(), 0);
        }
        if (t.isEnum()) {
            Object[] values = t.getEnumConstants();
            return values.length == 0 ? null : values[0];
        }
        return null;
    }
}
