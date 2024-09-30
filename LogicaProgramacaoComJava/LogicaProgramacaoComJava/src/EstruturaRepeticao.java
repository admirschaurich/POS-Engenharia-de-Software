import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class EstruturaRepeticao {
    Scanner prompt;
    public EstruturaRepeticao() {
        prompt = new Scanner(System.in);
    }


    public void For(){
        for(int cont=5;cont<=20;cont++){
            System.out.println("Números de 5 a 20: " + cont);
        }
    }

    public void While(){
        int opcao = 0;

        while(opcao != 99){
            System.out.println("Digite um valor qualquer ou digite 99 para sair");
            opcao = prompt.nextInt();
        }

        System.out.println("O Programa será encerrado!");
    }

    public void DoWhile() {
        int opcao;

        do{
            System.out.println("Digite um valor qualquer ou digite 99 para sair");
            opcao = prompt.nextInt();

            if(opcao == 99){
                System.out.println("O Programa será encerrado!");
            }
        }while(opcao != 99);
    }

    public void RepeticaoAninhada() {
        for(int i=0;i<=10;i++){
            for (int j = 0; j <=10 ; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    public void Exercicio1() {
        for(int x=1; x<10; x++)
            if (x % 4 != 0 && x % 2 == 0)
                for (int y = 1; y < 5; y++)

        System.out.println(y);
    }

    public void Exercicio2() {
        int d = 0, x = 314;

        while(x > 1){
            x = x/2;
            d = d +1;
        }

        System.out.println(x);
        System.out.println(d);
    }

    public void Exercicio3() {
        int n = 6;

        int cont = 0;

        for (int i = 1; i<(n+1); i++) {
            if(n%i == 0){
                cont = cont + 1;
            }
        }
        System.out.println(cont == 2);
    }

    public void Exercicio4() {
        int x=4, y=8, r=0;

        for(int i=0; i<x; i++){
            r = r + y;
        }

        System.out.println(r);
    }

    public void Dispose(){
        prompt.close();
    }
}
