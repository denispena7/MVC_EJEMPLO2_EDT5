package es.studium.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Vista vista;
	Modelo modelo;

	public Controlador(Modelo m, Vista v)
	{
		modelo = m;
		vista = v;

		v.ventana.addWindowListener(this);
		v.btnCalcular.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// Cogemos los datos de los cuadros de texto
		int horas1 = Integer.parseInt(vista.txtHh1.getText());
		int minutos1 = Integer.parseInt(vista.txtMm1.getText());
		int horas2 = Integer.parseInt(vista.txtHh2.getText());
		int minutos2 = Integer.parseInt(vista.txtMm2.getText());
		
		String resultado = modelo.diferenciaHoraria(horas1, minutos1, horas2, minutos2);
		
		vista.txtResultado.setText(resultado);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}