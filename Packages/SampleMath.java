import maths.*;
import java.util.*;
class SampleMath
{
	public static void main(String ar[])
	{
		maths_sqr m=new maths_sqr();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println("square is "+m.sqr(n));
		System.out.println("cube is "+maths_sqr.cube(n));
	}
}