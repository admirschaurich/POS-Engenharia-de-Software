import java.util.Scanner;
import java.util.Random;

public class Condicionais {
    Scanner prompt;

    public Condicionais() {
        prompt = new Scanner(System.in);
    }

    public void CondicionaisSimples() {
        int nota = 2;
        if (nota >= 7) {
            System.out.println("Aprovado");
        }
    }

    public void CondicionaisCompostas() {
        int nota = 2;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void CondicionaisAninhadas(int nota) {
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void CondicionaisMultiplasEscolhas() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Cadastrar notas");
        System.out.println("3 - Listar alunos e notas");

        int opcao = prompt.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Vamos cadastrar aluno");
                break;
            case 2:
                System.out.println("Vamos cadastrar notas");
                break;
            case 3:
                System.out.println("Listar alunos e notas");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void ExemploPratico() {
        Random gerador = new Random();

        int NumeroGerado = gerador.nextInt(10);

        System.out.println("Adivinhe o número sorteado entre 0 e 10:");

        int numero = prompt.nextInt();

        if (numero == NumeroGerado) {
            System.out.println("Parabéns, você acertou! Numero sorteado foi o: " +
                    NumeroGerado);
        } else {
            System.out.println("Você errou, tente novamente! Numero sorteado foi o: " +
                    NumeroGerado);
        }

        prompt.close();
    }

    public void Exercicio2(int ano) {
        if (((ano % 4) == 0 || (ano % 100) > 0) || ((ano % 400) == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }
    }

    public void Exercicio3() {
        String txt = "maria";

        if (txt != "Maria") {
            System.out.println(txt + "seu acesso não está autorizado");
        } else {
            System.out.println(txt + "seu acesso foi autorizado");
            System.out.println("...");
        }
    }

    public void Exercicio4() {
        String valorA = "true";
        boolean valorB = true;
        boolean valorC = true;

        if (valorA == "true") {
            System.out.println("Valor da variável valorA é true");
        }

        if (valorB == true) {
            System.out.println("Valor da variável valorB é true");
        }

        if (valorC) {
            System.out.println("Valor da variável C é false");
        }
    }

    public void Dispose() {
        prompt.close();
    }
}