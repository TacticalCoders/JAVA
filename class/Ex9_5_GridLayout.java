import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Ex9_5_GridLayout extends JFrame {
	
	public Ex9_5_GridLayout() {
		
		setTitle("GridLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//4�� 2���� �׸��� ����.
		GridLayout grid = new GridLayout(4,2); //���� ���������� ���۷��� ���� ���� �ٷ� ���������� �̹� ���������� ��ġ������ ���� �� �߰�.
		grid.setVgap(5); //���� ������ ���� ������ 5�ȼ��� ����. ��ó�� ���۷��� ������ ����ϸ� �Ӽ��� ���ϰ� ����� �� �ִ�.
		c.setLayout(grid);
		//�׸���� �¿��� ��� ������ �Ʒ��� add�� ������ �߰��ȴ�.
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		Ex9_5_GridLayout obj = new Ex9_5_GridLayout();

	}

}
