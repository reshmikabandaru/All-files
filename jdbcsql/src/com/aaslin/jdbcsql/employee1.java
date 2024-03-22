package com.aaslin.jdbcsql;

public class employee1 {

        private int id;
		private String name;
		
		private department1 dept;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public void setId(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
		public department1 getDept() {
			return dept;
		}
		public void setDept(department1 dept) {
			this.dept = dept;
		}
		
		public String toString() {
			return "Employee [id="+this.id+", name="+this.name+", Department name="+dept.getName()+"]";
		}
	}



