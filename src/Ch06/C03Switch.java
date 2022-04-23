package Ch06;

public class C03Switch {

	public static void main(String[] args) {
		
		//01 switch 기본
//		int rank = 1;
//		String medalColor;
//		
//		switch(rank) 
//		{
//			case 1:		// if ( rank == 1 )
//				medalColor = "금메달";
//				break; // 만약 case 1 에 해당하는 조건이 되면 break문을 만나 switch문을 강제종료함.
//			case 2:		// else if ( rank == 2 )
//				medalColor = "은메달";
//				break;
//			case 3:		// else if ( rank == 3 )
//				medalColor = "동메달";
//				break;
//			default:	// else
//				medalColor = "무관";
//		}
//		System.out.println("메달 : " + medalColor);
		
		//02 break 필요성
		int rank = 1;
		String medalColor;
		
		switch(rank) 
		{
			case 1:		// if ( rank == 1 )
				medalColor = "금메달";
				break; // 만약 case 1 에 해당하는 조건이 되면 break문을 만나 switch문을 강제종료함.
			case 2:		// else if ( rank == 2 )
				medalColor = "은메달";
				break;
			case 3:		// else if ( rank == 3 )
				medalColor = "동메달";
				break;
			default:	// else
				medalColor = "무관";
		}
		System.out.println("메달 : " + medalColor);

	}

}
