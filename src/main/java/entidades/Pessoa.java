package entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity		//ESSA anotação diz, que essa Entidade vai corresponder a uma Tabela!!! 	
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	
	/*
	 * ESSAS ANOTAÇÕES SÃO O MAPEAMENTO DA CLASSE!
	 * 
	 * NA VARIAVEL, OU CAMPO, QUE FOR CONSIDERADO A CHAVE PRIMÁRIA
	 * DEVE-SE APLICAR AS ANOTAÇÕES ABAIXO, ESPECIFICANDO QUEM SERÁ
	 * A CHAVE PRI, E TAMBÉM COMO ELA SERÁ INCREMENTADA, NO CASO ABAIXO
	 * SERÁ AUTOMÁTICA DE 1, EM 1
	 */
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	
	
	private String name;
	private String email;
	
	public Pessoa() {
	}
	
	public Pessoa(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}