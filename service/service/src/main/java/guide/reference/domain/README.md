# Entities / Domain

As entities são a base fundamental da Clean Architecture, representando os conceitos mais importantes e duradouros do sistema. Elas encapsulam as regras de negócio mais essenciais e invariáveis, aquelas que são verdadeiramente centrais para o domínio da aplicação. As responsabilidades das entities incluem:

## Representação do Domínio de Negócio
As entities são responsáveis por modelar os elementos principais do domínio de negócios. Elas refletem os objetos e conceitos centrais que são críticos para o funcionamento do sistema. Por exemplo, em um sistema bancário como o sugerido aqui, a entidade Conta é essencial para representar o domínio bancário.

## Isolamento das Regras de Negócio
As entities devem encapsular as regras de negócio que são invariáveis e independentes de casos de uso específicos ou interfaces de usuário. Elas contêm lógica de negócio que permanece consistente, independentemente de como a aplicação evolui ou de quais funcionalidades são adicionadas.

## Independência de Infraestrutura e Frameworks
Uma característica crucial das entities é a sua independência de detalhes de implementação como frameworks, bibliotecas ou infraestrutura. Elas não devem ter dependências externas que possam causar acoplamento com tecnologias específicas, permitindo que as regras de negócio sejam reutilizáveis e testáveis de forma isolada.

## Manutenção de Integridade e Consistência
As entities são responsáveis por garantir a integridade e consistência dos dados do sistema. Elas implementam validações e restrições que asseguram que o estado dos objetos do domínio esteja sempre válido. Isso inclui garantir que transações financeiras não ultrapassem saldos de conta ou que um cliente tenha informações de contato válidas.

## Base para Casos de Uso
As entities servem como base sobre a qual os casos de uso são construídos. Elas fornecem os dados e a lógica de negócios que os casos de uso manipularão para implementar funcionalidades específicas do sistema. Isso significa que mudanças nas regras de negócio refletidas nas entities podem ser facilmente propagadas para os casos de uso, mantendo a coesão do sistema.

## Durabilidade e Persistência
Embora as entities em si sejam independentes dos mecanismos de persistência, elas são frequentemente projetadas com a durabilidade em mente. Isso significa que elas devem ser persistíveis em um banco de dados ou outro armazenamento, mesmo que o mecanismo exato de persistência seja tratado em outras camadas da arquitetura.

Em resumo, as entities na Clean Architecture são componentes fundamentais que encapsulam as regras de negócio essenciais e invariáveis do sistema, mantendo-se independentes das camadas externas e de detalhes de implementação. Elas garantem a integridade e consistência do domínio de negócio, servindo como base sólida para o desenvolvimento de funcionalidades e garantindo que o sistema permaneça flexível e manutenível ao longo do tempo.