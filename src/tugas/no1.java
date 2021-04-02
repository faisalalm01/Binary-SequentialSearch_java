package tugas;
import java.util.Scanner;
public class no1 {

    public static void main(String[] args) {
    System.out.println("SEQUENTIAL SEACH"+"\n");

    Scanner Input = new Scanner(System.in);
       
    String data[] ={"Galileo","Archimedes","Alkhawarizmi","Aljabar","faisal_ali","Tesla"};
    String cari;
        
    System.out.println("Isi data adalah : ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.print("Masukkan Data Yang akan dicari : ");
       
        cari = Input.nextLine();
            for (int i =0; i<data.length; i++){
                if(cari.equalsIgnoreCase(data[i])){
               System.out.print("Data " + cari + " Berada Di Indeks Ke : " + i);
               break;
            }
        }
        System.out.println("\n");
        System.out.println(" faisal ali m ");
        
    }     
    }
