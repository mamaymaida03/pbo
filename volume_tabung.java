package week1;

public class volume_tabung {

	public static void main(String[] args) {


		// Deklarasi variabel
		int diameter = 5;
		int tinggi = 10;
		double volume;

		// Menghitung jari-jari
		double jariJari = diameter / 2.0;

		// Menghitung volume tabung
		volume = Math.PI * jariJari * jariJari * tinggi;

		// Format string untuk menampilkan volume
		String formattedVolume = String.format("%.16f", volume);

		// Menampilkan hasil
		System.out.println("Diameter tabung: " + diameter);
		System.out.println("Tinggi tabung: " + tinggi);
		System.out.println("Volume tabung: " + formattedVolume);

 
	}

}
