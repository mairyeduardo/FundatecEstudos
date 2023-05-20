export function Card({ nome, lancamento, oscar, diretores, generos }) {
    return (
      <div class="card">
        <h4>{nome}</h4>
        <p>{lancamento}</p>
        <ul>
          {
            diretores.map(diretor => (
              <li>{diretor}</li>
            ))
          }
        </ul>
        <h4>{generos}</h4>
        <h4>{oscar}</h4>
      </div>
    )
  }