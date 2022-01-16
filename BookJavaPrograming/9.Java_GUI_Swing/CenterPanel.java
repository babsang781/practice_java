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
			x = (int) (Math.random() * 200); // ���� ©�� ������ ���� 50�� ������ ����
			y = (int) (Math.random() * 200);
			label = new JLabel(text[i]);
			label.setLocation(x, y); // ������ġ�� label ���̱�
			label.setSize(50, 10); // label ũ�� ����
			
			this.add(label);
			
		}
	}

}
