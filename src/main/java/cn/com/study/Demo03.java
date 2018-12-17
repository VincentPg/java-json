package cn.com.study;

import com.google.gson.Gson;

/**
 * Json字符串转JavaBean
 * @author penggang
 *
 */
public class Demo03 {
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
		@Override
		public String toString() {
			return "Student{name="+name+",age="+age+"}";
		}
		
	}
	
	public static void main(String[] args) {
		String studentJsonStr="{\"name\":\"java\",\"age\":26}";
		Gson gson = new Gson();
		Student student1 = gson.fromJson(studentJsonStr, Student.class);
		System.out.println("jsonstr to java bean:"+student1);
	}
}
