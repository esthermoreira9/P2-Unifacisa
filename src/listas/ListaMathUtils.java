package listas;

import java.util.ArrayList;
import java.util.List;

public class ListaMathUtils {
	
	public static List<Integer> calculaDivisores(int num) {
		List<Integer> divisores = new ArrayList<Integer>();
		divisores.add(1);
		if(num != 1) {
			divisores.add(num);
		}
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0 ) {
				divisores.add(i);
			}
		}
		return divisores;
	}

}
