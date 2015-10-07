public class Card
{
  private int value;
  private char suit;

  public Card(char s, int v) throws CardException
  {
    if (s == 'c') s = 'C';
    if (s == 'd') s = 'D';
    if (s == 'h') s = 'H';
    if (s == 's') s = 'S';
    if (s == 'C' || s == 'D' || s == 'H' || s == 'S')
    {
      this.suit = s;
    }
    else
    {
      throw new CardException("Illegal Suit" + this.suit);
    }
    if (v >= 1 && v <= 13)
    {
      this.value = v;
    }
    else
    {
      throw new CardException("Illegal value" + this.value);
    }
  }

  public Card(int v, char s) throws CardException
  {
    this(s, v);
  }

  public int getValue()
  {
    return this.value;
  }

  public char getSuit()
  {
    return this.suit;
  }

  public String toString()
  {
    int si = -1;
    String names[] = {"Ace", "Two", "Three", "Four", "Five", "Six",
                       "Seven", "Eight", "Nine", "Ten", "Jack",
                       "Queen", "King"};
    String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
    switch(this.suit)
    {
case 'c':
case 'C':si = 0;
         break;
case 'd':
case 'D':si = 1;
         break;
case 'h':
case 'H':si = 2;
         break;
case 's':
case 'S':si = 3;
    }
    return names[this.value-1] + " of " + suits[si];
  }
}
