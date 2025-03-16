package Funcionario;

public class TestarFuncionario {
    public static void main(String[] args) {
 
        Funcionario novoFuncionario = new Funcionario();

        // dados gerais
        novoFuncionario.nome = "Yasmin";
        novoFuncionario.sobrenome = "Azevedo";
        novoFuncionario.horasTrabalhadas = 8;
        novoFuncionario.valorPorHora = 45.98;

        System.out.println("=== DADOS DO FUNCIONÁRIO ===");
        System.out.println("Nome completo: " + novoFuncionario.nomeCompleto());

        System.out.println("Salário inicial: R$ " + novoFuncionario.calcularSalario());

        novoFuncionario.incrementarHoras(3);

        System.out.println("Salário e horas extras: R$ " + novoFuncionario.calcularSalario());
    }
}