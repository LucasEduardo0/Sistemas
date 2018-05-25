package exercicio01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ProdutoPedido {
	
	//Atributos
	private String nomeCliente;
	private String nomeProduto;
	private int quantidade;
	private int horas;
	private int data;
		
	//ArrayList
	public static ArrayList<ProdutoPedido> dados2 = new ArrayList<>();
	
	//Métodos magicos
	public String getNomeCliente(){
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeProduto(){
		
		RealizarPedidos rp = new RealizarPedidos();
		
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto){
		this.nomeProduto = nomeProduto;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	public int getHora(){
		return horas;
	}
	public void setHora(int horas){
		this.horas = horas;
	}
	
	public int getData(){
		return data;
	}public void setData(int data){
		this.data = data;
	}

}
