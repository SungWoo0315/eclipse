package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;			// 게임에서 획득한 점수 150점
		
		int lastScore1 = ++gameScore;	// 게임스코어에서 1만큼 더한 값을 라스트스코어1에 대입
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;	// 게임스코어에서 1만큼 뺀 값을 라스트스코어2에 대입  // 151로 업데이트 된 상테에서 1을 뺸것이므로 150으로 나온다.
		System.out.println(lastScore2);

	}

}
