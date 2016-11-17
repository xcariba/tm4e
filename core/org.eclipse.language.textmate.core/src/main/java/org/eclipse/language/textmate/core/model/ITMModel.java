/**
 *  Copyright (c) 2015-2016 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.language.textmate.core.model;

import java.util.List;

import org.eclipse.language.textmate.core.grammar.IGrammar;

/**
 * TextMate model API.
 *
 */
public interface ITMModel {

	/**
	 * Returns the TextMate grammar to use to parse for each lines of the
	 * document the TextMate tokens.
	 *
	 * @return the TextMate grammar to use to parse for each lines of the
	 *         document the TextMate tokens.
	 */
	IGrammar getGrammar();

	/**
	 * Set the TextMate grammar to use to parse for each lines of the document
	 * the TextMate tokens.
	 * 
	 * @param grammar
	 */
	void setGrammar(IGrammar grammar);

	/**
	 * Add model tokens changed listener.
	 * 
	 * @param listener
	 *            to add
	 */
	void addModelTokensChangedListener(IModelTokensChangedListener listener);

	/**
	 * Remove model tokens changed listener.
	 * 
	 * @param listener
	 *            to remove
	 */
	void removeModelTokensChangedListener(IModelTokensChangedListener listener);

	void dispose();

	List<TMToken> getLineTokens(int line);

}