/*Program to count the number of villages controlled by tribes A and B*/
package com.VillageTribes;

import java.util.Scanner;
class VillageTribe
{
	public static void main(String [] args){
		System.out.println("Enter the number of testcases: ");
		Scanner sc = new Scanner(System.in);

		int no_of_testCase = sc.nextInt();                                        // read number of testcase

		for (int i = 1; i <= no_of_testCase; i++)                                // iterate till the number of testcases
		{
			System.out.println("Enter String(containing A ,B,.)");
			String s = sc.next();                                                 // read the input pattern
			int countA = 0, countB = 0, count_empty = 0;                          //initialize no of villages controlled by tribes A and B to 0
			boolean villageA = false, villageB = false;                          
			for (int j = 0; j < s.length(); j++)                                //iterate till  the end of entered string (pattern)
			{
				//check for the presence of A
				if (s.charAt(j) == 'A') 
				{
					if (villageA) 
					{
						countA = countA + count_empty;               //add the number of empty villages controlled by A
						
					} 
					else 
					{
						villageA = true;
						villageB = false;
					}
					countA++;
					count_empty = 0;
					
				}//End of outer if
				
				//check for the presence of B
				else if (s.charAt(j) == 'B') 
				{
					if (villageB) 
					{
						countB = countB + count_empty;              //add the number of empty villages controlled by B
					
					} else 
					{
						villageB = true;
						villageA = false;
					}
					countB++;
					count_empty = 0;
				}//End of else if 
				else 
				{
                   if (villageA) 
					{	
						count_empty++;
					}
					else if(villageB) 
					{
						count_empty++;
					}
				}
			}//End of Inner for loop
			System.out.println(countA + " " + countB);
		}//End of Outer for loop
	
	}//End of main() method
}//End of Class 