# Arrays

A função dos arrays é armazenar um conjuto de valores, que podem ser de tipos primitivos
ou de tipos não-primitivos (classes).

Para percorrer um array é comum o uso *for indexado* ou do *for-each*.

## Arrays Multi-Dimensionais

Existe também a possibilidade de serem criados arrays de arrays, eles podem ser bidimensionais,
tridimensionais e n-dimensionais.

Em um array bidimensional, caso queira acessar algum elemento, basta fornecer o índice da linha
e o índice da coluna desejadas.

## Arrays são Objetos

Portanto, eles tem variáveis, métodos e na comparação com **==**, são comparados os endereços
de memória dos arrays.

Para comparar o conteúdo fazemos uso da classe utilitária de nome Arrays, usando o método
**Arrays.equals(Object o1, Object o2)**

## Exceções

Existem duas exceções mais comuns quando tratamos de arrays, que são: ArrayIndexOutOfBoundsException
e NullPointerException.
  - ArrayIndexOutOfBoundsException: quando você tenta acessar um elemento do array em um índice
    inexistente (ex: índice negativo, ou índice que extrapola o limite do array)
  - NullPointerException: quando você tenta fazer qualquer operação em um objeto (que neste caso é um array)
    mas o objeto não foi instanciado
