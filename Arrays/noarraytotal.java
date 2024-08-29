public class noarraytotal{
	public static void main(String[]args){
		int no[] = {22,45,500,44,33,42};
		int sum = 0;
		
		//0 kiyanne 22 , 1 kiyanne 45;
		
		for(int count=0; count<no.length ;count++){
			sum+=no[count]; //sum=sum+num[count];
		}
		System.out.println("Total Is: = "+sum);
	}
}