// $Id$

package org.pokersource.eval.test;

import junit.framework.*;

public class AllTests {
  public static void main (String[] args) {
    junit.textui.TestRunner.run(suite());
  }
  public static Test suite() {
    TestSuite suite = new TestSuite("All org.pokersource.eval tests");
    suite.addTest(new TestSuite(StandardEvalTest.class));
    suite.addTest(new TestSuite(JokerEvalTest.class));
    suite.addTest(new TestSuite(AsianStudEvalTest.class));
    return suite;
  }
}