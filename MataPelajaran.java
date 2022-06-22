import java.util.ArrayList;
import java.util.Scanner;

public class MataPelajaran implements Pelajaran {
    Scanner input = new Scanner(System.in);

    ArrayList<String> mapelSenin = new ArrayList<String>();
    ArrayList<String> mapelSelasa = new ArrayList<String>();
    ArrayList<String> mapelRabu = new ArrayList<String>();
    ArrayList<String> mapelKamis = new ArrayList<String>();
    ArrayList<String> mapelJumat = new ArrayList<String>();
    ArrayList<String> mapelSabtu = new ArrayList<String>();
    
    public void lihatPelajaran(){
        
    }
    public void tambahPelajaran(){
        
    }
    public void hapusPelajaran(){
        
    }

    public void menuMapel(){
        System.out.println("\n=========================================");
        System.out.println("Pilihan Fitur : ");
        System.out.println("1. Lihat Jadwal Mata Pelajran");
        System.out.println("2. Tambah Jadwal Mata Pelajaran");
        System.out.println("3. Hapus Jadwal Mata Pelajaran");
        System.out.println("4. Kembali");
        System.out.println("=========================================");
        int pilMenu;
        System.out.print("Pilhan >> ");pilMenu = input.nextInt();input.nextLine();

        if(pilMenu == 1){
            System.out.println("=========================================");
            lihatPelajaran();
            System.out.println("=========================================");menuMapel();
        }else if(pilMenu == 2){
            System.out.println("=========================================");
            tambahPelajaran();
            System.out.println("=========================================");menuMapel();
        }else if(pilMenu == 3){
            System.out.println("=========================================");
            hapusPelajaran();
            System.out.println("=========================================");menuMapel();
        }else if(pilMenu == 4){
            System.out.println("=========================================\n");
        }else{
            System.out.println("=========================================\n");menuMapel();
        }
    }
}
