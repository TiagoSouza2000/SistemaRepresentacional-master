create database mca;
use  mca;
CREATE TABLE aluno (
    aluno_cod int PRIMARY KEY,
    aluno_nome varchar (100 ),
    aluno_dt_nasc DATE,
     aluno_curso varchar (100 ),
    aluno_fase varchar (1 ),


);

CREATE TABLE login (
    log_seq int PRIMARY KEY,
    log_nome varchar(30 ),
    log_senha varchar(20 )
);


INSERT INTO LOGIN (LOG_SEQ, LOG_NOME, LOG_SENHA) VALUES ('1', 'teste', 'teste');

select * from login