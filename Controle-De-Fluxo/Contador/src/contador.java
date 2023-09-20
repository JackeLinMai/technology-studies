import java.util.Scanner;

public class contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            int resultado = Contar(parametroUm, parametroDois);
            System.out.println("Contagem realizada com sucesso: " + resultado + " números impressos.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static int Contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroUm > parametroDois) {
            try {
                throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        int contagem = parametroDois - parametroUm + 1;

<<<<<<< HEAD
        for (int o = 1; o <= contagem; o++) {
=======
        for (int o = 1;o <= contagem; o++) {
>>>>>>> 2d90604864b4c8f96717e61b2d2eb9869d426ec3
            System.out.println("Imprimindo o número " + (parametroUm + o - 1));
        }

        return contagem;
    }
    }
