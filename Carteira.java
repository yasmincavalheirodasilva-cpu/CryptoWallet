public class Carteira {
    String dono;
    double saldoBitcoin;
    String senhaAcesso;

    public Carteira(String dono, String senhaAcesso) {
        this.dono = dono;
        this.senhaAcesso = senhaAcesso;
        this.saldoBitcoin = 0.0;
    }

    public void depositar(double qtd) {
        this.saldoBitcoin += qtd;
    }
}
