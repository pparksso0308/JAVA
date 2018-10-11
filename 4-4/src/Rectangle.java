
public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int _x, int _y, int _width, int _height)
	{
		x=_x;
		y=_y;
		width = _width;
		height = _height;
	}
	
	void show()
	{
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	
	int square()
	{
		return width*height;
	}
	
	boolean contains(Rectangle _r)
	{
		if((_r.x+_r.width < x+width) && (_r.x > x) && (_r.y+_r.height < y+height) && (_r.y > y))
			return true;
		
		return false;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}

}
