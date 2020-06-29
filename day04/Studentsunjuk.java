package day04;

public class Studentsunjuk {
	String name;
	int kor, math, eng;
	
	public Studentsunjuk(String name, int kor, int math, int eng) {
		
	this.name=name;
	this.eng=eng;
	this.kor=kor;
	this.math=math;
	
}
	public void getTotal(  ) {
		System.out.println(name + "ÃÑÁ¡ : " +(kor+eng+math));
		
	}
	public String getAvg() {
		return name + "Æò±Õ : " + (kor+eng+math)/3;
		
	}
	
	

}
