package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MessageBox  extends JFrame{
	public MessageBox(String title, String msg) {
		setTitle(title);
		setLayout(new FlowLayout());
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램이 끝나버려서 이건 쓰면 안된다.
		JButton closeBtn = new JButton("닫기");
		JLabel lbl = new JLabel(msg);
		add(lbl);
		add(closeBtn);
		closeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); //해당 창만 닫아준다.
				
			}
		});
		setSize(300,100);
		setVisible(true);
	}

}
