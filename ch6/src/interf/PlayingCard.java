package interf;

public interface PlayingCard {
	public static final int SPADE = 4;
	public final int DIAMOND = 3; // == public static final int
	static int HEART = 2; // == 
	int CLOVER = 1; // == 
	
	public abstract String getCardNumber();
	String getCardKind(); // == public abstract String getCardKind();
	
	
}
