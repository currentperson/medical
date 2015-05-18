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
	    //设置百分比
	      PiePlot pieplot = (PiePlot) chart.getPlot();
	      DecimalFormat df = new DecimalFormat("0.00%");//获得一个DecimalFormat对象，主要是设置小数问题
	      NumberFormat nf = NumberFormat.getNumberInstance();//获得一个NumberFormat对象
	      StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//获得StandardPieSectionLabelGenerator对象
	      pieplot.setLabelGenerator(sp1);//设置饼图显示百分比
	  
	  //没有数据的时候显示的内容
	      pieplot.setNoDataMessage("无数据显示");
	      pieplot.setCircular(false);
	      pieplot.setLabelGap(0.02D);
	  
	      pieplot.setIgnoreNullValues(true);//设置不显示空值
	      pieplot.setIgnoreZeroValues(true);//设置不显示负值
	     frame1=new ChartPanel (chart,true);
	      chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体
	      PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象
	      piePlot.setLabelFont(new Font("宋体",Font.BOLD,10));//解决乱码
	      chart.getLegend().setItemFont(new Font("黑体",Font.BOLD,10));
	}
   private static DefaultPieDataset getDataSet(HashMap<String, Integer> hashmap) {
       DefaultPieDataset dataset = new DefaultPieDataset();
       Iterator<Entry<String, Integer>> iterator = hashmap.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			dataset.setValue(entry.getKey(),entry.getValue());
		}
/*       dataset.setValue("苹果",100);
       dataset.setValue("梨子",200);
       dataset.setValue("葡萄",300);
       dataset.setValue("香蕉",400);
       dataset.setValue("荔枝",500);*/

       return dataset;
}
   public ChartPanel getChartPanel(){
   	return frame1;
   	
   }
}
