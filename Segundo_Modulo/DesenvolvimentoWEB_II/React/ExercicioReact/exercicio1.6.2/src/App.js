import "./styles.css";
import React, { useState } from "react";

function Titulo({ titulo }) {
  return <h1>{titulo}</h1>;
}

export default function App() {
  const [tarefa, setTarefa] = useState("");
  const [tarefas, setTarefas] = useState([]);

  const onAdicionar = (event) => {
    setTarefa(event.target.value);
  };

  const onClick = () => {
    setTarefas([...tarefas, tarefa]);
    setTarefa(""); // Limpa o campo de entrada após adicionar a tarefa
  };

  const onExcluir = (event) => {
    const novasTarefas = [...tarefas];
    novasTarefas.splice(event, 1);
    setTarefas(novasTarefas);
  };

  return (
    <div className="App">
      <Titulo titulo="Lista de Tarefas" />
      <input class="input" value={tarefa} onChange={onAdicionar} />
      <button onClick={onClick}>Adicionar</button>
      <ul>
        {tarefas.map((tarefa, event) => (
          <li class="lista-itens">
            <div class="divisao">{tarefa}</div>
            <button class="botao" onClick={() => onExcluir(event)}>
              Excluir
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}
