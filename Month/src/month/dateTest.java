package month;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dateTest {
	public static void main(String[] args) {
		
		// 현재날짜 (시스템, 시스템 타임존)
		LocalDate systemNow = LocalDate.now();
		
		// 타임존 적용
		LocalDate seoulNow = LocalDate.now(ZoneId.of("Asia/Seoul"));
		LocalDate parisNow = LocalDate.now(ZoneId.of("Europe/Paris"));
		LocalDate americaNow = LocalDate.now(ZoneId.of("Pacific/Pago_Pago"));
		
		System.out.println(systemNow.toString());
		System.out.println(seoulNow.toString());
		System.out.println(parisNow.toString());
		System.out.println(americaNow.toString());
		
		System.out.println("================");
		
		// 포멧 설정 (년월일)
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy~년~MM~월~dd~일~");
		
		String sysFormat = systemNow.format(format);
		
		System.out.println(sysFormat);
		
		System.out.println("================");
		
		// 포멧 설정 (시분초)
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		String nowFormat = nowTime.format(formatter);
		
		System.out.println(nowTime.toString());
		System.out.println(nowFormat);
		
		int hour = nowTime.getHour();
		int min = nowTime.getMinute();
		int sec = nowTime.getSecond();
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
		System.out.println(sysFormat+nowFormat);
	}
}
