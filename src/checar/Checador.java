package checar;
import java.io.IOException;
import java.util.Scanner;


public class Checador {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int vetor[] = new int[5];
        int countPar = 0;
        int countImpar = 0;
        int countPosit = 0;
        int countNegat = 0;


//continue a solução
        for( int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + " valor: ");
            vetor[i] = leitor.nextInt();
        }
        for( int i = 0; i < 5; i ++){
            int z = vetor[i];
            if (z % 2 == 0){
                countPar ++;
            }else {
                countImpar ++;
            }
            if (z > 0){
                countPosit ++;
            }else if (z < 0){
                countNegat ++;
            }
        }
//insira suas variaveis corretamente
        System.out.println(countPar + " par(es)");
        System.out.println(countImpar + " impar(es)");
        System.out.println(countPosit + " positivo(s)");
        System.out.println(countNegat + " negativo(s)");
    }

}
