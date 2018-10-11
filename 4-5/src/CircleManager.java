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
		System.out.println( "(" + x +","+ y + ")" +radius);
	}
}
public class CircleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle [3] ; // 3개의 Circle 배열 선언
		for(int i =0; i< c.length ; i++)
		{
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();	//x값 읽기
			double y = scanner.nextDouble();//y값 읽기
			int radius = scanner.nextInt();//반지름 읽기
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i=0 ; i<c.length ; i++)
		{
			c[i].show();
		}
		scanner.close();
	}

}
