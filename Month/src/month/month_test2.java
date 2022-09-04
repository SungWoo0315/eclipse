package month;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class month_test2 {

	public static void main(String[] args) {

		/*
		 * ArrayList 선언 
		 * */
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		/*1월~4월*/
		for (int i = 1; i < 5; i++) {
			String xxx = "2022";
			String mmm = xxx+"0"+i;
			list2.add(mmm);	
		}
		/*1월~9월*/
		for (int j = 1; j < 10; j++) {
			String uuu = "2022";
			String nnn = uuu+"0"+j;
			list.add(nnn);
		}
		/*10월~12월*/
		for (int i = 10; i < 13; i++) {
			String year = "2022";
			String yearmonth = year + i;
			list.add(yearmonth);
		}
		System.out.println(list.toString());   // 입력 들어온 월
		System.out.println(list2.toString());  // 이미 테이블에 들어가 있는 월
		
		/*removeAll 로 제거대상을 제거*/
		list.removeAll(list2); 
		
		System.out.println(list.toString());  // 실질적으로 테이블에 없는 월 (입력대상)
		System.out.println("===============");
		System.out.println("list 사이즈 => "+list.size());
		System.out.println("202205 포함여부 true false => "+list.contains("202205"));
		System.out.println("202205 의 인덱스번호 => "+list.indexOf("202205"));
		System.out.println("202205 인덱스번호를 활용한 값 get"+list.get(list.indexOf("202205")));
	}

}
