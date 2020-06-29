package guiTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List; // �׸��׸��°�
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ListTest extends JFrame implements ActionListener, ItemListener{
	private JTextField tf;
	private JTextArea ta;
	private List list;
	private JCheckBox cb;
	public ListTest() {
		setTitle("List ����");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		tf = new JTextField(15);
		JButton btn = new JButton("�߰�");
		cb = new JCheckBox("���߼���");
		p1.setBackground(Color.gray); // ���� �ٲٴ� �� 
		p1.add(tf); p1.add(btn); p1.add(cb);
		
		JPanel p2 = new JPanel(new GridLayout(1, 2)); // GridLayout�� ���̺� ����̴�. (��, ��) , ������ �°� �˾Ƽ� ������ ����.
		list = new List();
		ta = new JTextArea();
		p2.add(list); p2.add(ta);
		btn.addActionListener(this); //����
		tf.addActionListener(this); // ���͸� ġ�� �Էµǰ� �ϴ� �� 
		list.addItemListener(this); //����
		cb.addItemListener(this); // ����
		add(BorderLayout.NORTH, p1);
		add(BorderLayout.CENTER, p2);
		
		
		
		setSize(400,400);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//if(tf.getText().length()==0) return; // ������ �����ش�.
		if(tf.getText().isEmpty()) return; // boolean �� �̶� ����ִٸ� ����,
		list.add(tf.getText());
		tf.setText(""); // �߰� ��ư ������ ������ �����ְ� �ϴ� �̺�Ʈ
		
	}
	public static void main(String[] args) {
		new ListTest();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) { // ItemEvent�� �ҷ��´�.
		// �̺�Ʈ�� �߻��� ��ü�� ����
		Object obj = e.getSource();//�̺�Ʈ�� �߻���Ű�� ��ü�� �˷��ش�.
		if(obj==list) { //list�� �̺�Ʈ �߻�
			ta.setText(""); // ȭ���� �����ش�.
		  if(list.isMultipleMode()) { //����Ʈ�� ���߼��� ���߸��� true, ���ϸ��� false�� �˷��ش�.
			  String[] arr = list.getSelectedItems(); // ���� �ʿ��Ҷ� items ��ġ�� �ʿ��ϸ� index
			  for(int i = 0; i<arr.length; i++) {
				  ta.append(arr[i]+"\n");
			  }
		  }else {//����Ʈ�� ���ϼ���
			// ����Ʈ(list)���� ������ ������ textarea(ta) ����ϱ�
			ta.setText(list.getSelectedItem());
		  }
		}else if(obj==cb) { // checkbox�� �̺�Ʈ �߻�
			if(cb.isSelected()) { //üũ�ڽ� ����->����Ʈ ���߸��, üũ�� ���õǾ����� true
				list.setMultipleMode(true); 
			}else { //üũ�ڽ� ���� -> ����Ʈ ���ϸ��  , �׷��� ������ false
				list.setMultipleMode(false); 
			}
			
		}

	}


}