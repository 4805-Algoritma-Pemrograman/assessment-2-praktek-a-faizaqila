import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        
        System.out.println("Angka ganjil dari 0 hingga " + n + " adalah:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan bilangan bulat n: ");
        int n = scanner.nextInt();

        
        tampilkanAngkaGanjil(n);

        
        scanner.close();
    }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    
}
