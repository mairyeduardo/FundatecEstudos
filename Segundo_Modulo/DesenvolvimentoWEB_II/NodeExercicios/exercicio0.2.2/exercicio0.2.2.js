const usuario = {
    nome: "lucas",
    idade: 22,
    resposta: [
        {
            descricao: "Você possui que tipos de animais em sua casa?",
            valores: ["cachorro", "gato"]
        },
        {
            descricao: "Qual a profissão dos seus sonhos?",
            valor: "bombeiro"
        },
        {
            descricao: "O que você pensa do atual governo do pais?",
            valor: "Muita coisa"
        }

    ]
}

const questionarios = [
    {
        idTitulo: "Questionario Adoção de animais",
        tipo: "checkbox",
        pergunta: "Você possui que tipos de animais em sua casa?",
        opcoes: [
            {
                id: '1',
                descricao: "cachorro"
            },
            {
                id: '2',
                descricao: "tartaruga"
            },
            {
                id: '3',
                descricao: "gato"
            },
            {
                id: '4',
                descricao: "passarinho"
            }
        ],
    },
    {
        idTitulo: "Questionario Objetivo do futuro",
        tipo: "radio",
        pergunta: "Qual a profissão dos seus sonhos?",
        opcoes: [
            {
                id: '1',
                descricao: 'bombeiro'
            },
            {
                id: '2',
                descricao: "policial"
            },
            {
                id: '3',
                descricao: "medico"
            }
        ],
    },
    {
        idTitulo: "Questionario Politico",
        tipo: "texto",
        pergunta: "O que você pensa do atual governo do pais?",
    }

];

function buscartipo(buscar) {
    return questionarios.filter((questionario) => questionario.tipo === buscar);
}

console.log(JSON.stringify(usuario, null, Infinity))
const questionario = buscartipo("radio")
console.log(JSON.stringify(questionario, null, Infinity)); 