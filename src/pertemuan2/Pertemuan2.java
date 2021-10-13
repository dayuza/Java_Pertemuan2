/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Dayuza
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Variabel.
        Pertemuan2 per2 = new Pertemuan2();
        System.out.println("========Variabel========");
        per2.PertemuanVariable();
        System.out.println("=======Percabangan======");
    }
    void PertemuanVariable(){
//    Deklarasi Variable
    String nama_depan, nama_belakang, alamat, tempat_lahir;
    int npm, umur, noHP;
//        Mengisi Variable
        nama_depan = "Teguh";
        nama_belakang = "Nugratama Dayuza";
        alamat = "Maninjau";
        tempat_lahir = "Bukittinggi";
        umur = 20;
        npm = 19100012;
        noHP = 43923;
//        Menampilkanya di layar
        System.out.println("Nama ; " + nama_depan + " " + nama_belakang);
        System.out.println("Alamat ; " + alamat);
        System.out.println("Tempat Lahir ; " + tempat_lahir);
        System.out.println("Umur ; " + umur);
        System.out.println("NPM ; " + npm);
        System.out.println("No HP ; " + noHP);
    }
}
