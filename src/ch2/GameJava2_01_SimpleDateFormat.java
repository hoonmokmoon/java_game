package ch2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GameJava2_01_SimpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

		System.out.println(dateFormat.format(today));

	}

}
