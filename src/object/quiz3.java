package object;

public class quiz3 {

	public static void main(String[] args) {
		Coffe a = new Coffe("아메리카노","둘리",3000);
		Coffe b = new Coffe("라떼","또치",20000);
		
		a.showInfo();
		b.showInfo();				
	}

}

class Coffe {
	String menu;
	int price;
	String name;
	int money;
	
	public Coffe(String menu,String name, int money) {
		this.menu = menu;
		this.name = name;
		this.money = money;
	}
	
	public void showInfo() {
		if(menu.equals("아메리카노")) {
			price = 4000;
		}else if (menu.equals("라떼")) {
			price = 4500;
			
		}
		if(money < price) {
			System.out.println(name + "는 가난합니다.");
			return;
		}else {
		System.out.println(money+"원을 가진 " + name + "는 별다방 카페에서 " + price + "원을 내고 " +menu + "를 샀습니다.");
		}
	}
}
