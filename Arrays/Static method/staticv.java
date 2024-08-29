public class staticv{
	static void mystaticmethod()
	{
		System.out.println("Static method can be calld withouth creating objects");
		}
		public void mypublicmethod();
		{
		System.out.println("public method must be called by creating objects");
		}
			public static void main(String[]args)
			{
				mystaticmethod();
				mypublicmethod();
				
				staticv myobj = new staticv();
				myobj.mypublicmethod();
			}
		}
		
	
