package com.algaworks.festa.model;

public class Convidado {
	private String nome;
	private Integer quantidadeAcompanhantes;
	
	public Convidado(){
		
	}
	
	public Convidado(String nome, Integer quantidadeAcompanhantes) {
		this.nome = nome;
		if(quantidadeAcompanhantes > 0){
			this.quantidadeAcompanhantes = quantidadeAcompanhantes;
		}
		else this.quantidadeAcompanhantes = 0;	
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
		try{
			if(quantidadeAcompanhantes >= 0){
				this.quantidadeAcompanhantes = quantidadeAcompanhantes;
			}
			else quantidadeAcompanhantes = 0;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	

}
