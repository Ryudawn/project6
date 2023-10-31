package object;

public class Ex1 {

	public static void main(String[] args) {
		
		Student student = new Student("둘리",5000);
		Student student2 = new Student("도우너",10000);
		
		Bus bus = new Bus(100);
		student.takeBus(bus);
		student.showInfo();
		bus.showInfo();
		
		Subway subway = new Subway("2호선");
		student2.takeSubway(subway);
		student2.showInfo();
		subway.showInfo();
		
		
	}

}
class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("버스 "+ busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다. ");
	}
}

class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("지하철 "+ lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다. ");
	}
}

class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money = this.money - 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money = this.money - 1500;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}

















