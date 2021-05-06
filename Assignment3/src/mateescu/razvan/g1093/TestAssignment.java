package mateescu.razvan.g1093;


import mateescu.razvan.g1093.builder.PopUpWindow;
import mateescu.razvan.g1093.builder.PremiumAccountInterface;
import mateescu.razvan.g1093.builder.WindowColor;
import mateescu.razvan.g1093.decorator.BackgroundScriptDecorator;
import mateescu.razvan.g1093.decorator.Script;
import mateescu.razvan.g1093.builder.PopUpWindow.PopUpWindowBuilder;
import mateescu.razvan.g1093.factory.AbstractCryptoMethod;
import mateescu.razvan.g1093.factory.CryptographyMethodFactory;
import mateescu.razvan.g1093.factory.CryptographyType;
import mateescu.razvan.g1093.flyweight.Command;
import mateescu.razvan.g1093.flyweight.ScriptType;
import mateescu.razvan.g1093.flyweight.ScriptsFactory;
import mateescu.razvan.g1093.prototype.AESModule;
import mateescu.razvan.g1093.singleton.BackgroundScript;
import mateescu.razvan.g1093.singleton.DatabaseConnection;
import mateescu.razvan.g1093.singleton.ForegroundScript;

public class TestAssignment {
	
	public static void main(String[] args) throws CloneNotSupportedException {
	System.out.println("\tSingleton");
	BackgroundScript backgroundScript= new BackgroundScript();
	ForegroundScript foregroundScript = new ForegroundScript();
	
	System.out.println("\n\n\tSimple Factory");
	AbstractCryptoMethod cryptoMethod= 
			CryptographyMethodFactory.getCryptoMethod(CryptographyType.ENCRYPTION, "weakPassword", "0123456789abcdef");
	cryptoMethod.accountAction();
	cryptoMethod = CryptographyMethodFactory.getCryptoMethod(CryptographyType.DECRYPTION, "amk7b54cgh3b", "0123456789abcdef");
	cryptoMethod.accountAction();
	
	System.out.println("\n\n\tBuilder\nNothing to print");
	PopUpWindow window1= new PopUpWindow.PopUpWindowBuilder("Razvan")
			.isSubscribedToLetter().hasVPN()
			.setWindowColor(new WindowColor(123, 20, 90))
			.setAccountPrivileges(new PremiumAccountInterface() {
				@Override
				public void removeAds() {
					System.out.println("Ads removed");
					
				}
				@Override
				public void getHackingNews() {
					System.out.println("Facebook got hacked");
				}
			})
			.build();
	
	System.out.println("\n\tPrototype");
	AESModule aesModule = new AESModule("www.github.com");
	AESModule aesModule1 = (AESModule)aesModule.clone();
	
	System.out.println("\n\n\tDecorator\n");
	Script messagingInterface= new mateescu.razvan.g1093.decorator.ForegroundScript("www.acs.ase.ro","PREMIUM");
	messagingInterface.searchAccount("www.facebook.com");
	messagingInterface= new BackgroundScriptDecorator(messagingInterface);
	messagingInterface.searchAccount("www.facebook.com");
	System.out.println(messagingInterface.generateRandomPassword());
	
	System.out.println("\n\n\tFlyWeight\n");
	Command backgroundScript1= new Command("Decrypt requested data");
	Command backgroundScript2= new Command("perform API requests");
	Command foregroundScript1= new Command("Scrape current page for log in fields");
	Command foregroundScript2= new Command("Prompt user before saving passwords");
	
	ScriptsFactory.getModel(ScriptType.BACKGROUND).manageCommands(backgroundScript1);
	ScriptsFactory.getModel(ScriptType.BACKGROUND).manageCommands(backgroundScript2);
	ScriptsFactory.getModel(ScriptType.FOREGROUND).manageCommands(foregroundScript1);
	ScriptsFactory.getModel(ScriptType.FOREGROUND).manageCommands(foregroundScript2);
	
	
	System.out.println("\n\n\tAdapter\n");
	//TO-DO
	//test the adapter from the package
	}
}
