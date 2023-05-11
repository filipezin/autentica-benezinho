# Autentica Benezinho 🤓👍🏾

Checkpoint II - Enterprise Application Development aplicada em 10/05/2023.


| ![](documentacao/fiap.jpg)                      | **Enterprise Application Development** |
|-------------------------------------------------|----------------------------------------|
| **ALUNO:** Filipe Albanes Nobre Santos - 94377 | **TURMA:** 2TDSPI  - 2TDSPJ            |
| **PROFESSOR:** Benefrancis do Nascimento        | 10/05/2023                             |
| **CHECK POINT II**                              | **VALE 10 PONTOS**                     |

# Sumário


[Estudo de caso ](#_Estudo_de_caso)

[O que deverá ser feito? ](#_O_que_devera_ser_feito)

[Diagrama de Classes ](#_Diagrama_de_Classes)

[Correção da Prova ](#_Correcao)

<a id="_Estudo_de_caso"></a>

# Estudo de caso


A Holding Benezinho ![](RackMultipart20230510-1-eptqiz_html_5188b812c34f88e5.png) expandiu muito o seu portifólio de sistemas gerenciados, para prover maior segurança ao acesso dos diversos sistemas da Holding, os arquitetos de software propuseram o desenvolvendo um sistema para gerenciamento de permissões dos sistemas empresariais da Holding Benezinho.

Contratamos você como Engenheiro de Software para ajudar a construir esse sistema.

Na sprint atual, você foi incumbido de fazer:

1. O Mapeamento Objeto Relacional das primeiras classes envolvidas neste projeto de software;

2. A criação automatizada das tabelas no banco de dados Oracle;

3. A persistência de todos os dados, e;

4. A criação de dois métodos capazes de realizar consultas aos Usuários persistidos previamente:

5. Consulta todos os usuários findAll;

6. Consulta usuário pela chave primária findById.


<a id="_O_que_devera_ser_feito"></a>

# O que deverá ser feito?


**Faça o Fork do projeto no github do professor :**

https://github.com/Benefrancis/autentica-benezinho.git

Caso o github esteja indisponível, você deverá pegar o projeto no diretório compartilhado.

**Você deverá:**


1. **(0,5 Ponto)** acessar o arquivo persistence.xml e alterar as configurações da **persistence-unit** para que seja possível conectar-se ao banco de dados Oracle da FIAP com o seu usuário e senha (manter o seu usuário e senha ativo é sua responsabilidade). Não utilize o usuário e senha de outro aluno. Caso tenha problema para autenticar, comunique o professor.

2. **(1,5 Pontos)** adicionar corretamente as anotações JPA na classe **Profile**.
  
   Lembre-se que:

   1. Deverá adicionar uma _ **constraint** _ para que não seja possível ter mais de um Profile com o mesmo **nome** na tabela do banco de dados;
   2. Existe relacionamento **Muitos para Muitos** entre **Profile** e **Role** no atributo roles.

1. **(1 Ponto)** adicionar corretamente as anotações JPA na classe **Role**.

   Lembre-se que:

   1. Deverá adicionar duas **constraint** para que não seja possível ter mais de uma Role com o mesmo **nome** na tabela do banco de dados;
   2. Existe relacionamento **Muitos para Um** entre **Role** e **Sistema** a no atributo sistema.

1. **(2 Pontos)** adicionar corretamente as anotações JPA na classe **User**.

    Lembre-se que:

   1. Deverá adicionar uma _constraint_ para que não seja possível ter mais de um **User** com o mesmo endereço de **email** na tabela do banco de dados;
   2. Existe relacionamento **Muitos para Um** entre User e Pessoa no atributo pessoa.
   3. Existe relacionamento Muitos para Muitos entre **User** e **Profile** no atributo profiles.

1. **(0,5 Ponto)** adicionar corretamente as anotações JPA na classe **Pessoa**.

    Lembre-se que:

   1. A classe **Pessoa** possui três classes herdeiras:
     
      1. Pessoa Física;
      2. Pessoa Jurídica.

1. **(1 Pontos)** adicionar corretamente as anotações JPA na classe **PessoaFisica**.

    Lembre-se que:

   1. Deverá adicionar uma _ **constraint** _ para que não seja possível ter mais de uma Pessoa Física com o mesmo número de **CPF** na tabela do banco de dados;
   2. Existe relacionamento **Muitos para Muitos** entre **PessoaFisica** e **PessoaFisica** no atributo filhos.

1. **(1 Ponto)** adicionar corretamente as anotações JPA na classe **PessoaJuridica**.

    Lembre-se que:

   1. Deverá adicionar uma _ **constraint** _ para que não seja possível ter mais de uma Pessoa Jurídica com o mesmo número de **CNPJ** na tabela do banco de dados;
   2. Existe relacionamento **Muitos para Muitos** entre **PessoaJuridica** e **Pessoa** no atributo socios.

1. **(1,5 Pontos)** adicionar corretamente as anotações JPA na classe **Sistema**.

    Lembre-se que:

   1. Deverá adicionar uma _ **constraint** _ para que não seja possível ter mais de um Sistema com a mesma **Sigla** na tabela do banco de dados;
   2. Existe relacionamento **Muitos para Muitos** entre **Sistema** e **Pessoa** no atributo responsáveis.

1. **(0,5 Ponto)** criar um método capaz de consultar um **Usuario** pelo seu identificador na correspondente tabela no banco de dados;

1. **(0,5 Ponto)** criar um método capaz de consultar todos os **Usuarios** na correspondente tabela no banco de dados;



<a id="_Diagrama_de_Classes"></a>

# Diagrama de Classes

<img src="documentacao/classes.png">


<a id="_Correcao"></a>

# Correção da Prova

A correção da prova será disponibilizada no github do professor (branch correcao):

Para acessar digite no prompt:

```shell
git clone https://github.com/Benefrancis/autentica-benezinho.git && cd autentica-benezinho && git checkout correcao
```

A prova é individual, em caso de fraude de qualquer tipo todos os envolvidos receberão nota ZERO.

Boa prova.