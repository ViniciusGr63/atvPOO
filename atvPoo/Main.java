public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Conta conta1 = new Conta("123456", 1000.0);
        Conta conta2 = new Conta("654321", 2000.0);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        try {
            Conta contaEncontrada = banco.buscarContaPorNumero("123456");
            System.out.println("Conta encontrada por número: " + contaEncontrada.getNumero());

            Conta contaParaBuscar = new Conta("654321", 0.0);
            Conta outraContaEncontrada = banco.buscarConta(contaParaBuscar);
            System.out.println("Outra conta encontrada: " + outraContaEncontrada.getNumero());
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}
