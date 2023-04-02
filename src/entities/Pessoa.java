package entities;

public class Pessoa {

	private String nome;
	private String dtNascimento;
	private String cpf;
	private String nomeMae;
	private String nacionalidade;
	private char sexo;

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Pessoa(String nome, String dtNascimento, String cpf, String nomeMae, String nacionalidade, char sexo) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.nomeMae = nomeMae;
		this.nacionalidade = nacionalidade;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dtNascimento=" + dtNascimento + ", cpf=" + cpf + ", nomeMae=" + nomeMae
				+ ", nacionalidade=" + nacionalidade + ", sexo=" + sexo + "]";
	}

}
