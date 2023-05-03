<h1>Crie uma Agenda.</h1>

<h3>A agenda deve inserir na tabela Registro. A tabela deve ser criada com o seguinte create: </h3>

> CREATE TABLE REGISTRO (
> 
> id INTEGER not NULL,
> 
> nome VARCHAR(255),
> 
> sobrenome VARCHAR(255),  
> 
> idade INTEGER,
> 
> PRIMARY KEY ( id )) 

**Devem existir as seguintes operações:**

- *Adicionar contato;*
- *Excluir contato;*
- *Listar contatos;*
- *Pesquisar contato por nome;*

**O programa deve ter um menu, que possibilite que o usuário informe a operação desejada e insira os valores dinamicamente e tenha opção de visualizar os resultados.**

*Exemplo consulta por nome:*

> SELECT * FROM REGISTRO WHERE NOME LIKE 'Mateus'

