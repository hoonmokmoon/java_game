package ch2;

public class GameJava2_02_String {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World!";
		String str3 = str1 + str2;

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		System.out.println("str1의 크기는" + str1.length() + "입니다.");
		System.out.println("str2ë¥¼ ìë¬¸ìë¡ ë°ê¾¸ë©´ " + str2.toLowerCase() + "입니다.");
		System.out.println("str3ì lì Lë¡ ë°ê¾¸ë©´" + str3.replace("l", "L") + "입니다.");
		System.out.println("str2ì 3ë²ì§¸ ë¬¸ìë " + str2.charAt(2) + "입니다.");
	}

}
