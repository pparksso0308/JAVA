
import java.util.Scanner;

public class Grade {

		private int math;
		private int science;
		private int english;
		double avg;

	public Grade(int _math, int _science, int _english)
	{
		math=_math;
		science= _science;
		english = _english;
	}
	
	public double average()
	{
		avg = (math+science+english)/3;
		
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
	
		

		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math,science,english);
		System.out.println("����� "+me.average()); //average�� ����� ����Ͽ� ����
		
		scanner.close();
	}

}
