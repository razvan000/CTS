package mateescu.razvan.g1093.adapter;

public class RSA implements PublicKeyEncryptionInterface{
	String password;
	int keyLength;
	String key;
	
	public RSA(String message, int keyLength, String key) {
		super();
		this.password=message;
		this.keyLength=keyLength;
		this.key=key;
	}
	@Override
	public String generateKey() {
		System.out.println("Choosing prime numbers...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Key generated");
		return "";
	}

	@Override
	public void signMessage() {
		System.out.println("Message is signed");
		
	}
	@Override
	public int getPassword() {
		// TODO Auto-generated method stub
		return this.keyLength;
	}
	@Override
	public String getKeyLength() {
		// TODO Auto-generated method stub
		return this.password;
	}
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}
	
	
}
