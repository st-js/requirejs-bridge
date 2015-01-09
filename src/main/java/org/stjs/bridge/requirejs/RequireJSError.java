package org.stjs.bridge.requirejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class RequireJSError {

	/**
	 * A general classification, like "timeout", "nodefine", "scripterror".
	 */
	public String requireType;

	/**
	 * An array of module names/URLs that timed out.
	 */
	public Array<String> requireModules;
}
