package Aula3;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Funcionario 1";
		f1.departamento = "TI";
		f1.salario = 100.0;
		f1.recebeAumento(50);
		f1.rg = "123456789";
		
		f1.dataEntrada = new Data();
		f1.dataEntrada.preencheData(1, 1, 2000);
		
		f1.mostra();
	
		
	}

}
