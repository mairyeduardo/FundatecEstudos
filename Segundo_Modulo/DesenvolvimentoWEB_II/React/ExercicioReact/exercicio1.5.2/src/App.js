import { useState } from "react";
import "./styles.css";
import "./tarefa.css";
import "./botao.css";
import { tarefas } from "./tarefas";

function Titulo({ titulo }) {
  return <h1>{titulo}</h1>;
}

function Botao({ descricao, onClick, status }) {
  return (
    <button className={status} onClick={onClick}>
      {descricao}
    </button>
  );
}

function Tarefa(props) {
  return <li className={props.status}>{props.descricao}</li>;
}

export default function App() {
  const botoes = ["pendente", "concluido", "excluida"];
  const [exibir, setExibir] = useState("pendente");
  return (
    <div className="App">
      <Titulo titulo="Minhas Tarefas" />

      {botoes.map((botao) => (
        <Botao
          status={botao}
          descricao={botao}
          onClick={() => setExibir(botao)}
        />
      ))}

      <ul>
        {tarefas
          .filter((tarefa) => tarefa.status === exibir)
          .map((tarefa) => (
            <Tarefa descricao={tarefa.descricao} status={tarefa.status} />
          ))}
      </ul>
    </div>
  );
}
