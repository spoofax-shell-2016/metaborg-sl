package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.nodes.ControlFlowException;

public class ReturnException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3217000063919712695L;
	private final RuleResult result;

	public ReturnException(RuleResult result) {
		this.result = result;
	}

	public RuleResult getResult() {
		return result;
	}

}
