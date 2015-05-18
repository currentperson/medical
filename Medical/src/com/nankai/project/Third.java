package com.nankai.project;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.jfree.chart.ChartPanel;
import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;
public class Third {
	Frame frame = new Frame();
	//Frame f = new Frame();
	PieChart pieChart = new PieChart(resultsForPhysiological,"生理因素");
	ChartPanel chartpanel = pieChart.getChartPanel();
	PieChart pieChart2 = new PieChart(resultsForPsychologica,"病理因素");
	ChartPanel chartpanel2 = pieChart2.getChartPanel();
	Panel panel = new Panel();
	Panel panel2 = new Panel();
	public void init(){
		frame.setLayout(new GridLayout(2, 1));
		/*panel.add(chartpanel);
		panel2.add(chartpanel2);*/
		frame.add(chartpanel);
		frame.add(chartpanel2);
		panel.setVisible(true);
		panel2.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		frame.pack();
	
		  frame.setVisible(true);

		  frame.setLocationRelativeTo(null);
		
	}



}
