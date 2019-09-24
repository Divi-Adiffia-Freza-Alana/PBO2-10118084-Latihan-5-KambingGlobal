/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Kambing global

 */
 
public class kambingGlobal {
 int jumlahKambing =88;  
    
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing : "+ jumlahKambing);
        
    }
    public void tambahKambing(){
    jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
            }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kambingGlobal kambingSusu = new kambingGlobal();
        // menampilkan jumlah kambing yang ada saat program pertama x jalan
        kambingSusu.getJumlahKambing();
        // menambah satu kambing
        kambingSusu.tambahKambing();
        // menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
