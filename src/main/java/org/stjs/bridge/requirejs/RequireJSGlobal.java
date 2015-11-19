package org.stjs.bridge.requirejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.functions.*;

@GlobalScope
public final class RequireJSGlobal {
	private RequireJSGlobal() {
		//static only
	}

	public static final RequireJSNamespace requirejs = new RequireJSNamespace();

	public static final RequireJSNamespace require = new RequireJSNamespace();

	public static native void define(RequireJSPlugin plugin);
	public static native void define(Function0<?> moduleConstructor);

	public static native void define(Array<String> dependencies, Function<?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function0<?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function1<?, ?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function2<?, ?, ?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function3<?, ?, ?, ?> moduleConstructor);
	public static native void define(Array<String> dependencies, Function4<?, ?, ?, ?, ?> moduleConstructor);

	public static native void define(String moduleName, Array<String> dependencies, Function<?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function0<?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function1<?, ?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function2<?, ?, ?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function3<?, ?, ?, ?> moduleConstructor);
	public static native void define(String moduleName, Array<String> dependencies, Function4<?, ?, ?, ?, ?> moduleConstructor);

	public static native Object require(String moduleName);

	public static native void require(Array<String> dependencies, Callback onSuccess);
	public static native void require(Array<String> dependencies, Callback0 onSuccess);
	public static native void require(Array<String> dependencies, Callback1<?> onSuccess);
	public static native void require(Array<String> dependencies, Callback2<?, ?> onSuccess);
	public static native void require(Array<String> dependencies, Callback3<?, ?, ?> onSuccess);
	public static native void require(Array<String> dependencies, Callback4<?, ?, ?, ?> onSuccess);

	public static native void require(Array<String> dependencies, Callback onSuccess, Callback1<RequireJSError> onError);
	public static native void require(Array<String> dependencies, Callback0 onSuccess, Callback1<RequireJSError> onError);
	public static native void require(Array<String> dependencies, Callback1<?> onSuccess, Callback1<RequireJSError> onError);
	public static native void require(Array<String> dependencies, Callback2<?, ?> onSuccess, Callback1<RequireJSError> onError);
	public static native void require(Array<String> dependencies, Callback3<?, ?, ?> onSuccess, Callback1<RequireJSError> onError);
	public static native void require(Array<String> dependencies, Callback4<?, ?, ?, ?> onSuccess, Callback1<RequireJSError> onError);

}
