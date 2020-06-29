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
//JFrame �� �ݴ� ��� ����
//üũ�ϰ� �����ϴ°� item �̺�Ʈ
public class JPannelTest extends JFrame implements ActionListener {//JFrame�� swing�� �ִ� ��
	JTextField tf1;
	
	public JPannelTest() {//������
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		
		tf1 = new JTextField(20);//�ϳ��� ������ �� �� �ִ°� TextField
		JTextArea ta = new JTextArea(5,20);//���� ������ �� �� �ִ°� JTextArea, ��ũ�ѹ� �Ȼ��ܼ� �������� �ؿ��� �Ⱥ��δ�.
		TextArea tta = new TextArea(5,10);//TextArea�� ��ũ�ѹٰ� ���ܼ� �������� �ؿ��� ���δ�.
		setLayout(new FlowLayout());//��ġ�����ڸ� ���ؼ� ��ư�� �������ش�.
		//ȭ�鿡 ���
		add(b1);
		add(b2);
		add(tf1);
		add(ta);
		add(tta);
		//actionPerformed �� ������� �ִ� ��
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		//ũ�⸦ 300, 400
		setSize(300, 400);
		//ȭ�鿡 ���̱�
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();//getActionCommand() ���ڸ� ������ �´�.
		Container con = getContentPane();//�� �����ϴ� ���3
		if(str.equals("��ư1")) {
			System.out.println("��ư1 Ŭ��");
			con.setBackground(Color.blue);//�� �����ϴ� ���3
			System.out.println(tf1.getText());
			//getContentPane().setBackground(Color.blue);//JFrame���� �� �����ϴ� ���1
		}else  {
			System.out.println("��ư2 Ŭ��");
			con.setBackground(Color.CYAN);//�� �����ϴ� ���3
			tf1.setText("");//set��  ��ȣ���� �������� �ٲ��ش�.
			//Container con = getContentPane();//JFrame���� �� �����ϴ� ���2
			//con.setBackground(Color.CYAN);//""
		}
	}

	public static void main(String[] args) {
		new JPannelTest();
	}

}
