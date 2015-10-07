import java.util.Random;

public class Deck {
	Card[] deck;
	
	public Deck() throws CardException {
		int nextIndex = 0;
		
		this.deck = new Card[52];	
		
		char suits[] = {'C', 'D', 'H', 'S'};
	    for (int i = 0; i < 4; i++)
	    {
	      for (int j = 0; j < 13; j++)
	      {
	        Card c = new Card(suits[i], j+1);
	        this.deck[nextIndex++] = c;
	      }
	    }
		
	}
	
	public void shuffle() {
	    int index;
	    Card temp;
	    Random random = new Random();
	    for (int i = this.deck.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = this.deck[index];
	        this.deck[index] = this.deck[i];
	        this.deck[i] = temp;
	    }
	}	
	
	
	public void printItems() {
		for (int i = 0; i < 52; i++) {
			System.out.println(this.deck[i]);
		}
	}
			
	public static void main(String args[]) throws CardException {
		Deck deck = new Deck();
		deck.shuffle();
		deck.printItems();
	}
}
