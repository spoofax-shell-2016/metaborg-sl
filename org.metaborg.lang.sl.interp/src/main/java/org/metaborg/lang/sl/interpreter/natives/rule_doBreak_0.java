package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.terms.doBreak_0_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleKind;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doBreak_0 extends Rule {

	public rule_doBreak_0() {
		super(SourceSection.createUnavailable("Rule", "doBreak"), new FrameDescriptor(), RuleKind.TERM, DEFAULT_NAME,
				doBreak_0_Term.class);
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] components = new Object[2];
		System.arraycopy(frame.getArguments(), 1, components, 0, 2);
		throw new BreakException(components);
	}
}
