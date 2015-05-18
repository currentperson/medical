package com.nankai.project;


import java.awt.Font;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;
public class PieChart {
	ChartPanel frame1;
	DefaultPieDataset data;
	public PieChart(HashMap hashMap,String name){
		  data = getDataSet(hashMap);
	      JFreeChart chart = ChartFactory.createPieChart3D(name,data,true,false,false);
	    //���ðٷֱ�
	      PiePlot pieplot = (PiePlot) chart.getPlot();
	      DecimalFormat df = new DecimalFormat("0.00%");//���һ��DecimalFormat������Ҫ������С������
	      NumberFormat nf = NumberFormat.getNumberInstance();//���һ��NumberFormat����
	      StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//���StandardPieSectionLabelGenerator����
	      pieplot.setLabelGenerator(sp1);//���ñ�ͼ��ʾ�ٷֱ�
	  
	  //û�����ݵ�ʱ����ʾ������
	      pieplot.setNoDataMessage("��������ʾ");
	      pieplot.setCircular(false);
	      pieplot.setLabelGap(0.02D);
	  
	      pieplot.setIgnoreNullValues(true);//���ò���ʾ��ֵ
	      pieplot.setIgnoreZeroValues(true);//���ò���ʾ��ֵ
	     frame1=new ChartPanel (chart,true);
	      chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
	      PiePlot piePlot= (PiePlot) chart.getPlot();//��ȡͼ���������
	      piePlot.setLabelFont(new Font("����",Font.BOLD,10));//�������
	      chart.getLegend().setItemFont(new Font("����",Font.BOLD,10));
	}
   private static DefaultPieDataset getDataSet(HashMap<String, Integer> hashmap) {
       DefaultPieDataset dataset = new DefaultPieDataset();
       Iterator<Entry<String, Integer>> iterator = hashmap.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			dataset.setValue(entry.getKey(),entry.getValue());
		}
/*       dataset.setValue("ƻ��",100);
       dataset.setValue("����",200);
       dataset.setValue("����",300);
       dataset.setValue("�㽶",400);
       dataset.setValue("��֦",500);*/

       return dataset;
}
   public ChartPanel getChartPanel(){
   	return frame1;
   	
   }
}
