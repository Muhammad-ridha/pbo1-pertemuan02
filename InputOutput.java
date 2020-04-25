import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner =  new Scanner(System.in);
  String nama;
  int jumlahSks;
  double IPK;

  System.out.println("Program Penghitung Nilai SKS");
  System.out.println("***** by Muhammad Ridha ****");

  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.print("Masukkan jumlah SKS yang sudah ditempuh: ");
  jumlahSks = scanner.nextInt();

  System.out.print("Masukkan IPK sementara :");
  IPK = scanner.nextDouble();

  double jumlah = IPK * jumlahSks;
  System.out.println("Total Nilai = "+jumlah);
 
  System.out.println("Jangan Lupa Belajar !!");
 }
}