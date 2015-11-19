package org.stjs.bridge.requirejs;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.*;

/**
 * see http://requirejs.org/docs/plugins.html for complete documentation
 *
 * @author sgoetz
 */
@STJSBridge
@SyntheticType
public class RequireJSPlugin {
	/**
	 * <code>load</code> is a function, and it will be called with the following arguments:
	 * <ul>
	 * <li><strong>name</strong>: String. The name of the resource to load. This is the part after the ! separator in the name. So, if a module asks for 'foo!something/for/foo', the foo module's load function will receive 'something/for/foo' as the name.</li>
	 * <li><strong>parentRequire</strong>: Function. A local "require" function to use to load other modules. This function will resolve relative module names relative to the module name that asked for this plugin resource. If the loader plugin wants to require() something relative to its own ID, it can ask for a require in its own define call.</li>
	 * <li><strong>onload</strong>: Function. A function to call with the value for name. This tells the loader that the plugin is done loading the resource. onload.error() can be called, passing an error object to it, if the plugin detects an error condition that means the resource will fail to load correctly.</li>
	 * <li><strong>config</strong>: Object. A configuration object. This is a way for the optimizer and the web app to pass configuration information to the plugin. The i18n! plugin uses this to get the current current locale, if the web app wants to force a specific locale. The optimizer will set an isBuild property in the config to true if this plugin (or pluginBuilder) is being called as part of an optimizer build.</li>
	 * </ul>
	 */
	public Callback4<String, RequireJSNamespace, Onload, Object> load;

	/**
	 * <code>normalize</code> is called to normalize the name used to identify a resource. Some resources could use relative paths, and need to be normalized to the full path. normalize is called with the following arguments:
	 * <ul>
	 *     <li><strong>name</strong>: String. The resource name to normalize.</li>
	 * 	   <li><strong>normalize</strong>: Function. A function that can be called to normalize a regular module name.</li>
	 * </ul>
	 */
	public Function2<String, Function1<String, String>, String> normalize;
}
