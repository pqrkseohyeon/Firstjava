package day07;

public class IPTV extends ColorTV{
	private String ipAddr;
	
	public IPTV(String ipAddr, int inch, int nColors ) {
		super(inch, nColors);//super�� �׻� ���� ó���� ��� �Ѵ�.
		this.ipAddr = ipAddr;
	}
	
@Override
public void printProperty() {
	System.out.println("���� IPTV��" + ipAddr + "�ּ�");
	super.printProperty();
}

}
