package selenium.classes;

public class prac1 {

	public static void main(String[] args) {

		String s1 = "sounder is good boy";

		String[] ss = s1.split(" ");

		int num = ss.length;

		System.out.println(num);

		for (int i = num - 1; i >= 0; i--) {

			int j = ss[i].length();

			String kk = ss[i];

			StringBuffer sb = new StringBuffer(kk);
			System.out.print(sb.reverse());
		}

	}

}
