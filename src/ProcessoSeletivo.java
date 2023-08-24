import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       selecaoCandidatos();
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Bianca","Alanis","Astrid","Zoe","Patricia","Angela","Nicole"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato" + candidato + "solicitou este valor de salário" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+" foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contraproposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

}
