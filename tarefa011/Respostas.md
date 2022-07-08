## Padrões de Codificação

A padronização de código é uma prática de desenvolvimento de software extensivamente aceita. A sua necessidade vem da importância de criação de um ambiente altamente colaborativo entre os desenvolvedores. Quando definimos padrões e boas práticas, garantimos que todos da equipe conseguirão ter o mínimo de entendimento do código daquele projeto. Isso facilita os processos de desenvolvimento, retirada de bugs, atividades de validação e manutenção. Em consequência, há um aumento da produtividade do projeto como um todo. Existem várias sugestões de padrões, mas é normal cada empresa adotar seus próprios padrões.

Os padrões de codificação trazem regras a respeito de como descrever comentários, realizar a identação e utilizar espaços em brancos dentro de um código. Também possuímos as convenções de nomenclatura, onde cada contexto deve ser nomeado seguindo algumas regras. Existem alguns padrões bem conhecidos e bastante utilizados como, por exemplo, o CamelCase. Como o nome já deixa bem claro, o CamelCase define a prática de escrever as palavras compostas ou frases, onde cada palavra é iniciada com maiúsculas e unidas sem espaços. Outro caso onde pode-se obter um padrão de codificação é na organização de arquivos. Isto inclui a convenção de nomenclatura de arquivos e como os arquivos serão organizados no sistema de arquivos.

Como exemplo podemos citar um dos padrões que é mais comum de se encontrar são os que definem regras para a nomeclatura de constantes váriáveis e métodos. Para constantes o mais comum é definição que elas devem ser nomeadas utilizando todas as letras em caixa alta. Já Os nomes de variáveis devem estar com uma primeira letra minúscula e, em caso de nomes compostos, com a primeira letra de cada palavra interna em maiúsculo. Os métodos seguem as seguintes regras: Os nomes dos métodos devem ser verbos, em casos compostos com o primeiro nome minúsculo, e com a primeira letra de cada palavra interna em maiúsculo. 

Exemplos
```
//Constantes
    COR_PADRAO = "Preto";

//Variável
    primeiroNome = "Gustavo";

//Método
    calcularArea(int x, int y);
```
---
## Reflexão

Na ciência da computação, reflexão é a capacidade de um programa de computador de examinar, introspectar e modificar sua própria estrutura e comportamento em tempo de execução. Em linguagens de programação orientadas a objetos, a reflexão permite a inspeção de classes, interfaces, campos e métodos em tempo de execução sem saber os nomes das interfaces, campos, métodos em tempo de compilação. Também permite a instanciação de novos objetos e invocação de métodos.

Assim, podemos citar como os principais usos para  reflexão os seguintes casos:
- A Reflexão é tradicionalmente usado para carregar módulos/classes do assembly e criar uma instância deles, em tempo de execução.
- Para obter os atributos públicos de um objeto.
- Durante o teste, criando objetos simulados durante a inicialização do tempo de execução.
- Para criar bibliotecas genéricas para lidar com diferentes formatos sem reimplantações, às vezes referidas, ou usando Ligação tardia implícita.
- Ao construir novos tipos em tempo de execução.
- Para examinar e instanciar tipos em um assembly.
- A capacidade de alterar o valor de um campo marcado como privado em uma biblioteca de terceiros.

Como exemplo de reflexão podemos citar o caso de quando queremos saber o tipo de uma váriavel que foi definido em tempo de execução.

```
int i = 42;  
System.Type type = i.GetType();  
System.Console.WriteLine(type);
```
A saída no console será:
```
> System.Int32
```
----
## Programação Defensiva

