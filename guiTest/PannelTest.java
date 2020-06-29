package guiTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//�ݴ� ��� ����
public class PannelTest extends Frame  implements ActionListener{//ActionListener �� actionPerformed �� ������ �ִ�.
	TextField tf1;
	public PannelTest() {
		//super("GUI Test");//������ ������ ��Ÿ����.
		setTitle("GUI Test");//���� ����� �����ڷ� ������ ��Ÿ���� ��� , �� ����� ��ɾ�� ������ ��Ÿ���� ���
		Button b1 = new Button("��ư1");
		Button b2 = new Button("��ư2");
		Button b3 = new Button("��ư3");
		tf1 = new TextField(20);//ũ�� �����ҷ�������� �ȿ� ���� ������ ����()�ȿ� ũ�� �����ָ� �ȴ�. 
		setLayout(new FlowLayout());//�տ� �ƹ��͵� ���°� �θ� ����ϴ� ��, �������� ��Ī
		add(b1);//�����ӿ��ٰ� b1�� �����ְ�, �����̳ʸ� ����
		add(b2);
		add(b3);
		add(tf1);
		b1.addActionListener(this);//actionPerformed�� �ִ� ��ġ�� ����Ų��.super�� �θ�, this�� �ڽ�
		b2.addActionListener(this);
		b3.addActionListener(this);
		//������
		setSize(300,400); // ������ ����� �����ִ°�
		setVisible(true);//ȭ�鿡 ���̱�
	}
	public void actionPerformed(ActionEvent e) {//��ư�� ��ư�� �ݵ�� ������� ��� �Ѵ�.
		String str = e.getActionCommand();
		if(str.equals("��ư1")) {
			System.out.println("��ư1 �̺�Ʈ �߻�");	
			setBackground(Color.YELLOW);//��׶��� �� ����
			System.out.println(tf1.getText());//�Է��� ������ �������� ��ɾ�  get
		}else if(str.equals("��ư2")){
			System.out.println("��ư2 �̺�Ʈ �߻�");
			setBackground(Color.BLUE);
		}else {
			System.out.println("��ư3 �̺�Ʈ �߻�");
			setBackground(Color.PINK);
		}
	}
	
	public static void main(String[] args) {
		new PannelTest();

	}

}
