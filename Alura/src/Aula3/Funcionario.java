package Aula3;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data  dataEntrada;
	String rg;
	
	void recebeAumento(double valor){
		
		this.salario += valor;
		
	}
	
	double calculaGanhoAtual(){
		
		return this.salario * 12;	
		
	}
	
	void mostra (){
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Salario anual: " + this.calculaGanhoAtual());
		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("Rg: " + this.rg);
		
	}
	
}
