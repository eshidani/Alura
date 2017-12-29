package Aula2;

public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre / 3;
		
		System.out.println(gastosTrimestre);
		
		System.out.println("Média mensal:" + mediaMensal);
		
	
		int x = 150;
		while (x < 300){
			System.out.println(x);
			x++;
		}
		
		
		int soma = 0;
		
		for (int num = 1; num <= 1000; num++){
			soma = soma + num;
		}
		
		System.out.println("Soma: " + soma);
		
		
		for(int num = 1;num <= 100;num++){
			if (num % 3 == 0 ){
				System.out.println("Numero: "+ num);
			}
		}
		
		
		long fatorial = 1;
		for (long num = 1; num <= 40; num++){
			fatorial *= num;
			System.out.println("Fatorial:" + fatorial);
		}
		*/
		
		int x = 13;
		
		while(x != 1) {
			if (x % 2 == 0){
				
				x = x / 2;
				System.out.print(x + ">");
			}else{
				
				x = 3 * x + 1;
				System.out.print(x + ">");
			}
		}
	}
	
}
