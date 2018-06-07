/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 07 02:02:59 GMT 2018
 */

package com.wakaleo.gameoflife.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.wakaleo.gameoflife.domain.Cell;
import com.wakaleo.gameoflife.domain.GridWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GridWriter_ESTest extends GridWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GridWriter gridWriter0 = new GridWriter();
      Cell[][] cellArray0 = new Cell[1][0];
      String string0 = gridWriter0.convertToString(cellArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Cell[] cellArray0 = new Cell[1];
      Cell cell0 = Cell.DEAD_CELL;
      cellArray0[0] = cell0;
      Cell[] cellArray1 = new Cell[0];
      Cell[][] cellArray2 = new Cell[2][4];
      cellArray2[0] = cellArray0;
      cellArray2[1] = cellArray1;
      GridWriter gridWriter0 = new GridWriter();
      String string0 = gridWriter0.convertToString(cellArray2);
      assertEquals(".\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GridWriter gridWriter0 = new GridWriter();
      Cell[][] cellArray0 = new Cell[1][2];
      // Undeclared exception!
      try { 
        gridWriter0.convertToString(cellArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.wakaleo.gameoflife.domain.GridWriter", e);
      }
  }
}
