import java.util.*;

class Test<A>
{
	A value;
	void show()
	{
		System.out.print(value.getClass().getName());
	}
	
}

class Generics
{
	public static void main(String args[])
	{
		Test<String> ts=new Test<String>();
		ts.value="vishal";
		ts.show();
	}
}