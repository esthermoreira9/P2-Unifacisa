# Strings 

O primeiro ponto mais importante a ser falado sobre Strings é que uma String não é um tipo primitivo.
Se prestarmos atenção vamos notar que ela começa com letra maiúscula, que em Java é um indicativo para classes.
E isso é verdade, uma String é uma classe que possui métodos, assim como qualquer outra e na verdade quando criamos uma String nós estamos instanciando um objeto da classe String.

Com o uso de Strings é extremamente comum, os criadores do Java acharam melhor existir uma forma mais rápida e prática de criar Strings, retirando a necessidade da chamada ao construtor e o *new*.

## Métodos da classe String

Por ser uma classe, a String pode ter métodos.
E os pricipais são:

```java
String nome = "Esther Beatriz Moreira";

//charAt(indice)
System.out.println("Iniciais: "+nome.charAt(0)+"."+nome.charAt(11)+"."+nome.charAt(18));

//contains
System.out.println(nome.contains("Esther"));
System.out.println(nome.contains(" "));
System.out.println(nome.contains(" M"));
System.out.println(nome.contains("z"));

//indexOf
System.out.println(nome.indexOf("Beatriz"));
System.out.println(nome.indexOf("o"));

//lastIndexOf
System.out.println(nome.lastIndexOf("e"));

//isEmpty
System.out.println(nome.isEmpty());

//replace
System.out.println(nome.replace("Esther","ESTHER"));
System.out.println(nome);
System.out.println(nome.replace(" ","-"));
System.out.println(nome);

//substring
System.out.println(nome.substring(0,7));

//toLowerCase
System.out.println(nome.toLowerCase());

//toUpperCase
System.out.println(nome.toUpperCase());
```

Cada operação que executamos gera um novo objeto e as alterações que fazemos na String não se acumulam, caso queira fazer isso é preciso reatribuir o resultado da operação à variável.

## Objetos, == e equals

Para comparar o conteúdo de duas Strings é necessário usar o método **equals**, pois, se utilizarmos **==** entre duas Strings só irá resultar em true caso as duas se refiram ao mesmo objeto.

Usamos **equals** porque no Java existe algo chamado "String Pool".
Ao tentar instanciar uma String sem a palavra reservada *new* ele tenta economizar memória e verifica se já existe um objeto com aquele mesmo conteúdo.
Caso exista, ele reaproveita aquele objeto e atribui seu endereço de memória à variável.
Porém, sempre que uma String for criada usando de forma explicita a palavra reservada *new*, idependentemente de haver uma String com aquele conteúdo, a JVM vai criar um novo objeto.

## Imutabilidade de Strings

Em Java, toda vez que você altera uma String, na verdade, você está criando um novo objeto e o anterior vai ficar ocupando espaço na memória até o **Garbage Collector** removê-lo.

Portanto, em Java as Strings são imutáveis.

## StringBuilder

O StringBuilder é uma alternativa pra quem quer economizar memória, os objetos de StringBuilder podem ser alterados
e sempre que você alterar um StringBuilder, nenhum objeto adicional precisará ser criado.

O uso de StringBuilder é mais comum em situações em que muitas operações String são executadas em um curto intervalo de tempo.
Geralemente em competições de programação e situações em que a necessidade é tornar o programa mais eficiente.


