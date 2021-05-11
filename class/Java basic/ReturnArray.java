public class ReturnArray {
  
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length;i++)
			temp[i] =i; //초기화
		return temp; //배열 레퍼런스를 반환(주소를 반환)
	}
	
	public static void main(String[] args) {
		
		int intArray[];
		intArray = makeArray(); //temp의 주소를 intArray도 공유
		for(int i = 0 ; i < intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}
