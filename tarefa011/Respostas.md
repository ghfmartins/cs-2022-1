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

Programação defensiva refere-se a um conjunto de práticas que garantem que o código saiba gerenciar situações não esperadas, garantindo a disponibilidade do sistema, a integridade dos dados e a saúde da aplicação (e seus envolvidos). É esperado que todo sistema construído é utilizado por alguém. Este alguém pode ser uma pessoa ou um código de terceiro. Toda aplicação possui métodos e classes públicos, destinados a se comunicarem com o mundo externo, portanto, estes são as portas de entrada para seu código, e estão lidando com território desconhecido. Uma maneira inteligente de garantir que o fluxo esperado dos dados seja seguido é validar qualquer dado que seja enviado pelas fontes externas, criando uma barreira de proteção.

> "Nunca confie nos dados inseridos pelo usuário"

Assim, sempre que a sua aplicação recebe dados de uma fonte externa é de extrema importância validar a entrada que chegou, e quando se deparar com valores invalidos, algumas abordagens podem ser utilizadas, como por exemplo, converter para o valor válido mais próximo; retornar um valor padrão para a operação; retornar um código de erro ou simplesmente finalizar a aplicação. Testes também são importantes ferramentas para garantir uma programação mais defensiva. Testes completos por testadores profissionais permitem que um desenvolvedor tenha centenas de horas de uso do produto para encontrar erros antes que o software seja lançado.

Agindo assim, garantiremos que o sistema saiba tratar valores inválidos que ele pode receber eventualmente, validando a integridade dos dados e que os comportamentos inesperados sejam evitados.

Como exemplo podemos citar a seguinte situação. Caso você esteja implementando um cadastro de usuário e precisa validar de o email e o cpf informados são realmente válidos. Nessa situação, podemos criar métodos que validam as regras para um e-mail e um cpf válidos e sempre verificarmos esses dados, gerando um erro caso eles não atendam a estas condições
```
public class Usuário {
  public void cadastrarUsuarios(string name, string email, string cpf) {
    if (!ValidateEmail(email))
      throw new ArgumentException("Email invalido!");
      
    if (!ValidateCpf(cpf))
      throw new ArgumentException("CPF invalido!");
      
    // ...
  }
}
``` 