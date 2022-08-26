package excepciones;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal5 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello World Java Swing");
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("pulsame");
		button.setBounds(130, 200, 100, 40);
		frame.getContentPane().setLayout(null);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				FileWriter fw=null;
				try {
					fw= new FileWriter("nuevo.txt");
					fw.write("hola soy un fichero de texto");
					DriverManager.getConnection("dafasdf","dfafdsf","dafeda");
					JOptionPane.showMessageDialog(null, "Has creado el fichero");
				} catch (IOException | SQLException e1) {
					
					JOptionPane.showMessageDialog(null,e1.getMessage());
					
				}finally {
					
					if (fw!=null) {
						try {
							fw.close();
						} catch (IOException e1) {
						
							JOptionPane.showMessageDialog(null,e1.getMessage());
							
						}
					}
				}
				
				
			}
		});
		
		frame.getContentPane().add(button);
		frame.pack();
		frame.setVisible(true);

	}

}
