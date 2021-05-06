package mateescu.razvan.g1093.factory;

public class Decryption extends AbstractCryptoMethod{

	public Decryption(String type, String password, String key) {
		super(type, password, key);
		
	}

	@Override
	public void accountAction() {
		System.out.printf("Decrypting %s with the key: %s using %s \n", password, key, type);
	}

}
