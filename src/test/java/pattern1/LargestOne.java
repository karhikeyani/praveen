package pattern1;

import java.util.Scanner;

public class LargestOne {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		
		int []s= new int [d];
		
	//	int []s = {23, 33,234,289,47, 66, 997,64};
		
		int length = s.length;
		
		int temp =0;
		
		
		for (int i = 0; i < length; i++) 
		{
			
			for (int j = i+1; j < length; j++)
			{
				
				if (s[i]>s[j]) 
				{
					
					temp= s[i];
					
					s[i]=s[j];
					
					s[j]=temp;
					
					
					
				}
				
			}
			
		}
for (int k= 0; k < s.length; k++) {
				
			
			System.out.println(s[k]);
		             }

	}

}
