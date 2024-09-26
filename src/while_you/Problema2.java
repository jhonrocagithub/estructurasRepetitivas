package while_you;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Problema2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scpScroll;
	private JTextArea txtAreaResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema2 frame = new Problema2();
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
	public Problema2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(158, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 47, 414, 203);
		contentPane.add(scpScroll);
		
		txtAreaResultado = new JTextArea();
		scpScroll.setViewportView(txtAreaResultado);
	}
	public void actionPerformed(ActionEvent e) {
		//declarar variables
		int numero=3, suma=0;
		
		//proceso de calculo
		while(numero <= 94) {
			
			//imprime el numero actual
			txtAreaResultado.append(numero + "\n");
			
			//suma el numero actual
			suma += numero;
			
			//pasa al siguiente numero
			numero+=7;
		}
		// Imprime la suma de la serie 
		  txtAreaResultado.append("Suma : " + suma); 
		
		
	}
}
