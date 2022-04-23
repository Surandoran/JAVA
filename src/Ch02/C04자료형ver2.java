package Ch02;

public class C04자료형ver2 {

	public static void main(String[] args) {
		//----------------------------------
		//int 자료형
		//----------------------------------
		int int1 = 0b1111;	//2진수
		int int2 = 0206;	//8진수
		int int3 = 365;		//10진수
		int int4 = 0xb3;	//16진수
		
		System.out.println("int1 : " + int1);
		System.out.println("int2 : " + int2);
		System.out.println("int3 : " + int3);
		System.out.println("int4 : " + int4);
		//----------------------------------
		//byte 자료형(1byte)
		//----------------------------------
		byte byte1 = -128;
		byte byte2 = -30;
		byte byte3 = 30;
		byte byte4 = 127;
		
		System.out.println("byte1 : " + byte1);
		System.out.println("byte2 : " + byte2);
		System.out.println("byte3 : " + byte3);
		System.out.println("byte4 : " + byte4);
		//----------------------------------
		//char 자료형(2byte -음수값 X)
		//----------------------------------
		char char1 = 100;
		char char2 = 5000;
		char char3 = 400;
		char char4 = 30;
				
		System.out.println("char1 : " + char1);
		System.out.println("char2 : " + char2);
		System.out.println("char3 : " + char3);
		System.out.println("char4 : " + char4);
		//----------------------------------
		//short 자료형(2byte -음수값 O) 약 -30000 ~ +30000
		//----------------------------------
		short short1 = 32767;
		short short2 = -32768;
		short short3 = 1234;
		short short4 = 4567;
						
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		System.out.println("short3 : " + short3);
		System.out.println("short4 : " + short4);
		//----------------------------------
		//long 자료형(8byte -음수값 O)
		//----------------------------------
		//int자료형(-21억 + 21억)
		//long 자료형
		long long1 = 200000000000000L;
		long long2 = 5000;
		long long3 = 400;
		long long4 = 30;
						
		System.out.println("long1 : " + long1);
		System.out.println("long2 : " + long2);
		System.out.println("long3 : " + long3);
		System.out.println("long4 : " + long4);
		//----------------------------------
		//double 자료형(8byte) - 기본 자료형(15 - 18자리)
		//float 자료형(4byte) - (5 - 자리)
		//----------------------------------
		double double1 = 10.77777777777777777777;//20개
		float float1   = 10.77777777777777777777F;//
		double double2 = 30.5;
		double double3 = 40.5;
								
		System.out.println("double1 : " + double1);
		System.out.println("float1 : " + float1);
		System.out.println("double2 : " + double2);
		System.out.println("double3 : " + double3);

	}

}
