 package br.com.senai.vitoriasilva.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable {
	
	 private int n1;
	 private int n2;
	 private int n3;
	 
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	 
//	 @Inject
//	 private Flash flash;
//	 
//	 public String processar() {
//		 
//		 flash.put("nomeDoUsuario", nome);
//		 
//		 return "result?faces-redirect=true";
//	 }
	 


	 

}