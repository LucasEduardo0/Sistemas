package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Historico {

	public Historico() {
		
		//JFrame
		JFrame historico = new JFrame("Histórico");
		historico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		historico.setSize(1000, 500);
		historico.setLocationRelativeTo(null);
		historico.setLayout(null);
		
		//JButton
		JButton sair = new JButton("Sair");
		sair.setBounds(420, 400, 150, 30);
		
		//Instanciar
		Acao a = new Acao();
		
		//JTabel
		JTable tabela = new JTable(a.listarProdutoPedido());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(50, 30, 890, 350);
		
		//Ação botão
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar formulário atual
				historico.dispose();
				
				//Voltar para Principal
				Principal p = new Principal();
				
			}
		});
		
		//Add JFrame
		historico.add(barra);
		historico.add(sair);
		
		//Visivel
		historico.setVisible(true);
		
		
	}
	

}