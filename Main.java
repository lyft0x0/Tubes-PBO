import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    MataPelajaran mataPelajaran = new MataPelajaran();
    
    public void menuApp(){

        System.out.println("=========================================");
        System.out.println("\tSTUDENT PLANNER SISWA");
        System.out.println("=========================================");
        System.out.println("Selamat datang, userr");
        System.out.println("=========================================");
        System.out.println("Pilih menu : ");
        System.out.println("1. Mata Pelajaran");
        System.out.println("2. Materi Pelajaran");
        System.out.println("3. Tugas dan Pekerjaan Rumah (PR)");
        System.out.println("4. Catatan Aktivitas");
        System.out.println("5. Data Siswa");
        System.out.println("=========================================");
        int pilMenu;
        System.out.print("Pilhan >> ");pilMenu = input.nextInt();input.nextLine();

        switch(pilMenu){
			case 1 : mataPelajaran.menuMapel();menuApp();
			//case 2 : ;menu();
			//case 3 : ;menu();
			//case 4 : ;menu();
			//case 5 : ;menu();
			//case 6 : ;menu();
			default : menuApp();
		}

    }


    public static void main(String[] args) {
        Main app = new Main();
        app.menuApp();
    }
}