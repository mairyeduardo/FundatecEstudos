Considere o array filmes declarado abaixo. 

```jsx
const filmes = [
  {
    nome: 'O Senhor do Aneis: A Sociedade do Anel',
    lancamento: 2002,
		oscar: true,
    diretores: ['Peter Jackson'],
    generos: ['Fantasia', 'Aventura'],
  },
  {
    nome: 'Harry Potter e a Pedra Filosofal',
    lancamento: 2001,
		oscar: true,
    diretores: ['Chris Columbus'],
    generos: ['Fantasia'],
  },
  {
    nome: 'Matrix',
		oscar: true,
    lancamento: 1999,
    diretores: ['Lana Wachowski', 'Lilly Wachowski'],
    generos: ['Ação', 'Ficção Cientifica'],
  },
	{
    nome: 'Meninas Malvadas',
    oscar: false,
    lancamento: 2004,
    diretores: ['Mark Waters'],
    generos: ['Comédia'],
  }
];

```

🔥 **Enunciado II:** Faça um Component que irá listar todos os filmes que foram ganhadores de Oscar e renderize o título do filme utilizando uma tag `h2`.
