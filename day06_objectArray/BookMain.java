package day06_objectArray;

import java.util.Scanner;

public class BookMain {
	
	
	static Scanner sc = new Scanner(System.in);
	BookBean[]arr = new BookBean[50];
	int cnt;
	public void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체보기");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
		
		
	}
	//데이터입력
	public void bookInsert() {
		System.out.println("데이터 입력하세요...");
		System.out.print("책제목 : ");
		String title = sc.nextLine();
		System.out.print("책저자 : ");
		String writer = sc.nextLine();
		//arr[cnt] = new BookBean(title, writer);
		//cnt++
		arr[cnt++] = new BookBean(title,writer);
	}
	//전체보기
	public void bookList() {
		System.out.println("책 리스트....");
//		for(int i=0;i<cnt;i++) {
//			System.out.println("책제목 : " + arr[i].title);
//			System.out.println("책저자 : " + arr[i].writer);
//			System.out.println();
//		}
		//for-each(저장소 이름 : arr)
		for(BookBean book : arr) {
			if(book==null) break;
			System.out.println("책제목 : " + book.getTitle());
			System.out.println("책저자 : " + book.getWriter());
			System.out.println();	
		}
	}
	public static void main(String[] args) {
		BookMain bm = new BookMain();
		while(true){
			bm.showMenu();
			int choice = sc.nextInt();
			BookMain.sc.nextLine();
			switch(choice){
				case 1 : bm.bookInsert();break;
				case 2 : bm.bookList(); break;
				case 3 : System.out.println("종료");
						 System.exit(0);
				default: System.out.println("입력오류");
		}
		}
		
	}

}
