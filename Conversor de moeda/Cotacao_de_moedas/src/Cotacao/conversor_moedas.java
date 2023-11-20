package Cotacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class conversor_moedas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Dolar;
	private JTextField txtDolar;
	private JLabel Real;
	private JTextField txtReal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    conversor_moedas frame = new conversor_moedas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();					
				}
			}
		});				
	}
	
	/**
	 * Create the frame.
	 */
	//Função para converter de Real
    //para o dólar e vice-versa
	public conversor_moedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Texto_Conversor = new JLabel("Conversor de Moeda");  //texto inicial decorativo
		Texto_Conversor.setBounds(142, 11, 157, 22);
		Texto_Conversor.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(Texto_Conversor);
		
		Dolar = new JLabel("Dólar Comercial:");  //Nomeando os rótulos e configurando e os limites dos rótulos
		Dolar.setBounds(91, 91, 78, 14);
		contentPane.add(Dolar);
		
		txtDolar = new JTextField();  //Inicializando os campos de texto com 0 por padrão e configurando o limites para os campos de texto 
		txtDolar.setBounds(91, 113, 74, 23);
		txtDolar.setText("0");
		contentPane.add(txtDolar);
		txtDolar.setColumns(10);
		
		Real = new JLabel("Real Comercial:");  //Nomeando os rótulos e configurando e os limites dos rótulos
		Real.setBounds(275, 91, 74, 14);
		contentPane.add(Real);
		
		txtReal = new JTextField();  //Inicializando os campos de texto com 0 por padrão e configurando o limites para os campos de texto
		txtReal.setBounds(275, 113, 74, 23);
		txtReal.setText("0");
		contentPane.add(txtReal);
		txtReal.setColumns(10);
		
		JButton real1 = new JButton("Real");  //Aqui é o botão que é feito o cálculo do Real para o Dolar
		real1.setBounds(275, 147, 74, 23);
		real1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
                double d  //Convertendo para double
                    = Double.parseDouble(txtReal.getText());
  
                double d1 = (d / 4.91);  //Essa é a cotação do dia 19/11/2023 e Convertendo Real em dólares
                String str1 = String.valueOf(d1);  // Obtendo o valor da string (str1) do valor calculado
  
                txtDolar.setText(str1);  //Colocando-o na caixa de texto o resultado do Real para Dólar
			}
		});
		contentPane.add(real1);
		
		JButton dolar1 = new JButton("Dolar");  //Aqui é o botão que é feito o cálculo do Dolar para o real
		dolar1.setBounds(91, 147, 74, 23);
		dolar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                double d2  //Convertendo para double
                    = Double.parseDouble(txtDolar.getText());
  
                double d3 = (d2 * 4.91);  //Essa é a cotação do dia 19/11/2023 e Convertendo dólares em Real
                String str2 = String.valueOf(d3);  // Obtendo o valor da string (str2) do valor calculado
  
                txtReal.setText(str2);  //Colocando-o na caixa de texto o resultado do dólar para Real
			}
		});
		contentPane.add(dolar1);				              
    }       			    
}