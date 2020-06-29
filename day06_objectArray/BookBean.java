package day06_objectArray;

public class BookBean {
	private String title;
	private String writer;
	
public BookBean(String title, String writer) {
	this.title=title;
	this.writer=writer;	
 }
	//public(누구나 접근 가능한 것),default(같은패키지),private(자신만 사용가능)
	//getter(나만 쓸 수 있게 변수앞에 private를 붙이고 메소드를 다시 만들어줘야한다.)
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}

}
