package mateescu.razvan.g1093.adapter;

public class AES2RSAAdapter extends AdvancedEncryptionStandard{
	PublicKeyEncryptionInterface publicKeyEncryption = null;

	public AES2RSAAdapter(PublicKeyEncryptionInterface publicKeyEncryption) {
		super(publicKeyEncryption.getPassword(), publicKeyEncryption.getKeyLength(), publicKeyEncryption.getKey() );
		this.publicKeyEncryption=publicKeyEncryption;
	}

	

	@Override
	public void encrypt(String password, String key) {
		// TODO
		this.publicKeyEncryption.signMessage();
	}

	@Override
	public void padPassword(String password) {
		// TODO
		
	}

	@Override
	public String generateKey(String password) {
		// TODO 
		return this.publicKeyEncryption.generateKey();
	}
	
}
