package mateescu.razvan.g1093.decorator;

import java.util.Random;

public class BackgroundScriptDecorator extends ScriptAbstractDecorator{
	
	static String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456790<>?,./:";
	
	
	public BackgroundScriptDecorator(Script script) {
		super(script);
		
	}

	@Override
	public String generateRandomPassword() {
		String password="";
		Random rand= new Random(60);
		for(int i=0;i<20;i++) {
			password += characters.charAt(rand.nextInt(56));
		}
		return password;
	}

	@Override
	public void searchAccount(String website) {
		System.out.println("Searching in the database");
	}

	
}
