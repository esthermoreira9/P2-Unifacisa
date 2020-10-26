# Polimorfismo

Polimorfismo, de origem grega, quer dizer **várias formas**.

Uma vez criado, um objeto permanece sempre sendo do mesmo tipo.
Porém, as *variáveis de referência podem mudar o endereço 
de memória para onde estão apontando*. 
A única restrição é que variáveis de referência de um tipo A não apontem para
um objeto de referência de um tipo B, se B não for subclasse de A.

Algumas regras sobre polimorfismo:

1. O polimorfismo pode acontecer sempre que existir herança e sobrescrita.
2. O polimorfismo vai acontecer quando uma variável de referência mudar o objeto para onde ela aponta, e esse objeto tiver uma implementação diferente da superclasse.
3. O objeto em si não é polimórfico, o que é polimórfico é a função que foi sobrescrita.

Obeserve o exemplo abaixo: 

```java
public class Pessoa {	
	private String nome;
	private int idade;
	public Pessoa(){}
	//demais funcoes
}

public class PessoaFisica extends Pessoa{
	private int cpf;
	//demais funcoes	
}

public class PessoaJuridica extends Pessoa{
	protected String cnpj;
	//demais funcoes	
}

public class Cliente extends PessoaFisica{
	private long saldo;
	private long limite;
	//demais funcoes	
}

public class Funcionario extends PessoaFisica{
	private int salario;	
	protected double getBonificacao(){
		return 0.1*this.salario;
	}
	//demais funcoes	
}

public class Secretario extends Funcionario{}

public class Gerente extends Funcionario{
	@Override
	public double getBonificacao() {
		return 0.2*super.getSalario();
	}
	//demais funcoes
}
```

Nele, a função getBonificação() apresenta comportamento polimórfico, pois na classe
gerente ela é sobrescrita, de modo a dar aos gerentes 20% de bonificação, que originalmente
eram 10%. Essa função pode retornar 10% ou 20% de acordo com qual objeto ela está apontando,
isso caracteriza um comportamento polimórfico.

Dicas: 
1. **Não importa como nos referenciamos a um objeto, o método que será invocado é sempre o do objeto em questão.**
2. **Programe sempre pra uma superclasse!**
