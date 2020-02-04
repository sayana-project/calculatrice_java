package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calcfra {

	private JFrame frmCalculatrice;
	private JTextField cTextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcfra window = new calcfra();
					window.frmCalculatrice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcfra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatrice = new JFrame();
		frmCalculatrice.getContentPane().setFocusTraversalKeysEnabled(false);
		frmCalculatrice.getContentPane().setFocusable(false);
		frmCalculatrice.getContentPane().setLayout(null);
		
		cTextfield = new JTextField();
		cTextfield.setBounds(0, 13, 420, 22);
		frmCalculatrice.getContentPane().add(cTextfield);
		cTextfield.setColumns(10);
		
		JButton but1 = new JButton("1");
		but1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "1");
			}
		});
		
		but1.setBounds(10, 68, 76, 25);
		frmCalculatrice.getContentPane().add(but1);
		
		JButton but4 = new JButton("4");
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "4");
			}
		});
		
		but4.setBounds(10, 106, 76, 25);
		frmCalculatrice.getContentPane().add(but4);
		
		JButton but7 = new JButton("7");
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "7");
			}
		});
		
		but7.setBounds(10, 144, 76, 25);
		frmCalculatrice.getContentPane().add(but7);
		
		JButton but0 = new JButton("0");
		but0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText("cTextfield.getText() + 0");
			}
		});
		
		but0.setBounds(10, 182, 76, 25);
		frmCalculatrice.getContentPane().add(but0);
		
		JButton but2 = new JButton("2");
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "2");
			}
		});
		
		but2.setBounds(98, 68, 76, 25);
		frmCalculatrice.getContentPane().add(but2);
		
		JButton but5 = new JButton("5");
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "5");
			}
		});
		
		but5.setBounds(98, 106, 76, 25);
		frmCalculatrice.getContentPane().add(but5);
		
		JButton but8 = new JButton("8");
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "8");
			}
		});
		
		but8.setBounds(98, 144, 76, 25);
		frmCalculatrice.getContentPane().add(but8);
		
		JButton butpoint = new JButton(".");
		butpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + ".");
			}
		});
		
		butpoint.setBounds(98, 182, 76, 25);
		frmCalculatrice.getContentPane().add(butpoint);
		
		JButton but3 = new JButton("3");
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "3");
			}
		});
		
		but3.setBounds(186, 68, 76, 25);
		frmCalculatrice.getContentPane().add(but3);
		
		JButton but6 = new JButton("6");
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "6");
			}
		});
		
		but6.setBounds(186, 106, 76, 25);
		frmCalculatrice.getContentPane().add(but6);
		
		JButton but9 = new JButton("9");
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "9");
			}
		});
		
		but9.setBounds(186, 144, 76, 25);
		frmCalculatrice.getContentPane().add(but9);
		
		JButton butc = new JButton("C");
		butc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(null);
			}
		});
		
		butc.setBounds(186, 182, 76, 25);
		frmCalculatrice.getContentPane().add(butc);
		
		JButton buts = new JButton("-");
		buts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "-");
			}
		});
		
		buts.setBounds(362, 68, 58, 63);
		frmCalculatrice.getContentPane().add(buts);
		
		JButton buta = new JButton("+");
		buta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "+");
			}
		});
		
		buta.setBounds(292, 68, 58, 63);
		frmCalculatrice.getContentPane().add(buta);
		
		JButton butm = new JButton("*");
		butm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "*");
			}
		});
		
		butm.setBounds(292, 144, 58, 63);
		frmCalculatrice.getContentPane().add(butm);
		
		JButton butd = new JButton("/");
		butd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cTextfield.setText(cTextfield.getText() + "/");
			}
		});
		
		butd.setBounds(362, 144, 58, 63);
		frmCalculatrice.getContentPane().add(butd);
		
		JButton butega = new JButton("=");
		butega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		butega.setBounds(10, 221, 190, 25);
		frmCalculatrice.getContentPane().add(butega);
		
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int longtext = cTextfield.getText().length();
				int number = cTextfield.getText().length()-1;
				String store;
				
				if(longtext>0){
					StringBuilder back= new StringBuilder(cTextfield.getText());
					back.deleteCharAt(number);
					store = back.toString();
					cTextfield.setText(store);
				}
			}
		});
		button.setBounds(219, 221, 190, 25);
		frmCalculatrice.getContentPane().add(button);
		
		frmCalculatrice.setType(Type.UTILITY);
		frmCalculatrice.setTitle("Calculatrice");
		frmCalculatrice.setBounds(100, 100, 450, 309);
		frmCalculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
