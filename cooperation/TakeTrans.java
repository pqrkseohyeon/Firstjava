package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 5000);
		Student s2 = new Student("이순신", 10000);
	
		
		Bus bus = new Bus(100); // 100번 버스
		//s1 학생이 100번 버스를 탄다.
		s1.takeBus(bus);
		
		Subway subway = new Subway("2호선");
		//s2 학생이 2호선 지하철을 탄다
		s2.takeSubway(subway);
		s1.showInfo();
		s2.showInfo();
		bus.showInfo();
		subway.showInfo();
		
		Student s3 = new Student("Edward" , 30000);
		Taxi taxi = new Taxi("택시회사");
		s3.takeTaxi(taxi);
		s3.showInfo();
		taxi.showInfo();
	}
	

}
