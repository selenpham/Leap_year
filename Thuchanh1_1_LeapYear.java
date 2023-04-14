//Bài 1. Thực hành với điều kiện
//1.1. Nhập vào từ bàn phím số nguyên N là số năm tương ứng. 
//Kiểm tra năm đó có phải là năm nhuận hay không?.In kết quả ra màn hình.
package LAB2;

import java.util.Scanner;

public class Thuchanh1_1_LeapYear {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap so N> 0 tuong ung:");
		int N = scanner.nextInt();		
		
		if(N%400 == 0) {
			if(N%4 ==0 && N%100 !=0) {
				System.out.println(N + " la nam nhuan");
			}
			System.out.println(N + " la nam nhuan");
		}
		else {
			System.out.println(N+" khong la nam nhuan ");
		}
				
	}
}
