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
        	if(opc!=1 && opc!=2 && opc!=0) {
            	System.out.println("Opção Inválida!\n");
           }
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
     	   System.out.println("\n1.Ligar/Desligar 2.Mudar Canal 3.Aumentar Volume \n4.Reduzir Volume 5.Ver Status 6.Voltar");
     	   System.out.print("Escolha uma opção: ");
     	   aux = sc.nextInt();
     	   switch(aux){
     	   case 1:
     		   if(opc==1 && tvs.state == false) {
     			   tvs.on(opc);
     		   }else if(opc==1 && tvs.state == true) {
     			   
     			   System.out.println("A TV da Sala foi desligada!");
     		   } 
     		   if(opc==2 && tvq.state == false) {
     			   tvq.on(opc);
     		   }else if(opc==2 && tvq.state == true) {
     			   
     			   System.out.println("A TV do Quarto foi desligada!");
     		   }
     		   break;
     	   case 2:
     		   if(opc==1 && tvs.state==true) {
     			   tvs.channel = tvs.change();
          		}else if(opc==2 && tvq.state==true){
          			tvq.channel = tvq.change();
          		}else {
          			System.out.println("A TV está desligada!");
          		}
     		   	break;
     	   case 3:
     		   if(opc==1 && tvs.state==true || opc==2 && tvq.state==true) {
     			   if(opc==1 && tvs.volume<100) {
     				   tvs.volume++;
     				   System.out.println("TV Sala - Volume "+tvs.volume);
     			   }else if(opc==2 && tvq.volume<100){
     				   tvq.volume++;
     				   System.out.println("TV Quarto - Volume "+tvq.volume);
     			   }else {
     				   System.out.println("O volume está no limite máximo!");
     			   }
     		   }else {
     			   System.out.println("A TV está desligada!");
     		   }
     		   break;
     	   case 4:
     		   if(opc==1 && tvs.state==true || opc==2 && tvq.state==true) {
     			   if(opc==1 && tvs.volume>0) {
     				   tvs.volume--;
     				   System.out.println("TV Sala - Volume "+tvs.volume);
     			   }else if(opc==2 && tvq.volume>0) {
     				   tvq.volume--;
     				   System.out.println("TV Quarto - Volume "+tvq.volume);
     			   }else {
     				   System.out.println("O volume está zerado!");
     			   }
     		   }else {
     			   System.out.println("A TV está desligada!");
     		   }
     		   break;
     	   case 5:
     		   System.out.println((tvs.state) ? "A TV da Sala está ligada no canal "+tvs.channel+" e no volume "+tvs.volume : "A TV da Sala está desligada no canal "+tvs.channel+" e no volume "+tvs.volume);
     		   System.out.println((tvq.state) ? "A TV do Quarto está ligada no canal "+tvq.channel+" e no volume "+tvq.volume : "A TV do Quarto está desligada no canal "+tvq.channel+" e no volume "+tvq.volume);
     		   break;
     	   case 6:
     		   System.out.print("\n");
     		   main(null);
     		   break;
     	   default:
     		   System.out.println("Opção Inválida!");
     		   break;
     	   }
        }   
	}
	public void on(int opc) {
		if(opc==1){
            tvs.state = true;
            tvs.volume = 0;
            tvs.channel = 1;
            System.out.println("A televisão da Sala está ligada no canal "+tvs.channel+" e no volume "+tvs.volume);
        }else if(opc==2){
            tvq.state = true;
            tvq.volume = 0;
            tvq.channel = 1;
            System.out.println("A televisão do Quarto está ligada no canal "+tvq.channel+" e no volume "+tvq.volume);
        }
	}
	public void off() {
		
	}
	public int change() {
		int channel=0;
		return channel;
	}

}
