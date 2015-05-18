package cn.edu.nankai.medicalproject.data;

import java.util.ArrayList;

public class Data {

	private ArrayList<Item> items;

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(ArrayList<Item> items) {
		super();
		this.items = items;
	}

	@Override
	public String toString() {
		return "Data [items=" + items + "]";
	}
	
}
