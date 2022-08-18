import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int n = nhapN(scan);
	  int a[] = taoMang(n);
	  xuatMang(a);
	  int tong = tinhTongLienKe(a);
	  System.out.println(tong);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập a > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];  
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static int tinhTongLienKe(int a[]) {
		int tong = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
                 tong +=a[i];
			}
		}
		return tong;
	}
}
