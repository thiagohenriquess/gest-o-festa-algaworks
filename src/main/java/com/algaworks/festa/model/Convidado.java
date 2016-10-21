package com.algaworks.festa.model;

public class Convidado {
	private String nome;
	private Integer quantidadeAcompanhantes;
	
	public Convidado(){
		
	}
	
	public Convidado(String nome, Integer quantidadeAcompanhantes) {
		super();
		this.nome = nome;
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(!nome.equals("")) 
			this.nome = nome;
		else this.nome="Bilau";
	}
	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}
	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}
	
	

}
