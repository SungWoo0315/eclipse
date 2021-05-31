package collection.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import collection.Member;

public class ArraysAsListTest {

	public static void main(String[] args) {
		
		List<String> list = java.util.Arrays.asList("서초구", "구로구", "강서구");
		
		List<Member> list1 = Arrays.asList(new Member(1, "홍길동"),
				new Member(2, "이순신"));
		
		for (Member member : list1) {
			member.getMemberName();
		}
		
		Iterator<Member> it = list1.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			member.getMemberName();
		}
	}

}
