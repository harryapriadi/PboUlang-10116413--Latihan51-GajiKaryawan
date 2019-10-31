/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA  : Harry Apriadi
 * Kelas : PBO ULANG
 * NIM   : 10116413
 * Deskripsi Tugas : Membuat Program Untuk Pendataan Gaji Karyawan
 */
public class PboUlang10116413Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    protected static String nik;
    protected static String nama;
    protected static String jabatan;
    protected static int golongan;
    private static int kehadiran;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        Manager manager = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        nik = baca.next();
        karyawan.setNik(nik);
        System.out.print("Masukan Nama : ");
        nama = baca.next();
        karyawan.setNama(nama);
        System.out.print("Masukan Golongan (1/2/3) : ");
        golongan = baca.nextInt();
        karyawan.setGolongan(golongan);
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        jabatan = baca.next();
        karyawan.setJabatan(jabatan);
        System.out.print("Masukan Jumlah Kehadiran : ");
        kehadiran = baca.nextInt();
        manager.setKehadiran(kehadiran);

        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK      : " + karyawan.getNik());
        System.out.println("NAMA     : " + karyawan.getNama());
        System.out.println("GOLONGAN : " + karyawan.getGolongan());
        System.out.println("JABATAN  : " + karyawan.getJabatan());

        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN  : "
                + manager.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN   : "
                + manager.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : "
                + manager.tunjanganKehadiran(kehadiran));
        System.out.println("");

        System.out.println("GAJI TOTAL : " + manager.gajiTotal());
    }

}
