## README - Sistema de Cadastro de Membros da Comunidade Escolar

###  Descrição

Este é um sistema simples em Java que permite o cadastro de diferentes tipos de membros da comunidade escolar: **Aluno**, **Professor** e **Técnico-Administrativo**.

Utiliza os principais pilares da Programação Orientada a Objetos (POO):

- **Encapsulamento:** todos os atributos são privados e acessados via getters/setters.
- **Herança:** as classes `Aluno`, `Professor` e `TecnicoAdministrativo` estendem a classe abstrata `Pessoa`.
- **Abstração:** a classe `Pessoa` define a estrutura genérica de um membro escolar.
- **Polimorfismo:** o método `exibirDados()` é sobrescrito por cada classe derivada.

---

### 🔹 Conceitos de POO aplicados

| Conceito         | Como foi usado                                                                 |
|------------------|---------------------------------------------------------------------------------|
| **Abstração**       | A classe abstrata `Pessoa` define os atributos comuns e obriga `exibirDados()` |
| **Encapsulamento**| Todos os atributos são `private`, acessados por meio de getters e setters        |
| **Herança**         | `Aluno`, `Professor` e `TecnicoAdministrativo` estendem a classe `Pessoa`     |
| **Polimorfismo**   | Métodos `exibirDados()` e `mostrarTurno()` são sobrescritos e chamados polimorficamente |

---

###  Tipos de Membros Cadastrados

- **Aluno:** matrícula, curso, turno
- **Professor:** SIAPE, disciplina, turno
- **Técnico-Administrativo:** setor, cargo, turno

---

###  Funcionalidades

- Cadastro de qualquer número de membros
- Entrada de dados via console
- Impressão de relatório individual para cada membro
- Inclusão do atributo `Turno` para todos os tipos
- O programa reinicia automaticamente após o relatório
- Tratamento de exceções com `try/catch` para evitar erros de entrada
- Utilização de `ArrayList` para armazenar os cadastros dinamicamente

---

###  Exemplo de Saída

```
Quantos membros deseja cadastrar? 2
Selecione o tipo (1 - Aluno, 2 - Professor, 3 - Técnico-Administrativo): 1
Nome: João
Idade: 19
CPF: 123.456.789-00
Matrícula: 2021001
Curso: Análise e desevolvimento de software
Turno: Noite

Cadastro do membro #2
Selecione o tipo (1 - Aluno, 2 - Professor, 3 - Técnico-Administrativo): 2
Nome: Fausto Jose
Idade: 42
CPF: 987.654.321-00
SIAPE: SI45678
Disciplina: Análise e desevolvimento de software
Turno: Noite

=== RELATÓRIO DE MEMBROS CADASTRADOS ===
Aluno:
Nome: João
Idade: 19
CPF: 123.456.789-00
Matrícula: 2021001
Curso:  Análise e desevolvimento de software
Turno: Noite
---------------------------
Professor:
Nome: Fausto Jose
Idade: 42
CPF: 987.654.321-00
SIAPE: SI45678
Disciplina: Análise e desevolvimento de software
Turno: Noite
Deseja realizar outro cadastro? (s/n): n
Encerrando o programa. Até mais!
```

---

###  Como executar

1. Clone o repositório:
   [https://github.com/joaoirineu33/sistema-de-cadastro-de-membros-escolar.git](https://github.com/joaoirineu33/sistema-de-cadastro-de-membros-escolar.git)

2. Abra em uma IDE (como VS Code, IntelliJ ou Eclipse).
3. Compile e execute o arquivo `Main.java`.