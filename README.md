# Especificação - Ticket Machine

**Autor:** Calebe de Paula Bianchini

## 1. Requisitos

As estações de trem frequentemente fornecem máquinas de vender bilhetes que imprimem um bilhete quando um cliente insere a quantia correta para pagar a passagem. As máquinas mantêm uma soma total da quantidade de dinheiro que coletou durante toda sua operação.

### 1.1 Catálogo dos Atores

| Ator    | Descrição                      |
|---------|--------------------------------|
| Cliente | Usuário da máquina de vender bilhetes. |

### 1.2 Diagrama dos Casos de Uso

*(Inserir imagem do diagrama de casos de uso aqui)*

### 1.3 Especificação dos Casos de Uso

#### 1.3.1 CSU01 – Inserir Dinheiro

- **Identificador:** CSU01
- **Nome:** Inserir Dinheiro
- **Atores:** Cliente
- **Sumário:** Uma quantia de dinheiro é inserida na máquina. É importante ressaltar que essa quantia sempre é representada por uma única nota de papel-moeda.
- **Complexidade:** Médio
- **Regras de Negócio:** N/D
- **Pré-condições:** N/D
- **Pós-condição:** O valor inserido é adicionado ao saldo total disponível.
- **Pontos de Inclusão:** N/D
- **Pontos de Extensão:** N/D

##### Fluxo Principal

| Ações do Ator                           | Ações do Sistema                                                  |
|-----------------------------------------|-------------------------------------------------------------------|
| 1. O Cliente insere uma nota de papel-moeda. | 2. O Sistema mostra uma mensagem informando para o Cliente aguardar alguns instantes. |
|                                         | 3. O Sistema valida a nota de papel-moeda inserida.                |
|                                         | 4. O Sistema adiciona o valor ao saldo disponível.                 |
|                                         | 5. O Sistema informa que a nota de papel-moeda foi aceita.         |
|                                         | 6. O Sistema informa o saldo atual. Caso de Uso é encerrado.       |

##### Fluxo de Exceção 1: Nota de Papel-moeda Inválida

| Ações do Ator                           | Ações do Sistema                                                  |
|-----------------------------------------|-------------------------------------------------------------------|
|                                         | 1. O Sistema devolve a nota de papel-moeda.                       |
|                                         | 2. Enquanto o Cliente não retirar a nota de papel-moeda, o Sistema informa que a nota é inválida. |
| 3. O Cliente retira a nota de papel-moeda. | 4. Volta ao passo 6 do Fluxo Principal.                           |

#### 1.3.2 CSU02 – Solicitar Bilhete

- **Identificador:** CSU02
- **Nome:** Solicitar Bilhete
- **Atores:** Cliente
- **Sumário:** Um único bilhete de transporte é impresso.
- **Complexidade:** Fácil
- **Regras de Negócio:** N/D
- **Pré-condições:** N/D
- **Pós-condição:** Um bilhete é impresso e seu valor é debitado do saldo disponível.
- **Pontos de Inclusão:** N/D
- **Pontos de Extensão:** N/D

##### Fluxo Principal

| Ações do Ator                           | Ações do Sistema                                                  |
|-----------------------------------------|-------------------------------------------------------------------|
| 1. O Cliente solicita impressão do bilhete de transporte. | 2. O Sistema verifica o saldo e emite o bilhete.                    |
|                                         | 3. O Sistema informa o saldo atual. Caso de Uso é encerrado.       |

##### Fluxo de Exceção 1: Saldo Insuficiente

| Ações do Ator                           | Ações do Sistema                                                  |
|-----------------------------------------|-------------------------------------------------------------------|
|                                         | 1. O Sistema informa que o saldo é insuficiente.                  |
|                                         | 2. Volta ao passo 3 do Fluxo Principal.                           |

#### 1.3.3 CSU03 – Solicitar Troco

- **Identificador:** CSU03
- **Nome:** Solicitar Troco
- **Atores:** Cliente
- **Sumário:** O troco é devolvido. Vale ressaltar que o troco também é em nota de papel-moeda.
- **Complexidade:** Fácil
- **Regras de Negócio:** N/D
- **Pré-condições:** N/D
- **Pós-condição:** O valor em nota de papel-moeda é devolvido e o saldo disponível é zerado.
- **Pontos de Inclusão:** N/D
- **Pontos de Extensão:** N/D

##### Fluxo Principal

| Ações do Ator                           | Ações do Sistema                                                  |
|-----------------------------------------|-------------------------------------------------------------------|
| 1. O Cliente solicita devolução do saldo restante como troco. | 2. O Sistema verifica o saldo e devolve a quantidade do saldo em notas de papel-moeda. |
|                                         | 3. O Sistema zera o valor do saldo.                               |
|                                         | 4. O Sistema informa o saldo atual. Caso de Uso é encerrado.       |
