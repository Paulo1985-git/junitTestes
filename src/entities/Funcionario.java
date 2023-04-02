package entities;

public class Funcionario extends Pessoa {

	private String cadastro;
	private String dtAdmissao;
	private String funcao;
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Funcionario(String nome, String dtNascimento, String cpf, String nomeMae, String nacionalidade, char sexo,
			String cadastro, String dtAdmissao, String funcao, double salario) {
		super(nome, dtNascimento, cpf, nomeMae, nacionalidade, sexo);
		this.cadastro = cadastro;
		this.dtAdmissao = dtAdmissao;
		this.funcao = funcao;
		this.salario = salario;
	}

	public Funcionario(String nome, String dtNascimento, String cpf, String nomeMae, String nacionalidade, char sexo,
			String cadastro, String dtAdmissao, String funcao) {
		super(nome, dtNascimento, cpf, nomeMae, nacionalidade, sexo);
		this.cadastro = cadastro;
		this.dtAdmissao = dtAdmissao;
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [cadastro=" + cadastro + ", dtAdmissao=" + dtAdmissao + ", funcao=" + funcao + "]";
	}

	public Funcionario(String nome, String dtNascimento, String cpf, String nomeMae, String nacionalidade, char sexo) {
		super(nome, dtNascimento, cpf, nomeMae, nacionalidade, sexo);
	}

}
