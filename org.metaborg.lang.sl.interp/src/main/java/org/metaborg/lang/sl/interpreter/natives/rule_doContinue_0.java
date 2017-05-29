package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.terms.doContinue_0_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleKind;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doContinue_0 extends Rule {

	public rule_doContinue_0() {
		super(SourceSection.createUnavailable("Rule", "doContinue"),
				new FrameDescriptor(), RuleKind.TERM, DEFAULT_NAME,
				doContinue_0_Term.class);
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {

		Object[] components = new Object[2];
		System.arraycopy(frame.getArguments(), 1, components, 0, 2);
		throw new ContinueException(components);
	}
}
