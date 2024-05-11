package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import view.MycolorView;

public class MycolorListener implements ActionListener {

	private MycolorView mycolorView;

	public MycolorListener(MycolorView mycolorView) {
		this.mycolorView = mycolorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();//lay ra luong su kien
		
		if(src.equals("Red Text")) {
			this.mycolorView.changeTEXTColor(Color.RED);
		}else if(src.equals("Yellow Text")){
			this.mycolorView.changeTEXTColor(Color.YELLOW);
		}else if(src.equals("Green Text")){
			this.mycolorView.changeTEXTColor(Color.GREEN);
		}else if(src.equals("Red Background")){
			this.mycolorView.changeBACKGROUNDColor(Color.RED);
		}else if(src.equals("Yellow Background")){
			this.mycolorView.changeBACKGROUNDColor(Color.YELLOW);
		}else if(src.equals("Green Background")){
			this.mycolorView.changeBACKGROUNDColor(Color.GREEN);
		}
		else {}
		
		}
}
