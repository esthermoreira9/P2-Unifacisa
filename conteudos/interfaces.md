## Interfaces

**Interface** é como uma espécie de molde.
Elas definem quais funções/métodos devem ser implementadas, mas não especificam
como devem ser implementadas.

Para definir uma interface basta trocar a palavra **class** por **interface**
e criar as funções sem o código do corpo.
Interfaces só podem ter variáveis que utilizam o modificador **final**, ou seja, 
variáveis com valores que nunca mudam.

As classes que implementam as interfaces devem implementar todos os métodos contidos
na interface.

No caso das interfaces, em Java, pode existir uma "herança múltipla", ou seja,
uma classe pode implementar mais de uma interface.
Além disso, interfaces também podem herdar outras interfaces. Quando uma 
**interface A** herda uma **interface B**, o que acontece é que todas as
funções existentes (mas não implementadas) em B passam a coexistir em A.
Neste caso, uma classe qualquer que implementar a interface A deve fornecer
implementações para os métodos definidos na interface A e na interface B.

## Pontos importantes sobre Interfaces

1. **Nós jamais conseguiremos instanciar uma Interface**. As interfaces não
contém código funcional, portanto, não sabem executar funções, que é o
principal objetivo de objetos.
2. Todos os métodos de uma interface são, por padrão, **abstract**
(não tem corpo de função) e **public**.
3. Variáveis de interfaces são por padrão **public**, **static** e **final**,
ou seja, são constantes.
