package org.generation.redesocial.conecteme.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo Nome é obrigatório")
	@Size(min = 3, max = 100, 
	message = "O atributo nome deve ter no mínimo 3 e no máximo 100 caracteres")
	private String nome;
	
	@ApiModelProperty(example = "email@email.com.br")
	@NotBlank(message = "O atributo Usuário é obrigatório")
	@Email(message = "O atributo usuário deve ser um email válido")
	private String usuario;

	@ApiModelProperty(example = "(**) *****-****")
	@NotBlank(message = "O atributo Usuário é obrigatório")
	private String telefone;

	@ApiModelProperty(example ="Estado onde reside exemplo: Pernambuco")
	private String estado;
	
	@NotBlank(message = "O atributo Senha é obrigatório")
	@Size(min = 8, message = "A senha deve ser no mínimo 8 caracteres.")
	private String senha;
	
	private String foto;
	
	private String tipo;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<PostagemModel> postagem = new ArrayList<>();
	
	public UsuarioModel (long id, String nome, String usuario, String senha, String tipo, String telefone, String estado, String foto) {
		
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.telefone = telefone;
		this.estado = estado;
		this.senha = senha;
		this.tipo = tipo;
		this.foto = foto;
		
	}
	
	public UsuarioModel() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<PostagemModel> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
	
}
