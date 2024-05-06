// Mendefinisikan package 'util' di mana class InputUtil berada
package util;

// Mengimpor class Scanner dari package java.util
import java.util.Scanner;

// Mendefinisikan class InputUtil
public class InputUtil {

    // Membuat Object Scanner untuk digunakan dalam class
    private static Scanner scanner = new Scanner(System.in);

    // Method untuk meminta input dari pengguna dengan menampilkan informasi tertentu
    public static String input(String info){
        System.out.print(info + " : "); // Menampilkan informasi yang diberikan kepada pengguna
        String data = scanner.nextLine(); // Membaca input pengguna dan menyimpannya dalam variabel data
        return data; // Mengembalikan data yang dimasukkan oleh pengguna
    }
}
