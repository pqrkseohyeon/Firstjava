package utilTest;

import java.util.Calendar;

public class CalendarTest {
	public static void printCalendar(String msg, Calendar cal) { //static은 static으로 불러야 한다.
		//년, 월, 일 //값을 가져올 때는 get이라는 명령어를 사용해서 가져와야 한다.
		int year = cal.get(Calendar.YEAR);//년
		int month = cal.get(Calendar.MONTH)+1;//월//컴퓨터는 0부터 시작해서 11까지 있고, 사람은 1~12가 있어서, +1을 해줘야 한다.
		int day = cal.get(Calendar.DAY_OF_MONTH);//일
		System.out.println(year + "/" + month + "/" + day);
		//요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//일요일이 1번 금요일은 번
		int d = cal.get(Calendar.DAY_OF_WEEK);
		String yul = "";
		
		switch(d) {
		case Calendar.SUNDAY : yul = "일"; break;
		case 2 : yul = "월"; break;
		case 3 : yul = "화"; break;
		case 4 : yul = "수"; break;
		case 5 : yul = "목"; break;
		case Calendar.FRIDAY : yul = "금"; break;
		case 7 : yul = "토"; break;
		
		}
		//배열
		String[] arr = {"일","월","화","수","목","금","토"};
		System.out.println("배열요일 : " + arr[cal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("switch 요일 : " + yul);
		System.out.println(Calendar.SATURDAY);//7
		int ampm = cal.get(Calendar.AM_PM);
		String ampmStr = "";
		/*
		if(ampm==Calendar.AM) {//오전
			ampmStr = "오전";
		}else {//오후
			ampmStr = "오후";
		}*/
		ampmStr = (ampm==Calendar.AM)?"오전":"오후";
		int h = cal.get(Calendar.HOUR);
		int hourofDay = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("현재시각 : "+ampmStr +""+ h +":" +m+":"+s);
		System.out.println("현재시각 : "+hourofDay +"" +":" +m+":"+s);
		
	}
	
	public  static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재",now);
		now.set(2020,6,1);//2020년 7월1일
		CalendarTest.printCalendar("someday", now);
		now.set(1993,5,29);
		CalendarTest.printCalendar("bir", now);
	}

}
