package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

public class UnsafeAllocatorAI8Test {

  public static class SimpleClass {
    public boolean initialized = false;
    public SimpleClass() {
      this.initialized = true;
    }
  }

  public static abstract class AbstractClass {
    public AbstractClass() {}
  }

  public interface SampleInterface {
    void foo();
  }

  @Test
  public void testCreateNotNull() {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    Assert.assertNotNull(allocator);
  }

  @Test
  public void testNewInstanceConcreteClass() throws Exception {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    SimpleClass instance = allocator.newInstance(SimpleClass.class);
    Assert.assertNotNull(instance);
    // Unsafe allocation should bypass the constructor
    Assert.assertFalse("Constructor should not be invoked", instance.initialized);
  }

  @Test(expected = Exception.class)
  public void testNewInstanceInterfaceThrowsException() throws Exception {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    allocator.newInstance(SampleInterface.class);
  }

  @Test(expected = Exception.class)
  public void testNewInstanceAbstractClassThrowsException() throws Exception {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    allocator.newInstance(AbstractClass.class);
  }

  @Test(expected = Exception.class)
  public void testNewInstanceNullClass() throws Exception {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    allocator.newInstance(null);
  }

  @Test
  public void testMultipleCreations() {
    UnsafeAllocator allocator1 = UnsafeAllocator.create();
    UnsafeAllocator allocator2 = UnsafeAllocator.create();
    Assert.assertNotNull(allocator1);
    Assert.assertNotNull(allocator2);
  }
}
