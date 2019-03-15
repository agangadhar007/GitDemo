package Java;

public class ThisKeyword {

	int a = 3;
	
	public void GetData()
	{
		int a = 2;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj = new ThisKeyword();
		obj.GetData();
	}

}
