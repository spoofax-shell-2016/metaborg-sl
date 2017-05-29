package org.metaborg.lang.sl.interpreter.natives;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class readln_0 extends TermBuild {

	public readln_0(SourceSection source) {
		super(source);
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return executeString(frame);
	}

	@Override
	public String executeString(VirtualFrame frame) {
		InputStream is = getContext().getInput();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		int c;
		try {
			for (c = is.read(); c != '\n' && c != -1; c = is.read()) {
				byteArrayOutputStream.write(c);
			}
			if (c == -1 && byteArrayOutputStream.size() == 0) {
				return null;
			}
			String line = byteArrayOutputStream.toString(StandardCharsets.US_ASCII.displayName());
			return line;
		} catch (IOException e) {
			throw new IllegalStateException("Failed to read input stream", e);
		}
	}

	public static TermBuild create(SourceSection source) {
		return new readln_0(source);
	}
}
