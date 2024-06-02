/**
 * <h1> Teamcubation - Exercício - Aula de Mocks</h1>
 * Objetivo:<br>
 * . Fixar o aprendizado de uso de mocks e spies em testes unitários<br>
 * . Verificar a diferença de comportamento entre o mock e o spy<br><br>
 *
 * Pré-requisito:<br>
 * . Ter o JUnit e o Mockito nas dependências do projeto<br><br>
 *
 * Preparo das classes:<br>
 * - Crie uma classe CaixaEletronico que tenha uma dependência de uma classe Banco<br>
 * - A classe Banco deve ter dois métodos que retornem double: getSaldoContaCorrente e getSaldoContaPoupanca<br>
 * - Crie um método na classe CaixaEletronico que chame os dois métodos da classe Banco e faça qualquer coisa com eles<br><br>
 *
 * Preparo dos testes:<br>
 * - Crie uma classe de teste CaixaEletronicoTest<br>
 * - Crie um método de teste para testar o seu método da classe CaixaEletronico<br><br>
 *
 * Teste 1:<br>
 * - Teste seu método da classe CaixaEletronico usando um MOCK da classe Banco, onde você irá fazer com que os dois métodos da classe Banco retornem valores diferentes dos valores reais.<br><br>
 *
 * Teste 2:<br>
 * - Teste seu método da classe CaixaEletronico usando um SPY da classe Banco, onde você irá fazer com que um dos métodos da classe Banco retorne um valor diferente do valor real, e o outro método você não irá modificar.<br><br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   02/06/2024
 */
public class CaixaEletronico {
    private Banco banco;

    public CaixaEletronico(Banco banco){
        this.banco =banco;
    }
    public void saldoDasContas(){
        double saldoContaCorrente = banco.getSaldoContaCorrente();
        double saldoContaPoupanca = banco.getSaldoContaPoupanca();
        System.out.println("Saldo da Conta Corrente: " + saldoContaCorrente);
        System.out.println("Saldo da Conta Poupança: " + saldoContaPoupanca);
    }

}
