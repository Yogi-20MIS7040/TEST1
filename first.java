/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		import java.util.Arrays;
	import java.util.Scanner*;
	
package qsdf;

class 1 
{
  
public static void main (String args[]) 
  {
    
		 Scanner sc=new Scanner(System.in);
		 int n =sc.nextInt();
		 
		 
		        int[] input =  new int[n];
		        for(int j = 0; j < n; j++)
		        {
		            input[j] = sc.nextInt();
		       
		        
		 
		        int[] a = new int[(n)/2];
		        int[] b = new int[n - a.length];
		 
		        for (int i = 0; i < n; i++)
		        {
		            if (i < a.length)
		                a[i] = input[i];
		            else
		                b[i - a.length] = input[i];
		        }
		 
		        System.out.println(Arrays.toString(a));
		        System.out.println(Arrays.toString(b));
		    }
		}

	}



	}
}

