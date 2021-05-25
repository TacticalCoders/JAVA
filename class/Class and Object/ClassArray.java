class Id {
  String id;
  String pw;
  
  public Id () {}
  
  public Id(String id, String pw){
    this.id = id; 
    this.pw = pw;
  }
  
}

public class ClassArray {
  public static void main(String[] args){
    Id [] id; //Id 클래스를 가리키는 레퍼런스 변수 선언.  Id [] id = new Id[5]로 한줄로도 작성가능.
    id = new ID[5]; //레퍼런스를 5개 생성한 것. 즉, 객체는 아직 생성되지 않음.
    
    for(int i = 0; i<id.lenth ; i++){
      id[i] = new Id(); //객체 5개 생성.
    }
  }
}
