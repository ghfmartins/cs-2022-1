### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
  git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
    Exibe informações de ajuda sobre o Git.

  b. git help checkout
    Acessa a pagina do manual do git sobre a função de checkout.

  c. git help merge
    Acessa a pagina do manual do git sobre a função de merge.

  d. git init
    Cria um novo repositório do Git.

  e. git add --all
    Adiciona ao staging as mudanças de todos os arquivos rastreados ou não pelo git.

  f. git add -u
    Atualiza no staging todos os arquivos rastreados pelo git.

  g. git config -l
    Utilizado para alterar o arquivo .gitconfig e só pode ser executado como administrador do sistema.

  h. git mv a.txt b.txt
    Renomeia o arquivo a.txt para b.txt

  i. git reset --hard
    Redefine o indice e a árvore de trabalho. Quaisquer alterações nos arquvos rastreados na árvore de trabalho após o último commit serão descartados.
  
  j. git log -27
    Exibe os registros do log do commit de id 27

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
  "git add ." e "git commit -m 'mensagem'"

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
  git diff

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
  git status

6. Qual o comando para efetuar um _commit_?
  git commit -m "descrição do commit"

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
  git clean

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
  Este diretório deve ter o seu caminho adicionado no arquivo .gitignore que encontramos na raiz do diretório.

9. O que acontece se o seu repositório local for acidentalmente removido?
  Todas as alterações que houveram sido commitas e feito um pull request para a o repositório remoto serão perdidos.

10. Como clonar um repositório remoto?
  git clone <"url do respotório remoto">

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
  git log origin..HEAD --oneline

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
.git/config

13. Qual o comando para criar um repositório local?
  git init

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
  é o mesmo que o nome do diretório raiz

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
  git add <file>

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
  SHA significa secure hash algorithm e é uma forma de embaralhar um arquivo para gerar um conjunto de caracteres identificadores. Eles são utilizados para individualizar um commit e sempre que um arquivo for modificado um hash diferente será gerado. Se voltar ao que era antes, o mesmo hash de antes será criado.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
  HEAD

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
  Não, por que esse comando apenas monitora os arquivos que ja eram rastreados e sofreram alguma atualização.

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
Após a execução destes dois comandos o que acontecerá é que o último commit será revertido e todas as alterações feitas nele serão removidas do repositório.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?


21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
  .gitignore

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
  Devemos inserir no arquivo .gitignore a indicação para esse arquivo *.class


23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando **git shortlog -sne**?
  Trouxe as lista de todos os contribuidores do projeto.

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
  Trouxe o endereço dos repositórios remotos.

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
  git tag

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
  git tag --list '2.0'

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
  Cria uma tag versão 3.4-gold com a descrição "minha versão ouro".

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
  Exibe a tag criada com a indentificação 3.4-gold

30. O que o comando **git push origin 3.4-gold** teria como efeito?
  Envia a tag criada para o repositório remoto.

31. Após executar um commit, qual o efeito de **git commit --amend**?
  É uma forma de se alterar o commit mais recente.

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
  Ele irá resetar para a versão do arquivo x.txt presente no head.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
  Irá mudar para a última versão do arquivo a.txt comitada.

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
  git reset HEAD a.txt vai fazer com que o arquivos editados que foram adicionados para o stage fiquem untracked. Já o git checkout -- a.txt vai fazer a modificação no arquivo seja descartada.


35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.

</DIV/>
