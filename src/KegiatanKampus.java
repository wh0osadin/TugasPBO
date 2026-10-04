public class KegiatanKampus {

    private String namaKegiatan;
    private String tanggal;
    private String lokasi;
    private int peserta;

    private static int totalKegiatan = 0;

  
    public KegiatanKampus(String namaKegiatan, String tanggal,
                          String lokasi, int peserta) {

        this.namaKegiatan = namaKegiatan;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.peserta = peserta;

        totalKegiatan++;
    }

    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getPeserta() {
        return peserta;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setPeserta(int peserta) {
        this.peserta = peserta;
    }

    public static int getTotalKegiatan() {
        return totalKegiatan;
    }

    public void tampilkanInfo() {

        System.out.println("Nama Kegiatan : " + namaKegiatan);
        System.out.println("Tanggal       : " + tanggal);
        System.out.println("Lokasi        : " + lokasi);
        System.out.println("Jumlah Peserta: " + peserta);
    }

    public void mulaiKegiatan() {

        System.out.println("Kegiatan sedang berlangsung.");
    }

    public void cariKegiatan(String nama) {

        if (namaKegiatan.equalsIgnoreCase(nama)) {

            System.out.println(
                "Kegiatan ditemukan: " + namaKegiatan
            );
        }
    }

    public void cariKegiatan(int peserta) {

        if (this.peserta == peserta) {

            System.out.println(
                "Kegiatan ditemukan: " + namaKegiatan
            );
        }
    }
}