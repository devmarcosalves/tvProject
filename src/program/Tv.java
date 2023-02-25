package program;
import java.util.Scanner;

public class Tv {
	private static int opc;
	static Scanner sc = new Scanner(System.in);
	static TvSala tvs = new TvSala();
    static TvQuarto tvq = new TvQuarto();

	public static void main(String[] args) {
        System.out.println("\tSistema de Gerenciamento de Televisões\n");
        do{
        	start();
        }while(opc!=0);
        System.out.println("Até logo ;)");
        sc.close();
	}
	public static void start() {
		int aux=0;
		System.out.println("1.TV Sala 2.TV Quarto 0.Sair");
        System.out.print("Escolha uma opção: ");
        opc = sc.nextInt();
        while(opc==1 && aux!= 6|| opc==2 && aux!=6) {
     	   if(opc==1) {
     		   tvs.state = false;
     		   tvs.channel = 1;
     		   tvs.volume = 0;
     	   }else {
     		   tvq.state = false;
     		   tvq.channel = 1;
     		   tvq.volume = 0;
     	   }
        }   
	}
	public void on() {
		
	}
	public void off() {
		
	}
	public int change() {
		int channel=0;
		return channel;
	}

}
