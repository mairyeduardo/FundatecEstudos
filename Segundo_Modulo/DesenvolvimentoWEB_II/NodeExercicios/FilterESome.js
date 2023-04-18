const publicacoes = [
    {
      nome: 'gameplayrg',
      titulo: 'capcon cancela re9',
      tags: ['news', 'resident evil', 'nostalgia'],
    },
    {
      nome: 'gatosfotos',
      titulo: 'gatos são melhores q cachorro',
      tags: ['fofinhos', 'familia'],
    },
    {
      nome: 'gameplayrg',
      titulo: 're 2 será refeito',
      tags: ['games', 'nostalgia'],
    },
  ];
  
  //percorrer o array de publicacoes
  //para cada objeto Publicacao
  //verificar se não possui uma tag "resident evil"
  //se eu nao tiver, adiciono no array
  //se eu tiver, não adiciono no array
  
  function _filtrarDiferenteDe(_tag) {
    const novoArray = [];
    for (let i = 0; i < publicacoes.length; i++) {
      const publicacao = publicacoes[i];
      const tags = publicacao.tags;
      let possuiRE = false;
      for (let j = 0; j < tags.length; j++) {
        const tag = tags[j];
        if (tag == _tag) {
          possuiRE = true;
        }
      }
      if (possuiRE === false) {
        novoArray.push(publicacao);
      }
    }
    return novoArray;
  }
  
  //usando o forEach
  function __filtrarDiferenteDe(_tag) {
    const novoArray = [];
    publicacoes.forEach((publicacao) => {
      let possuiRE = false;
      publicacao.tags.forEach((tag) => {
        if (tag == _tag) possuiRE = true;
      });
      if (!possuiRE) novoArray.push(publicacao);
    });
    return novoArray;
  }
  
  // usando um callback customizado como parametro
  function __filtrarDiferenteDe(fn) {
    const novoArray = [];
    publicacoes.forEach((publicacao) => {
      if (fn(publicacao.tags)) novoArray.push(publicacao);
    });
    return novoArray;
  }
  
  // const array = filtrarDiferenteDe(tags => {
  //     let possuiRE = false;
  //     tags.forEach(tag => {
  //         if(tag == 'resident evil') possuiRE = true
  //     })
  //     return !possuiRE;
  // })
  
  //utilizando o método some
  // usando um callback customizado como parametro
  function ___filtrarDiferenteDe(_tag) {
    const novoArray = [];
    publicacoes.forEach((publicacao) => {
      // se pelo menos alguma é igual a
      if (!publicacao.tags.some((tag) => tag === _tag))
        novoArray.push(publicacao);
    });
    return novoArray;
  }
  
  // utilizando o filter
  function filtrarDiferenteDe(_tag) {
    return publicacoes.filter(
      (publicacao) => !publicacao.tags.some((tag) => tag === _tag)
    );
  }
  
  const array = filtrarDiferenteDe('resident evil');
  
  console.log(array);
  