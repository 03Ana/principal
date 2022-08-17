import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Window {
	
	JFrame frame = new JFrame();
	JPanel panouButoane = new JPanel();
	JTextArea text = new JTextArea();
	
	JButton buton1 = new JButton("1");
	JButton buton2 = new JButton("2");
	JButton buton3 = new JButton("3");
	JButton buton4 = new JButton("4");
	JButton buton5 = new JButton("5");
	JButton buton6 = new JButton("6");
	JButton buton7 = new JButton("7");
	JButton buton8 = new JButton("8");
	JButton buton9 = new JButton("9");
	JButton buton0 = new JButton("0");
	JButton butonplus = new JButton("+");
	JButton butonminus = new JButton("-");
	JButton butoninmultire = new JButton("x");
	JButton butonimpartire = new JButton("/");
	JButton butonsterge = new JButton("C");
	JButton butonegal = new JButton("=");
	
	public Window() {
		
		frame.setTitle("Minicalculator");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setSize(500, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new GridLayout(2, 1));
		frame.setLayout(new FlowLayout());
		text.setColumns(13);
		text.setRows(4);
		text.setFont(new Font("Serif",Font.PLAIN,40));
		
		panouButoane.setBackground(Color.pink);
		panouButoane.setPreferredSize(new Dimension(500, 400));
//		panouButoane.setLayout(new GridLayout(4, 4));
		panouButoane.setLayout(new GridLayout(4, 4, 5, 5));
		
		buton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText()+"1");
				
			}
		});
		buton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"2");
				
			}
		});
		buton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.setText(text.getText()+"3");
				
			}
		});
		buton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"4");
				
			}
		});
        buton5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"5");
				
			}
		});
        buton6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"6");
				
			}
		});
        buton7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"7");
				
			}
		});
        buton8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"8");
				
			}
		});
        buton9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"9");
				
			}
		});
        buton0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"0");
				
			}
		});
        butonplus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"+");
				
			}
		});
        butonminus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"-");
				
			}
		});
        butoninmultire.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"x");
				
			}
		});
        butonimpartire.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText(text.getText()+"/");
				
			}
		});
        butonsterge.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    text.setText("");
				
			}
		});
        butonegal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Operation op = new Operation();
			    text.setText(text.getText()+"="+ op.calcul(text.getText()));
				
			}
		});
        
		panouButoane.add(butonsterge);
		panouButoane.add(butonplus);
		panouButoane.add(butonminus);
		panouButoane.add(butoninmultire);
		panouButoane.add(buton1);
		panouButoane.add(buton2);
		panouButoane.add(buton3);
		panouButoane.add(butonimpartire);
		panouButoane.add(buton4);
		panouButoane.add(buton5);
		panouButoane.add(buton6);
		panouButoane.add(butonegal);
		panouButoane.add(buton7);
		panouButoane.add(buton8);
		panouButoane.add(buton9);
		panouButoane.add(buton0);
		
		frame.add(text);
		frame.add(panouButoane);
		
//		ultima linie
		frame.setVisible(true);
		
	}

	
}
