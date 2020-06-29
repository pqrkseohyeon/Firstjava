package day06_objectArray;

public class PlayerManager {
	private final int MAX_INT = 50;
	Player[] arr = new Player[MAX_INT];
	private int cnt;

	public void insertPlayer() {
		System.out.println("선수정보 등록...");
		System.out.print("이름>>");
		String name = BookMain.sc.nextLine();
		System.out.print("주소>>");
		String address = BookMain.sc.nextLine();
		System.out.print("나이>>");
		int age = BookMain.sc.nextInt();
		System.out.print("키>>");
		double height = BookMain.sc.nextDouble();
		System.out.print("몸무게>>");
		double weight = BookMain.sc.nextDouble();
		arr[cnt++] = new Player(name,address,age,height,weight);
		
		

	}
	
	public void viewPlayer() {//이름, 나이 출력
		for(Player p :arr) {
			if(p==null) break;
			System.out.println("이름:" + p.getName());
			System.out.println("나이:" + p.getAge());
		}
		
		
	}
//	//선수찾기
//	public void searchPlayer() {
//		System.out.println("찾을 선수 이름>>");
//		//이름이 같으면 찾는 선수
//		//찾는 선수가 있으면 이름, 키, 주소,나이,몸무게 출력
//		//없으면 찾는 선수는 없습니다.
//		String searchName = BookMain.sc.next();
//		Player p = null;
//		for(int i = 0;i<cnt;i++) {
//		if(searchName.equals(arr[i].getName())) {
//			p = arr[i];
//			break;
//		 }//if
//		}//for
//		if(p!=null) {
//			//이름, 나이, 주소, 키, 몸무게
//			System.out.println("이름:" + p.getName());
//			System.out.println("나이:" + p.getAge());
//			System.out.println("주소:" + p.getAddress());
//			System.out.println("키:" + p.getHeight());
//			System.out.println("몸무게:" + p.getWeight());
//		}
//		
//		}else {
//			System.out.println("찾는 선수 없습니다.");
//	}
		
	public void searchPlayer() {
		
	
		System.out.println("찾을 선수 이름>>");
		String searhName = BookMain.sc.next();
		Player p = search(searhName);
		if(p==null) {
			System.out.println("찾는 선수 없습니다.");
			return;
		}
		System.out.println("이름:" + p.getName());
		System.out.println("나이:" + p.getAge());
		System.out.println("주소:" + p.getAddress());
		System.out.println("키:" + p.getHeight());
		System.out.println("몸무게:" + p.getWeight());
		
 }
	public Player search(String searhName) {
		for(int i = 0;i<cnt;i++) {
		if(searhName.equals(arr[i].getName())) {
			return arr[i];
		}
		}
		return null;
	}

	
}
