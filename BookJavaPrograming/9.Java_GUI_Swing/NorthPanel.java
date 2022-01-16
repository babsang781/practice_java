package swing;

import javax.swing.*;
import java.awt.*;


public class NorthPanel extends JPanel{
	
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
// 		생성해줄 필요 없음. this. 으로 처리 가능
//		Container c = getRootPane(); 
		setLayout(new FlowLayout());
//		JButton btn=new JButton(); 
		this.add(new JButton("open"));
		this.add(new JButton("read"));
		this.add(new JButton("close"));
		
	}
	
}
