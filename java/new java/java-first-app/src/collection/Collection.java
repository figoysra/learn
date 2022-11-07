package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
  public static void main(String[] args) {
    // collection adalah sebuah framework atau kumpulan interface fan class yang berguna
    // pengolahan variable / objek terdapat di java util

    //list 
    // bisa memiliki nilai yang sama
    // bisa null
    // urutan nilai terurut sesuai saat mengisi nilai 

      List<String> foods =  new ArrayList<>();
      //add menambahkan , remove hapus, set update
      foods.add("Banana");
      foods.add("Mangga");
      foods.add(1, "Guava");   
      System.out.println("Foods sebelum diupdate " + foods);

      //update data
      foods.set(1, "Jambu");


      System.out.println(foods + " Setelah diupdate");
      System.out.println("Index ke 0" + foods.get(0));

      // remove data
      foods.remove(0);
      foods.remove("Jambu");
      System.out.println(foods + "food setelah dihapus");

    // set
    // tidak bisa duplikat
    // bisa nilainya null
    // urutanya acak
      Set<String> setBinatang = new HashSet<>();
      
      setBinatang.add("Babi");
      setBinatang.add("Jangkrik");
      setBinatang.add("Anjing");
      System.out.println(setBinatang);

    // map
    // tidak bisa duplikat
    // unordered
    // memeliki key(tidak bisa duplikat) dan value (bisa duplikat)

      Map<String, Integer> priceList = new HashMap<>();
      
      //add data
      priceList.put("Harga Teman", 1000);

      System.out.println(priceList);

  }
}
