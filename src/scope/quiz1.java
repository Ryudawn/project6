package scope;

public class quiz1 {
	
}
class a {
	public int field1; 	// 모든공간
	int field2;			// 해당 패키지 내 모든공간	
	private int field3;	// 해당 클래스 내에 공간만 허용 외부 보안
}
class Person {
	String personName;			//인스턴스 생성시 사용 가능
	int personAge;
	static char gender = 'F';	//인스턴스를 생성하지 않아도 사용 가능
	
	public void setPersonName(String name) {
		this.personName = name;	//메소드 안에서만 사용 가능
		
	}
	public void setPersonAge(int age) {
		this.personAge = age;	//메소드 안에서만 사용 가능
	}
}
