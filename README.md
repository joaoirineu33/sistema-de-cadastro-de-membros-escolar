## README - Sistema de Cadastro de Membros da Comunidade Escolar

###  Descrição

Este é um sistema simples em Java que permite:

- O cadastro de diferentes tipos de membros da comunidade escolar: **Aluno**, **Professor** e **Técnico-Administrativo**.
- E também o controle de consumo de um **Cilindro de Gás**, com tratamento de exceção personalizada para consumo excedente.


Utiliza os principais pilares da Programação Orientada a Objetos (POO):

- **Encapsulamento:** todos os atributos são privados e acessados via getters/setters.
- **Herança:** as classes `Aluno`, `Professor` e `TecnicoAdministrativo` estendem a classe abstrata `Pessoa`.
- **Abstração:** a classe `Pessoa` define a estrutura genérica de um membro escolar.
- **Polimorfismo:** o método `exibirDados()` é sobrescrito por cada classe derivada.

---

### 🔹 Conceitos de POO aplicados

| Conceito           | Como foi usado                                                                                                 |
|--------------------|----------------------------------------------------------------------------------------------------------------|
| **Abstração**      | A classe abstrata `Pessoa` e a modelagem do `CilindroGas`                                                    |
| **Encapsulamento** | Todos os atributos são `private`, acessados por meio de getters e setters                                     |
| **Herança**        | `Aluno`, `Professor` e `TecnicoAdministrativo` estendem a classe `Pessoa`                                    |
| **Polimorfismo**   | Métodos `exibirDados()` e `mostrarTurno()` são sobrescritos nas classes derivadas                             |
| **Exceção Customizada** | Implementação de `ConsumoExcedenteException` para controle de regras no consumo de gás                      |

---


###  Tipos de Membros Cadastrados

- **Aluno:** matrícula, curso, turno
- **Professor:** SIAPE, disciplina, turno
- **Técnico-Administrativo:** setor, cargo, turno

---

### 🛠️ Funcionalidades

- Cadastro de qualquer número de membros
- Entrada de dados via console
- Impressão de relatório individual para cada membro
- Inclusão do atributo `Turno` para todos os tipos
- Controle de um **Cilindro de Gás** com:
  - Registro de consumo
  - Validação contra consumo excedente
  - Lançamento da exceção `ConsumoExcedenteException` se tentar consumir além da capacidade atual
- Tratamento de exceções com `try/catch`
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
###  Funcionalidade Extra — Controle de Cilindro de Gás

- O cilindro tem:
  - **capacidadeMaxima**
  - **capacidadeAtual**
  - **qtdeUltimoConsumo**
- Método principal:
  - `registrarConsumo(int quantidade)` atualiza o consumo.
- Se tentar consumir mais do que a **capacidadeAtual**, dispara a exceção personalizada **`ConsumoExcedenteException`**.
---

###  Exemplo de Saída
```
 CONTROLE DE CILINDRO DE GÁS   
 Cilindro criado:
→ capacidadeMaxima = 50
→ capacidadeAtual = 50
→ qtdeUltimoConsumo = 0

--------------------------------------------------------

Registro de consumo:
✔ Consumo de 10 unidades
→ capacidadeAtual = 40
→ qtdeUltimoConsumo = 10

Registro de consumo:
✔ Consumo de 5 unidades
→ capacidadeAtual = 35
→ qtdeUltimoConsumo = 5

Registro de consumo:
✖ Tentativa de consumir 40 unidades
→ ERRO: Consumo de 40 excede a capacidade atual de 35 unidades.

--------------------------------------------------------

🔸 Estado final do cilindro:
→ capacidadeMaxima = 50
→ capacidadeAtual = 35
→ qtdeUltimoConsumo = 5

+------------------------------------------------------+
```

---
###  Como executar

1. Clone o repositório:
   [https://github.com/joaoirineu33/sistema-de-cadastro-de-membros-escolar.git](https://github.com/joaoirineu33/sistema-de-cadastro-de-membros-escolar.git)

2. Abra em uma IDE (como VS Code, IntelliJ ou Eclipse).
3. Compile e execute o arquivo `Main.java`.