package com.market.main;

import javax.swing.*;
import java.awt.*;




public class GusetWindow extends JFrame {
	
	public GusetWindow(String title, int x, int y, int width, int heigth) {
		initContainer(title, x, y, width, height);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./images/shop.png").getImage());
		
	}
	private void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height);
		setLayout(null);
		
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) /2);
		JPanel userPanel = new JPanel();
	}

}
