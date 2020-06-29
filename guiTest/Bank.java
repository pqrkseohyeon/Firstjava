package guiTest;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Bank extends JFrame{
	HashMap<String, Integer> hm = new HashMap<String,Integer>();
	List lst;
	public Bank() {
		setTitle("BANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		JPanel left = new JPanel(); //왼쪽꺼
		left.setLayout(new GridLayout(5,1));
		JPanel p1 = new JPanel(); // 왼쪽화면 첫번째 줄
		p1.add(new JLabel("이름"));
		JTextField tfName = new JTextField(15);
		p1.add(tfName);
		
		JButton btn = new JButton("계좌생성"); // 왼쪽화면 두번째 줄
		
		JPanel p2 = new JPanel(); // 왼쪽화면 세번째 줄
		p2.add(new JLabel("잔액"));
		JTextField tfBalance = new JTextField(15);
		tfBalance.setEditable(false);
		p2.add(tfBalance);
		
		JPanel p3 = new JPanel(); // 왼쪽화면 네번째 줄
		JTextField tfMoney = new JTextField(15);
		p3.add(tfMoney);
		p3.add(new JLabel("원"));
		
		JPanel p4 = new JPanel(); // 왼쪽화면 다섯번째 줄
		JButton inputBtn = new JButton("예금");
		JButton outputBtn = new JButton("출금");
		JButton fileBtn = new JButton("파일로 저장");
		p4.add(inputBtn); p4.add(outputBtn); p4.add(fileBtn);
		
		left.add(p1); left.add(btn); left.add(p2); left.add(p3); left.add(p4);
		// 오른쪽 화면
		 lst = new List();
		// 왼쪽, 오른쪽 화면 붙이기
		add(left);  add(lst);
		
		// 계좌생성버튼 클릭
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//tfName의 내용을 가져와서 lst에 추가한다. 단, 공백은 저장 안함
				if(tfName.getText().isEmpty()) return; // 공백 저장 안하게 해준다.
				lst.add(tfName.getText().trim());
				hm.put(tfName.getText().trim(),0);	//맵에 저장, trim()공백제거
				tfName.setText("");
				
			}
		});
		
		//리스트
		lst.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 리스트에서 선택한 이름을 tfName에 넣고, 잔액은 tfBalance에 넣기
				String str = lst.getSelectedItem().trim(); //trim() 앞뒤 공백 제거
				tfName.setText(str);
				tfBalance.setText(hm.get(str)+"");
				
			}
		});
		
		// 예금버튼 클릭
		inputBtn.addActionListener(new ActionListener() {
			/*
			 * 1. 리스트에 선택된 계좌 잔액에
			 * 2. tfMoney 만큼 더해서
			 * 3. 잔액(tfBalance)을 고쳐주고 맵에 저장
			 * 
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String Key = lst.getSelectedItem().trim();
				
				int balance = hm.get(Key); //기존잔액
				int value = balance + Integer.parseInt(tfMoney.getText());//수정잔액
				tfBalance.setText(value+ ""); //화면에서 잔액수정
				hm.put(Key, value); //hm 내용 수정
				tfMoney.setText(""); // 편의를 위해 예금액 지우기	
				
			}catch(NullPointerException n){
				new MessageBox("오류!!!", "계좌를 선택해 주세요");
			}catch (NumberFormatException e2) {
				new MessageBox("입력오류!!!", "숫자를 입력하세요");
			}
			}
			});
		
		// 출금버튼 클릭
		outputBtn.addActionListener(new ActionListener() {
			/*
			 * 1. 리스트에 선택된 계좌 잔액에
			 * 2. tfMoney 만큼 빼서
			 * 3. 잔액(tfBalance)을 고쳐주고 맵에 저장
			 * 
			 */
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				//String Key = lst.getSelectedItem().trim();
				String Key = tfName.getText();
				int balance = hm.get(Key); //기존잔액
				int value = balance - Integer.parseInt(tfMoney.getText());//수정잔액
				if(value<0) {
					new MessageBox("잔액부족!!!", Key + "님 잔액이 부족합니다.");
					return;
				}
				tfBalance.setText(value + "");
				hm.put(Key, value); //hm 내용 수정
				tfMoney.setText(""); // 편의를 위해 예금액 지우기
			}catch(NullPointerException n) {
				new MessageBox("오류!!!", "계좌를 선택해 주세요");
				
			}catch(NumberFormatException e2) {
				new MessageBox("입력오류!!!","숫자를 입력하세요");
			}
			}
			});
		
			//파일저장
			fileBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//hm의 내용 -> file
				File dir = new File("src\\guiTest"); //
				File file = new File(dir, "myBank.txt");
				try {
					FileWriter fw = new FileWriter(file); //파일로 내보낼 객체
					Set<String> set = hm.keySet(); //key의 집함
					Iterator<String> it = set.iterator();
					while(it.hasNext()) {
						String Key = it.next(); // 하나의 Key 구하기
						fw.write(Key+" "); // 이름 내보내기, 공백을 안주면 한단어로 읽기 때문에 공백을 줘서 구분을 해줘야한다.
						fw.write(hm.get(Key)+"\n"); // 잔액구하기
					}
					fw.close();
				} catch (IOException e1) {
					new MessageBox("파일오류!!!" , "파일 저장 실패");
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		
		
		setSize(500, 300);
		setVisible(true);
		load();
		
	}
	
	private void load() {
		hm.clear();
		File dir = new File("src\\guiTest");
		File file = new File(dir,"myBank.txt");
		try {
		if(!file.exists()) {
			file.createNewFile();
		}
		Scanner sc = new Scanner(file); // 파일로 읽어오기
		while(sc.hasNext()) {
			String name = sc.next().trim(); //이름
			int money = sc.nextInt(); // 잔액
			hm.put(name, money); //맵에 저장
			lst.add(name+"\n"); //리스트에 이름 추가, 지역변수였는데, 여기서도 사용해야 하니까 전역변수로 만들어줘야 한다.
			
		}
		sc.close();
		}catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		new Bank();

	}

}
