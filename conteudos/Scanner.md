# Scanner

Para receber e armazenar informações interagindo com o usuário no Java é preciso importar a classe Scanner que fica contida no pacote java.util.Scanner

É preciso criar e instanciar um objeto Scanner, como no exemplo abaixo:

```java
import java.util.Scanner;

public class Basics7 {

	public static void main(String[] args) {

		Scanner entrada =  new Scanner (System.in);
		
		int num = entrada.nextInt();
```
