package com.java.chapter8_6_0527;

public class Q4_278p {

	public class Employee {
		public String name;
		public String grade;
		public Employee(String name) {
			this.name = name;
		}
	}
	
	public class Engineer extends Employee {
		
		public Engineer(String name) {
			super(name);
			
		}
		private String skillset;
		public String getSkillSet() {
			return skillset;
		}
		public void setSkillSet(String skillset) {
		this.skillset = skillset;
		}
	}
}
