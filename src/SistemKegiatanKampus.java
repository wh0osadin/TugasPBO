import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemKegiatanKampus {

    // Menyimpan daftar kegiatan menggunakan ArrayList
    static ArrayList<KegiatanKampus> daftarKegiatan =
            new ArrayList<KegiatanKampus>();

    // Menyimpan data anggota menggunakan HashMap
    static HashMap<String, String> dataAnggota =
            new HashMap<String, String>();

    static Scanner input = new Scanner(System.in);

    // Method untuk memproses kegiatan
    public static void prosesKegiatan(KegiatanKampus kegiatan) {
        kegiatan.tampilkanInfo();
        kegiatan.mulaiKegiatan();
    }

    // Method pencarian kegiatan berdasarkan nama
    public static void cariData(String nama)
            throws KegiatanTidakDitemukanException {

        boolean ditemukan = false;

        for (int i = 0; i < daftarKegiatan.size(); i++) {

            if (daftarKegiatan.get(i).getNamaKegiatan()
                    .equalsIgnoreCase(nama)) {

                daftarKegiatan.get(i).tampilkanInfo();
                ditemukan = true;
            }
        }

        if (ditemukan == false) {
            throw new KegiatanTidakDitemukanException(
                    "Kegiatan tidak ditemukan!"
            );
        }
    }

    public static void main(String[] args) {

        int pilihan = 0;

        do {

            try {

                System.out.println("\n===== SISTEM KEGIATAN KAMPUS =====");
                System.out.println("1. Tambah Seminar");
                System.out.println("2. Tambah Workshop");
                System.out.println("3. Tambah Lomba");
                System.out.println("4. Tampilkan Semua Kegiatan");
                System.out.println("5. Mulai Semua Kegiatan");
                System.out.println("6. Proses Kegiatan");
                System.out.println("7. Cari Data Kegiatan");
                System.out.println("8. Total Kegiatan");
                System.out.println("9. Daftar Peserta");
                System.out.println("10. Tambah Data Anggota");
                System.out.println("11. Cari Data Anggota");
                System.out.println("12. Tampilkan Semua Anggota");
                System.out.println("13. Keluar");
                System.out.print("Pilih menu: ");

                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {

                    case 1:
                        System.out.print("Nama Seminar: ");
                        String namaSeminar = input.nextLine();

                        System.out.print("Tanggal: ");
                        String tanggalSeminar = input.nextLine();

                        System.out.print("Lokasi: ");
                        String lokasiSeminar = input.nextLine();

                        System.out.print("Jumlah Peserta: ");
                        int pesertaSeminar = input.nextInt();
                        input.nextLine();

                        System.out.print("Nama Pembicara: ");
                        String pembicara = input.nextLine();

                        daftarKegiatan.add(
                            new Seminar(namaSeminar, tanggalSeminar,
                            lokasiSeminar, pesertaSeminar, pembicara)
                        );

                        System.out.println("Seminar berhasil ditambahkan!");
                        break;

                    case 2:
                        System.out.print("Nama Workshop: ");
                        String namaWorkshop = input.nextLine();

                        System.out.print("Tanggal: ");
                        String tanggalWorkshop = input.nextLine();

                        System.out.print("Lokasi: ");
                        String lokasiWorkshop = input.nextLine();

                        System.out.print("Jumlah Peserta: ");
                        int pesertaWorkshop = input.nextInt();
                        input.nextLine();

                        System.out.print("Materi: ");
                        String materi = input.nextLine();

                        daftarKegiatan.add(
                            new WorkShop(namaWorkshop, tanggalWorkshop,
                            lokasiWorkshop, pesertaWorkshop, materi)
                        );

                        System.out.println("Workshop berhasil ditambahkan!");
                        break;

                    case 3:
                        System.out.print("Nama Lomba: ");
                        String namaLomba = input.nextLine();

                        System.out.print("Tanggal: ");
                        String tanggalLomba = input.nextLine();

                        System.out.print("Lokasi: ");
                        String lokasiLomba = input.nextLine();

                        System.out.print("Jumlah Peserta: ");
                        int pesertaLomba = input.nextInt();
                        input.nextLine();

                        System.out.print("Jenis Lomba: ");
                        String jenisLomba = input.nextLine();

                        daftarKegiatan.add(
                            new Lomba(namaLomba, tanggalLomba,
                            lokasiLomba, pesertaLomba, jenisLomba)
                        );

                        System.out.println("Lomba berhasil ditambahkan!");
                        break;

                    case 4:
                        if (daftarKegiatan.isEmpty()) {
                            System.out.println("Belum ada kegiatan.");
                        } else {
                            for (int i = 0; i < daftarKegiatan.size(); i++) {
                                System.out.println("\nKegiatan ke-" + (i + 1));
                                daftarKegiatan.get(i).tampilkanInfo();
                            }
                        }
                        break;

                    case 5:
                        if (daftarKegiatan.isEmpty()) {
                            System.out.println("Belum ada kegiatan.");
                        } else {
                            for (int i = 0; i < daftarKegiatan.size(); i++) {
                                daftarKegiatan.get(i).mulaiKegiatan();
                            }
                        }
                        break;

                    case 6:
                        if (daftarKegiatan.isEmpty()) {
                            System.out.println("Belum ada kegiatan.");
                        } else {
                            System.out.print("Masukkan nomor kegiatan: ");
                            int nomor = input.nextInt();
                            input.nextLine();

                            if (nomor >= 1 &&
                                nomor <= daftarKegiatan.size()) {

                                prosesKegiatan(
                                    daftarKegiatan.get(nomor - 1)
                                );

                            } else {
                                System.out.println("Nomor kegiatan tidak valid.");
                            }
                        }
                        break;

                    case 7:
                        System.out.print("Masukkan nama kegiatan: ");
                        String cariNama = input.nextLine();

                        try {
                            cariData(cariNama);
                        } catch (KegiatanTidakDitemukanException e) {
                            System.out.println("Kesalahan: " + e.getMessage());
                        }
                        break;

                    case 8:
                        System.out.println(
                            "Total kegiatan: " + daftarKegiatan.size()
                        );
                        break;

                    case 9:
                        if (daftarKegiatan.isEmpty()) {
                            System.out.println("Belum ada kegiatan.");
                        } else {
                            System.out.print("Nomor kegiatan: ");
                            int nomorPeserta = input.nextInt();

                            if (nomorPeserta >= 1 &&
                                nomorPeserta <= daftarKegiatan.size()) {

                                System.out.print("Jumlah peserta yang daftar: ");
                                int jumlah = input.nextInt();

                                if (jumlah > 0) {
                                    KegiatanKampus kegiatan =
                                        daftarKegiatan.get(nomorPeserta - 1);

                                    if (kegiatan instanceof DapatDiikuti) {
                                        ((DapatDiikuti) kegiatan)
                                            .daftarPeserta(jumlah);
                                    } else {
                                        System.out.println(
                                            "Kegiatan tidak bisa menerima pendaftaran."
                                        );
                                    }
                                } else {
                                    System.out.println(
                                        "Jumlah peserta harus lebih dari 0."
                                    );
                                }

                            } else {
                                System.out.println("Nomor kegiatan tidak valid.");
                            }

                            input.nextLine();
                        }
                        break;

                    case 10:
                        System.out.print("Masukkan ID anggota: ");
                        String id = input.nextLine();

                        System.out.print("Masukkan nama anggota: ");
                        String namaAnggota = input.nextLine();

                        dataAnggota.put(id, namaAnggota);

                        System.out.println("Data anggota berhasil ditambahkan!");
                        break;

                    case 11:
                        System.out.print("Masukkan ID anggota yang dicari: ");
                        String cariId = input.nextLine();

                        if (dataAnggota.containsKey(cariId)) {
                            System.out.println(
                                "Nama anggota: " + dataAnggota.get(cariId)
                            );
                        } else {
                            System.out.println("Anggota tidak ditemukan.");
                        }
                        break;

                    case 12:
                        if (dataAnggota.isEmpty()) {
                            System.out.println("Belum ada data anggota.");
                        } else {
                            System.out.println("\n===== DATA ANGGOTA =====");

                            for (Map.Entry<String, String> data
                                    : dataAnggota.entrySet()) {

                                System.out.println(
                                    "ID: " + data.getKey()
                                    + " | Nama: " + data.getValue()
                                );
                            }
                        }
                        break;

                    case 13:
                        System.out.println("Program selesai.");
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Input harus berupa angka!");
                input.nextLine();

            } finally {

                System.out.println("Proses menu selesai.");
            }

        } while (pilihan != 13);

        input.close();
    }
}