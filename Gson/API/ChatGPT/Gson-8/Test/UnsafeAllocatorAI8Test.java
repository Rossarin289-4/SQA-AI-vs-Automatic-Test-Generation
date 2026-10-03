package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnsafeAllocatorAI8Test {

  @Test
  public void testCreateNotNull() {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    assertNotNull(allocator);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testNewInstanceInterfaceThrowsException() throws Exception {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    allocator.newInstance(Runnable.class);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testNewInstanceAbstractClassThrowsException() throws Exception {
    UnsafeAllocator allocator = UnsafeAllocator.create();
    allocator.newInstance(UnsafeAllocator.class);
  }
}
