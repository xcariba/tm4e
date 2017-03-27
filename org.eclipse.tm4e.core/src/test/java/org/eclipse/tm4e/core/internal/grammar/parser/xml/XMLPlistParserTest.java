/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.tm4e.core.internal.grammar.parser.xml;

import org.eclipse.tm4e.core.internal.grammar.reader.IGrammarParser;
import org.eclipse.tm4e.core.internal.types.IRawGrammar;
import org.junit.Test;

public class XMLPlistParserTest {

	@Test
	public void testCsharp() throws Exception {
		IGrammarParser parser = XMLPListParser.INSTANCE;
		IRawGrammar grammar = parser.parse(XMLPlistParserTest.class.getResourceAsStream("JavaScript.tmLanguage"));
		System.err.println(grammar);
	}
}
