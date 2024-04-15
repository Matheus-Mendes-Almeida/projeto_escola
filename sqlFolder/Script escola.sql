CREATE DATABASE IF NOT EXISTS escola;

USE escola;

CREATE TABLE IF NOT EXISTS aluno (
	alu_nome VARCHAR(100),
    alu_periodoEscolar INTEGER,
    alu_anoDeIngresso INTEGER,
    
    PRIMARY KEY (alu_nome)
);

CREATE TABLE IF NOT EXISTS professor(
	prof_nome VARCHAR(100),
    prof_formacao VARCHAR(60),
    prof_areaDeAtuacao VARCHAR(60),
    prof_anoDeIngresso INT,
    
    PRIMARY KEY (prof_nome)
);

CREATE TABLE IF NOT EXISTS materia(
	mate_nome VARCHAR(60),
    mate_areaDeConhecimento VARCHAR(60),
    mate_periodoEscolar INT,
    
    PRIMARY KEY (mate_nome)
);