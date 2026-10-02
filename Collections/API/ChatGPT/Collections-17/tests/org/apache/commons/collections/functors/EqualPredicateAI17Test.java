package org.apache.commons.collections.functors;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.commons.collections.Predicate;
import org.junit.Assert;
import org.junit.Test;

public class EqualPredicateAI17Test {

    @Test
    public void equalPredicateFactoryMatchesEqualButDistinctValues() {
        Predicate<String> predicate = EqualPredicate.equalPredicate(new String("value"));

        Assert.assertTrue(predicate.evaluate(new String("value")));
        Assert.assertTrue(predicate instanceof EqualPredicate);
    }

    @Test
    public void directPredicateRejectsDifferentAndNullValues() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("expected");

        Assert.assertFalse(predicate.evaluate("other"));
        Assert.assertFalse(predicate.evaluate(null));
    }

    @Test
    public void nullFactoryReturnsPredicateThatOnlyMatchesNull() {
        Predicate<String> predicate = EqualPredicate.<String>equalPredicate(null);

        Assert.assertFalse(predicate instanceof EqualPredicate);
        Assert.assertTrue(predicate.evaluate(null));
        Assert.assertFalse(predicate.evaluate("not null"));
    }

    @Test
    public void getValueReturnsTheExactStoredReference() {
        Object value = new Object();
        EqualPredicate<Object> predicate = new EqualPredicate<Object>(value);

        Assert.assertSame(value, predicate.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void directPredicateWithNullStoredValueThrowsWhenEvaluatedWithoutEquator() {
        EqualPredicate<Object> predicate = new EqualPredicate<Object>(null);

        predicate.evaluate(new Object());
    }

    @Test
    public void equatorCanDeclareDifferentObjectsEqualAndReceivesBothArguments() {
        Object stored = new Object();
        Object input = new Object();
        Object[] received = new Object[2];
        EqualPredicate<Object> predicate =
                new EqualPredicate<Object>(stored, recordingEquator(true, received));

        Assert.assertTrue(predicate.evaluate(input));
        Assert.assertSame(stored, received[0]);
        Assert.assertSame(input, received[1]);
    }

    @Test
    public void equatorResultOverridesNormalEqualsResult() {
        String stored = new String("same");
        String input = new String("same");
        Object[] received = new Object[2];
        EqualPredicate<String> predicate =
                new EqualPredicate<String>(stored, recordingEquator(false, received));

        Assert.assertFalse(predicate.evaluate(input));
        Assert.assertSame(stored, received[0]);
        Assert.assertSame(input, received[1]);
    }

    @Test
    public void equatorIsInvokedForNullInput() {
        Object stored = new Object();
        Object[] received = new Object[2];
        EqualPredicate<Object> predicate =
                new EqualPredicate<Object>(stored, recordingEquator(true, received));

        Assert.assertTrue(predicate.evaluate(null));
        Assert.assertSame(stored, received[0]);
        Assert.assertNull(received[1]);
    }

    @SuppressWarnings("unchecked")
    private static <T> Equator<T> recordingEquator(final boolean result,
            final Object[] received) {
        return (Equator<T>) Proxy.newProxyInstance(
                Equator.class.getClassLoader(),
                new Class[] { Equator.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] arguments) {
                        if ("equate".equals(method.getName())) {
                            received[0] = arguments[0];
                            received[1] = arguments[1];
                            return Boolean.valueOf(result);
                        }
                        if ("hashCode".equals(method.getName())) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        if ("equals".equals(method.getName())) {
                            return Boolean.valueOf(proxy == arguments[0]);
                        }
                        if ("toString".equals(method.getName())) {
                            return "recording equator";
                        }
                        return null;
                    }
                });
    }
}
