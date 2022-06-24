package test;

public class Test {
	public static void main(String[] args) {
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i +  "* " + j + "= "  + i * j);
//			}
//		}
		
//		int i = 2;
//		int j = 1;
//		while(i <= 9) {
//			while(j <= 9) {
//				System.out.println(i +  "* " + j + "= "  + i * j);
//				j++;
//			}
//			j = 1;
//			i++;
//		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
