import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		int math;
		int science;
		int english;
		double avg;
		
		
		public Grade(int _math, int _science, int _english)
		{
			math=_math;
			science= _science;
			english = _english;
		}
		
		int average()
		{
			avg = (math+science+english)/3;
			
			return avg;
		}
		
		
		
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math,science,english);
		System.out.println("����� "+me.average()); //average�� ����� ����Ͽ� ����
		
		scanner.close();
	}

}
