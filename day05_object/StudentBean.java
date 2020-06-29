package day05_object;

public class StudentBean {
	private String name;
	private int kor, eng, math;
	private int rank=1;
	
	public int getRank() {
		return rank;
	}
	public String getName() {
		return name;
	}
	
	public StudentBean(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public double getAvg() {
		return (kor+eng+math)/3;
	}
	public void setRank(int rank) {
		this.rank += rank;
	}

}
