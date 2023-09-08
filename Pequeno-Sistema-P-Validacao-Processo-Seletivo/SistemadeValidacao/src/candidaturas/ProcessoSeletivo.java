package candidaturas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    	String[] candidatos = {"PAULO","JACKELINE","ANTONIO","NATHALLY","SOCORRO","JOSIMAR","SAMUEL"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando=true;
        boolean atendeu=false;
        do{
            atendeu=atender();
            continuarTentando=!atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
                System.out.println("Contato realizado com sucesso!");
            }
        }while(continuarTentando && tentativasRealizadas<3);
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
         }
    
    
    static void imprimirSelecionado(){
        String[] candidatos = {"PAULO","JACKELINE","ANTONIO","NATHALLY","SOCORRO","JOSIMAR","SAMUEL"};
        System.out.println("Imprimindo a lista de candidatos informabdo o inidice do elemento");
        for(int indice=0;indice<candidatos.length;indice++){
            System.out.println("o candidato de número "+indice+1+" e o "+candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação do for each");
        for(String candidato: candidatos){
            System.out.println("o candiodato selecionado foi "+ candidato);
        }
    }
    static void selecaoCandidatos() {
    	String[] candidatos = {"PAULO","JACKELINE","ANTONIO","PEDRO","NATHALLY","SOCORRO","JOSIMAR","SAMUEL"};
    	int candidatosSelecionados=0;
    	int candidatosAtual=0;
    	double salarioBase=2000.0;
    	while(candidatosSelecionados <5 && candidatosAtual <candidatos.length) {
    		String candidato = candidatos[candidatosAtual];
    		double salarioPretendido = valorPretendido();
    		System.out.println("O candidato "+candidato +" solicitou este valor de salário");
    		
    		if (salarioBase > salarioPretendido) {
    			System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
    			candidatosSelecionados++;
    		}
     }
    }
    static double valorPretendido() {
    	return ThreadLocalRandom.current().nextDouble(1800,2000);
    	}
    static void analisarCandidato(double salarioPretendido){
        double salarioBase= 2000.0;
        if(salarioBase  > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando os demais candidatos");
        }
    }
}
