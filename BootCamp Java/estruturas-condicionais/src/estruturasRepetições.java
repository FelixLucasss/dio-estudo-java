import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class estruturasRepetições {
    public static void main(String[] args) {
        for(int carneirinhos=1;carneirinhos<=10;carneirinhos++){
            System.out.println("Contando carneirinhos : "+ carneirinhos);
        }
        System.out.println("Joãozinho dormiu!");

        String alunos[] = {"FELIPE", "JONAs", "JULIA", "MARCOS"};
        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno do indice " + x + " é " + alunos[x]);
        }

        
        double mesada =50.0;
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce>mesada){
                valorDoce=mesada;
            }System.out.println("Doce do valor: "+ valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada : "+ mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces!");

        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando...");
        }while(tocando());
        System.out.println("Alô!!!");

    }
    private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(5,15);
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+ atendeu);
        return ! atendeu;
    }
}
