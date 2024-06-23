# Capitulo 2 - Arquitetura e divisão de camadas
Neste capítulo, aprofundaremos nosso entendimento sobre a Clean Architecture e como ela é aplicada na prática. Se você acompanhou até aqui, já deve ter uma boa compreensão teórica desse conceito. Vale lembrar que a divisão de camadas se reflete no código e na interação entre os arquivos, e a organização em pastas serve apenas para facilitar a gestão, não representando a divisão lógica em si.

## Falta algo?

A Clean Architecture é amplamente utilizada, especialmente em ambientes empresariais, devido à sua capacidade de promover código limpo e altamente manutenível. Apesar de sua simplicidade aparente, que facilita a definição clara de comunicações entre interfaces e camadas, sua implementação frequentemente enfrenta problemas. Muitos projetos no GitHub, ao tentar seguir a Clean Architecture, acabam introduzindo graves problemas de acoplamento ou colocando itens incorretamente em camadas erradas, como domains sendo colocados em locais inadequados.

Para evitar esses problemas, é crucial entender claramente a separação e a interação entre as camadas. Vamos agora detalhar cada uma dessas camadas.

## Camadas
A seguir, descreveremos como as camadas do projeto são divididas e como elas interagem entre si.

### Domain
A camada de Domain é onde definimos os contratos de caso de uso e as entidades do sistema. Esta camada está diretamente relacionada às Enterprise Business Rules, ou seja, às regras de negócio essenciais da aplicação. Ela deve permanecer independente de outras camadas, focando exclusivamente na lógica de negócios.

[Entities/Domain](https://github.com/rodrigoror/pa-igti-guia-de-referencia/blob/main/service/service/src/main/java/guide/reference/domain/README.md)

### Data
Na camada de Data, estão todos os contratos de caso de uso específicos do sistema, ligados às Application Business Rules. Esta camada define as funcionalidades que a aplicação terá, implementando as regras de negócio específicas. Ela serve como um intermediário entre a lógica de negócios e as operações de infraestrutura.

[Use Case/Data](https://github.com/rodrigoror/pa-igti-guia-de-referencia/blob/main/service/service/src/main/java/guide/reference/data/README.md)

### Infra
A camada de Infra lida com a comunicação com frameworks e bibliotecas externas. Esta é a camada mais externa, conectando o sistema a elementos externos, como frameworks, bibliotecas e interfaces. A Infra deve ser isolada para garantir que mudanças externas não afetem a lógica interna da aplicação.

[Frameworks & Drivers / Infrastructure](https://github.com/rodrigoror/pa-igti-guia-de-referencia/blob/main/service/service/src/main/java/guide/reference/infra/README.md)

### Presentation
A camada de Presentation atua como a porta de entrada da aplicação, disponibilizando recursos através de APIs RESTful. Esta camada é responsável por interagir diretamente com o usuário final, recebendo e processando suas solicitações antes de encaminhá-las para as camadas internas.

[Interface Adapters/Presenters](https://github.com/rodrigoror/pa-igti-guia-de-referencia/blob/main/service/service/src/main/java/guide/reference/presentation/README.md)


### Main
A camada Main é uma divisão auxiliar que integra componentes de todas as outras camadas e fornece os dados necessários para a camada de Presentation. Ela detalha as operações de cada caso de uso e gerencia a execução dentro do fluxo de requisição, coordenando a interação entre as diversas camadas.

[Interface Adapters/Controllers](https://github.com/rodrigoror/pa-igti-guia-de-referencia/blob/main/service/service/src/main/java/guide/reference/main/README.md)

## Estrutura

Com esta estrutura bem definida, podemos avançar com confiança, aplicando a Clean Architecture de forma prática e eficiente, evitando os erros comuns de implementação e garantindo um código limpo e sustentável.

![CleanArchitectureStruture](/img/CleanArchGraph.png)

