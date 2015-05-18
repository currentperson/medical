package cn.edu.nankai.medicalproject.data;

import java.util.ArrayList;

public class Item {

	private String title;
	private Range maleRange;
	private Range femaleRange;
	private String units;
	private ArrayList<String> increasePhysiologicalReasons;
	private ArrayList<String> increasePsychologicalReasons;
	private ArrayList<String> decreasePhysiologicalReasons;
	private ArrayList<String> decreasePsychologicalReasons;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Range getMaleRange() {
		return maleRange;
	}

	public void setMaleRange(Range maleRange) {
		this.maleRange = maleRange;
	}

	public Range getFemaleRange() {
		return femaleRange;
	}

	public void setFemaleRange(Range femaleRange) {
		this.femaleRange = femaleRange;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public ArrayList<String> getIncreasePhysiologicalReasons() {
		return increasePhysiologicalReasons;
	}

	public void setIncreasePhysiologicalReasons(
			ArrayList<String> increasePhysiologicalReasons) {
		this.increasePhysiologicalReasons = increasePhysiologicalReasons;
	}

	public ArrayList<String> getIncreasePsychologicalReasons() {
		return increasePsychologicalReasons;
	}

	public void setIncreasePsychologicalReasons(
			ArrayList<String> increasePsychologicalReasons) {
		this.increasePsychologicalReasons = increasePsychologicalReasons;
	}

	public ArrayList<String> getDecreasePhysiologicalReasons() {
		return decreasePhysiologicalReasons;
	}

	public void setDecreasePhysiologicalReasons(
			ArrayList<String> decreasePhysiologicalReasons) {
		this.decreasePhysiologicalReasons = decreasePhysiologicalReasons;
	}

	public ArrayList<String> getDecreasePsychologicalReasons() {
		return decreasePsychologicalReasons;
	}

	public void setDecreasePsychologicalReasons(
			ArrayList<String> decreasePsychologicalReasons) {
		this.decreasePsychologicalReasons = decreasePsychologicalReasons;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String title, Range maleRange, Range femaleRange,
			ArrayList<String> increasePhysiologicalReasons,
			ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,
			ArrayList<String> decreasePsychologicalReasons) {
		super();
		this.title = title;
		this.maleRange = maleRange;
		this.femaleRange = femaleRange;
		this.increasePhysiologicalReasons = (ArrayList<String>)increasePhysiologicalReasons.clone();
		this.increasePsychologicalReasons = (ArrayList<String>)increasePsychologicalReasons.clone();
		this.decreasePhysiologicalReasons = (ArrayList<String>)decreasePhysiologicalReasons.clone();
		this.decreasePsychologicalReasons = (ArrayList<String>)decreasePsychologicalReasons.clone();
		//System.out.println("this.strincreasePhysiologicalReasons: " + this.increasePhysiologicalReasons.size());
		//System.out.println("showDetailOfArrayList" + showDetailOfArrayList(increasePhysiologicalReasons));
	}

	public Item(String title, Range maleRange, Range femaleRange, String units,
			ArrayList<String> increasePhysiologicalReasons,
			ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,
			ArrayList<String> decreasePsychologicalReasons) {
		super();
		this.title = title;
		this.maleRange = maleRange;
		this.femaleRange = femaleRange;
		this.units = units;
		this.increasePhysiologicalReasons = (ArrayList<String>)increasePhysiologicalReasons.clone();
		this.increasePsychologicalReasons = (ArrayList<String>)increasePsychologicalReasons.clone();
		this.decreasePhysiologicalReasons = (ArrayList<String>)decreasePhysiologicalReasons.clone();
		this.decreasePsychologicalReasons = (ArrayList<String>)decreasePsychologicalReasons.clone();
	}

	private String showDetailOfArrayList(ArrayList<String> strs){
		String result = "";
		//System.out.println("size0: " + strs.size());
		for(String item : strs){
			result += item + ".";
		}
		//System.out.println("size" + strs.size());
		return result;
	}
	
	@Override
	public String toString() {
		//System.out.println("before item:" + increasePhysiologicalReasons.size());
		return "Item [title=" + title + ", maleRange=" + maleRange
				+ ", femaleRange=" + femaleRange + ", units=" + units
				+ ", increasePhysiologicalReasons="
				+ showDetailOfArrayList(this.increasePhysiologicalReasons)
				+ ", increasePsychologicalReasons="
				+ showDetailOfArrayList(this.increasePsychologicalReasons)
				+ ", decreasePhysiologicalReasons="
				+ showDetailOfArrayList(this.decreasePhysiologicalReasons)
				+ ", decreasePsychologicalReasons="
				+ showDetailOfArrayList(this.decreasePsychologicalReasons) + "]";
	}
}
