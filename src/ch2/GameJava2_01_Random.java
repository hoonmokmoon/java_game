package ch2;

import java.util.Random;

public class GameJava2_01_Random {

	public static void main(String[] args) {
		Random r = new Random();

		System.out.println("1 ~ 100 범위의 난수: " + Math.abs(r.nextInt() % 100) + 1);

	}

}