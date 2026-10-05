public class Lomba extends KegiatanKampus {

    private String jenisLomba;

    public Lomba(String namaKegiatan, String tanggal,
                 String lokasi, int peserta,
                 String jenisLomba) {

        super(namaKegiatan, tanggal, lokasi, peserta);

        this.jenisLomba = jenisLomba;
    }

    public String getJenisLomba() {
        return jenisLomba;
    }

    public void setJenisLomba(String jenisLomba) {
        this.jenisLomba = jenisLomba;
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("Jenis Kegiatan : Lomba");

        super.tampilkanInfo();

        System.out.println("Jenis Lomba    : " + jenisLomba);
    }

    @Override
    public void mulaiKegiatan() {

        System.out.println(
            "Lomba dimulai dengan pertandingan."
        );
    }
}