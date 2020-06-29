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
		JMenu mfile = new JMenu("����");
		//�޴� �ȿ� �ִ� �͵��̶� item�� ����ؾ� �Ѵ�.
		JMenuItem mOpen = new JMenuItem("����");
		JMenuItem mNew = new JMenuItem("������");
		JMenuItem mSave = new JMenuItem("����");
		JMenuItem mSaveAs = new JMenuItem("�ٸ� �̸����� ����");
		JMenuItem mExit = new JMenuItem("������");
		mfile.add(mOpen);
		mfile.add(mNew);
		mfile.add(mSave);
		mfile.add(mSaveAs);
		mfile.addSeparator(); // ���� ������ش�.
		mfile.add(mExit);
		JMenuBar mb = new JMenuBar();
		mb.add(mfile);
		setJMenuBar(mb);
		
		 ta = new JTextArea(); // ���� �б� �޼ҵ忡���� ����ؾ� �ϱ� ������ ������������ ta�� ���������� �������� �Ѵ�.
		//JScrollPane jsp = new JScrollPane(ta); //�ؿ� ���ٰ� ���� ���̴�. ���߿� ���Ѱ� ����ϸ� �ȴ�.
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(ta);
		
		add(jsp);
		
		//������
		mNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(""); 
				setTitle("�������");
			}
		});
		
		
		//����
		mOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if(fc.showOpenDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; // ��ҹ�ư�̸� ���ڵ带 �����ϰ�,
				
				f = fc.getSelectedFile(); //���õ� ������ ���´�. //��� ��ư�� �ƴ϶�� �̰� �����Ѵ�.
				setTitle(f.getName()); //������ ������ ���������� ��Ÿ���ش�.
				fileRead(f); // �о��ִ� �޼ҵ� �����.
				
			}
		});
		
		
		//����
		mSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getTitle().equals("�������")) { //��������̸� â�� ����,
//					JFileChooser fc = new JFileChooser();
//					if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; 
//					f = fc.getSelectedFile();
//					fileSave(f);
//					setTitle(f.getName());
				mSaveAs.doClick(); // mSave as�� Ŭ���ϴ� �Ͱ� �Ȱ����ϱ� ���� ������ �ּ�ó���ϰ�, �� �ڵ带 ����ϸ� �Ȱ��� ����� ����� �� �ִ�.
				}else { //�⺻ ������ ����
					fileSave(f); 
				}
				
			}
		});
		
		
		//���̸� ����
		mSaveAs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; 
				f = fc.getSelectedFile();
				//System.out.println("�������� :" + f); //���� ���� ��ġ �˷��ִ� ��¹�
				fileSave(f);
				setTitle(f.getName());
				
			}
		});
		
		
		//������
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
		new Memo("�������");
	}
	
	
	//���� �б� �޼ҵ�
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
	
	// ���� ���� �޼ҵ�
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