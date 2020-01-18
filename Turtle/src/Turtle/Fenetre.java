package Turtle;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener{
	
	public Fenetre() {
		this.setTitle("Ma première fenêtre Java");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		this.setSize(620, 802);
		this.setLocationRelativeTo(null);
		 
		this.setContentPane(new Panneau());
		
		JPanel contentPane=(JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton DeuxJ= new JButton("2 joueurs");
		DeuxJ.setPreferredSize(new Dimension(200,100));
		contentPane.add(DeuxJ );
		
		JButton troisJ= new JButton("3 joueurs");
		troisJ.setPreferredSize(new Dimension(200,100));
		contentPane.add(troisJ );
		
		JButton quatreJ= new JButton("4 joueurs");
		quatreJ.setPreferredSize(new Dimension(200,100));
		contentPane.add(quatreJ );
		

		              
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	} 

}
