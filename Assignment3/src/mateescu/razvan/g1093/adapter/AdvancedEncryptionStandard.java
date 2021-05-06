package mateescu.razvan.g1093.adapter;

public abstract class AdvancedEncryptionStandard {
	int numberOfRounds;
	int keyLength;
	String password;
	String key;
	
	public AdvancedEncryptionStandard( int keyLength, String pass, String key) {
		this.numberOfRounds=10;
		this.keyLength=keyLength;
		this.password=pass;
		this.key=key;
	}
	
	public abstract void encrypt(String password, String key);
	
	public abstract void padPassword(String password);
	
	public abstract String generateKey(String password);
		
}

