public class User {
	private Card[] stack;
	private String name;
	public int turn;
	
	public User(String name, int turn) throws CardException {
		this.name = name;
		this.stack = new Card[26];
		this.turn = turn;
	}
	
	public void getDealt(Deck deck) {
		int nextIndex = 0;
		int init;

		if(this.turn == 1) {
			init = 0;
		} else {
			init = 1;
		}	
		for (int i = init; i < deck.deck.length; i += 2) {
			this.stack[nextIndex++] = deck.deck[i];
		}
	}

	public void printStack() {
		for (int i = 0; i < this.stack.length; i++) {
			System.out.println(this.stack[i]);
		}
	}

	public static void main(String args[]) throws CardException {
		Deck deck = new Deck();
		User user1 = new User("A", 1);
		User user2 = new User("B", 2);

		deck.shuffle();

		user1.getDealt(deck);
		user1.printStack();

		//deck.printItems();
	}	
}
