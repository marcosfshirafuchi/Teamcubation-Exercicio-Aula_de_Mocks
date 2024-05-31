# <a href="https://ibb.co/3rNCHC2"><img src="https://i.ibb.co/K0qrHrd/1711738799650.jpg" alt="1711738799650" border="0" height="70" width="180"></a> Aula de Mocks


#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)

# Exercicio - Aula de Mocks

Objetivo:<br>
- Fixar o aprendizado de uso de mocks e spies em testes unitários<br>
- Verificar a diferença de comportamento entre o mock e o spy

Pré-requisito:<br>
- Ter o JUnit e o Mockito nas dependências do projeto

Preparo das classes:
- Crie uma classe CaixaEletronico que tenha uma dependência de uma classe Banco
- A classe Banco deve ter dois métodos que retornem double: getSaldoContaCorrente e getSaldoContaPoupanca
- Crie um método na classe CaixaEletronico que chame os dois métodos da classe Banco e faça qualquer coisa com eles

Preparo dos testes:
- Crie uma classe de teste CaixaEletronicoTest
- Crie um método de teste para testar o seu método da classe CaixaEletronico

Teste 1:
- Teste seu método da classe CaixaEletronico usando um MOCK da classe Banco, onde você irá fazer com que os dois métodos da classe Banco retornem valores diferentes dos valores reais.

Teste 2:
- Teste seu método da classe CaixaEletronico usando um SPY da classe Banco, onde você irá fazer com que um dos métodos da classe Banco retorne um valor diferente do valor real, e o outro método você não irá modificar.
