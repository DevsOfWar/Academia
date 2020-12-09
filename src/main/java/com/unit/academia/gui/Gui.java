package com.unit.academia.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import com.unit.academia.repositorios.PlanoRepositorio;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

public class Gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 200, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Só Vai");
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		// Menu Plano
		JMenu mnNewMenu = new JMenu("Plano");
		mnNewMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mnNewMenu);
		
		JMenuItem adicionar = new JMenuItem(new PlanoAdicionarAction());
		adicionar.setText("Adicionar");
		mnNewMenu.add(adicionar);
		
		JMenuItem editar = new JMenuItem(new PlanoEditarAction());
		editar.setText("Editar");
		mnNewMenu.add(editar);
		
		JMenuItem excluir = new JMenuItem(new PlanoExcluirAction());
		excluir.setText("Excluir");
		mnNewMenu.add(excluir);
		
		JMenuItem consultar = new JMenuItem(new PlanoConsultarAction());
		consultar.setText("Consultar");
		mnNewMenu.add(consultar);
		

		// Menu Atividade
		JMenu mnNewMenu_1 = new JMenu("Atividade");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem atividadeAdd = new JMenuItem(new AtividadeAdicionarAction());
		atividadeAdd.setText("Adicionar");
		mnNewMenu_1.add(atividadeAdd);
		
		JMenuItem atividadeEd = new JMenuItem(new AtividadeEditarAction());
		atividadeEd.setText("Editar");
		mnNewMenu_1.add(atividadeEd);
		
		JMenuItem atividadeEx = new JMenuItem(new AtividadeExcluirAction());
		atividadeEx.setText("Excluir");
		mnNewMenu_1.add(atividadeEx);
		
		JMenuItem atividadeCons = new JMenuItem(new AtividadeConsultarAction());
		atividadeCons.setText("Consultar");
		mnNewMenu_1.add(atividadeCons);
		
		// Menu Aluno
		JMenu mnNewMenu_2 = new JMenu("Aluno");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Adicionar");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Editar");
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Excluir");
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Consultar");
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Registrar Contrato");
		mnNewMenu_2.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Efetuar Pagamento");
		mnNewMenu_2.add(mntmNewMenuItem_13);
		
		// Menu Turma
		JMenu mnNewMenu_3 = new JMenu("Turma");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Adicionar");
		mnNewMenu_3.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Editar");
		mnNewMenu_3.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Excluir");
		mnNewMenu_3.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Consultar");
		mnNewMenu_3.add(mntmNewMenuItem_17);
		
	}
}
