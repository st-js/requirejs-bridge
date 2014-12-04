package org.stjs.bridge.requirejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Function;
import org.stjs.javascript.functions.Function0;

@STJSBridge
@GlobalScope
public final class RequireJSGlobal {
	private RequireJSGlobal() {
		//static only
	}

	public static final RequireJS require = new RequireJS();

	public static native Object define(Function0<Object> moduleConstructor);

	public static native Object define(String moduleName, Array<String> dependencies, Function<Object> moduleConstructor);

	public static native Object define(Array<String> dependencies, Function<Object> moduleConstructor);

	public static native void require(Callback0 moduleConstructor);

	public static native void require(Array<String> dependencies, Callback moduleConstructor);

}
