### Semana 1 - Dia 25/05/2022 - Aulas 001a004 - Atividade Supervisionada


1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

# Rest Api

## 1. Definição
API Rest é uma interface de programação de aplicações que está em conformidade com as restrições do estilo de arquitetura REST, permitindo a interação com serviços web RESTful. Para enriquecer mais esse conceito, precisamos entender ambos os conceitos de API e do padrão REST.

**1.1 Conceito de API:**

O acrônimo API é a abreviação de Application Programming Interface, que significa “Interface de Programação de Aplicações”. Representa um conjunto de rotinas e padrões estabelecidos e documentados para que aplicações externas tenha autorização para utilizar as funcionalidades oferecidas por essa aplicação, sem precisar conhecer os detalhes dessa implementação. Para isso, a API utiliza requisições HTTP responsáveis pelas operações básicas necessárias para a manipulação dos dados. As principais requisições são:

* POST: criar dados no servidor;
* GET: leitura de dados no host;
* DELETE: excluir as informações;
* PUT: atualizações de registros.

**1.2 Conceito de Rest.**

REST não é um protocolo ou padrão, mas sim um conjunto de restrições de arquitetura. Os desenvolvedores de API podem implementar a arquitetura REST de maneiras variadas. Quando um cliente faz uma solicitação usando uma API RESTful, essa API transfere uma representação do estado do recurso ao solicitante ou endpoint. Essa informação é entregue via HTTP utilizando um dos vários formatos possíveis: JSON, XML, Python ou texto sem formatação, dentre outros. O formato JSON - Javascript Object Notation - é a linguagem de programação mais usada porque, apesar de seu nome, é independente de qualquer outra linguagem e pode ser lido por máquinas e humanos.

Portanto uma API RESTful funciona através da manipulação de recursos e representações. Essas representações são trocadas entre os usuários e o servidor através de uma interface padronizada e de um protocolo de comunicação específico, geralmente o HTTP. Assim, quando um usuário deseja usar uma funcionalidade da aplicação, seu dispositivo envia uma solicitação via HTTP ao servidor. O servidor localiza o recurso e comunica a representação do estado dele na resposta ao usuário através do mesmo protocolo. E são essas representações que podem ser feitas em diversos formatos.

## 2. Características
Assim, para uma API ser considerada RESTful, ela deve serguir as restrições desse padrão. Basicamente são elas:

**2.1 Cliente-Servidor**

Indica uma arquitetura baseada em clientes, servidores e recursos, em que as solicitações são feitas via protocolo HTTP. Essa condição está ligada à independência entre o cliente e o servidor. Ou seja, mudanças feitas pelo usuário na aplicação em seu dispositivo não devem afetar o servidor e sua estrutura de dados. De mesmo modo, alterações feitas pelos desenvolvedores nos bancos de dados da aplicação não devem instantaneamente impactar o dispositivo do usuário.

**2.2 Stateless**

Cada requisição acionada entre a comunicação cliente-servidor deve possuir toda a informação necessária e compreensível para realizar a origem da requisição, não sendo de responsabilidade do servidor armazenar qualquer tipo de contexto. Isso pode gerar alto tráfego de dados e impacto na performance da aplicação, porém pode-se utilizar recursos de cache nesses casos.

**2.3 Cache**

É utilizado para melhorar a performance de comunicação entre aplicações, otimizando o tempo de resposta  na comunicação entre cliente-servidor. É de responsabilidade do servidor controlar as diretivas de cache através do cabeçalho HTTP (HTTP Header).

**2.4 Interface Uniforme**

É a interoperabilidade entre os componentes da arquitetura cliente-servidor. Assim, se faz necessário estabelecer um contrato para a comunicação entre essas partes. Portanto, se faz necessário que:
1. Os recursos solicitados sejam identificáveis e estejam separados das representações enviadas ao cliente;
2. Os recursos possam ser manipulados pelo cliente por meio da representação recebida com informações suficientes para tais ações;
3. As mensagens autodescritivas retornadas ao cliente contenham as informações necessárias para descrever como processá-las.
4. Hipertexto e hipermídia estão disponíveis. Ou seja, após acessar um recurso, o cliente pode usar hiperlinks para encontrar as demais ações disponíveis para ele no momento.

**2.5 Sistema em Camadas**

Cada camada do sistema deve possuir uma funcionalidade específica. Desta forma, cada camada é responsável por uma etapa diferente dos processos de requisção de usuário e de respsota do servidor. Elas são ordenadas hierarquicamente, mas apesar de serem separadas, interagem entre si.

## 3. Conclusão
Portanto, uma API RESTful oferece altos níveis de liberdade e flexibilidade para os desenvolvedores e seus softwares. Seu uso é benéfico principalmente em aplicações em nuvem (servidores cloud). Além da flexibilidade, uma API RESTful tende a utilizar menos largura de banda, tornando o uso da internet mais eficiente. Adicionado a isso, e as suas caracteristicas, podemos citar que essas aplicações possuem maior seguraça e padronização de protocolos.