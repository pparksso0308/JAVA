package ��ǰJavaProgramming;

public class TV {

	String brand;
	int year;
	int inch;
	
	public TV(String _brand, int _year, int _inch)
	{
		brand = _brand;
		year= _year;
		inch = _inch;
	}
	void show()
	{
		System.out.println(brand+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
