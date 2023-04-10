package day08.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ex36_Swing extends JFrame {

	JTabbedPane jt;  // 탭이 있는 뼈대
	JPanel p1; // 
	JPanel p2;
	JPanel p3;
	JPanel p4;
	
	public Ex36_Swing() {
		this.setTitle("Swing Example");
		this.setSize(1000,600);
		
		this.getContentPane().add(getJTabbedPane(), BorderLayout.CENTER);
	}
	
	public JTabbedPane getJTabbedPane() {
		jt = new JTabbedPane();
		jt.setTabPlacement(JTabbedPane.TOP);
		jt.addTab("Tab1", getPanel1());
		jt.addTab("Tab2", getPanel2());
		
		return jt;
	}
	
	public JPanel getPanel1() {
		p1 = new JPanel();
		JLabel j = new JLabel();
		j.setText("SWING 1st Panel");
		p1.add(j);
		return p1;
	}
	
	public JPanel getPanel2() {
		p2 = new JPanel();
		JTextField t = new JTextField("This is a TextField");
		JButton b = new JButton("OK");
		
		// JList
		String[] os = {"Mac", "Windos", "Linux", "Unix"};
		JList l = new JList(os);
		
		// JTable
		String[][] data = {
				{"Python", "Easy"},
				{"Java", "..."}
		};
		String[] varname = {"Name", "Difficulty"};
		JTable tb = new JTable(data, varname);
		
		p2.add(t); p2.add(b); p2.add(l); p2.add(tb);
		return p2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex36_Swing s = new Ex36_Swing();
		s.setVisible(true);  // 보이게 하려면 true
	}

}
