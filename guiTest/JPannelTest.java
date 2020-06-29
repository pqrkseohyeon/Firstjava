package guiTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//JFrame 은 닫는 기능 있음
//체크하고 선택하는건 item 이벤트
public class JPannelTest extends JFrame implements ActionListener {//JFrame은 swing에 있는 것
	JTextField tf1;
	
	public JPannelTest() {//생성자
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		
		tf1 = new JTextField(20);//하나의 라인을 쓸 수 있는건 TextField
		JTextArea ta = new JTextArea(5,20);//여러 라인을 쓸 수 있는건 JTextArea, 스크롤바 안생겨서 내려가면 밑에가 안보인다.
		TextArea tta = new TextArea(5,10);//TextArea는 스크롤바가 생겨서 내려가도 밑에가 보인다.
		setLayout(new FlowLayout());//배치관리자를 통해서 버튼을 생성해준다.
		//화면에 출력
		add(b1);
		add(b2);
		add(tf1);
		add(ta);
		add(tta);
		//actionPerformed 를 연결시켜 주는 것
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		//크기를 300, 400
		setSize(300, 400);
		//화면에 보이기
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();//getActionCommand() 글자를 가지고 온다.
		Container con = getContentPane();//색 구현하는 방법3
		if(str.equals("버튼1")) {
			System.out.println("버튼1 클릭");
			con.setBackground(Color.blue);//색 구현하는 방법3
			System.out.println(tf1.getText());
			//getContentPane().setBackground(Color.blue);//JFrame에서 색 구현하는 방법1
		}else  {
			System.out.println("버튼2 클릭");
			con.setBackground(Color.CYAN);//색 구현하는 방법3
			tf1.setText("");//set은  괄호안의 내용으로 바꿔준다.
			//Container con = getContentPane();//JFrame에서 색 구현하는 방법2
			//con.setBackground(Color.CYAN);//""
		}
	}

	public static void main(String[] args) {
		new JPannelTest();
	}

}
