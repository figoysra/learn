package newProgram;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
  
  // program kasir restoran makan

  // variable global
  static Scanner input = new Scanner(System.in);
  static int menu;
  static int order;
  static int totalAmount;
  static int amount;
  static String opsi;


  static List<List<Object>> menus = new ArrayList<>();
  // array dua dimensi [[]] => [["makan", 9000]]


  static List<Integer> orders = new ArrayList();

  static void menuApp(){
    System.out.println("RESTORAN HARGA DIRI");
    System.out.println("1. Pilih Menu");
    System.out.println("2. Input Pemesanan");
    System.out.println("3. Pembayaran");
    System.out.print("Pilihan : ");

    menu = input.nextInt();
    input.nextLine();
    System.out.println();
  }

  static void setMenuResto(){
    menus.add(new ArrayList<>(Arrays.asList("Ayam", 200000)));
    menus.add(new ArrayList<>(Arrays.asList("Babi", 10000)));
    menus.add(new ArrayList<>(Arrays.asList("Kulit Babi", 200)));
  }

  static void getMenu(){
    for(int i = 0; i < menus.size(); i++){
      System.out.println((i+1) + ". " + menus.get(i).get(0) + "\t Rp. " + menus.get(i).get(1));
    }
  }

  static void orderMenu(){
    System.out.println("Pesen nomer berapa ");
    order = input.nextInt();
    input.nextLine();
    orders.add(order);
    
  }

  static void summaryOrder(){
    System.out.println("Bayar Cokk");
    totalAmount = 0;

    for (int i = 0; i < orders.size(); i++) {
      System.out.println((i + 1) + ". " + menus.get(orders.get(i) - 1));    
      totalAmount += (Integer) menus.get(orders.get(i)-1).get(1);
    }

    System.out.println("Segini ya " + totalAmount);
  }

  static void Pembayaran(){
    LocalDate date = LocalDate.now();

    System.out.println("Struk");
    System.out.println("Tanggal Pembayaran" + date);
    summaryOrder();

    System.out.println("Uang Tunai : " + amount);
    if(amount > totalAmount){
      System.out.println("Kembalian " + (amount - totalAmount));
    }

  }

  public static void main(String[] args) {
    setMenuResto();

    do {
      menuApp();

      switch (menu) {
        case 1:
          System.out.println("Daftar Menu : ");
          getMenu();
          break;
        case 2:
          System.out.println("Order: ");
          getMenu();
          while (true) {
            orderMenu();
            summaryOrder();
            System.out.println(orders);
            
            System.out.println();
            System.out.print("Ingin Menambahkan pesanan: ");
            opsi = input.nextLine();
            if(opsi.equalsIgnoreCase("y")){
              continue;
            } else{
              break;
            }
          }
          break;
        case 3:
          if(totalAmount > 0){
            while (true) {
              System.out.println("Bayar : ");
              summaryOrder();
              System.out.print("Uang Tunai ");
              amount = input.nextInt();
              input.nextLine();
              System.out.println();
              if(amount < totalAmount){
                System.out.println("Bayar Seng genah ");
                System.out.println();
                continue;
              } else{
                Pembayaran();
                orders = new ArrayList<>();
                totalAmount = 0;
                System.out.println();
                break;
              }
  
            }  
          } else{
            System.out.println("seng genaaah");
          }
          break;
        default:
          System.out.println("Ga Jelas Bre");
          break;
      }

      System.out.println();
      System.out.println("Lanjut ga");
      opsi = input.nextLine();
    } while (opsi.equalsIgnoreCase("y"));

    System.out.println("Thank u bre");
  }
}
