package conditional;

import java.util.Scanner;

public class ExampleConditional {
  // 3 Jenis penggunaan 
  // if else
  // ternary
  // switch case
      
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Total Harga");
    int harga = input.nextInt();
    input.nextLine();

    if(harga >= 5000 && harga <= 10000){
      System.out.println("Mahal");
    }else if(harga >= 10000){
      System.out.println("Sangat Mahal");
    }else{
      System.out.println("Murah");
    }

    System.out.println("Ternary Operator");
    int time = 10;
    String hari = time <= 12 ? "Pagi": "Malam";
    System.out.println(hari);

    System.out.println("Masukan warna lampu lintas");

    String lampu = input.nextLine();

    switch (lampu) {
      case "merah":
        System.out.println("Berhenti");
        break;
      case "kuning":
        System.out.println("Gasss");
        break;
      case "hijau":
        System.out.println("Jalan");
        break;
      default:
        System.out.println("Ga jelas");
        break;
    }

    input.close();


  }
}
