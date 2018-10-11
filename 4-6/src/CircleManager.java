import java.util.Scanner;

class Circle
{
	private double x,y;
	private int radius;
	
	public Circle(double _x, double _y, int _radius)
	{	
		x=_x;
		y=_y;
		radius = _radius;
		
	}
	
	
	
	public void show()
	{
		System.out.println( "���� ������ ū ���� (" + x +","+ y + ")" +radius);
	}
	
	
}
public class CircleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int max = -1;
		int idx = -1;
		
		Circle c[] = new Circle [3] ; // 3���� Circle �迭 ����
		for(int i =0; i< c.length ; i++)
		{
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();	//x�� �б�
			double y = scanner.nextDouble();//y�� �б�
			int radius = scanner.nextInt();//������ �б�
			if(max < radius)
			{
				max = radius;
				idx = i;
			}
				
			c[i] = new Circle(x,y,radius);
		}
		
		
		
			c[idx].show();
		
		scanner.close();
	}

}
