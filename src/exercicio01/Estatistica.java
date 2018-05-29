package exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Estatistica extends JFrame {

	private JLayeredPane contentPane;

	public Estatistica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ProdutoPedido pp = new ProdutoPedido();
				
		JComboBox<ProdutoPedido> escolher = new JComboBox<ProdutoPedido>(new Vector<ProdutoPedido>(ProdutoPedido.dados2));
		escolher.setBounds(194, 11, 100, 20);
		contentPane.add(escolher);
		
		JButton sair = new JButton("Sair");
		sair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				
			}
		});
		sair.setBounds(205, 394, 89, 37);
		contentPane.add(sair);
		
		escolher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

					Acao a = new Acao();
					
					//JTable
					JTable tabela2 = new JTable(a.listarProdutoPedido());
					
					//JScrollPane
					JScrollPane barra2 = new JScrollPane(tabela2);
					barra2.setBounds(20, 60, 450, 300);
					
			contentPane.add(barra2);
				
			}
		});
		
		
		
		
		
	}
}
