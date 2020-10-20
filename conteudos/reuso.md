# Reúso de código

Escrever código duplicado é considerado uma má prática na programação, pois, sempre que houver
uma mudança em algum algoritmo, o programador precisa procurar todas as ocorrências daquele determinado
algoritmo e realizar a mudança em cada uma. Isso pode gerar problemas, pois quando se trata de desenvolvimento
de software mudança é quase uma certeza e ter que corrigir o mesmo trecho de código várias vezes pode induzir
o programador ao erro.

Para evitar isso utilizamos o reúso, que pode ser promovido de duas formas: composição e herança.

## Composição

O reúso por composição se dá quando uma classe A tem uma váriavel de referência que o tipo é de
outra classe B, a classe A tem acesso a todas as funções e váriaveis publicas de B, então, dizemos
que **A tem B**.

No exemplo abaixo utilizamos reúso por composição ao utilizar as classes Data e Pessoa.

```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
  //construtor e funções
}

class Pessoa{
  private String nome;
  private String cpf;
  private Conta conta;
  //construtor e funções
}

class Motorista{
  private Pessoa pessoa;
  private Data dataIngreso;  
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro{
  private Pessoa pessoa;
  private Data diaIngreso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  private double km;
  
  //demais atributos e funções
}
```

Porém, soa estranho dizer que *Motorista tem uma Pessoa* e *Passageiro tem uma Pessoa*, talbvez se
o nome da classe Pessoa fosse DadosPessoa a legibilidade tivesse mais sentido: *Motorista tem um DadosPessoa*
e *Passageiro tem um DadosPessoa*. Mas, mesmo que soe estranho essa abordagem não está incorreta
e na verdade é bastante poderosa.

## Herança

Na herança temos uma classe mãe e várias classes filhas , que são as classes que herdam.

A herança é estabelecida través do uso da palavra-chave **extends** e quando uma classe não declara
explicitamente que herda de outra classe, então ela herda da classe Object.

No exemplo abaixo, as classes Motorista e Passageiro herdam a classe Pessoa. Pessoa, Data e Corrida
não explicitam que herdam de outra classe, potanto, herdam da classe Object.

```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
  //construtor e funções
}

class Pessoa{
  protected String nome;
  protected String cpf;
  protected Conta conta;
  //construtor e funções
}

class Motorista extends Pessoa{
  private Data dataIngreso;  
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro extends Pessoa{
  private Data diaIngreso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  private double km;
  
  //demais atributos e funções
}
```

Nesse exemplo, **Motorista é uma Pessoa** e **Passageiro é uma Pessoa** e a legibilidade faz total
sentido.

Para o reúso de Data, a herança não faria sentido pois seria estranho dizer que *Motorista é uma Data*
e *Passageiro é uma Data*, e *Corrida é uma Data*.

Em Java, temos apenas herança simples, o que significa que uma classe não pode herdar de mais
de uma classe, a herança permite apenas um relacionamento **1 para 1**.

## Sobrescrita

É possível haver **sobrescrita** sempre que houver herança e métodos de uma superclasse ficarem
disponíveis para sub-classes, ela acontece quando uma sub-classe especializa um método herdado.
Especializar significa promover um funiconamento mais específico para aquele método e issoé feito 
codificando um método na sub-classe que contenha a mesma assinatura (tipo de modificador, 
tipo de retorno, nome de método, e mesma quantidade e mesmos tipos de argumentos). 

No exemplo abaixo a sobrescrita é utilizada para alterar o preço base e o custo por km coforme o tipo
de corrida solicitada.

```java
class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  protected double km;
  protected List<Passageiro> passageiros;
  
  public double getCusto(){
    return getPrecoBase() + getCustoKm() * km;
  }
  
  protected double getPrecoBase(){
    return 5;
  }
  
  protected double getCustoKm(){
    return 1.6;
  } 
}

class CorridaVip extends Corrida{    
  
  @Override
  protected double getCustoKm(){
    return 2.3;
  }  
}

class CorridaPool extends Corrida{    
  
  @Override
  protected double getPrecoBase(){
    return 4.5;
  }
  
  @Override
  protected double getCustoKm(){
    return 1.3;
  }
  
  @Override
  public double getCusto(){
    double custo = super.getCusto();
    return custo - (super.passageiros.size()/10 * custo);
  }
}
```

1. A anotação @Override é opcional, mas recomendada, pois indica ao compilador que o programador tem a
intenção de sobrescrever aquele método. Se o método anotado não estiver dentro das regras de reescrita,
então um erro de compilação é lançado.
2. Usamos o modificador de acesso protected para permitir que as sub-classes consigam acessar alguns
atributos. Outra opção seria deixar os atributos privados e criar métodos acessadores getters públicos.
3. Usamos super para se referir à uma variável/método da superclasse. No nosso exemplo, *super.getCusto()*
é obrigatório, pois de outro modo estaríamos nos referindo à função *getCusto()* da classe CorridaPool.
No caso de *super.passageiros*, o super não é obrigatório pois não existe ambiguidade a ser removida.
Por exemplo, se existisse uma variável local dentro do método getCusto() com identificação *passageiros*,
o que poderia gerar ambiguidade entre a variável local (do método) e a variável da superclasse.

#### Regras da Sobrescrita

As regras da sobrescrita dizem respeito à assinatura da função.
Por assinatura, considere: modificador de acessor, tipo de retorno, nome da função, quantidade de argumentos,
e tipos dos argumentos (a ordem dos argumentos importa)

Opção 1: assinatura exatamente igual.

Opção 2: assinatura não é exatamente igual, embora seja parecida.

&nbsp;  &nbsp; 2.1. nome de função igual

&nbsp;  &nbsp; 2.2. tipo de retorno pode ser diferente, contanto que o tipo da função sobrescrita respeite o relacionamento *É-UM* com o tipo de retorno da função na superclasse (lembrar que a palavra reservada *instanceof* é usada para o teste)

&nbsp;  &nbsp; 2.3. modificador de acesso menos restritivo (ex: se na superclasse tivermos protected, na sub-classe podemos ter public)
