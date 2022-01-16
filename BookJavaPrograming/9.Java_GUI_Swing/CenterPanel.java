package swing;

import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CenterPanel extends JPanel {

	public CenterPanel() {
		setLayout(null);
		String text[] = { "Hello", "Java", "Love" };
		int x, y;

		JLabel label;

		for (int i = 0; i < 3; i++) {
			x = (int) (Math.random() * 200); // 글자 짤림 방지를 위해 50의 여유를 남김
			y = (int) (Math.random() * 200);
			label = new JLabel(text[i]);
			label.setLocation(x, y); // 랜덤위치에 label 붙이기
			label.setSize(50, 10); // label 크기 설정
			
			this.add(label);
			
		}
	}

}
