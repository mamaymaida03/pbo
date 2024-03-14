package week1;

import java.util.Scanner;

public class keliling_lingkaran {

	public static void main(String[] args) {
		// Deklarasi variabel
        int diameter = 10; // Diameter lingkaran (tanpa koma)
        double jariJari;
        double keliling;

        // Menghitung jari-jari
        jariJari = diameter / 2;

        // Menghitung keliling lingkaran
        keliling = 2 * Math.PI * jariJari;

        // Menampilkan hasil
        System.out.println("Diameter lingkaran: " + diameter);
        System.out.println("Keliling lingkaran: " + keliling);
	}

}
