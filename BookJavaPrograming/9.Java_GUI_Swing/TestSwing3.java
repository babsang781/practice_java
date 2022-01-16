package swing;

import javax.swing.*;
import java.awt.*;


public class TestSwing3 extends JFrame{
	
	public TestSwing3() {
		// BorderLayout!
		setTitle("BorderLayout");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		
		// ����Ʈ�ҿ� ��ġ ������ ����
		c.setLayout(new BorderLayout(30,20));
		c.add(new NorthPanel(), BorderLayout.NORTH); //  NORTH �г� �߰�
		c.add(new CenterPanel(), BorderLayout.CENTER); //  CENTER �г� �߰�
		
		setSize(300,300);
		setVisible(true);		
		
	}
	
	public static void main(String[] args) {
		new TestSwing3();
	}

}
