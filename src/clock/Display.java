package clock;

public class Display {
	 private int limit=0;
	 private int value=0;
	 private static int step=1;
	 public static void showStep() {
		 System.out.println(step);
	 }
	public Display(int limit) {
		this.limit=limit;
	}
	public void increase() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	public int getValue() {
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Display d=new Display(24);
		while(true)
		{
			d.increase();
			System.out.println(d.getValue());
			
		}
		*/
		Display d1=new Display(21);
		Display d2=new Display(20);
		d1.showStep();
		d2.showStep();
		d1.step=2;
		d1.showStep();
		d2.showStep();
		Display.step=3;
		d1.showStep();
		d2.showStep();
	}

}
