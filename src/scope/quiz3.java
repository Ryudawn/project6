package scope;

public class quiz3 {

	public static void main(String[] args) {

		Person person = new Person();	// 생성은 했지만 person을 호출하여 사용하지 않음
		
		int i = 10;
		
		if(i > 1) {
			String str = "안녕하세요 "; // str에다가 안녕하세요를 넣었지만 출력문이 작성되지않아 혼자 숨어서 노는중임
		}
		for(int k=0; k < 10; k++) {
			System.out.println();	//10번의 줄넘김
		}
		
	}

}
