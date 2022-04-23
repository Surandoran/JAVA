package Ch03;

//형변환
//->서로 다른 자료형을 일치시키는 작업

//형변환 종류
//자동형변환(암시적형변환) : 컴파일러에 의한 자동형변환
//강제형변환(명시적형변환) : 프로그래머에 의한 강제형변환

public class C01TypeChange {

	public static void main(String[] args) {
		//자동형변환
		//좁은 공간만의 값을 넣은 공간에 대입하는경우
		//컴파일러에 의한 자동형변환
		// byte < short < int < long < float < double
		byte bval = 10;
		int ival = bval; // 자동형변환(int자료형으로변환)
		System.out.println("ival : " + ival);
		
		char cval = '가';
		ival = cval; // 자동형변환(int자료형으로변환)
		System.out.println("ival : " + ival);
		
		long lval = ival; // 자동형변환(long자료형으로변환)
		System.out.println("lval : " + lval);
		
		float fval = lval; // 자동형변환(float자료형으로변환)
		System.out.println("fval : " + fval);
		
		double dval = fval; // 
		System.out.println("dval : " + dval);
	}

}
