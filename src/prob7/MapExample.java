package prob7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );
		
		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;     // 최고 점수
		int totalScore = 0;   // 점수 합계
		
		/* 코드를 작성하세요 */
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			int value = map.get(key);
			// 평균점수 계산
			totalScore = totalScore + value;
			// 최고점수와 최고점수 아이디 저장
			if(value > maxScore){
				maxScore = value;
				name = key;
			}
		}
		
		System.out.println("평균점수: " + totalScore/3);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}
