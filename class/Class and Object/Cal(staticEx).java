class Calc {
  public static int abs(int a) { return a>0?a:-a; }
  public static int max(int a, int b) { return (a>b)?a:b; }
  public static int min(int a, int b) { return (a>b)?b:a; }
}
public class CalcEx {
  public static void main(String[] args) {
    System.out.println(Calc.abs(-5)); //static으로 선언할 시, 클래스명.메소드 로 객체를 생성하지 않고도 접근할 수 있다.
    System.out.println(Calc.max(10, 8));
    System.out.println(Calc.min(-3, -8));
  }
}
