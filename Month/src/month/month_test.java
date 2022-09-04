package month;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class month_test {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		for (int i = 1; i < 5; i++) {
			String xxx = "2022";
			String mmm = xxx+"0"+i;
//			System.out.println(mmm);
			list2.add(mmm);
			
			for (int j = 1; j < 10; j++) {
				String uuu = "2022";
				String nnn = uuu+"0"+j;
//				System.out.println("=====");
//				System.out.println(nnn);
				
				if(!mmm.equals(nnn)) {
					list.add(nnn);
				
				}
				
			}
//			
		}
		
		// List를 Set으로 변경
		Set<String> set = new HashSet<String>(list);
		// Set을 List로 변경
		List<String> newList =new ArrayList<String>(set);
		// 결과 출력
		Collection<String> ListA = newList;
		Collection<String> ListB = list2;
		
		
		List<String> ListAA = new ArrayList<String>(ListA);
		List<String> ListBB = new ArrayList<String>(ListB);
		
		ListAA.removeAll(ListB);
		ListBB.removeAll(ListA);
		
		
		System.out.println(ListAA.toString());


	}

}
