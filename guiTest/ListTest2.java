package guiTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List; // 그림그리는것
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

public class ListTest2 extends JFrame {
	private JTextField tf;
	private JTextArea ta;
	private List list;
	private JCheckBox cb;
	public ListTest2() {
		setTitle("List 예제2");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		tf = new JTextField(15);
		JButton btn = new JButton("추가");
		cb = new JCheckBox("다중선택");
		p1.setBackground(Color.gray); // 색깔 바꾸는 것 
		p1.add(tf); p1.add(btn); p1.add(cb);
		
		JPanel p2 = new JPanel(new GridLayout(1, 2)); // GridLayout은 테이블 모양이다. (행, 열) , 순서에 맞게 알아서 꽉차게 들어간다.
		list = new List();
		ta = new JTextArea();
		p2.add(list); p2.add(ta);
		ActionH ah = new ActionH();
		ItemH ih = new ItemH();
		
		btn.addActionListener(ah); //연결
		tf.addActionListener(ah); // 엔터를 치면 입력되게 하는 것 
		list.addItemListener(ih); //연결
		cb.addItemListener(ih); // 연결
		add(BorderLayout.NORTH, p1);
		add(BorderLayout.CENTER, p2);
		
		
		
		setSize(400,400);
		setVisible(true);
		
	}


	public static void main(String[] args) {
		new ListTest2();
		
	}
	class ActionH implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(tf.getText().isEmpty()) return; 
			list.add(tf.getText());
			tf.setText("");
			
		}
		
	}
	
	class ItemH implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			Object obj = e.getSource();//이벤트를 발생시키는 객체를 알려준다.
			if(obj==list) { //list가 이벤트 발생
				ta.setText(""); // 화면을 지원준다.
			  if(list.isMultipleMode()) { //리스트가 다중선택 다중모드는 true, 단일모드는 false를 알려준다.
				  String[] arr = list.getSelectedItems(); // 값이 필요할때 items 위치값 필요하면 index
				  for(int i = 0; i<arr.length; i++) {
					  ta.append(arr[i]+"\n");
				  }
			  }else {//리스트가 단일선택
				// 리스트(list)에서 선택한 내용을 textarea(ta) 출력하기
				ta.setText(list.getSelectedItem());
			  }
			}else if(obj==cb) { // checkbox가 이벤트 발생
				if(cb.isSelected()) { //체크박스 선택->리스트 다중모드, 체크가 선택되었으면 true
					list.setMultipleMode(true); 
				}else { //체크박스 해제 -> 리스트 단일모드  , 그렇지 않으면 false
					list.setMultipleMode(false); 
				}
			}
			
		}
		
	  } //ItemH
	}


