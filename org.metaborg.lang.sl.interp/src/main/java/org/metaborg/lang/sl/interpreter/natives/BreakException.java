package org.metaborg.lang.sl.interpreter.natives;

import com.oracle.truffle.api.nodes.ControlFlowException;

public class BreakException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7388640296078624195L;
	private final Object[] components;

	public BreakException(Object[] components) {
		this.components = components;
	}

	public Object[] getComponents() {
		return components;
	}

}
