package test;

import java.awt.List;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2007); // 2007&#24180;
		calendar.set(Calendar.MONTH, 9); // 10&#26376;&#65288;0..11&#65289;
		calendar.set(Calendar.DAY_OF_MONTH, 30); // 31&#26085;&#65288;0..30&#65289;

		calendar.set(Calendar.HOUR, 23); // 23&#26178;&#65288;0..23&#65289;
		calendar.set(Calendar.MINUTE, 55); // 59&#20998;&#65288;0..59&#65289;
		calendar.set(Calendar.SECOND, 56); // 59&#31186;&#65288;0..59&#65289;
		calendar.set(Calendar.MILLISECOND, 888); // 999&#12511;&#12522;&#31186;&#65288;0..999&#65289;
		System.out.println(calendar.getTimeInMillis());
		System.out.println(calendar.getTime());

		calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2012);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		calendar.set(Calendar.HOUR, 23); // 23&#26178;&#65288;0..23&#65289;
		calendar.set(Calendar.MINUTE, 55); // 59&#20998;&#65288;0..59&#65289;
		calendar.set(Calendar.SECOND, 56); // 59&#31186;&#65288;0..59&#65289;
		calendar.set(Calendar.MILLISECOND, 888); // 999&#12511;&#12522;&#31186;&#65288;0..999&#65289;
		System.out.println(calendar.getTime());

		ArrayList<Song> songList = new ArrayList<Song>();
		songList.add(new Song("test"));
		songList.add(new Song("ugugu"));
		songList.add(new Song("dedede"));
		songList.add(new Song("addaabb"));

		TestList testList = new TestList();
		Collections.sort(songList, testList);
		for (Song s_song : songList) {
			System.out.println(s_song.getArtist());
		}
		String zen = Normalizer.normalize("±²³´µ", Form.NFKC);
		System.out.println(zen);	
	}

}
