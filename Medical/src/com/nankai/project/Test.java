package com.nankai.project;


import javax.swing.JFrame;

import com.nankai.project.FirstFrame;

public class Test {
	public static void main(String[] args) 
	{
		FirstFrame frame = new FirstFrame("��ӭʹ��");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //ʹ����ɼ�������show()��ʱ�ˡ�
	}

}
