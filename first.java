/******************************************************************************

*******************************************************************************/
//Pennamada Yogeeswar Reddy 20MIS7040
public class Main
{
	public static void main(String[] args) {
		import java.util.Arrays;
	import java.util.Scanner*;
	
package qsdf;

class //  
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

