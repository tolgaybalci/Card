import java.lang.Object;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



//In this question, your task is implementing a card guessing game. There are four card type
//such as “spade”, “heart”, “diamond” and “club”. Each card can have value 1 to 13. The
//program chooses a card from deck and asks player card type and value. The program informs
//player about whether his/her guess is correct or wrong. Program runs until player guess is
//correct.
public class CardGuessingGame {
	public static void main(String args[]){
		//your code starts here
		//generates a card deck and picks a random card from the deck.	
		
		Scanner scan = new Scanner(System.in);
		
		int kartNo;
		String kartTipi;
		
		ArrayList<Card> deste = generateCardDeck(); 
		
		Card randomCard = deste.get(RandomTest.randomIntegerRandom(0, 51));
		
		System.out.println("Kart numarası giriniz: ");
		kartNo = scan.nextInt();
		System.out.println("Kart tipini giriniz: ");
		kartTipi= scan.next();
		//Your code ends here
		
		if(randomCard.getCardType().equals(kartTipi) && randomCard.getValue() == kartNo) {
			System.out.println("YOu win");
		}
		else {
			System.out.println("Try again.");
			System.out.println("Random card: " + randomCard.getCardType() + " " + randomCard.getValue());
		}
		
	}
	
	/*
	 * Generates card deck which is an arrayList that holds all cards with all types and values.
	 * there must be 52 cards in deck with types "spade", "club", "diamond", "heart" and values between 1-13
	 * */
	public static ArrayList<Card> generateCardDeck(){
		ArrayList<Card> deck = new ArrayList<Card>();
		String[] types = new String[]{"spade","club","diamond","heart"};
		for(String str : types){
			for(int i = 1; i <= 13; i++){
				Card card = new Card(str,i);
				deck.add(card);
			}
		}
		return deck;
	}
	

}
	

