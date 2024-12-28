# Exercício: Trabalhando com `ArrayList` e Classes em Java

Este exercício demonstra o uso da classe `ArrayList` para armazenar objetos personalizados. Aqui, criamos uma lista de pessoas utilizando a classe `Pessoa`, que possui atributos de `nome` e `idade`.

---

## Estrutura do Projeto

O projeto é composto por duas classes:

1. **`Pessoa`**: Representa um modelo com os atributos `nome` e `idade`.
2. **`Principal`**: Classe principal onde a lista de pessoas é manipulada.

---

## Funcionamento

1. **Criação da lista**: Utiliza `ArrayList<Pessoa>` para armazenar objetos do tipo `Pessoa`.
2. **Adição de elementos**: Objetos `Pessoa` são instanciados, configurados e adicionados à lista.
3. **Manipulação e exibição**:
   - A quantidade de elementos na lista é exibida com o método `size()`.
   - O primeiro elemento da lista é acessado com o método `get(0)`.
   - A lista completa é exibida utilizando o método sobrescrito `toString()`.

---

## Exemplo de Saída no Console

```plaintext
Quantidade de pessoas na lista: 3
Primeiro nome da lista: João
[Nome: João e idade: 25, Nome: Márcia e idade: 12, Nome: Jean e idade: 19]
