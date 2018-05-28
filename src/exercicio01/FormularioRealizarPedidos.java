package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormularioRealizarPedidos {
	
	public FormularioRealizarPedidos() {
		
		//JFrame
		JFrame realizarPedido = new JFrame("Realizar pedidos");
		realizarPedido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		realizarPedido.setSize(1000, 700);
		realizarPedido.setLocationRelativeTo(null);
		realizarPedido.setLayout(null);
		
		//Componentes para realizar o pedido
		JLabel nomeCliente = new JLabel("None do cliente");
		nomeCliente.setBounds(20, 20, 150, 20);
		JTextField respostaNomeCliente = new JTextField();
		respostaNomeCliente.setBounds(180, 20, 150, 20);
		JLabel quantidade = new JLabel("Quantidade");
		quantidade.setBounds(20, 50, 150, 20);
		JTextField respostaQuantidade = new JTextField();
		respostaQuantidade.setBounds(180, 50, 150, 20);
		JButton sair = new JButton("Sair");
		sair.setBounds(100, 90, 150, 30);
		
		//Instanciar
		Acao a = new Acao();
		
		//Jtabel
		JTable tabela = new JTable(a.listarProdutos());
		JTable tabela2 = new JTable(a.listarProdutoPedido());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(520, 20, 450, 220);
		JScrollPane barra2 = new JScrollPane(tabela2);
		barra2.setBounds(20, 260, 950, 380);
		
		//Ação tabela
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {

				//Obter a linha
				int linha = tabela.getSelectedRow();
				
				//Obter dados
				String nomeProduto = tabela.getValueAt(linha, 0).toString();
				double valorProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				
				//Obter dados fornecidos pelo usuário
				String nomeCliente = respostaNomeCliente.getText();
				int quantidade = Integer.parseInt(respostaQuantidade.getText());
				
				LocalDateTime tempo = LocalDateTime.now();
				int segundo = tempo.getSecond();
				int minuto = tempo.getMinute();
				int horas = tempo.getHour();
				String hora = horas+":"+minuto+":"+segundo;
				
				LocalDate datas = tempo.toLocalDate();
				
				String data = ""+datas;
				
				a.cadastrarProdutoPedido(nomeCliente, nomeProduto, quantidade, valorProduto, hora, data);
				
				//Atualizar tabela
				tabela2.setModel(a.listarProdutoPedido());
				
				//Limpar campos
				respostaNomeCliente.setText("");
				respostaQuantidade.setText("");
				
				//Cursor no campo nome cliente
				respostaNomeCliente.requestFocus();
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		//Ação sair
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//Fechar formulario Tealizar Pedidos
				realizarPedido.dispose();
				
				//Chamar principal
				FormularioPrincipal p = new FormularioPrincipal();
				
			}
		});
		
		//Add JFRame
		realizarPedido.add(nomeCliente);
		realizarPedido.add(respostaNomeCliente);
		realizarPedido.add(quantidade);
		realizarPedido.add(respostaQuantidade);
		realizarPedido.add(sair);
		realizarPedido.add(barra);
		realizarPedido.add(barra2);
		
		//Tornar visivel
		realizarPedido.setVisible(true);

	}	
		
}