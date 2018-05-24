package exercicio01;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ProdutoPedido {
	
	//Atributos
	private String nomeCliente;
	private String nomeProduto;
	private int quantidade;
	private String horas;
	
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
	
	public String getHora(){
		
		LocalDateTime tempo = LocalDateTime.now();
		
		int segundo = tempo.getSecond();
		int minuto = tempo.getMinute();
		int hora = tempo.getHour();
		
		horas = hora+":"+minuto+":"+segundo;
		
		return horas;
		
	}
	public void setHora(int horas){
		this.horas = Integer.toString(horas);
	}

}
