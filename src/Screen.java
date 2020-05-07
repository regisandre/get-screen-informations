package be.sioxox.utils;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;

public class Screen {
	public int getNumberScreens() {
		GraphicsDevice[] gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
		return gd.length;
	}

	public String getActualScreen() {
		return MouseInfo.getPointerInfo().getDevice().getIDstring().substring(8);
	}
	
	public String getScreensDimension() {
		String screensDimension = "";
		GraphicsDevice[] gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
		
		for (int i = 0; i < gd.length; i++) {
			screensDimension = screensDimension + "Screen dimension " + Integer.toString(i) + ": " + gd[i].getDisplayMode().getWidth() + "*" + gd[i].getDisplayMode().getHeight() + "\n";
		}
		
		return screensDimension;
	}

	public int getMaxWidth() {
		int maxWidth = 0;
		GraphicsDevice[] gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();

		for (int i = 0; i < gd.length; i++) {
			if (maxWidth < gd[i].getDisplayMode().getWidth()) {
				maxWidth = gd[i].getDisplayMode().getWidth();
			}
		}

		return maxWidth;
	}

	public int getMaxHeight() {
		int maxHeight = 0;
		GraphicsDevice[] gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();

		for (int i = 0; i < gd.length; i++) {
			if (maxHeight < gd[i].getDisplayMode().getHeight()) {
				maxHeight = gd[i].getDisplayMode().getHeight();
			}
		}

		return maxHeight;
	}

	public int getTotalWidth() {
		int totalWidth = 0;
		GraphicsDevice[] gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();

		for (int i = 0; i < gd.length; i++) {
			totalWidth = totalWidth + gd[i].getDisplayMode().getWidth();
		}

		return totalWidth;
	}
	
	public void getScreensInfos() throws Exception {
		System.out.println("Number of screen(s): " + getNumberScreens());

		System.out.println("Actual screen: " + getActualScreen());

		System.out.println(getScreensDimension());
	}
}
