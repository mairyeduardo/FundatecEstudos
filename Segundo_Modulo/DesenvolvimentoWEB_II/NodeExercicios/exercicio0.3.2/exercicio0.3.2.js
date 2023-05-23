const tarefas = [
    {
        titulo: 'Passear com o cachorro',
        concluida: false,
        dias: 10,
    },
    {
        titulo: 'Comprar leite',
        concluida: false,
        dias: 5,
    },
    {
        titulo: 'Lavar louça',
        concluida: true,
        dias: 60,
    }
] 

const tarefasConcluidas = tarefas.filter(tarefa => tarefa.concluida == true);
console.log(tarefasConcluidas)

const tarefasNaoConcluidas  = tarefas.filter(tarefa => !tarefa.concluida).length;
console.log(tarefasNaoConcluidas);

const tarefasConcluidasAbaixo30dias = tarefas.some(tarefa => tarefa.concluida && tarefas.dias < 30);
console.log(tarefasConcluidasAbaixo30dias);