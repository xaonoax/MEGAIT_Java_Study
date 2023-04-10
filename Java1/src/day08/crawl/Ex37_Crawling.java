package day08.crawl;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex37_Crawling extends JFrame implements ActionListener{
	JLabel[] label;
	JTextField tf;
	JButton bt;
	
	Ex37_Crawling() {
		tf = new JTextField("영화 이름을 입력하세요.");
		tf.setBounds(20, 50, 200, 30);  // x좌표, y좌표, 가로 사이즈, 세로 사이즈
		
		bt = new JButton("Search");
		bt.setBounds(230, 50, 100, 30);
		bt.addActionListener(this);
		
		label = new JLabel[10];
		for(int i=0;i<10;i++) {
			label[i] = new JLabel("감상평" + i);
			label[i].setBounds(20, 120 + (40 * i), 1000, 30);
			add(label[i]);
		}
		
		add(tf); add(bt);
		
		setSize(1100, 600);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex37_Crawling c = new Ex37_Crawling();
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked");
		
		String title = tf.getText();
		Font font = new Font("나눔고딕", Font.PLAIN, 14);
		label[0].setFont(font);
		
		String URL = "https://search.naver.com/search.naver?query=영화+" + title;
		try {
			Document doc = Jsoup.connect(URL).get();
			Elements elem = doc.select("p.area_text_box_ell");
			System.out.println(elem);
			
			int count = 0;
			for(Element el : elem) {
				label[count].setFont(font);
				label[count].setText((count+1) + "." + el.text());  // text() : 글만 가져옴(태그 제외)
				count++;
			}
			
		}
		catch(Exception ex) { ex.printStackTrace(); }
		
	}

}
