package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MycolorListener;
import model.MycolorModel;

public class MycolorView extends JFrame {

	private MycolorModel mycolorModel;
	private JLabel jLabel;

	public MycolorView() {
		this.mycolorModel = new MycolorModel();
		this.init();

	}

	public void init() {
		this.setTitle("My color");
		this.setSize(600, 600);

		this.setLocationRelativeTo(null);// hien thi giua man hinh
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ----------------------------------
		// them thanh phan vo phan nay

		// setup font text
		Font font_text = new Font("Arial", Font.BOLD, 80);
		jLabel = new JLabel(" ***TEXT.................*** ");
		jLabel.setFont(font_text);

		// set font chu va font TEXT
		Font font = new Font("Arial", Font.BOLD, 30);
//		Font font_text = new Font("Arial", Font.BOLD,100);
		
		
		MycolorListener mycolorListener = new MycolorListener(this);
 
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3)); // 2 dong 3 cot size = nhau

		// 3 nut chinh mau text , 3 nut mau nen
		// mau text
		JButton jButton_text_red = new JButton("Red Text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(mycolorListener);


		JButton jButton_text_yellow = new JButton("Yellow Text");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.addActionListener(mycolorListener);


		JButton jButton_text_green = new JButton("Green Text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(mycolorListener);


		// mau nen
		JButton jButton_background_red = new JButton("Red Background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
		jButton_background_red.setOpaque(true);
		jButton_background_red.setBorderPainted(false);
		jButton_background_red.addActionListener(mycolorListener);


		JButton jButton_background_yellow = new JButton("Yellow Background");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.setOpaque(true);
		jButton_background_yellow.setBorderPainted(false);
		jButton_background_yellow.addActionListener(mycolorListener);


		JButton jButton_background_green = new JButton("Green Background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.setOpaque(true);
		jButton_background_green.setBorderPainted(false);
		jButton_background_green.addActionListener(mycolorListener);


		// ------------------
		// dua jbottun voo jpanel
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);

		
		// sau khi lam listener xong thi
		//MycolorListener mycolorListener = new MycolorListener(this);
//		jButton_text_red.addActionListener(mycolorListener);
//		jButton_text_yellow.addActionListener(mycolorListener);
//		jButton_text_green.addActionListener(mycolorListener);
//		jButton_background_red.addActionListener(mycolorListener);
//		jButton_background_yellow.addActionListener(mycolorListener);
//		jButton_background_green.addActionListener(mycolorListener);
		
		
		// dat vi tri cho tung khu vuc
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH); // text nam tren cung
		this.add(jPanel, BorderLayout.CENTER); // nut trong jpanel ow giua

		// --------------------------------------
		this.setVisible(true);

	}

	public void changeTEXTColor(Color color) {
		this.jLabel.setForeground(color);

	}

	public void changeBACKGROUNDColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true); // to mau vien

	}

}
