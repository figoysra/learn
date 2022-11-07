public class App {
    public static void main(String[] args) throws Exception {
        //<tipe data> nama variable = isi variable
        // boolean isActive = true;
        int total = 100;

        //'' untuk char, gunakan "" untuk string
        String judulBuku = "ini buku";
    
        System.out.println("Judul Buku"+ judulBuku);
        System.out.println("Jumlah buku " + total);
        System.out.println("Buku Tersedia"+ total);


        // operator di java 
        // 1. Aritmatika
        // 2. Penugasan 
        // 3. Pembanding
        // 4. Logika
        // 5. Ternary

        System.out.println("Aritmatika");

        int a = 100;
        int b = 100;
        int c = a + b;

        System.out.println("Jumlah a + b " + c);
        
        System.out.println("Pembanding");

        boolean Pembanding = a > b;
        System.out.println(Pembanding + " hasil Pembanding" );

        System.out.println("Ternary");
        int jam = 8;
        String hari = (jam <= 12) ? "Hari Masih Pagi" : "Hari Sudah Siang";
        System.out.println("Hasil " + hari);

    
    }
}
