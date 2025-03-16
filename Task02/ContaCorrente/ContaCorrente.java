class ContaCorrente {
    double saldo;
 
    public void definirSaldoInicial(double valor) {
        this.saldo = valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}