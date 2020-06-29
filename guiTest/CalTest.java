package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalTest extends JFrame implements ActionListener{
	private JTextField tf1, tf2, tf3;
	public CalTest() {
		setTitle("계산기");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1 = new JTextField(5); // 숫자2
		tf2 = new JTextField(5); // 숫자2
		tf3 = new JTextField(15); // 결과
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/"); 
		add(new JLabel("숫자1"));
		add(tf1);
		add(new JLabel("숫자2"));
		add(tf2);
		add(b1); add(b2); add(b3); add(b4);
		add(new JLabel("결과"));
		add(tf3);
		b1.addActionListener(this); // 버튼을  이번트와 연결시켜준다.
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		setSize(600, 100);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand(); //반환값이 string이니까 글자로 이벤트 구현
		try { // 숫자 말고 문자를 입력하면  Integer.parseint에서 걸리기 때문에 try catch 문으로 예외 처리를 해줘야 한다.
		int a = Integer.parseInt(tf1.getText()); 
		int b = Integer.parseInt(tf2.getText());
		switch(str) { 
		case "+" : tf3.setText(String.valueOf(a+b)); break; // setText 뒤에는 문자가 와야하는데 a,b는 숫자이기 때문에 문자로 바꿔주는 방법 두가지 다 사용가능
		case "-" : tf3.setText(a-b+""); break;
		case "*" : tf3.setText(a*b+""); break;
		case "/" : tf3.setText(a/b+""); break;
			
		}
		} catch (NumberFormatException n) {
			tf3.setText("숫자를 입력하세요");
		} catch (ArithmeticException a) { 
			tf3.setText("0 으로 나눌 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		new CalTest();
	}

}
