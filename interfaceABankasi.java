public class ABankasi implements IBanka {

	private String bankaAdi;
	private String terminalId;
	private String password;
	
	public ABankasi (String bankAdi,String terminalId,String password) {
		this.bankaAdi = bankAdi;
		this.terminalId = terminalId;
		this.password = password;
	}
	
	@Override
	public boolean connect(String ipAdress) {
		System.out.println("Kullanici ip :" + ipAdress);
		System.out.println("Makina ip :" + this.hostIpAdress);
		System.out.println(this.bankaAdi + " Baglanildi !");
		return true;
	}
	
	@Override
	public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
		System.out.println("Bankadan cevap bekleniyor !");
		System.out.println("islem basarili oldu !");
		return true;
	}
	
	public void setBankaAdi(String bankaAdi) {
		this.bankaAdi = bankaAdi;
	}
	
	public String getBankaAdi() {
		return bankaAdi;
	}
	
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	
	public String getTerminalId() {
		return terminalId;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
