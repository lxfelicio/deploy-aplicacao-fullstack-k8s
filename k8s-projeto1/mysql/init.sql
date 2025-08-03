-- Cria o banco de dados se não existir
CREATE DATABASE IF NOT EXISTS projeto;

-- Seleciona o banco de dados
USE projeto;

-- Cria a tabela de usuários se não existir
CREATE TABLE IF NOT EXISTS usuarios (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100),
  email VARCHAR(100),
  comentario VARCHAR(255)
);
