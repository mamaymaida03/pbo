package week9;

public class BangunRuang {

    private double panjang;
    private double lebar;
    private double tinggi;
    private double jariJari;
    private double sisi;
    private double tinggiKerucut;

    // Constructors
    public BangunRuang(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(double sisi) {
        this.sisi = sisi;
    }

    public BangunRuang(double jariJari, double tinggiKerucut) {
        this.jariJari = jariJari;
        this.tinggiKerucut = tinggiKerucut;
    }

    // Methods for Cuboid (Balok)
    public double hitungVolumeBalok() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaanBalok() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Methods for Cube (Kubus)
    public double hitungVolumeKubus() {
        return sisi * sisi * sisi;
    }

    public double hitungLuasPermukaanKubus() {
        return 6 * (sisi * sisi);
    }

    // Methods for Cone (Kerucut)
    public double hitungVolumeKerucut() {
        return (1.0 / 3) * Math.PI * jariJari * jariJari * tinggiKerucut;
    }

    public double hitungLuasPermukaanKerucut() {
        double selimut = Math.sqrt((jariJari * jariJari) + (tinggiKerucut * tinggiKerucut));
        return Math.PI * jariJari * (jariJari + selimut);
    }
}
