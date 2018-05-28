package exercicio01;

import java.util.ArrayList;

public class Produto {

	//Atributos
	String nomeProduto;
	double valorProduto;
	
	//ArrauList Cadastrar produtos
	public static ArrayList<Produto> dados = new ArrayList<>();
	
	//Métodos magicos
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
}