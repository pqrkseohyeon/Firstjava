package guiTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//닫는 기능 없음
public class PannelTest extends Frame  implements ActionListener{//ActionListener 는 actionPerformed 를 가지고 있다.
	TextField tf1;
	public PannelTest() {
		//super("GUI Test");//프레임 제목을 나타낸다.
		setTitle("GUI Test");//위에 방법은 생성자로 제목을 나타내는 방법 , 이 방법은 명령어로 제목을 나타내는 방법
		Button b1 = new Button("버튼1");
		Button b2 = new Button("버튼2");
		Button b3 = new Button("버튼3");
		tf1 = new TextField(20);//크기 조절할려면생성자 안에 인자 값으로 지정()안에 크기 적어주면 된다. 
		setLayout(new FlowLayout());//앞에 아무것도 없는건 부모를 얘기하는 것, 프레임을 지칭
		add(b1);//프레임에다가 b1을 보여주고, 컨테이너를 실행
		add(b2);
		add(b3);
		add(tf1);
		b1.addActionListener(this);//actionPerformed가 있는 위치를 가르킨다.super는 부모, this는 자신
		b2.addActionListener(this);
		b3.addActionListener(this);
		//프레임
		setSize(300,400); // 프레임 사이즈를 보여주는것
		setVisible(true);//화면에 보이기
	}
	public void actionPerformed(ActionEvent e) {//버튼과 버튼을 반드시 연결시켜 줘야 한다.
		String str = e.getActionCommand();
		if(str.equals("버튼1")) {
			System.out.println("버튼1 이벤트 발생");	
			setBackground(Color.YELLOW);//백그라운드 색 지정
			System.out.println(tf1.getText());//입력한 내용을 가져오는 명령어  get
		}else if(str.equals("버튼2")){
			System.out.println("버튼2 이벤트 발생");
			setBackground(Color.BLUE);
		}else {
			System.out.println("버튼3 이벤트 발생");
			setBackground(Color.PINK);
		}
	}
	
	public static void main(String[] args) {
		new PannelTest();

	}

}
