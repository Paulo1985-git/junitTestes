package junitTestesApp;

import entities.Funcionario;

public class App {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario("Paulo", "11/02/1985", "059.411.417-93", "Lucia", "Brasileiro", 'M', "425", "01/01/2005", "Desenvolvedor", 5000.00);

		func.setDtAdmissao("31/01/2005");
		func.setSalario(4500.00);
		
		System.out.println(func);
		
		if(func.getSalario() > 5000.00 || func.getDtAdmissao() != "01/01/2005") {
			
			System.out.println("Não é colaborador da empresa Yellow");
			
		}else {
			System.out.println("É colaborador da empresa Yellow");
		}
		
	}

}
