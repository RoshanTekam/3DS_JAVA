
public class KiteTest {
	public static void main(String[] args) {
		Kite.showKiteCount();
		Kite kite1 = new Kite("Vishan", "Red", 50,false);
		kite1.showCount();
		Kite kite2 = new Kite("Shan", "Green", 40,false);
		kite1.showCount();
		Kite kite3 = new Kite("Shan", "White", 20,false);
		kite1.showKiteCount();
		kite1.showCount();
	}

}

class Kite {
	private String owner;
	private String color;
	private int length;
    private boolean flying;
	private static int kiteCount; // shared data across all kite's objects

	public static void showKiteCount() {
		System.out.println("Total kite in the sky : " + kiteCount);
	}

	public Kite(String owner, String color, int length,boolean flying) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying=flying;
		kiteCount++;
	}

	void showCount() {
		System.out.println("Kite owner : " + owner);
		System.out.println("Kite colot : " + color);
		System.out.println("Kite length : " + length);
		System.out.println("Count : " + Kite.kiteCount);
		System.out.println("_____________________________");
	}
	void kiteFight(Kite ref) {
		System.out.println(color+" Kite ");
		for(int i=0;i<=20;i++)
		{
			double value=Math.random();
			System.out.println("Kites ae fighting..."+value);
			if(value > 0.85)
			{
				kiteCount--;
				ref.flying=false;
				break;
			}
			if(value < 0.10)
			{
				kiteCount--;
				ref.flying=false;
				break;
			}
		}
	}
	

	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}

}
