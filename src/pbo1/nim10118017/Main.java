package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mendeklarasikan variabel dan mengaksesnya kemudian menampilkannya di layar.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mendeklarasikan variabel.
        int nilai;
        final double PHI = 3.14; //Konstanta uppercase.
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberikan nilai variabel.
        nilai = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil (mengakses variabel).
        System.out.println("Isi variabel nilai = " + nilai);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel nilaiLogika = " + nilaiLogika);
        System.out.println("Isi variabel nilaiKarakter = " + nilaiKarakter);
    }
    
}
