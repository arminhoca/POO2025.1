package Funcionario;

public class Funcionario {
    String nome;
    String sobrenome;
    int horasTrabalhadas;
    double valorPorHora;

  
    String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

   void incrementarHoras(int horas) {
        horasTrabalhadas += horas;
    }
}

