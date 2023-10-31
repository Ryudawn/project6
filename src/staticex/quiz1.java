package staticex;

public class quiz1 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.clientName = "둘리";
		System.out.println(c1.clientName + "의 카드번호는 " + c1.cardNumber + "번 입니다.");
		
		Card c2 = new Card();
		c2.clientName = "고길동";
		System.out.println(c2.clientName + "의 카드번호는 " + c2.cardNumber + "번 입니다.");
		
		Card c3 = new Card();
		c3.clientName = "고철수";
		System.out.println(c3.clientName + "의 카드번호는 " + c3.cardNumber + "번 입니다.");
		
	}

}
class Card {
	static int count = 100;
	int cardNumber;
	String clientName;
	
	public Card() {
		
		cardNumber = count;
		count++;
	}
}
