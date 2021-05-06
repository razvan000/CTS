package mateescu.razvan.g1093.flyweight;

import java.util.HashMap;


public class ScriptsFactory {
	static HashMap<String, ScriptInterface> scripts = new HashMap<>();
	
	static {
		scripts.put(ScriptType.BACKGROUND.toString(), 
				new ScriptFlyWeight("Background"));
		scripts.put(ScriptType.FOREGROUND.toString(), 
				new ScriptFlyWeight("Foreground"));
	}
	
	public static ScriptInterface getModel(ScriptType type) {
		return scripts.get(type.toString());
	}
}
