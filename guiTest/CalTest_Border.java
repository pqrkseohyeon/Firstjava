package guiTest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// JFrame의 기본 레이아웃은 BorderLayout이고, 
// JPanel 기본레이아웃은 FlowLayout        기본은 생략가능
public class CalTest_Border extends JFrame implements ActionListener{ 
	private JTextField tf1, tf2, tf3;
	public CalTest_Border() {
		setTitle("계산기 BorderLayout");
		//setLayout(new BorderLayout()); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		tf1 = new JTextField(5); // 숫자2
		tf2 = new JTextField(5); // 숫자2
		tf3 = new JTextField(15); // 결과
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/"); 
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("숫자1"));
		p1.add(tf1);
		p1.add(new JLabel("숫자2"));
		p1.add(tf2);
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4);
		p3.add(new JLabel("결과"));
		p3.add(tf3);
		add(BorderLayout.NORTH, p1); // 제일 위에
		add(BorderLayout.CENTER, p2); // 센터
		add(BorderLayout.SOUTH, p3); // 마지막 줄에 출력해주고, 
		b1.addActionListener(this); // 버튼을  이번트와 연결시켜준다.
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		setSize(400, 100);
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
		new CalTest_Border();
	}

}
