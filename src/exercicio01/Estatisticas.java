package exercicio01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Estatisticas extends JFrame {

	private JPanel estatisticas;
	private JTextField textField;

	public Estatisticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		estatisticas = new JPanel();
		estatisticas.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(estatisticas);
		estatisticas.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar por nome do cliente ou por data");
		lblNewLabel.setBounds(25, 21, 250, 14);
		estatisticas.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(266, 18, 125, 20);
		estatisticas.add(textField);
		textField.setColumns(10);
		
		JButton buscar = new JButton("Buscar");
		buscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Instanciar
				ProdutoPedido pp = new ProdutoPedido();
				Acao a = new Acao();
				
				
				
				if(textField.equals(pp.getNomeCliente())) {
					
					JOptionPane.showMessageDialog(null, "Olá");
					
				}
				
			}
		});
		buscar.setBounds(429, 11, 89, 41);
		estatisticas.add(buscar);
		
		//Instanciar
		Acao a = new Acao();
		
		//Jtabel
		JTable tabela = new JTable(a.listarProdutoPedido());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(20, 75, 750, 550);
		estatisticas.add(barra);
		
		JButton sair = new JButton("Sair");
		sair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Fechar formulario
				
				
			}
		});
		sair.setBounds(566, 11, 89, 41);
		estatisticas.add(sair);
		
		
		
		
		
	}
}
