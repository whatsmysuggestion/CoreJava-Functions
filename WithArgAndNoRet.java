
public class WithArgAndNoRet {
	
	public void displayName(String x)//formal or dummy arguments
	{
		System.out.println("Hello My name is "+x);
	}

	public static void main(String[] args) {
		 
		WithArgAndNoRet wa=new WithArgAndNoRet();
		
		wa.displayName("First");//actual or original arguments
		
		wa.displayName("Second");

	}

}
