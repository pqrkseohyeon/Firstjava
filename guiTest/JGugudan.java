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
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton b1 = new JButton("������");
		tf1 = new JTextField(10);
		ta = new JTextArea(10,20);
		
		add(tf1);
		add(b1);
		add(ta);
		
		
		b1.addActionListener(this);
		tf1.addActionListener(this);//enter�� �׼� �̺�Ʈ�̱� ������  enter�� �ĵ� ���� ������ �ϴ� ���. 
		setSize(300, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JGugudan();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText("");//��ư�� ������ ���� ���� �ʱ�ȭ
		//���� �����ͼ� for ����
		try {//���ڰ� �ƴ� ���ڸ� �Է��ϸ�, ���ڸ� �Է��ϼ����� ������ ������, try,catch��(����ó��)�� �̿��ϸ� �ȴ�.
		int d =Integer.parseInt(tf1.getText());//
		String str = e.getActionCommand();
			for(int i=1;i<10;i++) {
				//System.out.println(d+"*"+i+"="+d*i);
				ta.append(d+"*"+i+"="+d*i+"\n");//���� �����ǵ��� append�� ����Ѵ�.
			}
			}catch(NumberFormatException n) {
				tf1.setText("���ڸ� �Է��ϼ���");
			}
			
		
			
			
		
			
		}
		
		
	}


