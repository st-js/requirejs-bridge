Strongly-Typed Javascript (STJS) Bridge to RequireJS
================================

The STJS bridge to Require.js gives you access to this great library using a Java syntax.


## Creating a plugin with This STJS bridge

```java

RequireJSGlobal.define(new RequireJSPlugin() {
	{
		load = (String name, RequireJSNamespace parentRequire, Onload onload, Object config) -> {
			//req has the same API as require().
			parentRequire.$invoke($array(name), (value) -> {
				onload.$invoke(value);
			});
		};
	}
});
		
```
