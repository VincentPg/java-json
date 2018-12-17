package cn.com.study;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Json字符串转List
 * @author penggang
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		String listJsonStr="[\"1\",\"a\",\"3\",\"rt\",\"5\"]";
		Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        ArrayList<String> sList=gson.fromJson(listJsonStr, type);
        System.out.println("json convert List:"+sList);
        System.out.println(sList instanceof List);
	}
}
