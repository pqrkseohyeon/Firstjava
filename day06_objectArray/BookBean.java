package day06_objectArray;

public class BookBean {
	private String title;
	private String writer;
	
public BookBean(String title, String writer) {
	this.title=title;
	this.writer=writer;	
 }
	//public(������ ���� ������ ��),default(������Ű��),private(�ڽŸ� ��밡��)
	//getter(���� �� �� �ְ� �����տ� private�� ���̰� �޼ҵ带 �ٽ� ���������Ѵ�.)
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}

}
