package week9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (1-2) atau 0 untuk keluar: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menuBangunDatar(scanner);
                    break;
                case 2:
                    menuBangunRuang(scanner);
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void menuBangunDatar(Scanner scanner) {
        int choice;

        do {
            System.out.println("\nMenu Bangun Datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("0. Kembali ke Menu Utama");
            System.out.print("Pilih bangun datar (1-4) atau 0 untuk kembali: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan sisi persegi: ");
                    int sisiPersegi = scanner.nextInt();
                    BangunDatar persegi = new BangunDatar(sisiPersegi);
                    System.out.println("Luas persegi: " + persegi.luas(sisiPersegi));
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int panjangPersegiPanjang = scanner.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int lebarPersegiPanjang = scanner.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar(panjangPersegiPanjang, lebarPersegiPanjang);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.luas(panjangPersegiPanjang, lebarPersegiPanjang));
                    break;
                case 3:
                    System.out.print("Masukkan alas segitiga: ");
                    double alasSegitiga = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggiSegitiga = scanner.nextDouble();
                    BangunDatar segitiga = new BangunDatar(0); // dummy object
                    System.out.println("Luas segitiga: " + segitiga.luas(alasSegitiga, tinggiSegitiga));
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJariLingkaran = scanner.nextDouble();
                    BangunDatar lingkaran = new BangunDatar(0); // dummy object
                    System.out.println("Luas lingkaran: " + lingkaran.luas(jariJariLingkaran));
                    break;
                case 0:
                    System.out.println("Kembali ke Menu Utama...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);
    }

    private static void menuBangunRuang(Scanner scanner) {
        int choice;

        do {
            System.out.println("\nMenu Bangun Ruang:");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Kerucut");
            System.out.println("0. Kembali ke Menu Utama");
            System.out.print("Pilih bangun ruang (1-3) atau 0 untuk kembali: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    BangunRuang balok = new BangunRuang(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("Volume balok: " + balok.hitungVolumeBalok());
                    System.out.println("Luas Permukaan balok: " + balok.hitungLuasPermukaanBalok());
                    break;
                case 2:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    BangunRuang kubus = new BangunRuang(sisiKubus);
                    System.out.println("Volume kubus: " + kubus.hitungVolumeKubus());
                    System.out.println("Luas Permukaan kubus: " + kubus.hitungLuasPermukaanKubus());
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    BangunRuang kerucut = new BangunRuang(jariJariKerucut, tinggiKerucut);
                    System.out.println("Volume kerucut: " + kerucut.hitungVolumeKerucut());
                    System.out.println("Luas Permukaan kerucut: " + kerucut.hitungLuasPermukaanKerucut());
                    break;
                case 0:
                    System.out.println("Kembali ke Menu Utama...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);
    }
}
