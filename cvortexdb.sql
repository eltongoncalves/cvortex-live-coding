-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Tempo de geração: 03/07/2024 às 05:23
-- Versão do servidor: 8.0.38
-- Versão do PHP: 8.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `cvortexdb`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `demanda`
--

CREATE TABLE `demanda` (
  `id` int NOT NULL,
  `id_pessoa` int NOT NULL,
  `agendado_para_pessoa` int DEFAULT NULL,
  `id_unidade_de_negocio` int NOT NULL,
  `fechada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Despejando dados para a tabela `demanda`
--

INSERT INTO `demanda` (`id`, `id_pessoa`, `agendado_para_pessoa`, `id_unidade_de_negocio`, `fechada`) VALUES
(1, 1, 2, 1, 1),
(2, 2, 3, 2, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id` int NOT NULL,
  `id_situacao_pessoa` int NOT NULL,
  `id_unidade_de_negocio` int NOT NULL,
  `nome` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Despejando dados para a tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `id_situacao_pessoa`, `id_unidade_de_negocio`, `nome`) VALUES
(1, 1, 1, 'João'),
(2, 1, 2, 'Maria'),
(3, 2, 1, 'Pedro');

-- --------------------------------------------------------

--
-- Estrutura para tabela `situacao_pessoa`
--

CREATE TABLE `situacao_pessoa` (
  `id` int NOT NULL,
  `nome` varchar(255) NOT NULL,
  `bloqueia_entrega_de_demandas` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Despejando dados para a tabela `situacao_pessoa`
--

INSERT INTO `situacao_pessoa` (`id`, `nome`, `bloqueia_entrega_de_demandas`) VALUES
(1, 'Disponivel', 0),
(2, 'Indisponivel', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `unidade_de_negocio`
--

CREATE TABLE `unidade_de_negocio` (
  `id` int NOT NULL,
  `nome` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Despejando dados para a tabela `unidade_de_negocio`
--

INSERT INTO `unidade_de_negocio` (`id`, `nome`) VALUES
(1, 'Unidade 1'),
(2, 'Unidade 2');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `demanda`
--
ALTER TABLE `demanda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pessoa` (`id_pessoa`),
  ADD KEY `id_unidade_de_negocio` (`id_unidade_de_negocio`),
  ADD KEY `agendado_para_pessoa` (`agendado_para_pessoa`);

--
-- Índices de tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_situacao_pessoa` (`id_situacao_pessoa`),
  ADD KEY `id_unidade_de_negocio` (`id_unidade_de_negocio`);

--
-- Índices de tabela `situacao_pessoa`
--
ALTER TABLE `situacao_pessoa`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `unidade_de_negocio`
--
ALTER TABLE `unidade_de_negocio`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `demanda`
--
ALTER TABLE `demanda`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `situacao_pessoa`
--
ALTER TABLE `situacao_pessoa`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `unidade_de_negocio`
--
ALTER TABLE `unidade_de_negocio`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `demanda`
--
ALTER TABLE `demanda`
  ADD CONSTRAINT `demanda_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id`),
  ADD CONSTRAINT `demanda_ibfk_2` FOREIGN KEY (`id_unidade_de_negocio`) REFERENCES `unidade_de_negocio` (`id`),
  ADD CONSTRAINT `demanda_ibfk_3` FOREIGN KEY (`agendado_para_pessoa`) REFERENCES `pessoa` (`id`);

--
-- Restrições para tabelas `pessoa`
--
ALTER TABLE `pessoa`
  ADD CONSTRAINT `pessoa_ibfk_1` FOREIGN KEY (`id_situacao_pessoa`) REFERENCES `situacao_pessoa` (`id`),
  ADD CONSTRAINT `pessoa_ibfk_2` FOREIGN KEY (`id_unidade_de_negocio`) REFERENCES `unidade_de_negocio` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
