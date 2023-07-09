import "./styles.css";

function Titulo({ titulo }) {
  return <h1>{titulo}</h1>;
}

function MensagensRecebidas({ mensagem }) {
  return (
    <div id="mensagemRecebida" class="mensagem">
      {mensagem}
      <button class="botao-drop-1">
        <svg
          class="svg-icone-drop"
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 512 512"
        >
          <path d="M233.4 406.6c12.5 12.5 32.8 12.5 45.3 0l192-192c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L256 338.7 86.6 169.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l192 192z" />
        </svg>
      </button>
      <span>
        <svg
          class="span-svg-check-azul"
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 512 512"
        >
          <path d="M374.6 86.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L192 178.7l-57.4-57.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l80 80c12.5 12.5 32.8 12.5 45.3 0l160-160zm96 128c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L192 402.7 86.6 297.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l128 128c12.5 12.5 32.8 12.5 45.3 0l256-256z" />
        </svg>
      </span>
    </div>
  );
}

function MensagensEnviadas({ mensagem }) {
  return (
    <div id="mensagemEnviada" class="mensagem">
      {mensagem}
      <button class="botao-drop-2">
        <svg
          class="svg-icone-drop"
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 512 512"
        >
          <path d="M233.4 406.6c12.5 12.5 32.8 12.5 45.3 0l192-192c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L256 338.7 86.6 169.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l192 192z" />
        </svg>
      </button>
      <span>
        <svg
          class="span-svg-check-cinza"
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 512 512"
        >
          <path d="M374.6 86.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L192 178.7l-57.4-57.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l80 80c12.5 12.5 32.8 12.5 45.3 0l160-160zm96 128c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L192 402.7 86.6 297.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l128 128c12.5 12.5 32.8 12.5 45.3 0l256-256z" />
        </svg>
      </span>
    </div>
  );
}

export default function App() {
  const Recebidas = ["Oi...", "Tu não me ama mais?"];
  const Enviadas = ["Oi, boa Tarde.", "Quem é você mesmo?"];

  return (
    <div className="App">
      <Titulo titulo="Meu Chat" />

      <button id="botao-tres-pontos-opcao">
        <svg
          id="svg-icone-tres-pontos-opcao"
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 128 512"
        >
          <path d="M64 360a56 56 0 1 0 0 112 56 56 0 1 0 0-112zm0-160a56 56 0 1 0 0 112 56 56 0 1 0 0-112zM120 96A56 56 0 1 0 8 96a56 56 0 1 0 112 0z" />
        </svg>
      </button>

      {Recebidas.map((m) => (
        <MensagensRecebidas mensagem={m} />
      ))}

      {Enviadas.map((m) => (
        <MensagensEnviadas mensagem={m} />
      ))}
    </div>
  );
}
