
package assignment1;

import java.util.Scanner;

public class Assignment1 {
public static void main(String[] args) {

System.out.println("Ho va ten: Dao Phuoc Long");
System.out.println("Lop: CMU-TPM16"); 
System.out.println("MSSV: 29219054593");

Scanner hoten = new Scanner(System.in);
System.out.print("Nhap ho va ten: ");
String t = hoten.nextLine();

Scanner lop = new Scanner(System.in);
System.out.print("Nhap lop: ");
String l = lop.next();

Scanner MSSV = new Scanner(System.in);
System.out.print("Nhap MSSV: ");
String m = MSSV.next();

System.out.println("Ho va ten: "+t);
System.out.println("Lop: " +l);
System.out.println("MSSV: "+m);

}
}