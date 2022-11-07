package looping;

import java.util.Scanner;

public class ExampeLooping {
  public static void main(String[] args) {
    System.out.println("For Loop");

    for (int index = 0; index < 5 ; index++){
      System.out.println(index);
    }

    System.out.println("For Each");
    int[] arrAngka = {11, 12, 13, 14} ;
    for(int angka: arrAngka){
      System.out.println("angka " + angka);
    }

    System.out.println("Do While");

    Scanner input = new Scanner(System.in);
    boolean running = true;
    String answer;

    while (running) {
      System.out.println("Ingin mengakhiri semuanya (yes/no)");
      answer = input.nextLine();
      if(answer.equalsIgnoreCase("yes")){
        running = false;
      }
    }

    System.out.println("do while");

    do {
      running = true;
      System.out.println("akhiri (y|n)");
      answer = input.nextLine();
      if(answer.equalsIgnoreCase("y")){
        running = false;
      }
    }while(running);


    input.close();


  }
}
