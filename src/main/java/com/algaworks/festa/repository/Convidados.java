package com.algaworks.festa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.festa.model.Convidado;


@Repository	
public class Convidados {
	
	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();
	
	static{
		LISTA_CONVIDADOS.add(new Convidado(	"Fulano",5));
		LISTA_CONVIDADOS.add(new Convidado(	"Joãozinho",0));
		LISTA_CONVIDADOS.add(new Convidado(	"Marininha",2));
	}
	
	public List<Convidado> todos(){
		return Convidados.LISTA_CONVIDADOS;
	}
	
	public void adicionar(Convidado convidado){
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}

}
