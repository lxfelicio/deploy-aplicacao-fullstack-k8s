const form = document.getElementById('formulario'); // Seleciona o formulário

// Adiciona um evento de submit ao formulário
form.addEventListener('submit', async (e) => {
  e.preventDefault(); // Previne o comportamento padrão do formulário

  // Coleta os dados do formulário
  const body = {
    nome: document.getElementById('nome').value,
    email: document.getElementById('email').value,
    comentario: document.getElementById('comentario').value
  };

  // Envia os dados para o backend via POST
  await fetch("http://backend:8080/api/usuarios", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(body) // Converte o objeto em JSON
  });

  alert("Dados enviados!"); // Alerta de sucesso
  form.reset(); // Reseta o formulário
});
