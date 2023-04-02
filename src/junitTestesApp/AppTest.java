package junitTestesApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Funcionario;

class TestandoFuncionairo {
	
	Funcionario func = new Funcionario("Paulo", "11/02/1985", "059.411.417-93", "Lucia", "Brasileiro", 'M', "425", "01/01/2005", "Desenvolvedor", 5000.00);

	@Test
	void testandoNome() {
		assertEquals(func.getName(), "Paulo");
	}
	
	@Test
	void testandoDataDeNascimento() {
		assertEquals(func.getDtNascimento(), "11/02/1985");
	}
	
	@Test
	void testandoCpf() {
		assertEquals(func.getCpf(), "059.411.417-93");
	}
	
	@Test
	void testandoNomeDaMae() {
		assertEquals(func.getNomeMae(), "Lucia");
	}
	
	@Test
	void testandoNacionalidade() {
		assertEquals(func.getNacionalidade(), "Brasileiro");
	}

}
