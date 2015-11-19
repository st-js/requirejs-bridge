package org.stjs.bridge.requirejs;

import static org.stjs.javascript.JSCollections.$array;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Callback;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Callback4;

@SyntheticType
public final class RequireJSNamespace {
	RequireJSNamespace() {
		//
	}

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback onSuccess);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback0 onSuccess);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback1<?> onSuccess);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback2<?, ?> onSuccess);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback3<?, ?, ?> onSuccess);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback4<?, ?, ?, ?> onSuccess);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback onSuccess, Callback1<RequireJSError> onError);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback0 onSuccess, Callback1<RequireJSError> onError);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback1<?> onSuccess, Callback1<RequireJSError> onError);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback2<?, ?> onSuccess, Callback1<RequireJSError> onError);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback3<?, ?, ?> onSuccess, Callback1<RequireJSError> onError);

	@Template("invoke")
	public native void $invoke(Array<String> dependencies, Callback4<?, ?, ?, ?> onSuccess, Callback1<RequireJSError> onError);


	public native void config(RequireJSConfig config);

	/**
	 * It will reset the loader's internal state to forget about the previous definition of the module.
	 */
	public native void undef(String moduleName);

	/**
	 * Returns true if the module has already been loaded and defined. Used to be called require.isDefined before RequireJS 0.25.0.
	 */
	public native Boolean defined(String moduleName);

	/**
	 * Returns true if the module has already been requested or is in the process of loading and should be available at some point.
	 */
	public native Boolean specified(String moduleName);

	/**
	 * For instance "view/templates/main.html".
	 *
	 * @param moduleResource a module name plus an extension.
	 * @return will return a full path to the resource, obeying any RequireJS configuration.
	 */
	public native String toUrl(String moduleResource);
}
