import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        
          static int[] hargaMenu = {35000, 45000, 20000, 15000};
    static ArrayList<Integer> keranjangBelanja = new ArrayList<>();
    static Map<String, Integer> menuMap = new HashMap<>();

    static {
        menuMap.put("Burger", 0);
        menuMap.put("Steak", 1);
        menuMap.put("Spaghetti", 2);
        menuMap.put("Kentang", 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]: ");
            input = scanner.nextLine();
            if (menuMap.containsKey(input)) {
                int harga = hargaMenu[menuMap.get(input)];
                keranjangBelanja.add(harga);
            } else {
                System.out.println("Menu tidak tersedia. Silakan coba lagi.");
            }
            System.out.print("Input lagi (Y/N)?: ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));

        int totalBelanja = hitungTotalBelanja();
        double diskon = hitungDiskon(totalBelanja);
        double totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan = " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);
    }

   
    public static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

    
    public static double hitungDiskon(int totalBelanja) {
        double diskon = 0;
        if (totalBelanja >= 50000 && totalBelanja <= 100000) {
            diskon = totalBelanja * 0.05; 
        } else if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.10;
        }
        return diskon;
    }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
