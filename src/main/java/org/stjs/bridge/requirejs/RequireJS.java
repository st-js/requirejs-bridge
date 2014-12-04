package org.stjs.bridge.requirejs;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public final class RequireJS {
	RequireJS() {
		//
	}

	public native void config(RequireJSConfig config);
}
