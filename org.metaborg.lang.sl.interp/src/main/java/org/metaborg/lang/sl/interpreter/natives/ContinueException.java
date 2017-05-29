package org.metaborg.lang.sl.interpreter.natives;

import com.oracle.truffle.api.nodes.ControlFlowException;

public class ContinueException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 693593613167966359L;
	private final Object[] components;

	public ContinueException(Object[] components) {
		this.components = components;
	}

	public Object[] getComponents() {
		return components;
	}

}
