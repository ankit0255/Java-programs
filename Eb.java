package earlybindinglatebinding;
class A
{
	void f1()
	{
	System.out.println("f1");
	}

	void f2()
	{
	System.out.println("f2");
	}

	void f3()
	{
	System.out.println("f3");
	}
}
class B extends A
{
	
	void f3()
	{
	System.out.println("f32");
	}

	void f4()
	{
	System.out.println("f4");
	}
}
public class Eb
{
public static void main(String args[])
{
	A obj=new B();
	obj.f1();
	obj.f2();
	obj.f3();
	
}
}