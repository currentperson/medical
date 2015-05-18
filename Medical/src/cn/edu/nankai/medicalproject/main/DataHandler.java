package cn.edu.nankai.medicalproject.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import cn.edu.nankai.medicalproject.data.Database;
import cn.edu.nankai.medicalproject.data.GlobalInfo;
import cn.edu.nankai.medicalproject.data.Item;

import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;

public class DataHandler {

	private static void merge(ArrayList<String> reasons,
			HashMap<String, Integer> results) {

		for (String reason : reasons) {
			if (results.size() == 0) {
				results.put(reason, 1);
				continue;
			}

			for (int i = 0; i < results.size(); i++) {
				if (results.containsKey(reason)) {
					results.put(reason, results.get(reason) + 1);
				} else {
					results.put(reason, 1);
				}
			}
		}

	}

	public static void handleData() {

		ArrayList<String> resultOfPhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> resultOfPsychologicalReasons = new ArrayList<String>();

		Database database = new Database();
		/*
		 * for(Item item :database.getData().getItems()){
		 * System.out.println(item.toString()); }
		 */
/*
		Iterator<Entry<String, Double>> iteratorForTranslation = GlobalInfo.item.entrySet().iterator();
		while (iteratorForTranslation.hasNext()) {
			Entry<String, Double> entry = iteratorForTranslation.next();*/
			//inputs.add(entry.getValue());
			for(int i = 0; i< 15;i++){
				inputs.add(item[i]);
				//System.out.println("value: " + inputs);
			}
			
		

		//System.out.println("size: " + inputs.size());
		
		ArrayList<Item> items = database.getData().getItems();
		
		//System.out.println("items: " + items.size());
		
		for (int i = 0; i < inputs.size(); i++) {
			if(inputs.get(i) < 0){
				//System.out.println("< 0: " + i);
				continue;
			}
				
			if(isMale){
				if (inputs.get(i) < items.get(i).getMaleRange().getStart()) {
					//System.out.println("input < malestart: " + i);
					resultOfPhysiologicalReasons.addAll(items.get(i)
							.getDecreasePhysiologicalReasons());
					resultOfPsychologicalReasons.addAll(items.get(i)
							.getDecreasePsychologicalReasons());
				} else if (inputs.get(i) > items.get(i).getMaleRange().getEnd()) {
					resultOfPhysiologicalReasons.addAll(items.get(i)
							.getIncreasePhysiologicalReasons());
					resultOfPsychologicalReasons.addAll(items.get(i)
							.getIncreasePsychologicalReasons());
				}
			}else{
				//System.out.println("Female");
				if (inputs.get(i) < items.get(i).getFemaleRange().getStart()) {
					resultOfPhysiologicalReasons.addAll(items.get(i)
							.getDecreasePhysiologicalReasons());
					resultOfPsychologicalReasons.addAll(items.get(i)
							.getDecreasePsychologicalReasons());
				} else if (inputs.get(i) > items.get(i).getFemaleRange().getEnd()) {
					resultOfPhysiologicalReasons.addAll(items.get(i)
							.getIncreasePhysiologicalReasons());
					resultOfPsychologicalReasons.addAll(items.get(i)
							.getIncreasePsychologicalReasons());
				}
			}
			
		}
		merge(resultOfPhysiologicalReasons, resultsForPhysiological);
		merge(resultOfPsychologicalReasons, resultsForPsychologica);

		int amount = 0;
		Iterator<Entry<String, Integer>> iterator = resultsForPhysiological.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			//System.out.println(entry.getKey() + " : " +  entry.getValue());
			//amount += entry.getValue();
		}
		
		Iterator<Entry<String, Integer>> iterator2 = resultsForPsychologica.entrySet()
				.iterator();
		while (iterator2.hasNext()) {
			Entry<String, Integer> entry = iterator2.next();
			//System.out.println("2: " + entry.getKey() + " : " +  entry.getValue());
			//amount += entry.getValue();
		}
	}
}
