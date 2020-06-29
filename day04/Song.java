package day04;


public class Song {
	int year;
	String country, name, title;
	
	public Song(int year, String country, String name, String title ) {
		this.year = year;
		this.country = country;
		this.name = name;
		this.title = title;
		
		
	}
	
	public void show() {
		System.out.println(year +"년" + country +"국적의" + name + "가 부른" + title);
		
	}
}
