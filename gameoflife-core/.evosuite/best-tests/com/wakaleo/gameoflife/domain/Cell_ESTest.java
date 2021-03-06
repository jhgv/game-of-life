/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 07 02:05:01 GMT 2018
 */

package com.wakaleo.gameoflife.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.wakaleo.gameoflife.domain.Cell;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cell_ESTest extends Cell_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Cell cell0 = Cell.fromSymbol("*");
      assertEquals(Cell.LIVE_CELL, cell0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Cell[] cellArray0 = Cell.values();
      assertEquals(2, cellArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Cell cell0 = Cell.valueOf("DEAD_CELL");
      assertEquals(".", cell0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Cell.fromSymbol("+");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Cell cell0 = Cell.fromSymbol(".");
      String string0 = cell0.toString();
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Cell cell0 = Cell.fromSymbol(".");
      String string0 = cell0.getSymbol();
      assertEquals(".", string0);
  }
}
