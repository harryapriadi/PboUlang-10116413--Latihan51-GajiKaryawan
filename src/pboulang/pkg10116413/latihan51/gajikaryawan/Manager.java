/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan51.gajikaryawan;

/**
 *
 * @author Lenovo
 */
public class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        return kehadiran * 10000;

    }

    public float tunjanganJabatan(String jabatan) {

        if (null == jabatan) {
            tunjanganJabatan = 0;
        } else {
            switch (jabatan) {
                case "Manager":
                    tunjanganJabatan = 2000000;
                    break;
                case "Kabag":
                    tunjanganJabatan = 1000000;
                    break;
                default:
                    tunjanganJabatan = 0;
                    break;
            }
        }

        return tunjanganJabatan;

    }

    public float tunjanganGolongan(int golongan) {

        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }

        return tunjanganGolongan;

    }

    public float gajiTotal() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran(kehadiran);

    }
}
