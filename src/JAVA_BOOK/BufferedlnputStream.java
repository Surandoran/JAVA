package JAVA_BOOK;
import java.util.*;
//java 입출력
//기본적으로 Scanner와 print가 있다.
//입력과 출력을 줄여 I/O라고 한다.
//자바에서는 이러한 모든 I/O가 Stream(스트림) 을 통해 이루어진다

//Stream(스트림)
//Byte 형태로 데이터를 운반하는데 사용되는 연결통로(입력과 출력을 동시에 처리 할 수 없다)
//스트림은 먼저 보낸 데이터를 먼저 받게 되어 있어 연속적으로 데이터를 처리하려면 
//큐(queue)의 FIFO(First int Frist Out) 구조로 되어 있다.
//이 때 근원지(시작점) Source, 데이터 종착점을 Sink, 연결한 것을 Stream이라고 표현
//즉 Source - 입력 스트림 input Stream - 출력 스트림 output Stream - Sink로 연결

//정리
//Stream(스트림)은 Byte 형태로 데이터를 운반하는데 사용되는 연결통로로써 단방향 통신을 하며, 큐의 FIFO 구조로 되어있다
//또한 입력과 출력을 동시에 수행하려면 입력을 위한 입력 스트림(input stream)과 출력을 위한(output stream), 모두
//2개의 스트림이 필요하다는 것이다. 마지막으로 Source - input Stream - output Stream - Sink 순서로 데이터가 흐른다.

//Stream 활용 : InputStream / OutputStream
//처리 단위에 따라 Reader - inputStream / Writer - outputStream 으로 나누어 통신한다
//이 때 입력 스트림 inputStream은 스트림을 한 줄 씩 읽고, 출력스트림 outputStream 으로 데이터를 내보내며 해당 공간을 비운다.
//즉, 컴퓨터와 키보드를 연결하여 '입력'받는 것이 입력 스트림인InputStream 의 역활이고
//입력된 정보를 바탕으로 모니터에 출력하는 것은 출력 스트림OutputStream 의 역활이라고 할 수 있다. 이때 InputStream 은 System.in 을 사용하며,
//OutputStream 은 System.out 을 사용한다.

//InputStream / outputStream 은 자바에서 다음과 같이 사용 할 수 있다.

//import java.io.InputStream;
//import java.io.ObjectInput;

/*
 * InputStream 로 입력받는 경우 맨 앞 문자 1개만 출력됨 && int 형태로 입력받음
 */
//InputStream in = System.in;
//OutputStream out = System.out;

//int idata = in.read(); // input 은 read 와 연결되어 있기 때문에 in.read 를 사용한다
//
//out.write(idata); // output 은 write 와 연결되어있기 때문에 out.write 를 사용한다
//out.flush(); // flush 를 써주지 않으면 출력되지 않는다
//out.close(); // output 을 끝내는 매서드

//이때 중요한 것은 다음과 같다
//-InputStream / OutputStream 을 사용하려면 반드시 해당 패키지를 import 해주어야한다 ex)import java.io.인풋 혹은 아웃풋 혹은 io.* 사용가능
//-InputStream로 받아오는 경우 여러개의 값을 입력해도 단 1개의 문자밖에 못 가져오며 기본형은 int로 받아온다
//따라서 char 형태로 표현하고 싶다면, char 타입으로 캐스팅해주어야한다
//-출력을 위해 out.write() 후 flush()와 close()를 모두 사용해주어야한다. flush 는 write 에 저장된 값을 출력함과 동시에 비워주는 역활이고, close()는 마무리해주는 역활이다.
//-추가로 System.in 같은 경우 사실 많이 봐왔던거지만 입력을 받기 위해 자주 사용하는 Scanner 에서 사용하는 바로 그것이다.
//Scanner sc = new Scanner(System.in); // 여기서 입력 스트림이 사용된다.
import java.io.*;

public class BufferedlnputStream{

	public static void main(String[] args) throws IOException {
		
		//InputStreamReader 로 입력받는 경우에는 배열을 어떻게 주느냐에 따라 2개 이상의 값을 받을 수 있음 
//		InputStream in = System.in;
//		InputStreamReader reader = new InputStreamReader(in); //InputStreamReader 사용하기 위해 객체 생성
//		
//		OutputStream out = System.out;
//		OutputStreamWriter writer = new OutputStreamWriter(out); //OutputStreamWriter 사용하기 위해 객체 생성
//		
//		char cdata[] = new char[2]; // 이제는 char 를 기본형으로 받을 수 있고, 2개 이상의 값을 배열을 통해 받을올수 있다.
//		reader.read(cdata);
//		
//		int IcData = cdata[0] - '0'; // 배열이기 때문에 char 로 받은 값을 int로 변환하여 계산하고 싶은 경우 이처럼 사용해야한다.
//		
//		writer.write("입력받은 값 : ");
//		writer.write(cdata);
//		writer.write("\n");
//		writer.write("입력받은 첫번째 값 + 10 : ");
//		writer.write(IcData + 10 + "\n"); // 입력받은 첫번째 값 + 10
//		
//		System.out.println("########결과########");
//		writer.flush();
//		writer.close();
		//기존 InputStream 에서 1개의 값밖에 받아올 수 없는 부분을 보완하기 위해 InputStreamReader 사용
		//다만 InputStreamReader 를 통해서 2개 이상의 값을 받아오기 위해서는 배열을 사용해서 값을 받아와야 한다.
		//-InputStreamReader 는 고정적인 값 밖에 받아올 수 없다. 고정적인 값만 받아온다는 것은 내가 입력하는 값이 고정되어 있는 값보다 작다면
		//그만큼 공간의 낭비가 생기게 되고, 고정되어있는 값보다 크다면 공간이 부족해지는 문제가 발생 한다.
		//예를들어 위코드의 입력한 값은 1111 이지만 입력받은 값은 12로 나오면서 고정된 배열 2 이상은 받지 않았다는 것을 알 수 있다=> 효율이 나쁘다
		//-char 타입을 기본형으로 하기 때문에 따로 캐스팅 할 필요는 없다. 다만 값을 int로 변형하여 계산을 돌리고 싶은 경우는 위 코드처럼 바꿔주어야 한다.
		//마지막에 writer.write()로 여러번 써주어도 결국 flush()가서 한번에 출력되기 때문이다.
		
		//What is Buffer?
		//Buffer(이하 버퍼)는 이러한 InputStream과 InputStreamReader를 보완하고 합쳐서 탄생한 입출력의 최종형태이다.
		//버퍼는 고정값이 아니라 가변적인 값을 받게 된다. 즉 5개의 값을 받으면 5개의 공간이 사용되며, 10개의 값을 받으면 10개의 공간이 사용되어 보다 효율적이 된다
		//동시에 버퍼는 입력받은 값은 버퍼에 저장해두었다가 버퍼가 가득차거나 개행 문자가 나타나면 버퍼의 내용을 한 번에 전송하게 된다(이 부분이 중요함)
		//						< 버퍼를 사용하지 않는 입력 >
		//키보드 -----------------------------------------------------------> 프로그램
		//                   키보드의 입력이 키를 누르는 즉시 바로 전달됨.
		
		//	    					< 버퍼를 사용하는 입력 >
		//키보드--------------------->[L][O][V][E][][][][]------------------> 프로그램
		//키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송함 -----//버퍼가 가득 차거나, 개행 문자가 나타나면
		//												  버퍼의 내용을 한 번에 전송함
		// 위는 Scanner 아래는 Buffer 라고 생각하면 된다
		
		//버퍼의 가장 큰 장점은 한 번에 전송하는 방법을 통해 속도가 엄청나게 빨라진다.
		//예를 들어 이사를 가는 경우 물건을 한 번에 담아(BufferedReader를 통해 입력받고)
		//차로 옮기고, 그다음 이사할 집에 옮긴다(BufferedWriter의 writer()을 통해 저장했던 값을 한번에 출력한다.
		//이후 짐을 담는데 사용했던 가방이나 바구니들을 비우며 정리(flush() 를 사용하여 남아있는 값 출력 및 버퍼를 비운다)
		//결국 하나하나 옮기는 것(Scanner) 보다 한번에 옮기는 것이 빨라서이고 이는 컴퓨터도 마찬가지이다.
		//컴퓨터에 입력받는 값이 많으면 많을 수록 Buffer 를 사용하여 데이터를 입출력 하는게 Scanner를 통해 하나하나 출력하는 것보다 훨씬 빠르다.
		//단점같지않은 단점도 물론 존재한다.
		//1.먼저 아래 코드를 보면 느껴지겠지만 처음 Buffer를 사용하게 되면 코드가 살짝, 복잡하다고 느껴 질 수 있다.
		//2.다음으로 띄어쓰기(스페이스 바)와 엔터(개행문자)를 경계로 입력 값을 인식하는 SCanner 와 달리
		//BufferReader은 엔터만 경계로 인식하기 때문에 중간에 띄어쓰기라도 하는 경우 데이터를 가공해주어야한다.
		//3.Buffer 로 입력받는 기본 타입은 String 이기 때문에 int 로 계산해야하는 경우에도 형변환이 필수적이된다.
		//How to use Buffer?
		//Buffer는 2가지 형태의 코드로 확인해보자.
		//Buffer 객체 생성 시에는 InputStream 과 InputStreamReader 의 합쳐진 형태를 취한다.
		//Buffer 사용시에는 java.io.Buffered 패키지 임포트 뿐만 아니라 메인 메소드 뒤에 throws IOException{} 또는 try ~ catch 문을 넣어줘야한다
		
//		import java.io.BufferedReader;
//		import java.io.BufferedWriter;
//		
//		public static void main(Sting[] ags) thows IOException{ // 여기가 필수! 아니면 try ~ catch 사용해야함
//			
//			InputStream in = System.in;
//			InputStreamReader reader = new InpuStreamReader(in);
//			
//			OutputStream out = System.out;
//			OutputStreamWriter writer = new OutputStreamWriter(out);
//			
//			위의 4줄이 아래의 두개의 줄로 줄어든다.
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			String s = br.readLine(); //bufferedwriter 의 기본형은 String
//			
//			int i = Integer.parseInt(s) + 10 // String 을 int로 형변환 후 +10 !!
//					
//			br.close(); //bufferedreader 도 입력을 마쳤다면 닫아주자
//					
//			bw.write("입력받은 값 : " + s); // 출력
//			bw.newLine(); // 개행 메소드
//			bw.write("입력받은 값 +10 : " + i + "\n"); // 이렇게 하니까 제대로 출력됨
//			
//			bw.flush();// 남은 값 출력 && 버퍼 초기화
//			bw.close();// bufferedwriter 닫기
//			
//			//실행결과
//			입력 : 65
//			입력받은 값 : 65
//			입력받은 값 + 10 : 75
//			
//		}
		//Buffer 정리
		//1.Buffer 사용시에는 java.io.Buffered 패키지 임포트 뿐만 아니라 반드시 메소드 뒤에 throws IOException{} 사용하거나 try ~ catch문을 넣어주어야 한다.
		//2.Buffer는 가변적인 값을 받을 수 있으며, 입력받은 값을 Buffer에 저장하고, Buffer 에 저장한 값을 한번에 출력하기 때문에 보다 빠른 속도를 자랑한다.
		//3.Buffer 의 기본 타입은 String이며, 엔터(enter)를 경계로 값을 인식한다. 이 때문에 중간에 띄어쓰기(스페이스) 를 기준으로 값을 분리해야 하는 경우 데이터를 가공해주어야 한다.
		//4.BufferedWriter 을 사용해서 입력되었것들을 출력한다 이후 flush()를 사용하게 된다.
		//사실 Buffer는 기본적으로 버퍼가 꽉 차기 전에는 출력되지 않는데, flush() 를 통해 꽉 차지 않아도 buffer 내용을 (강제적으로) 출력 후 버퍼를 비우게 된다.
		//자주 사용하는 BufferedReader / BufferedWriter 클래스의 메인 메소드
		
		//BufferedReader *로 감싼것은 자주쓰는 메소드
		//*void - Close() : 입력 스트림을 닫고 사용하던 자원들을 푼다
		//void - mark(int, readAheadLimit):스트림의 현재 위치를 마킹한다
		//boolean - markSupported() : 스트림이 mark 기능을 지원하는지 true / false 로 알려준다
		//*int - read : 한 글자만 읽어 정수형으로 변환해준다. 즉 1을 '1'이라고 읽어서 '1'의 정수형(아스키코드)인 (int)1 = 49를 출력한다
		//*String - readLine() : STring 타입으로 한 줄을 읽어온다.
		//boolean - ready() : 입력 스트림이 사용할 준비가 되었는지 확인한다. 1이면 준비 완료!
		//void - reset() : 마킹이 있으면 그 위치부터 다시 시작, 그렇지 않다면 처음부터 다시 시작
		//long - skip(long n) : n개의 문자를 건너뛴다
		
		//BufferedWriter *로 감싼것은 자주쓰는 메소드=>이곳은 다 중요해서 따로 * 표시는 하지 않는다.
		//void - flush() : 버퍼에 남은 값 출력 && 버퍼 초기화(비우기)
		//void - Close() : 버퍼 끝내기. 끝내기 전에는 반드시!!! flush() 사용해야함
		//void - newLine() : 버퍼에서 사용하는 개행 메소드
		//void - write(int c) : 한 글자만 읽어 정수형으로 변환해준다. 즉 1을 '1'이라고 읽어서 '1'의 정수형(아스키코드)인 (int)1 = 49를 출력한다
//		문제
//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		출력
//		각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());


		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;

			bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		
	}
}