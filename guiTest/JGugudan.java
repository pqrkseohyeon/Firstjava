package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JGugudan extends JFrame implements ActionListener {
	JTextField tf1;
	JTextArea ta;
	

	public JGugudan() {
		setTitle("구구단");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton b1 = new JButton("구구단");
		tf1 = new JTextField(10);
		ta = new JTextArea(10,20);
		
		add(tf1);
		add(b1);
		add(ta);
		
		
		b1.addActionListener(this);
		tf1.addActionListener(this);//enter도 액션 이벤트이기 때문에  enter를 쳐도 값이 나오게 하는 방법. 
		setSize(300, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JGugudan();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText("");//버튼을 누를때 마다 값을 초기화
		//단을 가져와서 for 수행
		try {//숫자가 아닌 문자를 입력하면, 숫자를 입력하세요라는 문구를 띄울려면, try,catch문(예외처리)을 이용하면 된다.
		int d =Integer.parseInt(tf1.getText());//
		String str = e.getActionCommand();
			for(int i=1;i<10;i++) {
				//System.out.println(d+"*"+i+"="+d*i);
				ta.append(d+"*"+i+"="+d*i+"\n");//값이 축적되도록 append를 사용한다.
			}
			}catch(NumberFormatException n) {
				tf1.setText("숫자를 입력하세요");
			}
			
		
			
			
		
			
		}
		
		
	}


