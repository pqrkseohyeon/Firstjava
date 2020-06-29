package guiTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame{
	JTextArea ta;
	File f;
	public Memo(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenu mfile = new JMenu("파일");
		//메뉴 안에 있는 것들이라서 item을 사용해야 한다.
		JMenuItem mOpen = new JMenuItem("열기");
		JMenuItem mNew = new JMenuItem("새파일");
		JMenuItem mSave = new JMenuItem("저장");
		JMenuItem mSaveAs = new JMenuItem("다른 이름으로 저장");
		JMenuItem mExit = new JMenuItem("끝내기");
		mfile.add(mOpen);
		mfile.add(mNew);
		mfile.add(mSave);
		mfile.add(mSaveAs);
		mfile.addSeparator(); // 선을 만들어준다.
		mfile.add(mExit);
		JMenuBar mb = new JMenuBar();
		mb.add(mfile);
		setJMenuBar(mb);
		
		 ta = new JTextArea(); // 파일 읽기 메소드에서도 사용해야 하기 때문에 지역변수였던 ta를 전역변수로 만들어줘야 한다.
		//JScrollPane jsp = new JScrollPane(ta); //밑에 두줄과 같은 말이다. 둘중에 편한거 사용하면 된다.
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(ta);
		
		add(jsp);
		
		//새파일
		mNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(""); 
				setTitle("제목없음");
			}
		});
		
		
		//열기
		mOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if(fc.showOpenDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; // 취소버튼이면 이코드를 실행하고,
				
				f = fc.getSelectedFile(); //선택된 파일이 나온다. //취소 버튼이 아니라면 이걸 샐행한다.
				setTitle(f.getName()); //선택한 파일의 파일제목을 나타내준다.
				fileRead(f); // 읽어주는 메소드 만든다.
				
			}
		});
		
		
		//저장
		mSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getTitle().equals("제목없음")) { //제목없음이면 창을 띄우고,
//					JFileChooser fc = new JFileChooser();
//					if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; 
//					f = fc.getSelectedFile();
//					fileSave(f);
//					setTitle(f.getName());
				mSaveAs.doClick(); // mSave as를 클릭하는 것과 똑같으니까 위에 내용을 주석처리하고, 이 코드를 사용하면 똑같은 결과를 출력할 수 있다.
				}else { //기본 파일이 있음
					fileSave(f); 
				}
				
			}
		});
		
		
		//새이름 저장
		mSaveAs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; 
				f = fc.getSelectedFile();
				//System.out.println("파일저장 :" + f); //파일 저장 위치 알려주는 출력물
				fileSave(f);
				setTitle(f.getName());
				
			}
		});
		
		
		//끝내기
		mExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		setSize(500, 400);
		setVisible(true);
	}

	
	
	
	
	
	public static void main(String[] args) {
		new Memo("제목없음");
	}
	
	
	//파일 읽기 메소드
	private void fileRead(File f) {
		try {
			FileReader fr = new FileReader(f);
			StringWriter sw = new StringWriter();
			while(true) {
				int ch = fr.read();
				if(ch==-1)break;
				sw.write(ch);
			}
			ta.setText(sw.toString());
			sw.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 파일 저장 메소드
	private void fileSave(File f) {
		try {
		PrintStream ps = new PrintStream(f);
		ps.print(ta.getText());
		ps.close();
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	
		
	}
	
	
	

}
}