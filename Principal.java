public class Principal {
public static void main(String[] args) {
    Carteira minhaCarteira = new Carteira("Yasmin");
    minhaCarteira.depositar(0.5);
    System.out.println("Saldo de Bitcoin: " + minhaCarteira.saldoBitcoin);
}
}
