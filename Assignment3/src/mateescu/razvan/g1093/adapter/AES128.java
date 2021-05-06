package mateescu.razvan.g1093.adapter;

public class AES128 extends AdvancedEncryptionStandard{

	public AES128(int nRounds, int keyLength, String pass, String key) {
		super(keyLength, pass, key);
	}

	@Override
	public void encrypt(String password, String key) {
		System.out.println("Password encrypted");
	}

	@Override
	public void padPassword(String password) {
		System.out.println("Padded password with "+(16-password.length())+" characters");
		
	}

	@Override
	public String generateKey(String password) {
		String key=Integer.toString(password.length());
		key+="ijfng765avfs<p";
		return key;
		
	}
	

}
