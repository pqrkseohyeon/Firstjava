package utilTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



class Student{
	private String id;
	private String tel;
	private String name;
	
	public Student(String id, String tel, String name) {
		this.id = id;
		this.tel = tel;
		this.name = name;
	}
	
	//getter 
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", tel=" + tel + ", name=" + name + "]";
	}
	public String getTel() {
		return tel;
	}
	public String getName() {
		return name;
	}

}

public class HashMapStudent {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();//<key, value>
		map.put("홍", new Student("1","010-1111-1111","홍길동"));//new 뒤에오는건 생성자를 의미한다.
		map.put("이", new Student("2","010-2222-2222","이순신"));
		map.put("강", new Student("3","010-3333-3333","강감찬"));
		 
		Student s =map.get("홍");
		System.out.println(s.getName());
		System.out.println(s);
		System.out.println(s.getTel());
		
		//map 의 학생 정보를 출력하세요 -for-each
		for(String value : map.keySet()) {
			System.out.println(map.get(value));
		}
		
		//map 의 학생 정보를 출력하세요-iterator()
		System.out.println("===iterator===");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		
		
		
	}

}
