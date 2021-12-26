import java.awt.Container;

import javax.swing.*;
import java.awt.*;

public class TestSwing extends JFrame {
	
	public TestSwing() {
		setTitle("첫번째 프레임");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//  프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		
		Container contentPane = getContentPane(); // 프레임에 부착된 컨텐트 팬을 알아낸다.
		contentPane.setBackground(Color.ORANGE);  // 컨텐트팬의 색깔을 오렌지 색으로 
		contentPane.setLayout(new FlowLayout());  // 컨텐트팬에 FlowLayout 배치관리자 달기
		
		JButton button =new JButton("Click"); // 버튼 컴포넌트 생성
		contentPane.add(button); // 컨텐트팬에 버튼 부착
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
	}
	
	public static void main(String[] args) {
		TestSwing ts = new TestSwing();
	}

}
