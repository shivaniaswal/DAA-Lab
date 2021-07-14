import java.util.Scanner;
class linear
{
	public static void main(String args[])
	{
		Scanner I = new Scanner(System.in);
		int a[]=new int[10];
		int i=0,found=0,p;
		System.out.println("Enter the number of elements in the array");
		p=I.nextInt();
		for(i=0;i<p;i++)
		{
			System.out.println("Enter a number");
			a[i]= I.nextInt();
		}
			System.out.println("Enter a number to be found");
			int n = I.nextInt();
			for(i=0;i<a.length;i++)
			{
				if(n==a[i])
				{
					found=1;
					System.out.println("Number is found at " + i + " index");
					System.out.println("Total Comparisons " + (i+1));
					break;
				}
			}
				if(found==0)
				{
					System.out.println("Not found");
				}
			}
		}

