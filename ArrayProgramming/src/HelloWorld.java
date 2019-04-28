import java.util.BitSet;

public class HelloWorld {

	public static void main (String args[]) {
		System.out.println("Hello World");
		
		BitSet bit = new BitSet(5);
		bit.set(2);
		bit.set(3);
		System.out.println("Sizze of the bit " + bit.nextClearBit(0));
		
	}
	
}
