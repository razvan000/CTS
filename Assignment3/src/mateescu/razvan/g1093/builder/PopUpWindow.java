package mateescu.razvan.g1093.builder;

public class PopUpWindow {
	
	private String username;
	
	private String copyrightBanner;
	private WindowColor color;
	
	private boolean hasVPN;
	private boolean isSubscribedToNewsletter;
	
	private PremiumAccountInterface premiumAccount; 
	
	private PopUpWindow() {
		
	}
	
	public static class PopUpWindowBuilder {
		PopUpWindow popUpWindow;
		
		public PopUpWindowBuilder(String username) {
			this.popUpWindow=new PopUpWindow();
			this.popUpWindow.username=username;
		}
		
		public PopUpWindowBuilder hasVPN() {
			this.popUpWindow.hasVPN=true;
			return this;
		}
		
		public PopUpWindowBuilder isSubscribedToLetter() {
			this.popUpWindow.isSubscribedToNewsletter=true;
			return this;
		}
		
		public PopUpWindowBuilder setWindowColor(WindowColor color) {
			this.popUpWindow.color=color;
			return this;
		}
		
		public PopUpWindowBuilder setCopyrightBanner(String text) {
			this.popUpWindow.copyrightBanner=text;
			return this;
		}
		
		public PopUpWindowBuilder setAccountPrivileges(PremiumAccountInterface premiumAccount) {
			this.popUpWindow.premiumAccount=premiumAccount;
			return this;
		}
		
		public PopUpWindow build() {
			return this.popUpWindow;
		}
	}
}
