
public class WithArgAndNoRet2 {
	
	public void addition(int a,int b,int c)
	{
		System.out.println("Sum="+(a+b+c));
	}

	public static void main(String[] args) {
		 
		WithArgAndNoRet2 wa=new WithArgAndNoRet2();
		wa.addition(1,2,3);
		wa.addition(10,30,40);

	}

}
