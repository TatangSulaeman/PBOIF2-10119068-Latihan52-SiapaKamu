/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.siapakamu.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program siapa kamu
 * 
 */
public class Main {
    public static void main(String[]args){
        Dosen datDosen = new Dosen();
        Mahasiswa datMhs = new Mahasiswa();
        
        //set value
        datDosen.setNip("41227829930");
        datMhs.setNim("10110269");
        
        System.out.println("NIP DOSEN : " + datDosen.getNip());
        datDosen.siapaKamu();
        datDosen.mengajarApa();
        
        System.out.println();
        
        System.out.println("NIM MAHASISWA : " + datMhs.getNim());
        datMhs.siapaKamu();
        datMhs.kelasApa();
    }
}
