package com.nankai.project;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.SOUTH;
import static java.awt.BorderLayout.NORTH;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.TreeMap;

import javax.swing.JOptionPane;

import cn.edu.nankai.medicalproject.main.DataHandler;

import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;

public class Second {
	JFrame f = new JFrame("�ڶ���");
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel pic = new JPanel(){public void paintComponent(Graphics g) {
        ImageIcon icon = new ImageIcon("Image/1.png");
        icon.setImage(icon.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT));
        g.drawImage(icon.getImage(), 0, 0, this.getWidth(),this.getHeight(), this);
    }};
	JButton bt = new JButton("��һ��");
	String name[] = { "��ϸ������", "Ѫ�쵰�ײⶨ", "��ϸ��ѹ��", "ƽ����ϸ�����", "ƽ����ϸ��Ѫ�쵰����",
			"ƽ����ϸ��Ѫ�쵰��Ũ��", "��ϸ������ֲ����", "��ϸ������", "������ϸ��", "��������ϸ��", "�ȼ�����ϸ��",
			"�ܰ�ϸ��", "����ϸ��", "ѪС�����", "ƽ��ѪС�����" };
	JLabel label[] = new JLabel[15];
	
	
	JTextField content[] = new JTextField[15];
	
	Patient patient = new Patient();

	
	public Patient init() {
		
		//f.setLocation(500, 500);
		f.setSize(400, 500);
		f.setLocationRelativeTo(null);  
		p1.setLayout(new GridLayout(2, 1));
		p.setLayout(new GridLayout(15, 2));
		//p.add(agelabel);
		for(int i = 0; i < 15; i++){
			label[i]=new JLabel(name[i]);
			p.add(label[i]);
			content[i] = new JTextField();
			p.add(content[i]);
			
		}
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				boolean isEmpty = false;
				boolean isFalse = false;
				for(int i = 0; i < 15; i++){
					if(content[i].getText().equals(""))
					{
						isEmpty = true;
					}
					else{
						try {  
							Double.parseDouble(content[i].getText());   } 
						catch (NumberFormatException e) {   
							isFalse = true;  
							}
					}
				}
				/*if (isEmpty) {

					JOptionPane.showMessageDialog(f, "������ȫ����Ϣ");
				}*/
			    if (isFalse) {

					JOptionPane.showMessageDialog(f, "��������ȷ��Ϣ");
				}else {
					//patient = GetSecondInfo();
					GetInfo();
					DataHandler.handleData();
					new Third().init();
					f.setVisible(false);
				}
			}
		});
		p1.add(pic);
		p1.add(p);
		//f.add(pic,NORTH);
		f.add(bt, SOUTH);
		f.add(p1, CENTER);
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//f.pack();
		f.setVisible(true);
		return patient;
	}

	
	
	
	/*public Patient GetSecondInfo() {
		double d[]= new double[15];
		for(int i = 0; i < 15; i++){
			d[i] = Integer.parseInt(content[i].getText() == null ? "-1" : content[i].getText());
		}
		
		patient.setInfo(d);
		return patient;
	}*/
	public double[] GetInfo() {
		double d[]= new double[15];
		for(int i = 0; i < 15; i++){
			item[i] = content[i].getText().equals("") ? -1 : Double.parseDouble(content[i].getText());
		d[i]=item[i];
		//System.out.println("d[i]: " + item[i]);
		}
		/*for(int i = 0; i < 15; i++){
			item.put(name[i], d[i]);
			System.out.println("d[i]: " + d[i]);
		}*/

		return d;
	}

	/*public static void main(String[] args) {
		new FirstFrame().init();
	}*/

}
