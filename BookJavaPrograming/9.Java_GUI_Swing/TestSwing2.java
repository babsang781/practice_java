package swing;

import javax.swing.*;
import java.awt.*;

public class TestSwing2 extends JFrame{

	public TestSwing2() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 4X2 격자의 gridLayout 배치관리자 생성
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5); // 격자 사이의 간격
		
		Container c = getContentPane();
		c.setLayout(grid); // grid를 컨텐트팬의 배치 관리자로 지정
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
			
	}
	
	
	public static void main(String[] args) {
		// grid 배치관리자 
		new TestSwing2();

	}

}
