public class FasilitasKampus {
    private String namaFasilitas;
    private String jenisRuangan;

    public FasilitasKampus(String namaFasilitas, String jenisRuangan) {
        this.namaFasilitas = namaFasilitas;
        this.jenisRuangan = jenisRuangan;
    }

    public void tampilkanFasilitas() {
        System.out.println("Fasilitas Internal: " + namaFasilitas + " (" + jenisRuangan + ")");
    }
}