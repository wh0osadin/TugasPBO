import java.util.Scanner;

public class SistemKegiatanKampus {

    public static void prosesKegiatan(KegiatanKampus kegiatan) {

        System.out.println();
        System.out.println("===== PROSES KEGIATAN =====");

        kegiatan.mulaiKegiatan();
    }

    public static void cariData(KegiatanKampus kegiatan) {

        System.out.println();
        System.out.println("Data kegiatan:");

        kegiatan.tampilkanInfo();
    }

    public static void cariData(KegiatanKampus kegiatan,
                                int peserta) {

        if (kegiatan.getPeserta() == peserta) {

            System.out.println();
            System.out.println(
                "Kegiatan dengan jumlah peserta "
                + peserta
            );

            kegiatan.tampilkanInfo();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        KegiatanKampus[] daftarKegiatan =
                new KegiatanKampus[20];

        int jumlahKegiatan = 0;
        int pilihan;

        do {

            System.out.println();
            System.out.println("================================");
            System.out.println("     SISTEM KEGIATAN KAMPUS");
            System.out.println("================================");
            System.out.println("1. Tambah Seminar");
            System.out.println("2. Tambah Workshop");
            System.out.println("3. Tambah Lomba");
            System.out.println("4. Tampilkan Semua Kegiatan");
            System.out.println("5. Mulai Semua Kegiatan");
            System.out.println("6. Proses Kegiatan");
            System.out.println("7. Cari Data");
            System.out.println("8. Total Kegiatan");
            System.out.println("9. Keluar");
            System.out.println("================================");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.println();
                    System.out.println("===== TAMBAH SEMINAR =====");

                    System.out.print("Nama kegiatan: ");
                    String namaSeminar = input.nextLine();

                    System.out.print("Tanggal: ");
                    String tanggalSeminar = input.nextLine();

                    System.out.print("Lokasi: ");
                    String lokasiSeminar = input.nextLine();

                    System.out.print("Jumlah peserta: ");
                    int pesertaSeminar = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama pembicara: ");
                    String pembicara = input.nextLine();

                    daftarKegiatan[jumlahKegiatan] =
                            new Seminar(
                                namaSeminar,
                                tanggalSeminar,
                                lokasiSeminar,
                                pesertaSeminar,
                                pembicara
                            );

                    jumlahKegiatan++;

                    System.out.println(
                        "Seminar berhasil ditambahkan."
                    );

                    break;

                case 2:

                    System.out.println();
                    System.out.println("===== TAMBAH WORKSHOP =====");

                    System.out.print("Nama kegiatan: ");
                    String namaWorkshop = input.nextLine();

                    System.out.print("Tanggal: ");
                    String tanggalWorkshop = input.nextLine();

                    System.out.print("Lokasi: ");
                    String lokasiWorkshop = input.nextLine();

                    System.out.print("Jumlah peserta: ");
                    int pesertaWorkshop = input.nextInt();
                    input.nextLine();

                    System.out.print("Materi workshop: ");
                    String materi = input.nextLine();

                    daftarKegiatan[jumlahKegiatan] =
                            new WorkShop(
                                namaWorkshop,
                                tanggalWorkshop,
                                lokasiWorkshop,
                                pesertaWorkshop,
                                materi
                            );

                    jumlahKegiatan++;

                    System.out.println(
                        "Workshop berhasil ditambahkan."
                    );

                    break;

                case 3:

                    System.out.println();
                    System.out.println("===== TAMBAH LOMBA =====");

                    System.out.print("Nama kegiatan: ");
                    String namaLomba = input.nextLine();

                    System.out.print("Tanggal: ");
                    String tanggalLomba = input.nextLine();

                    System.out.print("Lokasi: ");
                    String lokasiLomba = input.nextLine();

                    System.out.print("Jumlah peserta: ");
                    int pesertaLomba = input.nextInt();
                    input.nextLine();

                    System.out.print("Jenis lomba: ");
                    String jenisLomba = input.nextLine();

                    daftarKegiatan[jumlahKegiatan] =
                            new Lomba(
                                namaLomba,
                                tanggalLomba,
                                lokasiLomba,
                                pesertaLomba,
                                jenisLomba
                            );

                    jumlahKegiatan++;

                    System.out.println(
                        "Lomba berhasil ditambahkan."
                    );

                    break;

                case 4:

                    System.out.println();
                    System.out.println(
                        "===== SEMUA KEGIATAN ====="
                    );

                    for (int i = 0;
                         i < jumlahKegiatan;
                         i++) {

                        System.out.println();
                        System.out.println(
                            "Data ke-" + (i + 1)
                        );

                        daftarKegiatan[i].tampilkanInfo();
                    }

                    break;

                case 5:

                    System.out.println();
                    System.out.println(
                        "===== MULAI SEMUA KEGIATAN ====="
                    );

                    for (int i = 0;
                         i < jumlahKegiatan;
                         i++) {

                        System.out.print(
                            daftarKegiatan[i]
                            .getNamaKegiatan() + " : "
                        );

                        daftarKegiatan[i].mulaiKegiatan();
                    }

                    break;

                case 6:

                    if (jumlahKegiatan == 0) {

                        System.out.println(
                            "Belum ada kegiatan."
                        );

                    } else {

                        System.out.print(
                            "Pilih nomor kegiatan: "
                        );

                        int nomor = input.nextInt();
                        input.nextLine();

                        if (nomor >= 1 &&
                            nomor <= jumlahKegiatan) {

                            prosesKegiatan(
                                daftarKegiatan[nomor - 1]
                            );

                        } else {

                            System.out.println(
                                "Nomor tidak tersedia."
                            );
                        }
                    }

                    break;

                case 7:

                    if (jumlahKegiatan == 0) {

                        System.out.println(
                            "Belum ada kegiatan."
                        );

                    } else {

                        System.out.println(
                            "1. Cari berdasarkan kegiatan"
                        );

                        System.out.println(
                            "2. Cari berdasarkan peserta"
                        );

                        System.out.print("Pilih: ");
                        int cari = input.nextInt();
                        input.nextLine();

                        if (cari == 1) {

                            System.out.print(
                                "Nomor kegiatan: "
                            );

                            int nomor =
                                    input.nextInt();

                            input.nextLine();

                            if (nomor >= 1 &&
                                nomor <= jumlahKegiatan) {

                                cariData(
                                    daftarKegiatan[
                                        nomor - 1
                                    ]
                                );
                            }

                        } else if (cari == 2) {

                            System.out.print(
                                "Jumlah peserta: "
                            );

                            int peserta =
                                    input.nextInt();

                            input.nextLine();

                            for (int i = 0;
                                 i < jumlahKegiatan;
                                 i++) {

                                cariData(
                                    daftarKegiatan[i],
                                    peserta
                                );
                            }

                        } else {

                            System.out.println(
                                "Pilihan tidak tersedia."
                            );
                        }
                    }

                    break;

                case 8:

                    System.out.println(
                        "Total kegiatan: "
                        + KegiatanKampus.getTotalKegiatan()
                    );

                    break;

                case 9:

                    System.out.println(
                        "Terima kasih telah menggunakan "
                        + "Sistem Kegiatan Kampus."
                    );

                    break;

                default:

                    System.out.println(
                        "Menu tidak tersedia."
                    );
            }

        } while (pilihan != 9);

        input.close();
    }
}