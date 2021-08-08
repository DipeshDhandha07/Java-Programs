import java.util.*;
class AreaEx
{
	int l,b;
	void input(int a,int b1)
	{
		l=a;
		b=b1;
	}
	int display()
	{
		int ans;
		ans=l*b;
		return ans;
	}
	public static void main(String ar[])
	{
		AreaEx A=new AreaEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter l");
		int len=sc.nextInt();
		System.out.println("enter b");
		int br=sc.nextInt();
		A.input(len,br);
		int ans1=A.display();
        System.out.println("Area of rect is "+ ans1);
        sc.close();
	}
}
