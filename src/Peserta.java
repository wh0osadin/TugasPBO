public class Peserta {
    private String idPeserta;
    private String nama;

    public Peserta(String idPeserta, String nama) {
        this.idPeserta = idPeserta;
        this.nama = nama;
    }

    public String getIdPeserta() {
        return idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfoPeserta() {
        System.out.println("ID: " + idPeserta + " | Nama Peserta: " + nama);
    }
}