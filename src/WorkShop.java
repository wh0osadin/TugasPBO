public class WorkShop extends KegiatanKampus {

    private String materi;

    public WorkShop(String namaKegiatan, String tanggal,
                    String lokasi, int peserta,
                    String materi) {

        super(namaKegiatan, tanggal, lokasi, peserta);

        this.materi = materi;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("Jenis Kegiatan : Workshop");

        super.tampilkanInfo();

        System.out.println("Materi         : " + materi);
    }

    @Override
    public void mulaiKegiatan() {

        System.out.println(
            "Workshop dimulai dengan kegiatan praktik."
        );
    }
}