public class Seminar extends KegiatanKampus {

    private String pembicara;

    public Seminar(String namaKegiatan, String tanggal,
                   String lokasi, int peserta,
                   String pembicara) {

        super(namaKegiatan, tanggal, lokasi, peserta);

        this.pembicara = pembicara;
    }

    public String getPembicara() {
        return pembicara;
    }

    public void setPembicara(String pembicara) {
        this.pembicara = pembicara;
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("Jenis Kegiatan : Seminar");

        super.tampilkanInfo();

        System.out.println("Pembicara      : " + pembicara);
    }

    @Override
    public void mulaiKegiatan() {

        System.out.println(
            "Seminar dimulai dengan pemaparan materi."
        );
    }
}