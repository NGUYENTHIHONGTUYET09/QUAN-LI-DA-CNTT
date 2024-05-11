package model;

import java.awt.Color;

//setForeground(Color c); -> mau chu
// setBackground(Color c); -> mau nen
// setOpaque(boolean); -> to mau cai vien

public class MycolorModel {
	private Color foreground;
	private Color background;
	private boolean opaque;

	public MycolorModel() {
		this.foreground = Color.BLACK;
		this.background = Color.WHITE;
		this.opaque = true; // co doi mau vien ko

	}

	public Color getBackground() {
		return background;
	}


	public void setBackground(Color background) {
		this.background = background;
	}

	public Color getForeground() {
		return foreground;
	}

	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}
	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}

}
