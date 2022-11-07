package task; //deklarasi package dimana berada

import java.util.Scanner;

// bagian class nya
// nama class harus sama dengan nama file
public class Person {
  public static void main(String[] args) {

    // scanner input(untuk input data dari terminal)
    Scanner input = new Scanner(System.in);

    //first name, lastname, birthPlace, favorite language
    System.out.print("Masukan nama depan: ");
    String firstName = input.nextLine();
    System.out.print("Masukan nama belakang: ");
    String lastName = input.nextLine();
    System.out.print("Masukan tempat lahir: ");
    String birthPlace = input.nextLine();
    System.out.print("Masukan tahun lahir: ");
    int birthYear = input.nextInt();
    // inputan selanjutnya tidak dilengkapi setelah next int (untuk selain next line)
    input.nextLine();
    System.out.print("Masukan Bahasa: ");
    String favLang = input.nextLine();
    //scaanner wajib di close
    input.close();

    System.out.println("Biodata");
    System.out.println(firstName + " " + lastName);
    System.out.println(birthPlace);
    System.out.println("lahir" + " " + birthYear );
    System.out.println("favorite language" + favLang);
  }
}
