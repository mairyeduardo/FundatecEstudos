const usuario = {
    nome: "lucas",
    idade: 22
}

const questionarios = [
    {
        titulo: "Questionario Adoção de animais",
        tipo: "checkbox",
        pergunta: "Você possui que tipos de animais em sua casa?",
        opcoes: ["cachorro", "tartaruga", "gato", "passarinho"],
        resposta: ["cachorro", "gato"]
    },
    {
        titulo: "Questionario Objetivo do futuro",
        tipo: "radio",
        pergunta: "Qual a profissão dos seus sonhos?",
        opcoes: ["bombeiro", "policial", "medico"],
        resposta: ["bombeiro"]
    },
    {
        titulo: "Questionario Politico",
        tipo: "texto",
        pergunta: "O que você pensa do atual governo do pais?",
        resposta: "Muita coisa"
    }

];

function buscartipo(buscar) {
    return questionarios.filter((questionario) => questionario.tipo === buscar);
}

console.log('Nome = ' + usuario.nome + ', Idade = ' + usuario.idade)

const questionario = buscartipo("radio")
console.log(questionario);