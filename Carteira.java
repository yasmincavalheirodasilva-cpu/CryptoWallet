public class Carteira {
    String dono;
    double saldoBitcoin;

    public Carteira(String dono) {
        this.dono = dono;
        this.saldoBitcoin = 0.001;
    }

    public void depositar(double qtd) {
        this.saldoBitcoin += qtd;
    }
}
