public class TestarContaCorrente {
    public static void main(String[] args) {
       
        ContaCorrente novaConta = new ContaCorrente();

        System.out.println("=== EXTRATO DE CONTA CORRENTE===");
        
        // valor inicial na conta
        novaConta.definirSaldoInicial(1000);
        System.out.println("O saldo inicial da conta é: R$ " + novaConta.getSaldo() +"0");
        
        // subtração de 500 reais do valor inicial
        novaConta.sacar(500);
        System.out.println("Saldo após saque de 500.00 reais: R$ " + novaConta.getSaldo()+"0");
        
        // soma como "depósito"
        novaConta.depositar(50);
        System.out.println("Saldo após depósito de 50.00 reais: R$ " + novaConta.getSaldo()+"0");
        
        // subtração
        novaConta.sacar(600);
        System.out.println("Saldo final após saque de 600 reais: R$ " + novaConta.getSaldo()+"0");

        // ps: não consegui fazer o double finalizar com dois zeros pra identificar os centavos, tive de fazer essa feiura de "0"
        
        // situação da conta após trnasações
        if (novaConta.getSaldo() < 0) {
            System.out.println("=== SALDO NEGATIVO ===");
        } else {
            System.out.println("=== SALDO POSITIVO ===");
        }
    }        
}
