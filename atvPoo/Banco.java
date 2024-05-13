import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarContaPorNumero(String numeroConta) throws ContaNaoEncontradaException {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta com número " + numeroConta + " não encontrada no banco.");
    }

    public Conta buscarConta(Conta c) throws ContaNaoEncontradaException {
        for (Conta conta : contas) {
            if (conta.equals(c)) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta não encontrada no banco.");
    }
}
