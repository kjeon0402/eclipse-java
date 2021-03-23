package collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		// Map : key와 value를 맵핑하여 저장하는 구조, index 대신 key를 활용한다
		// key는 중복을 허용하지 안혹, value는 중복을 허용한다
		// index는 중복을 허용하지 않고, value는 중복을 허용한다(배열의 입장에서는 당연한 이야기)
		
		// <key, value>
//		Map<String, Integer> map = new Map<String, Integer>();	// Cannot instantiate
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		// 제네릭 타입에는 primitive를 작성할 수 없다(객체가 아니므로, Wrapper Class를 활용할 것)
		
		map.put("year", 2021);
		map.put("month", 3);
		map.put("dayOfMonth", 22);
		map.put("dayOfWeek", 1);	// 0,1,2,3,4,5,6 == 일,월,화,수,목,금,토
		
		System.out.println("map.size() : " + map.size());
		
		System.out.println("map.get(\"year\") : " + map.get("year"));	// 일치하는 key가 있음 => value
		System.out.println("map.get(\"Year\") : " + map.get("Year"));	// 일치하는 key가 없음 => null
		System.out.println("map.get(2021) : " + map.get(2021));	// value는 key로 쓸 수 없다
		System.out.println();
		
		// 모든 value를 출력하기(1)
		Collection<Integer> values = map.values();
		for(Integer num : values) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		// 모든 value를 출력하기(2)
		Set<String> keySet = map.keySet();	// key의 묶음을 가져와서
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("\n");
		
		// 모든 value를 출력하기(3)
		Enumeration<String> keys = map.keys();	// key의 묶음을 열거자 형태로 가져와서
		while(keys.hasMoreElements()) {			// 처리하지 않은 요소(key)가 있으면
			String key = keys.nextElement();	// 다음 요소를 key에 저장한 후에
			Integer value = map.get(key);		// key를 이용하여 value를 구하고
			System.out.println(key + " : " + value);	// 함께 출력
		}
		System.out.println();
	} 
}
