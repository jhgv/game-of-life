/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 07 02:01:51 GMT 2018
 */

package com.wakaleo.gameoflife.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.wakaleo.gameoflife.domain.Cell;
import com.wakaleo.gameoflife.domain.Universe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Universe_ESTest extends Universe_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Universe universe0 = new Universe();
      // Undeclared exception!
      try { 
        universe0.getCellAt(0, (-578));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Universe.seededWith((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Universe.seededWith("~[:l!V{|T");
      assertEquals("~[:l!V{|T", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Universe universe0 = new Universe(0, 0);
      String string0 = universe0.getGrid();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Universe universe0 = new Universe();
      Cell cell0 = universe0.getCellAt(1, 1);
      assertEquals(".", cell0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Universe universe0 = new Universe(47, 47);
      // Undeclared exception!
      universe0.spawnsANewGeneration();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Universe universe0 = new Universe(2, 2748);
      // Undeclared exception!
      try { 
        universe0.spawnsANewGeneration();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Universe universe0 = new Universe(0, 0);
      // Undeclared exception!
      try { 
        universe0.setLiveCellAt(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.wakaleo.gameoflife.domain.Grid", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Universe universe0 = new Universe();
      // Undeclared exception!
      try { 
        universe0.setDeadCellAt(914, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 914
         //
         verifyException("com.wakaleo.gameoflife.domain.Grid", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Universe universe0 = new Universe(11, 735);
      universe0.getCells();
      // Undeclared exception!
      universe0.getCells();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Universe universe0 = new Universe(47, 47);
      // Undeclared exception!
      universe0.createNextGeneration();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Universe universe0 = null;
      try {
        universe0 = new Universe((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.wakaleo.gameoflife.domain.GridReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Universe universe0 = null;
      try {
        universe0 = new Universe("line.separator");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.wakaleo.gameoflife.domain.GridReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Universe universe0 = new Universe(1268, 974);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Universe universe0 = null;
      try {
        universe0 = new Universe((-815), 229);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.wakaleo.gameoflife.domain.Grid", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Universe universe0 = new Universe();
      universe0.setLiveCellAt(0, 1);
      universe0.createNextGeneration();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Universe universe0 = new Universe();
      universe0.setLiveCellAt(0, 1);
      universe0.setLiveCellAt(1, 0);
      universe0.setLiveCellAt(1, 1);
      universe0.setLiveCellAt(2, 1);
      universe0.createNextGeneration();
      universe0.spawnsANewGeneration();
      universe0.createNextGeneration();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = Universe.seededWith("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Universe universe0 = new Universe();
      String string0 = universe0.getGrid();
      assertEquals("...\n...\n...\n", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Universe universe0 = new Universe();
      universe0.setDeadCellAt(0, 0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Universe universe0 = new Universe("");
      universe0.spawnsANewGeneration();
      // Undeclared exception!
      try { 
        universe0.getCells();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Universe universe0 = new Universe(0, 0);
      // Undeclared exception!
      try { 
        universe0.createNextGeneration();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
