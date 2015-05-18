package cn.edu.nankai.medicalproject.data;

import java.util.ArrayList;

public class Database {

	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	private void clearItems(ArrayList<String> increasePhysiologicalReasons,ArrayList<String> increasePsychologicalReasons,
			ArrayList<String> decreasePhysiologicalReasons,ArrayList<String> decreasePsychologicalReasons){
		 increasePhysiologicalReasons.clear();
		 increasePsychologicalReasons.clear();
		 decreasePhysiologicalReasons.clear();
		 decreasePsychologicalReasons.clear();
	}
	
	private void addToArrayList(ArrayList<String> arrayList,String[] strings){
		for(String str : strings){
			arrayList.add(str);
		}
		//System.out.println("size2: " + arrayList.size());
	}
	
	private void initialData(){
		Item item;
		ArrayList<Item> items = new ArrayList<Item>();
		ArrayList<String> increasePhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> increasePsychologicalReasons = new ArrayList<String>();
		ArrayList<String> decreasePhysiologicalReasons = new ArrayList<String>();
		ArrayList<String> decreasePsychologicalReasons = new ArrayList<String>();
        
		String[] strincreasePhysiologicalReasons = new String[]{"��������","ȱ��","�����Ѫ��","������"};
		String[] strincreasePsychologicalReasons = new String[]{"�����Ժ�ϸ���ͷ�����","����ԭ�����µ�ѪҺŨ��","���������ಡ","���Է��༲��","��ϸ������","ҩ������"};
		String[] strdecreasePhysiologicalReasons = new String[]{"3���µ�Ӥ����15����ǰ�Ķ�ͯ�����","�����˹�����Ѫ���ܼ���","ѪҺϡ��(�����С�����)"};
		String[] strdecreasePsychologicalReasons = new String[]{"������ʧѪ","Ѫ������Ѫ","Ѫ������Ѫ","������ƶѪ","ҩ������"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		//System.out.println("strincreasePhysiologicalReasons: " + increasePhysiologicalReasons.size());
		item = new Item("��ϸ������",new Range(4.3, 5.9),new Range(3.9, 5.2),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"��������","ȱ��","�����Ѫ��","������","��������"};
		strincreasePsychologicalReasons = new String[]{"�����Ժ�ϸ���ͷ�����","����ԭ�����µ�ѪҺŨ��","���������ಡ","���Է��༲��","��ϸ������"};
		strdecreasePhysiologicalReasons = new String[]{"3���µ�Ӥ����15����ǰ�Ķ�ͯ�����","�����˹�����Ѫ���ܼ���","ѪҺϡ��(�����С�����)"};
		strdecreasePsychologicalReasons = new String[]{"��ȱ��","������ʧѪ","Ѫ������Ѫ","Ѫ������Ѫ","������ƶѪ","ҩ������"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("Ѫ�쵰�ײⶨ",new Range(137, 179),new Range(116, 155),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"��������","ȱ��","������"};
		strincreasePsychologicalReasons = new String[]{"�����Ժ�ϸ���ͷ�����","����ԭ�����µ�ѪҺŨ��","���������ಡ","���Է��༲��","��ϸ������"};
		strdecreasePhysiologicalReasons = new String[]{"3���µ�Ӥ����15����ǰ�Ķ�ͯ�����","�����˹�����Ѫ���ܼ���","ѪҺϡ��(�����С�����)"};
		strdecreasePsychologicalReasons = new String[]{"������ʧѪ","Ѫ������Ѫ","Ѫ������Ѫ","������ƶѪ","�ݿ�","����","���������"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("��ϸ��ѹ��",new Range(0.40, 0.52),new Range(0.37, 0.47),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"��ϸ����ƶѪ","ҩ��Ӱ��"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"����Сϸ����ƶѪ","Сϸ����ɫ����ƶѪ","ȫ������Ѫ��ƶѪ","ҩ��Ӱ��"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("ƽ����ϸ�����",new Range(80, 100),new Range(80, 100),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"ϸ����ƶѪ"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"����Сϸ����ƶѪ","Сϸ����ɫ����ƶѪ"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("ƽ����ϸ��Ѫ�쵰����",new Range(27, 34),new Range(27, 34),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"Сϸ����ɫ����ƶѪ"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("ƽ����ϸ��Ѫ�쵰��Ũ��",new Range(320, 360),new Range(320, 360),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		/*strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"Сϸ����ɫ����ƶѪ"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("ƽ����ϸ��Ѫ�쵰��Ũ��",new Range(320, 360),new Range(320, 360),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);*/
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"��ϸ������һ��ƶѪ","��ϸ������һ��ƶѪ","Сϸ������һ��ƶѪ"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"Сϸ����ɫ����ƶѪ"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("��ϸ������ֲ����",new Range(0, 14.5),new Range(0, 14.5),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"�¾�ǰ","���������","�����ڸ�Ů","�����˶�","��������","����","��������"};
		strincreasePsychologicalReasons = new String[]{"���Ժͻ�ŧ�Ը�Ⱦ","ȫ���Ⱦ","��������","���Դ��Ѫ��������Ѫ","��������","�ж�","��ϸ����Ѫ��","ҩ��Ӱ��"};
		strdecreasePhysiologicalReasons = new String[]{"Ů�Ծ�����"};
		strdecreasePsychologicalReasons = new String[]{"������Ⱦ","ĳЩ��Ⱦ��","ĳЩ��Ѫ��","��ѧҩƷ��������","���������Լ���","Ƣ���ܿ���","ҩ��Ӱ��"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("��ϸ������",new Range(3.50, 10.00),new Range(3.50, 10.00),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		

		strincreasePhysiologicalReasons = new String[]{"������","����","����","Ů�Ի�����"};
		strincreasePsychologicalReasons = new String[]{"���Ժͻ�ŧ�Ը�Ⱦ","�����ж�","��������","���Դ��Ѫ����Ѫ","�ϴ�������","��Ѫ��","�����ļ�����","����ֲ�����ųⷴӦ��"};
		strdecreasePhysiologicalReasons = new String[]{"�¾���","������"};
		strdecreasePsychologicalReasons = new String[]{"������Ⱦ","ĳЩ��Ѫ��","��ѧҩƷ��������","���������Լ���","Ƣ���ܿ���","�׿�"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("������ϸ��",new Range(0.50, 0.70),new Range(0.50, 0.70),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"�����没","ѪҺ��","�����Լ���","Ƥ����"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"�˺�","���˺�","Ӧ��״̬"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("��������ϸ��",new Range(0.01, 0.05),new Range(0.01, 0.05),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"����","����","�¾���"};
		strincreasePsychologicalReasons = new String[]{"������ֳ�Լ���","�����ж�","�����Խ᳦��","��״�ٺ��ܼ���֢","�����ۺ���"};
		strdecreasePhysiologicalReasons = new String[]{"������,������,������"};
		strdecreasePsychologicalReasons = new String[]{"���ͳ�����Ӧ���ٷ��ͱ�̬��Ӧ��","Ӧ����Ӧ","ʧѪ���ݿ�","��Ⱦ��������"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("�ȼ�����ϸ��",new Range(0.00, 0.01),new Range(0.00, 0.01),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"Ӥ����"};
		strincreasePsychologicalReasons = new String[]{"������Ⱦ","ĳЩѪҺ��","��ֲ�������췴Ӧ��","�������Դ�Ⱦ���ָ���"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"���ڻ��Ƽ�����ȱ��","�Ӵ�������","��Ⱦ��������"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("�ܰ�ϸ��",new Range(0.20, 0.40),new Range(0.20, 0.40),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		

		strincreasePhysiologicalReasons = new String[]{"�¾���������"};
		strincreasePsychologicalReasons = new String[]{"ĳЩ��Ⱦ","ĳЩѪҺ��","ĳЩ�����ָ���","ĳЩ�����没","�׿�","����Թؽ���","����,���˴����Ⱦ","ҩ��Ӱ��"};
		strdecreasePhysiologicalReasons = new String[]{"����","�ߺ��ε���"};
		strdecreasePsychologicalReasons = new String[]{"�������ܰ�ϸ����Ѫ����ȫ�蹦�ܲ�ȫ"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("����ϸ��",new Range(0.03, 0.08),new Range(0.03, 0.08),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{"���һ�򱥲ͺ�","��ԭ����","Ƶ������ѪС����"};
		strincreasePsychologicalReasons = new String[]{"����������","һ��������","Ƣ�г���","Ƣ��","��Ӳ��","�෢�Թ�����","�����","��״ϸ����","��˲�","����Թؽ���","����������","PLT>700��109/L"};
		strdecreasePhysiologicalReasons = new String[]{"�¾�ǰ","���Ծƾ��ж�"};
		strdecreasePsychologicalReasons = new String[]{"���ɼ���","�ƻ�����","���Ĺ���","ĳЩ������Ⱦ","PLT<60��109/L"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("ѪС�����",new Range(100, 300),new Range(100, 300),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		strincreasePhysiologicalReasons = new String[]{};
		strincreasePsychologicalReasons = new String[]{"ѪС����ٹ������������","������ά��","Ѫ˨�Լ���","Ƣ�г�","������ϸ����Ѫ��","�޴�ѪС���ۺ���"};
		strdecreasePhysiologicalReasons = new String[]{};
		strdecreasePsychologicalReasons = new String[]{"������Ѫϵͳ˥��","��Ѫ֢","Ƣ��","����","����ϸ����ƶѪ"};
		addToArrayList(increasePhysiologicalReasons,strincreasePhysiologicalReasons);
		addToArrayList(increasePsychologicalReasons, strincreasePsychologicalReasons);
		addToArrayList(decreasePhysiologicalReasons, strdecreasePhysiologicalReasons);
		addToArrayList(decreasePsychologicalReasons, strdecreasePsychologicalReasons);
		item = new Item("ƽ��ѪС�����",new Range(6.8, 12.8),new Range(6.8, 12.8),increasePhysiologicalReasons,increasePsychologicalReasons,
				decreasePhysiologicalReasons,decreasePsychologicalReasons);
		items.add(item);
		clearItems(increasePhysiologicalReasons,increasePsychologicalReasons,
					decreasePhysiologicalReasons,decreasePsychologicalReasons);
		
		this.data = new Data(items);
	}
	
	public Database() {
		super();
		// TODO Auto-generated constructor stub
		initialData();
	}

	public Database(Data data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "Database [data=" + data + "]";
	}

}
