package ch2;

import java.util.Calendar;

public class GameJava2_01_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);

		System.out.println("현재 시간은 " + hour + "시 " + min + "분 입니다.");

	}

}
