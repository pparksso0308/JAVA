
public class Song {
	
	String title;
	String artist;
	int year;
	String country;
	
	public Song()
	{}
	
	public Song(String _title, String _artist, int _year, String _country)
	{
		title = _title;
		artist = _artist;
		year = _year;
		country = _country;
	}
	
	void show()
	{
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song firstSong = new Song("Dancing Queen","ABBA",1978,"������");
		firstSong.show();
	}

}
