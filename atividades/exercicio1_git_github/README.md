# OO Exercício 1 Git/GitHub
Exercício sobre comandos básicos do Git e sobre GitHub.


## Comandos básicos
### `git init`
Cria um repositório git no diretório local. Além disso cria um subdiretório `.git` onde 
serão armazenadas e rastreadas as mudanças.

### `git clone`
Faz uma cópia de um repositório remoto na máquina local.

### `git branch`
Lista as branches existentes no repositório local indicando a working branch.

### `git checkout`
Muda a working branch para a branch alvo. 

### `git fetch`
Verifica se há alterações recentes no repositório remoto.

### `git pull`
Baixa e funde as alterações do repositório remoto para o repositório local.

### `git add`
Adiciona uma alteração de código na área de staging. Serve também para 
adicionar arquivos ao rastreamento do Git.

### `git commit`
Cria um ponto na história do repositório com as alterações que estava na área de staging.

### `git push`
Empurra todas as alterações até último commit de uma determinada branch para um repositório 
remoto.

## Diferença entre `git fetch` e `git pull`
Os dois comandos baixam conteúdo novo de um repositório remoto.

`git fetch` é só uma olhadinha na versão mais atual do repositório remoto, mas não altera nenhuma das branches no repositório local
nem faz merge.

`git pull` é fetch seguido de um `git merge FETCH_HEAD`.

---
#### Referências
- [Comandos Git](https://github.com/yudi-azvd/tutorial-git-github-basico/blob/master/conteudo/parte-2.md#comandos-git)
- [What is the difference between 'git pull' and 'git fetch'?](https://stackoverflow.com/questions/292357/what-is-the-difference-between-git-pull-and-git-fetch)
- [GIT: FETCH AND MERGE, DON’T PULL](https://longair.net/blog/2009/04/16/git-fetch-and-merge/)
