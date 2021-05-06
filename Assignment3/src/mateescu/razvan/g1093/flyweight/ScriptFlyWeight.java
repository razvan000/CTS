package mateescu.razvan.g1093.flyweight;

public class ScriptFlyWeight implements ScriptInterface{
	String name;
	
	@Override
	public void manageCommands(Command command) {
			System.out.println("Managing: "+command.actionToBeTaken);
		
		
	}
	
	public ScriptFlyWeight(String name) {
		super();
		this.name=name;
	}

}
