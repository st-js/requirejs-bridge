package org.stjs.bridge.requirejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.*;

@STJSBridge
@GlobalScope
public final class RequireJSGlobal {
	private RequireJSGlobal() {
		//static only
	}

	public static final RequireJS require = new RequireJS();

	public static native void define(Function0<?> moduleConstructor);

	public static native void define(String moduleName, Array<String> dependencies, Function<?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function0<?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function1<?, ?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function2<?, ?, ?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function3<?, ?, ?, ?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function4<?, ?, ?, ?, ?> moduleConstructor);

	public static native void define(Array<String> dependencies, Function<?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function0<?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function1<?, ?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function2<?, ?, ?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function3<?, ?, ?, ?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function4<?, ?, ?, ?, ?> moduleConstructor);

	public static native void require(Callback0 moduleConstructor);

	public static native void require(Array<String> dependencies, Callback moduleConstructor);
	public static native void require(Array<String> dependencies, Callback0 moduleConstructor);
	public static native void require(Array<String> dependencies, Callback1<?> moduleConstructor);
	public static native void require(Array<String> dependencies, Callback2<?, ?> moduleConstructor);
	public static native void require(Array<String> dependencies, Callback3<?, ?, ?> moduleConstructor);
	public static native void require(Array<String> dependencies, Callback4<?, ?, ?, ?> moduleConstructor);

}
