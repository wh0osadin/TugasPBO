import java.util.Scanner;

public class SistemKegiatanKampus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        KegiatanKampus[] daftarKegiatan =
                new KegiatanKampus[20];

        int jumlahKegiatan = 0;
        int pilihan;

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println("       SISTEM KEGIATAN KAMPUS");
            System.out.println("======================================");
            System.out.println("1. Tambah Data Kegiatan");
            System.out.println("2. Tampilkan Data Kegiatan");
            System.out.println("3. Cari Kegiatan");
            System.out.println("4. Mulai Kegiatan");
            System.out.println("5. Total Kegiatan");
            System.out.println("6. Keluar");
            System.out.println("======================================");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.println();
                    System.out.println(
                        "===== TAMBAH DATA KEGIATAN ====="
                    );

                    System.out.println("1. Seminar");
                    System.out.println("2. Workshop");

                    System.out.print(
                        "Pilih jenis kegiatan: "
                    );

                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print(
                        "Nama kegiatan: "
                    );

                    String nama = input.nextLine();

                    System.out.print(
                        "Tanggal: "
                    );

                    String tanggal = input.nextLine();

                    System.out.print(
                        "Lokasi: "
                    );

                    String lokasi = input.nextLine();

                    System.out.print(
                        "Jumlah peserta: "
                    );

                    int peserta = input.nextInt();
                    input.nextLine();

                    if (jenis == 1) {

                        System.out.print(
                            "Nama pembicara: "
                        );

                        String pembicara =
                                input.nextLine();

                        daftarKegiatan[jumlahKegiatan] =
                                new Seminar(
                                    nama,
                                    tanggal,
                                    lokasi,
                                    peserta,
                                    pembicara
                                );

                        jumlahKegiatan++;

                        System.out.println(
                            "Data seminar berhasil ditambahkan."
                        );

                    } else if (jenis == 2) {

                        System.out.print(
                            "Materi workshop: "
                        );

                        String materi =
                                input.nextLine();

                        daftarKegiatan[jumlahKegiatan] =
                                new WorkShop(
                                    nama,
                                    tanggal,
                                    lokasi,
                                    peserta,
                                    materi
                                );

                        jumlahKegiatan++;

                        System.out.println(
                            "Data workshop berhasil ditambahkan."
                        );

                    } else {

                        System.out.println(
                            "Jenis kegiatan tidak tersedia."
                        );
                    }

                    break;

                case 2:

                    System.out.println();
                    System.out.println(
                        "===== DATA KEGIATAN ====="
                    );

                    if (jumlahKegiatan == 0) {

                        System.out.println(
                            "Belum ada data kegiatan."
                        );

                    } else {

                        for (int i = 0;
                             i < jumlahKegiatan;
                             i++) {

                            System.out.println();
                            System.out.println(
                                "Data ke-" + (i + 1)
                            );

                            System.out.println(
                                "------------------------------"
                            );

                            daftarKegiatan[i]
                                    .tampilkanInfo();
                        }
                    }

                    break;

                case 3:

                    System.out.println();
                    System.out.println(
                        "===== CARI KEGIATAN ====="
                    );

                    System.out.print(
                        "Masukkan nama kegiatan: "
                    );

                    String cari =
                            input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0;
                         i < jumlahKegiatan;
                         i++) {

                        if (daftarKegiatan[i]
                                .getNamaKegiatan()
                                .equalsIgnoreCase(cari)) {

                            daftarKegiatan[i]
                                    .tampilkanInfo();

                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {

                        System.out.println(
                            "Kegiatan tidak ditemukan."
                        );
                    }

                    break;

                case 4:

                    System.out.println();
                    System.out.println(
                        "===== MULAI KEGIATAN ====="
                    );

                    if (jumlahKegiatan == 0) {

                        System.out.println(
                            "Belum ada kegiatan."
                        );

                    } else {

                        for (int i = 0;
                             i < jumlahKegiatan;
                             i++) {

                            System.out.println();

                            System.out.println(
                                "Kegiatan: "
                                + daftarKegiatan[i]
                                    .getNamaKegiatan()
                            );

                            daftarKegiatan[i]
                                    .mulaiKegiatan();
                        }
                    }

                    break;

                case 5:

                    System.out.println();
                    System.out.println(
                        "Total kegiatan yang dibuat: "
                        + KegiatanKampus
                            .getTotalKegiatan()
                    );

                    break;

                case 6:

                    System.out.println();
                    System.out.println(
                        "Terima kasih telah menggunakan "
                        + "Sistem Kegiatan Kampus."
                    );

                    break;

                default:

                    System.out.println();
                    System.out.println(
                        "Menu tidak tersedia."
                    );
            }

        } while (pilihan != 6);

        input.close();
    }
}