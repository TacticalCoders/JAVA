import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class Ex9_2 extends JFrame {
	
	public Ex9_2 () {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); //컴포넌트들은 컨텐트팬에 부착할 수 있기때문에 우선 컨텐트팬을 받아야 한다.
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK")); //JButton을 가리키는 레퍼런스 변수 없이 선언
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150); //set으로 시작하는 메소드들은 콘텐트 팬이 아닌 가장 큰 프레임을 뜻하기 때문에 접근 지정자를 사용할 필요가 없다.
		setVisible(true); //setTitle,setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE),setSize(300,150),setVisible(true)는 암기하자.
		
		}

	public static void main(String[] args) {
		Ex9_2 obj = new Ex9_2();
	}

}
