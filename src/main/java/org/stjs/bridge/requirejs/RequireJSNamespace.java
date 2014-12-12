package org.stjs.bridge.requirejs;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public final class RequireJSNamespace {
	RequireJSNamespace() {
		//
	}

	public native void config(RequireJSConfig config);

	public native void undef(String moduleName);
}
