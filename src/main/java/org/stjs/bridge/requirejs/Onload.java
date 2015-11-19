package org.stjs.bridge.requirejs;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.Template;

/**
 * @author sgoetz
 */
@STJSBridge
public class Onload {

	@Template("invoke")
	public native void $invoke(Object value);

	public native void error(Object error);

	public native void fromText(String text);
}
