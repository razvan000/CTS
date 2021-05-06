package mateescu.razvan.g1093.factory;

public class Encryption extends AbstractCryptoMethod{
	int numberOfRounds;
	
	public Encryption(String type, String password, String key,int numberOfRounds) {
		super(type, password, key);
		this.numberOfRounds=numberOfRounds;
	}

	@Override
	public void accountAction() {
		System.out.printf("Encrypting %s with the key: %s using %s, having %d rounds \n", password, key, type, numberOfRounds);
	}

}
