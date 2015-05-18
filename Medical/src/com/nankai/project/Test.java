package com.nankai.project;


import javax.swing.JFrame;

import com.nankai.project.FirstFrame;

public class Test {
	public static void main(String[] args) 
	{
		FirstFrame frame = new FirstFrame("欢迎使用");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //使窗体可见，不用show()过时了。
	}

}
