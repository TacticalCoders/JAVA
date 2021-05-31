import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Ex9_5_GridLayout extends JFrame {
	
	public Ex9_5_GridLayout() {
		
		setTitle("GridLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//4행 2열의 그리드 생성.
		GridLayout grid = new GridLayout(4,2); //이전 예제에서는 레퍼런스 변수 없이 바로 생성했지만 이번 예제에서는 배치관리자 생성 후 추가.
		grid.setVgap(5); //격자 사이의 수직 간격을 5픽셀로 지정. 이처럼 레퍼런스 변수를 사용하면 속성을 편리하게 사용할 수 있다.
		c.setLayout(grid);
		//그리드는 좌에서 우로 위에서 아래로 add할 때마다 추가된다.
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		Ex9_5_GridLayout obj = new Ex9_5_GridLayout();

	}

}
