package cn.com.study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

/**
 * java List和Map向json字符串转化
 * @author penggang
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		List<String> list = Arrays.asList("a", "b", "c", "d", "1","2");
		System.out.println("java list to jsonstr:"+gson.toJson(list));
		Map<String, Object> content = new HashMap<String, Object>();
		content.put("name", "java");
		content.put("age", "26");
		System.out.println("java map to jsonstr:"+gson.toJson(content));
	}
}
