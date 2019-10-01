package api;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "usuario")
public class Usuario {
	private int id;
	private String nome;
	private String sobrenome;
	
	
	public int getId() {
		return id;
	}

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	@XmlElement
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	@XmlElement
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
