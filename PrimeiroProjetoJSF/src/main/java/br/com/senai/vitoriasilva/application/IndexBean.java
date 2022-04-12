package br.com.senai.vitoriasilva.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//ctrl + shift + o = importa a biblioteca automaticamente

@SuppressWarnings("serial")
@Named
@RequestScoped

public class IndexBean implements Serializable{

	public String getMensagem() {
		
		return "Texto vindo do Bean";
	}
	
}
