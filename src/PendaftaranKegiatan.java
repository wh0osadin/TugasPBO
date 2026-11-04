public class PendaftaranKegiatan {
    public void prosesPendaftaran(Peserta peserta, KegiatanKampus kegiatan) {
        System.out.println("\n--- STRUK / BUKTI PENDAFTARAN ---");
        System.out.println("Peserta atas nama " + peserta.getNama() + " (ID: " + peserta.getIdPeserta() + ")");
        System.out.println("Berhasil mendaftar pada kegiatan:");
        kegiatan.tampilkanInfo();
        System.out.println("Status: Berterima dan tercatat di sistem.");
        System.out.println("------------------------------------");
    }
}