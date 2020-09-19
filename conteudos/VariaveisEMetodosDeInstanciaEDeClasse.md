# Variáveis e Métodos de Instância e de Classe

## Váriaveis de Instância e de Classe

Instânciar um objeto de determinada classe significa simplesmente criar um objeto daquela classe.

Na programação orientada a objetos, temos dois tipos de variáveis: as variáveis de instância, e as variáveis de classe.

Toda vez que usamos a palavra reservada *new* junto com um construtor, um objeto vai ser criado e todo objeto criado tem consigo variáveis de Instância.

As váriaveis de instância são os atributos que cada objeto carrega consigo.
Toda variável que é declarada (sem usar a palavra reservada *static*) é uma variável de instância.

Existem também as variáveis de classe que não pertecem ao contexto do objeto e independem da existência de objetos.

Para criar uma variável de classe é necessário apenas declará-la como **static**.
Além disso é considerado boa prática e recomendado que se use o nome da classe para referenciar variáveis estáticas.


## Métodos de Instância e de Classe

Aos Métodos se aplica a mesma lógica, Métodos de Instância pertencem aos objetos e, portanto, só podem ser executados sobre um objeto, depois que ele for criado.
Métodos estáticos pertecem a Classe e, portanto, não dependem da existencia de um objeto para serem executados.

