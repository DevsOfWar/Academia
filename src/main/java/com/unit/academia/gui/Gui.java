package com.unit.academia.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import com.unit.academia.repositorios.PlanoRepositorio;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JPopupMenu;

public class Gui {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=62,379
	 */

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
		
		JMenuItem alunoAdd = new JMenuItem(new AlunoAdicionarAction());
		alunoAdd.setText("Adicionar");
		mnNewMenu_2.add(alunoAdd);
		
		JMenuItem alunoEd = new JMenuItem(new AlunoEditarAction());
		alunoEd.setText("Eitar");
		mnNewMenu_2.add(alunoEd);
		
		JMenuItem alunoEx = new JMenuItem(new AlunoExcluirAction());
		alunoEx.setText("Excluir");
		mnNewMenu_2.add(alunoEx);
		
		JMenuItem alunoCons = new JMenuItem(new AlunoConsultarAction());
		alunoCons.setText("Consultar");
		mnNewMenu_2.add(alunoCons);
		
		JMenuItem alunoContr = new JMenuItem(new AlunoContratoAction());
		alunoContr.setText("Registrar Contrato");
		mnNewMenu_2.add(alunoContr);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Efetuar Pagamento");
		mnNewMenu_2.add(mntmNewMenuItem_13); //não implementado
		
		// Menu Turma
		JMenu mnNewMenu_3 = new JMenu("Turma");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem turmaAdd = new JMenuItem(new TurmaAdicionarActio());
		turmaAdd.setText("Adicionar");
		mnNewMenu_3.add(turmaAdd);
		
		JMenuItem turmaEd = new JMenuItem(new TurmaEditarAction());
		turmaEd.setText("Editar");
		mnNewMenu_3.add(turmaEd);
		
		JMenuItem turmaExcluir = new JMenuItem(new TurmaExcluirAction());
		turmaExcluir.setText("Excluir");
		mnNewMenu_3.add(turmaExcluir);
		
		JMenuItem turmaConsu = new JMenuItem(new TurmaConsultaAction());
		turmaConsu.setText("Consultar");
		mnNewMenu_3.add(turmaConsu);
		
	}
}
