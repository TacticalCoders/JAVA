import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


public class Ex9_3_FlowLayout extends JFrame {
	
	public Ex9_3_FlowLayout() {
		
		setTitle("FlowLayout smaple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //셋디폴트클로즈오퍼레이션
		Container c = getContentPane(); //컨텐트팬의 자료형은 Container
		//레이아웃은 어디에? -> 컨텐트팬에다가 하는 것이므로 접근지정자를 이용해야!
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//왼쪽 정렬, 가로 간격 30, 세로 간격 40
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex9_3_FlowLayout();
	}

}
