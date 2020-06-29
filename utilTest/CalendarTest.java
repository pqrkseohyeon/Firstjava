package utilTest;

import java.util.Calendar;

public class CalendarTest {
	public static void printCalendar(String msg, Calendar cal) { //static�� static���� �ҷ��� �Ѵ�.
		//��, ��, �� //���� ������ ���� get�̶�� ��ɾ ����ؼ� �����;� �Ѵ�.
		int year = cal.get(Calendar.YEAR);//��
		int month = cal.get(Calendar.MONTH)+1;//��//��ǻ�ʹ� 0���� �����ؼ� 11���� �ְ�, ����� 1~12�� �־, +1�� ����� �Ѵ�.
		int day = cal.get(Calendar.DAY_OF_MONTH);//��
		System.out.println(year + "/" + month + "/" + day);
		//����
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//�Ͽ����� 1�� �ݿ����� ��
		int d = cal.get(Calendar.DAY_OF_WEEK);
		String yul = "";
		
		switch(d) {
		case Calendar.SUNDAY : yul = "��"; break;
		case 2 : yul = "��"; break;
		case 3 : yul = "ȭ"; break;
		case 4 : yul = "��"; break;
		case 5 : yul = "��"; break;
		case Calendar.FRIDAY : yul = "��"; break;
		case 7 : yul = "��"; break;
		
		}
		//�迭
		String[] arr = {"��","��","ȭ","��","��","��","��"};
		System.out.println("�迭���� : " + arr[cal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("switch ���� : " + yul);
		System.out.println(Calendar.SATURDAY);//7
		int ampm = cal.get(Calendar.AM_PM);
		String ampmStr = "";
		/*
		if(ampm==Calendar.AM) {//����
			ampmStr = "����";
		}else {//����
			ampmStr = "����";
		}*/
		ampmStr = (ampm==Calendar.AM)?"����":"����";
		int h = cal.get(Calendar.HOUR);
		int hourofDay = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("����ð� : "+ampmStr +""+ h +":" +m+":"+s);
		System.out.println("����ð� : "+hourofDay +"" +":" +m+":"+s);
		
	}
	
	public  static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("����",now);
		now.set(2020,6,1);//2020�� 7��1��
		CalendarTest.printCalendar("someday", now);
		now.set(1993,5,29);
		CalendarTest.printCalendar("bir", now);
	}

}
