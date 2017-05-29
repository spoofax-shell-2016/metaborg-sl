package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.terms.StringV_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "term", type = TermBuild.class) })
public abstract class isS_1 extends TermBuild {

	public isS_1(SourceSection source) {
		super(source);
	}

	@Specialization
	public boolean checkSpecific(StringV_1_Term s) {
		return true;
	}

	@Fallback
	public boolean doGeneric(Object o) {
		return false;
	}

	public static TermBuild create(SourceSection source, TermBuild term) {
		return isS_1NodeGen.create(source, term);
	}
}
