package mateescu.razvan.g1093.factory;

public class CryptographyMethodFactory {
	public static AbstractCryptoMethod getCryptoMethod(CryptographyType type, String password, String key) {
		AbstractCryptoMethod cryptoMethod = null;
		switch (type) {
		case ENCRYPTION:
			cryptoMethod = new Encryption( "AES-128",password, key, 10);
			break;
		case DECRYPTION:
			cryptoMethod = new Decryption("AES-128", password, key);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return cryptoMethod;
	}
}
