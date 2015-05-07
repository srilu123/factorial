package com.parsa.cards;

public class Card {
	public  int rank;
	public int suit;
	
	public static void main(String[] args) {
		
		// must run program with -ea flag (java -ea ..) to
		// use assert statements
	    assert rankToString(ACE) == "Ace";
	    assert rankToString(DEUCE) == "Deuce";
	    assert rankToString(THREE) == "Three";
	    assert rankToString(FOUR) == "Four";
	    assert rankToString(FIVE) == "Five";
	    assert rankToString(SIX) == "Six";
	    assert rankToString(SEVEN) == "Seven";
	    assert rankToString(EIGHT) == "Eight";
	    assert rankToString(NINE) == "Nine";
	    assert rankToString(TEN) == "Ten";
	    assert rankToString(JACK) == "Jack";
	    assert rankToString(QUEEN) == "Queen";
	    assert rankToString(KING) == "King";

	    assert suitToString(diamonds) == "Diamonds";
	    assert suitToString(clubs) == "Clubs";
	    assert suitToString(hearts) == "Hearts";
	    assert suitToString(spades) == "Spades";

	}
public final static int diamonds=1;
public final static int spades=2;
public final static int clubs=3;
public final static int hearts=4;

public final static int ACE=1;
public final static int DEUCE=2;
public final static int THREE=3;
public final static int FOUR=4;
public final static int FIVE=5;
public final static int SIX=6;
public final static int SEVEN=7;
public final static int EIGHT=8;
public final static int NINE=9;
public final static int TEN=10;
public final static int JACK=11;
public final static int QUEEN=12;
public final static int KING=13;
public Card(int rank,int suit){
	assert isValidRank(rank);
	assert isValidSuit(suit);
	this.rank=rank;
	this.suit=suit;
}
/**
 * @return the rank
 */
public int getRank() {
	return rank;
}
/**
 * @return the suit
 */
public int getSuit() {
	return suit;
}
public static Boolean isValidRank(int rank){
	
	return ACE<=rank && rank >=KING;
	
}

public static Boolean isValidSuit(int suit){
	
	return diamonds<=suit && suit >=hearts;
	
}
public static String rankToString(int rank){
	switch(rank){
	case ACE:
        return "Ace";
    case DEUCE:
        return "Deuce";
    case THREE:
        return "Three";
    case FOUR:
        return "Four";
    case FIVE:
        return "Five";
    case SIX:
        return "Six";
    case SEVEN:
        return "Seven";
    case EIGHT:
        return "Eight";
    case NINE:
        return "Nine";
    case TEN:
        return "Ten";
    case JACK:
        return "Jack";
    case QUEEN:
        return "Queen";
    case KING:
        return "King";
    default:
    	return null;
	}
}
public static String suitToString(int suit){
	switch(suit){
	case diamonds:
		return "Diamonds";
	case spades:
		return "Spades";
	case clubs:
		return "Clubs";
	case hearts:
		return "Hearts";
		default:
			return null;
		
	}
}


}
