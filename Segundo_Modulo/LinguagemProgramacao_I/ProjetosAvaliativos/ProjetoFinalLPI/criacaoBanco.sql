CREATE TABLE "PUBLIC".chave (
    id                   varchar(35)   NOT NULL,
    valor                integer   NOT NULL,
    CONSTRAINT pk_chave_id PRIMARY KEY ( id )
 );
CREATE TABLE "PUBLIC".funcionario (
    id                   integer   NOT NULL,
    nome                 varchar(45)   NOT NULL,
    CONSTRAINT pk_funcionario_id PRIMARY KEY ( id )
 );
CREATE TABLE "PUBLIC".restaurante (
    id                   integer   NOT NULL,
    nome                 varchar(45)   NOT NULL,
    CONSTRAINT pk_restaurante_id PRIMARY KEY ( id )
 );
CREATE TABLE "PUBLIC".voto (
    id                   integer   NOT NULL,
    data                 date   NOT NULL,
    id_funcionario       integer   NOT NULL,
    id_restaurante       integer   NOT NULL,
    CONSTRAINT pk_voto_id PRIMARY KEY ( id ),
    CONSTRAINT unq_voto_pessoa_data UNIQUE ( data, id_funcionario )
 );
ALTER TABLE "PUBLIC".voto ADD CONSTRAINT fk_voto_restaurante FOREIGN KEY ( id_restaurante ) REFERENCES "PUBLIC".restaurante( id ) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "PUBLIC".voto ADD CONSTRAINT fk_voto_funcionario FOREIGN KEY ( id_funcionario ) REFERENCES "PUBLIC".funcionario( id ) ON DELETE NO ACTION ON UPDATE NO ACTION;