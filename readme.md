  Para enfrentar o desafio de desenvolver um sistema de gerenciamento de frota de veículos em uma grande empresa de transportes, foi necessário projetar uma solução que permitisse o armazenamento de diferentes tipos de veículos e a realização de cálculos de seguro e manutenções periódicas. O sistema precisava considerar as particularidades de cada veículo, como carros e motos, e garantir a organização e fácil acesso às informações por meio de uma estrutura de dados eficiente. A implementação foi orientada a um modelo de programação orientada a objetos em Java, que facilita a manutenção e expansão da aplicação.
  O ponto de partida da solução foi a criação de uma classe base chamada Veiculo, que encapsula os atributos comuns placa e ano, além de um método concreto exibirDetalhes e um método abstrato calcularValorSeguro, que seria personalizado pelas subclasses. Essa abordagem garantiu que as classes filhas pudessem implementar suas próprias regras de cálculo de seguro, adaptadas às suas particularidades. Para padronizar a realização de manutenções, foi criada uma interface chamada Manutencao, com um método realizarManutencao, assegurando que todas as subclasses de Veiculo adotassem uma forma consistente de indicar a manutenção realizada. Em seguida, foram implementadas as subclasses Carro e Moto, que herdaram de Veiculo e implementaram a interface Manutencao. Cada uma dessas classes adicionou atributos próprios numeroPortas e cilindrada, e implementou o método calcularValorSeguro de forma específica considerando o número de portas para carros e a cilindrada para motos. A estrutura de armazenamento utilizada foi uma lista, o que garantiu uma forma flexível e eficiente de manipulação dos veículos. Por fim, a classe principal foi desenvolvida para criar uma lista de veículos, adicionar instâncias de Carro e Moto, e percorrer a lista para exibir os detalhes, calcular o valor do seguro e executar as manutenções.
  A implementação do sistema de gerenciamento de frota em Java cumpriu com sucesso os requisitos da empresa, oferecendo uma solução que separa claramente as responsabilidades. A abordagem orientada a objetos permitiu que cada tipo de veículo fosse tratado de forma específica, enquanto a utilização de uma lista facilitou o armazenamento e a consulta dos veículos. Com essa estrutura, o sistema se mostrou flexível para futuras expansões, como a inclusão de novos tipos de veículos ou funcionalidades adicionais. Essa solução, portanto, não apenas atendeu às necessidades atuais da empresa, mas também proporcionou uma base sólida para evoluções futuras no gerenciamento da frota.

Link do código no GitHub: 
https://github.com/macielzeferino/college-java-activity


Referencias Bibliográficas

BALLAUFF, Peter H. Gestão de logística. São Paulo: Atlas, 2014.
FOWLER, Martin. Patterns of Enterprise Application Architecture. Addison-Wesley, 2002.
GAMMA, Erich; HELM, Richard; JOHNSON, Ralph; VLISSIDES, John. Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley, 1994.
MITCHELL, Melanie. An introduction to genetic algorithms. Cambridge: MIT Press, 1998.
GOLDBERG, David E. Genetic algorithms in search, optimization, and machine learning. Reading: Addison-Wesley, 1989.
ORACLE. Java Documentation: The Java Tutorials. 2024. Disponível em: https://docs.oracle.com/javase/tutorial/. Acesso em: 6 nov. 2024.

