
public class WithArgWithRet {

		public float sum(float a,int b)//Formal Arguments
		{
			
			return (a+b);
		}
	
	public static void main(String[] args) {
		
		WithArgWithRet was=new WithArgWithRet();
		
		float k=was.sum(10.1f, 20);
		System.out.println(k);//Actual Arguments
		
		System.out.println(was.sum(100.3f, 200));
	}

}
