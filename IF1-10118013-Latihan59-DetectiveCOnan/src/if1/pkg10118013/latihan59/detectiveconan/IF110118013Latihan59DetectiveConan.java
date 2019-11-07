/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan59.detectiveconan;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Serial Detective Conan");
        
        System.out.println("\nKarakter Utama");
        Conan conan = new Conan();
        conan.tampilNama();
        conan.Pakaian();
        
        //Team Detektif Cilik
        System.out.println("\nTeam Detektif Cilik");
        TeamDefektif tCilik = new TeamDefektif();
        
        //Team Kogoro Mouri
        System.out.println("\nTeam Kogoro Mouri");
        TeamKogoro tKogoro = new TeamKogoro();
        
        //Sahabat Shinichi
        System.out.println("\nSahabat Shinichi");
        SahabatShinichi sShinici = new SahabatShinichi();
    }
    
}
