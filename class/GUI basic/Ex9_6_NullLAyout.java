import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class Ex9_6_NullLAyout extends JFrame {
	
	public Ex9_6_NullLAyout() {
		
		setTitle("NullLAyout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null); //왜 NULL을 하는가? 기본으로 배치관리자가 부여되어 있기 때문, 따라서 NULL을 꼭 해줘야 한다.
		//컴포넌트의 위치나 크기를 직접 설정하고 싶은 경우, 배치관리자를 null로 한다.
		
		JLabel la = new JLabel("Hello, Press Buttons");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); //정수를 문자열로 변환. b는 추가하기 위한 임시 레퍼런스 변수.
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Ex9_6_NullLAyout obj = new Ex9_6_NullLAyout();
	}

}
