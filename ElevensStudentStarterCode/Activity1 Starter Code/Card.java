/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {
	private String suit;
	private String rank;
	private int pointValue;
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}
	public String getSuit() {
	    return suit;
    }
	public String getRank() {
		return rank;
	}
	public int getPointValue() {
		return pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
	    boolean match = false;
		if(rank.equals(otherCard.getRank()) && suit.equals(otherCard.getSuit()) && pointValue == otherCard.getPointValue()){
		    match = true;
		  }
		return match;
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")" ;
	}
}
