/**
* Copyright (c) 2016 committers of YAKINDU and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     committers of YAKINDU - initial API and implementation
*/
/**
 *  Unit TestCase for LogicalAnd
 */
using System;
namespace Yakindu.SCR.LogicalAnd {
	using NUnit.Framework;
	using Yakindu.SCR;
	
	[TestFixture]
	public class LogicalAndTestsTest {
		private LogicalAndStatemachine sct;
	
	[SetUp]
	public void setup() {
		sct = new LogicalAndStatemachine();
		sct.init();
	}
	
		[Test]
		public void testoperandEvaluationOrder(){
			sct.enter();
			sct.runCycle();
			Assert.IsTrue(sct.getX() == 4L && sct.getB());
		}
	}
}
