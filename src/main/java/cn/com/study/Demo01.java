package cn.com.study;

import com.google.gson.Gson;

/**
 * java Bean/pojo 向json字符串转化
 * @author penggang
 *
 */
public class Demo01 {
	public static class Student{
		private String name;
		private int   age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		Student student = new Student();
		student.setName("java");
		student.setAge(26);
		String jsonStr = gson.toJson(student);
		System.out.println("java bean to jsonStr:"+jsonStr);
	}
}
