public class Hello { //클래스
  
  public static int sum(int n, int m) { //메소드(함수)
    return n + m;
  }
  
  public static void main(String[] args){ //메인 메소드, 반드시 public, static, void타입으로 선언되어야 함. 한 클래스에 하나
    int i = 20; //변수 선언
    int s;
    char a;
    
    s = sum(i,10);
    a = '?';
    System.out.println(a); //java에서의 출력문.
    System.out.println("Hello");
    System.out,println(s);
  }
}
