package com.exercises; 
//Composition
//Department cannot exist without a doctor. 
public class department {
	public static class doctor {
		private String name;
		private int id;

		public doctor(String name, int id) {
			this.name = name;
			this.id = id;
		}

		public String toString() {
			return (name + " " + id);
		}
	}

	public static class Dept {
		doctor[] doc = { new doctor("HOUSE", 57), new doctor("CHASE", 83), new doctor("WILSON", 61) };

		public void depRun() {
			for (int i = 0; i < doc.length; i++) {
				System.out.println(doc[i]);
			}
		}
	}

	public static void main(String[] args) {
		Dept cardio = new Dept();
		cardio.depRun();
	}
}
