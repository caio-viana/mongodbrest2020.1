package mongodbrest.ancestrais;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "ancestrais")
public class Ancestral {

	@Id
	private String id;

	private String nome;
	private char sexo;
	private int anoNascimento;
	private int anoMorte;
	private String nomePai;
	private String nomeMae;

	public Ancestral(String nome, char sexo, int anoNascimento, int anoMorte, String nomePai, String nomeMae) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.anoMorte = anoMorte;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getAnoMorte() {
		return anoMorte;
	}

	public void setAnoMorte(int anoMorte) {
		this.anoMorte = anoMorte;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Override
	public String toString() {
		return "Ancestral [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", anoNascimento=" + anoNascimento
				+ ", anoMorte=" + anoMorte + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}

}
