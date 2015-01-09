package org.stjs.bridge.requirejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;

@GlobalScope
@SyntheticType
public class RequireJSConfig {
	public String baseUrl;

	public Map<String, String> paths;

	public Map<String, Array<String>> bundles;

	public Map<String, Map<String, String>> shim;

	public Map<String, Map<String, String>> map;

	public Map<String, Map<String, String>> config;

	public Map<String, Array<String>> packages;

	public boolean nodeIdCompat;

	public int waitSeconds;

	public String context;

	public Array<String> deps;

	public Callback callback;

	public boolean enforceDefine;

	public boolean xhtml;

	public String urlArgs;

	public String scriptType;

	public boolean skipDataMain;
}
