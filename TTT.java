package tTT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TTT {

	private JFrame frame;
	private String startGame="X";
	private int pl1co=0;
	private int pl2co=0;
	private int numco=0;
	private JTextField t1s;
	private JTextField t2s;
	private JButton bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTT window = new TTT();
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
	public TTT() {
		initialize();
	}

	private void gameScore() {
		t1s.setText(String.valueOf(pl1co));
		t2s.setText(String.valueOf(pl2co));
	}
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X")) 
			startGame="O";
		else 
			startGame="X";
	}
	
	public void reset() {
		bb1.setText(null);
		bb2.setText(null); bb3.setText(null); bb4.setText(null); bb5.setText(null);
		bb6.setText(null); bb7.setText(null); bb8.setText(null); bb9.setText(null);
		numco=0;
	}
	
	private void winningCond() {
		String b1=bb1.getText();
		String b2=bb2.getText();
		String b3=bb3.getText();
		String b4=bb4.getText();
		String b5=bb5.getText();
		String b6=bb6.getText();
		String b7=bb7.getText();
		String b8=bb8.getText();
		String b9=bb9.getText();
		
		
		//-----------X WINNING CONDITION---------------
		if(b1==("X") && b2==("X") && b3==("X")) {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		if(b4=="X" && b5=="X" && b6=="X") {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		if(b7=="X" && b8=="X" && b9=="X") {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		//--
		if(b1=="X" && b5=="X" && b9=="X") {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		if(b3=="X" && b5=="X" && b7=="X") {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		//--
		if(b1=="X" && b4=="X" && b7=="X") {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		if(b2=="X" && b5=="X" && b8=="X") {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		if(b3=="X" && b6=="X" && b9=="X") {
			JOptionPane.showConfirmDialog(frame, "Player X wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl1co++;gameScore();reset();
		}
		
		//-----------O WINNING CONDITION---------------
		if(b1=="O" && b2=="O" && b3=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		if(b4=="O" && b5=="O" && b6=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		if(b7=="O" && b8=="O" && b9=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		//--
		if(b1=="O" && b5=="O" && b9=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		if(b3=="O" && b5=="O" && b7=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		//--
		if(b1=="O" && b4=="O" && b7=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		if(b2=="O" && b5=="O" && b8=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		if(b3=="O" && b6=="O" && b9=="O") {
			JOptionPane.showConfirmDialog(frame, "Player O wins","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			pl2co++;gameScore();reset();
		}
		
		//--------------TIE CONDITION--------------------
		if(numco==9) {
			JOptionPane.showConfirmDialog(frame, "It's a tie","VicvacVoe", JOptionPane.INFORMATION_MESSAGE);
			reset();
		}
		
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblTictactoe = new JLabel("VicVacVoe");
		panel_1.add(lblTictactoe);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(3, 3, 1, 1));
		
		JPanel pp1 = new JPanel();
		pp1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp1);
		pp1.setLayout(new BorderLayout(0, 0));
		
		bb1 = new JButton("");
		bb1.setFont(new Font("Dialog", Font.BOLD, 50));
		bb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb1.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb1.setForeground(Color.RED);
				else
					bb1.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
			
		});
		pp1.add(bb1, BorderLayout.CENTER);
		
		JPanel pp2 = new JPanel();
		pp2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp2);
		pp2.setLayout(new BorderLayout(0, 0));
		
		bb2 = new JButton("");
		bb2.setFont(new Font("Dialog", Font.BOLD, 50));
		bb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb2.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb2.setForeground(Color.RED);
				else
					bb2.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp2.add(bb2, BorderLayout.CENTER);
		
		JPanel pp3 = new JPanel();
		pp3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp3);
		pp3.setLayout(new BorderLayout(0, 0));
		
		bb3 = new JButton("");
		bb3.setFont(new Font("Dialog", Font.BOLD, 50));
		bb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb3.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb3.setForeground(Color.RED);
				else
					bb3.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp3.add(bb3, BorderLayout.CENTER);
		
		JPanel pp4 = new JPanel();
		pp4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp4);
		pp4.setLayout(new BorderLayout(0, 0));
		
		bb4 = new JButton("");
		bb4.setFont(new Font("Dialog", Font.BOLD, 50));
		bb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb4.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb4.setForeground(Color.RED);
				else
					bb4.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp4.add(bb4, BorderLayout.CENTER);
		
		JPanel pp5 = new JPanel();
		pp5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp5);
		pp5.setLayout(new BorderLayout(0, 0));
		
		bb5 = new JButton("");
		bb5.setFont(new Font("Dialog", Font.BOLD, 50));
		bb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb5.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb5.setForeground(Color.RED);
				else
					bb5.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp5.add(bb5, BorderLayout.CENTER);
		
		JPanel pp6 = new JPanel();
		pp6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp6);
		pp6.setLayout(new BorderLayout(0, 0));
		
		bb6 = new JButton("");
		bb6.setFont(new Font("Dialog", Font.BOLD, 50));
		bb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb6.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb6.setForeground(Color.RED);
				else
					bb6.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp6.add(bb6, BorderLayout.CENTER);
		
		JPanel pp7 = new JPanel();
		pp7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp7);
		pp7.setLayout(new BorderLayout(0, 0));
		
		bb7 = new JButton("");
		bb7.setFont(new Font("Dialog", Font.BOLD, 50));
		bb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb7.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb7.setForeground(Color.RED);
				else
					bb7.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp7.add(bb7, BorderLayout.CENTER);
		
		JPanel pp8 = new JPanel();
		pp8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp8);
		pp8.setLayout(new BorderLayout(0, 0));
		
		bb8 = new JButton("");
		bb8.setFont(new Font("Dialog", Font.BOLD, 50));
		bb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb8.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb8.setForeground(Color.RED);
				else
					bb8.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp8.add(bb8, BorderLayout.CENTER);
		
		JPanel pp9 = new JPanel();
		pp9.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.add(pp9);
		pp9.setLayout(new BorderLayout(0, 0));
		
		bb9 = new JButton("");
		bb9.setFont(new Font("Dialog", Font.BOLD, 50));
		bb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb9.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) 
					bb9.setForeground(Color.RED);
				else
					bb9.setForeground(Color.BLUE);
				
				numco++;
				choosePlayer();winningCond();
			}
		});
		pp9.add(bb9, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(3, 2, 2, 2));
		
		JPanel pl1 = new JPanel();
		panel_2.add(pl1);
		
		JLabel lblPlayer1 = new JLabel("Player 1");
		pl1.add(lblPlayer1);
		
		JPanel pl2 = new JPanel();
		panel_2.add(pl2);
		
		JLabel lblPlayer2 = new JLabel("Player 2");
		pl2.add(lblPlayer2);
		
		JButton Reset = new JButton("RESET");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bb1.setText(null);
				bb2.setText(null); bb3.setText(null); bb4.setText(null); bb5.setText(null);
				bb6.setText(null); bb7.setText(null); bb8.setText(null); bb9.setText(null);
			}
		});
		
		t1s = new JTextField();
		t1s.setText("0");
		panel_2.add(t1s);
		t1s.setColumns(10);
		
		t2s = new JTextField();
		t2s.setText("0");
		panel_2.add(t2s);
		t2s.setColumns(10);
		
		panel_2.add(Reset);
		
		JButton Exit = new JButton("EXIT");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","VicvacVoe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		panel_2.add(Exit);
		
		
		
		JPanel panel = new JPanel(); panel.setBorder(new
		BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	  	
		 
	}

}
