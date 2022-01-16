package swing;

import javax.swing.*;
import java.awt.*;


public class TestSwing3 extends JFrame{
	
	public TestSwing3() {
		// BorderLayout!
		setTitle("BorderLayout");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		
		// 컨텐트팬에 배치 관리자 설정
		c.setLayout(new BorderLayout(30,20));
		c.add(new NorthPanel(), BorderLayout.NORTH); //  NORTH 패널 추가
		c.add(new CenterPanel(), BorderLayout.CENTER); //  CENTER 패널 추가
		
		setSize(300,300);
		setVisible(true);		
		
	}
	
	public static void main(String[] args) {
		new TestSwing3();
	}

}
