# Especificação da Máquina de Venda de Bilhetes

## Requisitos

As estações de trem frequentemente fornecem máquinas de vender bilhetes que imprimem um bilhete quando um cliente insere a quantia correta para pagar a passagem. As máquinas mantêm um registro total da quantidade de dinheiro que coletou durante toda sua operação.

### 1.1 Catálogo dos Atores

| Ator    | Descrição                         |
|---------|-----------------------------------|
| Cliente | Usuário da máquina de venda de bilhetes. |

### 1.2 Diagrama dos Casos de Uso

![image](https://github.com/gbschanz/ticket-machine-ajustado/blob/main/img/diagrama_casos_uso.png)


### 1.3 Especificação dos Casos de Uso

#### CSU01 – Inserir dinheiro

- **Identificador**: CSU01  
- **Nome**: Inserir dinheiro  
- **Atores**: Cliente  
- **Sumário**: Uma quantia de dinheiro é inserida na máquina. Nota-se que essa quantia sempre é representada por uma única nota de papel-moeda.
- **Complexidade**: Média  
- **Regras de Negócio**: N/D  
- **Pré-condições**: O sistema está ligado e pronto para aceitar uma nota de papel-moeda.
- **Pós-condição**: O valor inserido é adicionado ao saldo disponível da máquina.

##### Fluxo Principal:

| Ações do Ator                                | Ações do Sistema                                      |
|----------------------------------------------|------------------------------------------------------|
| 1. O Cliente insere uma nota de papel-moeda. | 2. O Sistema exibe uma mensagem pedindo ao cliente para aguardar. |
|                                              | 3. O Sistema valida a nota de papel-moeda.           |
|                                              | 4. O Sistema adiciona o valor ao saldo disponível.   |
|                                              | 5. O Sistema informa que a nota foi aceita.          |
|                                              | 6. O Sistema exibe o saldo atual e encerra o caso de uso. |

##### Fluxo Alternativo 1: Nota inválida

- **3a.** O Sistema não valida a nota de papel-moeda.

| Ações do Ator                           | Ações do Sistema                                      |
|-----------------------------------------|------------------------------------------------------|
|                                         | 1. O Sistema devolve a nota de papel-moeda.          |
| 1. O Cliente retira a nota.             | 2. O Sistema informa que a nota é inválida.          |
|                                         | 3. O sistema retorna ao passo 6 do fluxo principal.  |

---

#### CSU02 – Solicitar bilhete

- **Identificador**: CSU02  
- **Nome**: Solicitar bilhete  
- **Atores**: Cliente  
- **Sumário**: O cliente solicita a impressão de um bilhete de transporte. O sistema verifica se o saldo disponível é suficiente para cobrir o valor do bilhete, deduz o valor do saldo e imprime o bilhete.
- **Complexidade**: Baixa  
- **Regras de Negócio**: N/D  
- **Pré-condições**: O saldo disponível é suficiente para a compra do bilhete.
- **Pós-condição**: O bilhete é impresso e o valor do bilhete é debitado do saldo disponível.

##### Fluxo Principal:

| Ações do Ator                          | Ações do Sistema                                      |
|----------------------------------------|------------------------------------------------------|
| 1. O Cliente solicita um bilhete.      | 2. O Sistema verifica o saldo disponível.            |
|                                        | 3. O Sistema emite o bilhete e deduz o valor do saldo. |
|                                        | 4. O Sistema exibe o saldo atual e encerra o caso de uso. |

##### Fluxo Alternativo 1: Saldo insuficiente

- **2a.** O saldo disponível é insuficiente para a compra do bilhete.

| Ações do Ator                         | Ações do Sistema                                      |
|---------------------------------------|------------------------------------------------------|
|                                       | 1. O Sistema informa que o saldo é insuficiente.     |
|                                       | 2. O sistema retorna ao passo 4 do fluxo principal.  |

---

#### CSU03 – Solicitar troco

- **Identificador**: CSU03  
- **Nome**: Solicitar troco  
- **Atores**: Cliente  
- **Sumário**: O cliente solicita o troco e o sistema devolve o saldo restante em notas de papel-moeda.
- **Complexidade**: Baixa  
- **Regras de Negócio**: N/D  
- **Pré-condições**: O sistema possui saldo restante a ser devolvido.
- **Pós-condição**: O valor total em dinheiro é devolvido e o saldo disponível é zerado.

##### Fluxo Principal:

| Ações do Ator                          | Ações do Sistema                                      |
|----------------------------------------|------------------------------------------------------|
| 1. O Cliente solicita o troco.         | 2. O Sistema verifica o saldo disponível.            |
|                                        | 3. O Sistema devolve o saldo em notas de papel-moeda. |
|                                        | 4. O Sistema zera o saldo e exibe uma mensagem com o saldo atual. Caso de uso é encerrado. |

##### Fluxo Alternativo 1: Saldo insuficiente para troco

- **2a.** O sistema não possui moeda para realizar o troco

| Ações do Ator                         | Ações do Sistema                                      |
|---------------------------------------|------------------------------------------------------|
|                                       | 1. O Sistema informa que o sistema não possui moeda.     |
|                                       | 2. O sistema retorna ao passo 2 do fluxo principal.  |

---
