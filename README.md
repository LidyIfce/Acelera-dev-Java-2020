# Descrição dos desafios :memo:

## Primeiro Modulo:

#### Java-0: Fibonacci

Devem ser feitos os métodos:

- método @Desafio("Fibonacci") que retorne uma lista java.util.List com os primeiros números Integer da série de Fibonacci até 350.

- método @Desafio("isFibonnaci") que recebe um Integer como parâmetro e retorne Boolean. Caso o número recebido por parâmetro esteja entre os números da sequência de Fibonnaci do @Desafio("Fibonnaci") retorne true, senão, false.

#### Java-6: Criptografia de Júlio César

Automatize a criptografia e descriptografia de menagens utilizando a criptografia de Julio César.

Regras:
- As mensagens serão convertidas para minúsculas tanto para a criptografia quanto para descriptografia.
- Os números serão mantidos

#### Java-13 Calculadora de Salário Líquido

Deve ser implementado um algoritmo que será responsável por receber como parâmetro o salário bruto e retornar o salário líquido, já com todos os descontos de INSS e IRRF. (Utilize o método Math.round() para arredondar o resultado final).

## Segundo Módulo:

#### Java-1: Gerenciador de Times de Futebol

Nesse desafio deve-se construir o backend de um novo gerenciador de times de futebol.
Deverá ser implementada a interface MeuTimeInterface.

- incluirTime: Realiza a inclusão de um novo time
- incluirJogador: Realiza a inclusão de um novo jogador
- definirCapitao: Define um jogador como capitão do seu time. Um time deve ter apenas um capitão, por tanto o capitão anterior voltará a ser apenas jogador.
- buscarCapitaoDoTime: Mostra o identificador do capitão do time.
- buscarNomeJogador: Retorna o nome do jogador.
- buscarNomeTime: Retorna o nome do time.
- busarJogadoresDoTime: Retorna a lista com o identificador de todos os jogadores do time, ordenada pelo id.
- buscarMelhorJogadorDoTime: Retorna o identificador do melhor jogador do time.
- buscarJogadorMaisVelho: Retorna o identificador do jogador mais velho do time. Usar o menor identificador como critério de desempate.
- buscarTimes: Retorna uma lista com o identificador de todos os times cadastrado, ordenada pelo identificador. Retornar uma lista vazia caso não encontre times cadastrados.
- buscarJogadorMaiorSalario: Retorna o identificador do jogador com maior salário do time. Usar o menor identificador como critério de desempate.
- buscarSalarioJogador: Retorna o salário do jogador.
- buscarTopJogadores: Retorna uma lista com o identificador dos top melhores jogadores, utilizar o menor identificador como critério de desempate.
- buscarCorCamisaTimeDeFora: Retorna a cor da camisa do time adversário. Caso a cor principal do time da casa seja igual a cor principal do time de fora, retornar cor secundária do time de fora. Caso a cor principal do time da casa seja diferente da cor principal do time de fora, retornar cor principal do time de fora.

#### Java-7: Controle de estacionamento

Objetivo desse sistema é auxiliar na gestão de um estacionamento. Esse estacionamento é formato por um número limitado de vagas, assim, as regras são:

- O número de vagas do estacionamento são de dez carros.
- Para cada carro que entra no sistema é necessário informar a sua placa, cor além das informações do motorista.
- Para entrar no estacionamento, é necessário que exista um motorista, ou seja, nada de carro autônomo.
- O motorista precisa ter idade suficiente para dirigir e possuir uma habilitação.
- A habilitação não deverá está suspensa, ou seja, a pontuação da carteira de motorista não deverá ser superior a vinte pontos.
- O estacionamento não deverá comportar o número superior de vagas.
- Caso o estacionamento esteja lotado: * Chegue mais um novo carro, o primeiro que estacionou deverá sair * Caso o motorista do primeiro carro estacionado tenha uma idade superior a 55 anos, será escolhido o próximo motorista abaixo dos 55 anos. * Caso todos os motoristas, dentro do estacionamento, tenham mais de 55 anos e chegue um motorista, ele não conseguirá estacionar.

#### Java-14: Calcular Media, Moda e Mediana

Devem ser implementados os seguintes métodos: average, mode, median

- O método que terá o nome average deve receber um array de inteiros e retornar a média de seus valores. A média pode ser obtida através da soma de todos os valores do conjunto, dividida pela quantidade de elementos do conjunto.
- O método que terá o nome mode deve receber um array de inteiros e retornar um inteiro contendo o valor da moda do conjunto. A moda é representada pelo valor que mais se repete no conjunto.
- O método que terá o nome median deve receber um array de inteiros e retornar um valor inteiro contendo a mediana do conjunto. A mediana pode ser obtida ordenando os valores no array e pegando o valor que se encontra no meio do mesmo. Para arrays com quantidade par de elementos, não haverá um único valor no meio, nesse caso a mediana será definida como a média entre os dois valores do meio do array.


## Terceiro Módulo

#### Java-8: Calculador de Atributos de Classe

O desafio é somar ou subtrair determinados atributos do tipo BigDecimal de uma classe. Pra isso deverá ser criada uma annotation (“Somar”) para determinar quais atributos serão somados e outra annotation (“Subtrair”) para todos os atributos que serão subtraídos.

Deverá ser criada uma interface Calculavel. Esta interface possui 3 métodos:

- Somar: deverá somar todos os atributos do tipo BigDecimal de uma classe recebida como parâmetro e retornar um BigDecimal.
- Subtrair: deverá somar todos os atributos do tipo BigDecimal de uma classe recebida como parâmetro e retornar um BigDecimal.
- Totalizar: deverá subtrair os atributos annotados com “Subtrair” dos atributos annotados com “Somar”.

Deverá também ser criada uma classe concreta que implementa Calculavel. O nome dessa classe deve ser CalculadorDeClasses.

- Caso a classe não tenha nenhum atributo com annotation, retornar BigDecimal.ZERO
- Caso o atributo não seja BigDecimal, retornar BigDecimal.ZERO


## Quarto Módulo

#### Java-9: Criando Entidades de Banco de Dados em Java

Neste desafio foi recebido um projeto Maven pré-configurado com Springboot, Spring-JPA e banco de dados H2. 

[Modelo Entidade Relacionamento do banco de dados utilizado](https://codenation-challenges.s3-us-west-1.amazonaws.com/java-9/codenation-sample.png)

Deve ser o utilizado o package entity para criar as entidades JPA para o modelo proposto.


## Quinto Módulo

#### Java-10: Criando e manipulando entidades no Banco de dados com Spring

Neste desafio foi recebido um projeto Maven pré-configurado com Springboot, Spring-JPA e banco de dados H2. Este projeto também já continham as classes de entidade entity já criadas para o [Modelo de Entidade Relacionamento](https://codenation-challenges.s3-us-west-1.amazonaws.com/java-10/codenation-sample-2.png).

Também foi disponibilizadas interfaces de serviço para cada uma das classes entity. 

O objetivo era criar classes de serviço implementado as interfaces, e também as classes repository para manipulação dos dados.

#### Java-15: Order Service

Deverá ser implementados os métodos da classe OrderServiceImpl, uma implementação da Interface OrderService. A implementação de seus métodos deve utilizar a seguir as regras abaixo.

 - Double calculateOrderValue(List items)

Esse método deverá receber uma lista de OrderItem (Classe que contem o id do produto e sua quantidade no pedido) e deve retornar o valor total do pedido. Para calcular o valor total, deve-se obter o valor de cada item do pedido (OrderItem) multiplicando a quantidade de itens pelo valor do produto e, caso o produto tenha o atributo isSale igual a true, deve-se aplicar um desconto de 20%.

 - Set findProductsById(List ids)

Esse é um método de mapeamento, que deve receber uma lista de ids de produtos e devolver um conjunto de produtos.

 - Double calculateMultipleOrders(List> orders)

Esse método deverá calcular o valor total de todos os pedidos, sendo que cada pedido corresponde a uma lista de OrderItem. Para calcular o valor total de cada pedido, você deve seguir as mesmas regras do método calculateOrderValue.

 - Map> groupProductsBySale(List productIds)

Esse método deverá receber uma lista de ids de produtos e retornar um mapa com os produtos agrupados de acordo com o atributo isSale.

**Observações:** Para implementar os métodos acima, deverão ser utilizados os métodos disponíveis na Interface ProductRepository Todos os métodos devem ignorar id inválidos Todos os método devem ser implementados utilizando a Stream API


## Sexto Módulo

#### Java-11: Criando endpoints com Spring

Neste desafio foi recebido um projeto Maven pré-configurado com Springboot, Spring-JPA, Spring-WEB e banco de dados H2. Este projeto também já continham as classes de entidade entity, repositórios repository e de serviço service. 
O objetivo é escrever as classes controller deste projeto respeitando as regras abaixo:

 - Deverão ser criados os seguintes endpoints:

/user

/candidate

/submission

/acceleration

/company

/challenge


- Deverão ser expostos todos os métodos existentes nas classes de serviço service.

- Caso a entidade utilizada possua um DTO, este deve ser utilizada.


## Sétimo Módulo

#### Java-12: Oauth2 com Spring

Neste desafio foi recebido um projeto Maven pré-configurado com Springboot, Spring-JPA, Spring-WEB, Spring-Security e banco de dados H2.

 - Utilize a lib Spring Security OAuth2 AutoConfigure para utilizar Oauth2 no seu projeto spring.

 - Configure o Resource Server através da annotation @EnableResourceServer para expor o endpoint /user e bloquear todos os outros.

 - Configure o Authentication Server através da annotation @EnableAuthorizationServer.

 - O Email dos Usuários deve ser utilizado como login
 
 - A aplicação deve ser configurada para utilizar o UserRepository para buscar o Usuario por e-mail
 
 - A senha não deve estar encriptada
 
 - Utilize a propriedade do spring para setar scope password, client_id e client_secret.

 - GET /oauth/token: recebendo client_id, client_secret, grant_type, user e password. 
 
 - GET /user: deverá ser acessado sem autenticação.

 - GET /company: deverá ser acessado apenas com autenticação. Utilize a autenticação Bearer + token para conseguir acesso.
 
 
 ## Oitavo Módulo
 
 #### Refatorando formas de pagamento
 
 Em um sistema utilizado no caixa de uma loja, há uma funcionalidade de pagamento. A loja tem uma política de desconto de acordo com a forma de pagamento e o sistema já executa o comportamento conforme o esperado.

No entanto, o time de desenvolvimento do software notou que a complexidade dessas regras de descontos iria aumentar consideravelmente, o que fez o time perceber que a funcionalidade precisaria ser refatorada para aumentar a flexibilidade do sistema e evitar que uma mesma classe crescesse mais do que deveria, o que poderia ocasionar vários problemas - dentre eles, o aumento no esforço de manutenção e no surgimento de bugs.

A tarefa de refatoração foi dada a você. Por isso, levando em consideração princípios SOLID, como, por exemplo, o SRP (Single Responsibility Principle) e o OCP (Open Closed Principle), você deve refatorar o código da classe BillingProcessor de acordo com as instruções abaixo.

A classe BillingProcessor contém um método com a seguinte assinatura:

Double calculate(Order order)

Esse método já está funcionando conforme o esperado, aplicando descontos de acordo com a forma de pagamento. Sua tarefa consiste em refatorar esse método atendendo os seguintes requisitos: - A lógica de desconto de cada forma de pagamento deve ser encapsulada em uma classe diferente(Strategy Pattern) - Essas classes devem ser implementações da interface PriceStrategy - Cada implementação da classe PriceStrategy deve ser vinculada ao enum PaymentMethod correspondente (Esse enum já possui um atributo chamado priceStrategy, utilize-o) - Nenhuma nomenclatura de classe, atributo ou assinatura de método existente deve ser alterada.

Observações:

Para fins de testes, a nomenclatura das implementações da interface PriceStrategy devem conter o nome do Enumeration correspondente em CamelCase e sem _ (underline). As implementações devem estar no mesmo pacote da interface PriceStrategy

