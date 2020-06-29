package guiTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JPannelTest2 extends JFrame implements ActionListener{
	JPanel p1, p2;
	JTextArea ta;
	public JPannelTest2() {
		super("�г��׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������� ��Ȯ�ϰ� �۾��� �����ִ� ���
		setLayout(new FlowLayout());
		
		//�г� ��ư�� �׷����� ���� ���
		 p1 = new JPanel();//�г�1
		 p2 = new JPanel();//�г�2
		 ta = new JTextArea(10,20);
		JButton b1 =  new JButton("�г�2 ���̱�");
		JButton b2 =  new JButton("�г�2 �Ⱥ��̱�");
		JButton b3 =  new JButton("�г�1 ���̱�");
		JButton b4 =  new JButton("�г�1 �Ⱥ��̱�");
		
		//�г� ��ư�� �׷����� ���� ���
		p1.add(b1); p1.add(b2);
		p2.add(b3); p2.add(b4);
		add(p1);
		add(p2);
		add(ta);
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.GREEN);
		//��ư �������ִ� ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JPannelTest2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		ta.append(str+"\n");//"\n"���� ������ ���, getText ���� �������°�, setText ���� ()�ȿ� �������� �ٲٴ� ��
		if(str.equals("�г�2 ���̱�")) {
			p2.setVisible(true);
		}else if(str.equals("�г�2 �Ⱥ��̱�")) {
			p2.setVisible(false);
		} else if(str.equals("�г�1 ���̱�")){
			p1.setVisible(true);
		}else {
			p1.setVisible(false);
			
		}
	}

}