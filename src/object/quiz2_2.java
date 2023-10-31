package object;

public class quiz2_2 {

	public static void main(String[] args) {
		Student2 student1 = new Student2("둘리", 7000);
		Taxi taxi = new Taxi("70합 1234");
		student1.takeTaxi(taxi);
		student1.showInfo();
		taxi.showInfo();

	}

}
class Taxi {
	public String taxiNumber;
	public int money;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money = this.money + money;
	}
	
	public void showInfo() {
		System.out.println("택시의 차량번호는 " + taxiNumber + "입니다. 택시의 수익은 " + money +"원 입니다." );
	}
	
}
class Student2 {
	String studentName;
	int money;
	
	public Student2(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeTaxi(Taxi taxi) {
		if(money < 10000) {
			System.out.println("소지금이 적어 택시를 탈 수 없습니다 . ");
			return;
		}
		taxi.take(10000);
		this.money = this.money - 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}
