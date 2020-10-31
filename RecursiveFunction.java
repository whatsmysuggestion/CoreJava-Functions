
public class RecursiveFunction {

	public int fact(int n)
	{
		if(n==1||n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) {
			
		RecursiveFunction rr=new RecursiveFunction();
		System.out.println(rr.fact(5));
	}

}  //5*4*3*2*1
