package day07;

public class IPTV extends ColorTV{
	private String ipAddr;
	
	public IPTV(String ipAddr, int inch, int nColors ) {
		super(inch, nColors);//super는 항상 제일 처음에 써야 한다.
		this.ipAddr = ipAddr;
	}
	
@Override
public void printProperty() {
	System.out.println("나의 IPTV는" + ipAddr + "주소");
	super.printProperty();
}

}
