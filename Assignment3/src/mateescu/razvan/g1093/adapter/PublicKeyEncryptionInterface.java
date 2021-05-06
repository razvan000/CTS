package mateescu.razvan.g1093.adapter;

public interface PublicKeyEncryptionInterface {

	public String generateKey();
	public void signMessage();
	public int getPassword();
	public String getKeyLength();
	public String getKey();
}
