package Ch39;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01ServerSocket {

	public static void main(String[] args) {
	
		try {
			//IP : 192.168.5.50 , Port : 5050
			ServerSocket server = new ServerSocket(5050);
			System.out.println("서버 통신 서비스 시작!");
			Socket client = server.accept(); // Client 접속 요청시 
											 // Client객체 생성(IN/OUT스트림연결)
			
			//데이터 전송용 스트림
			OutputStream out = client.getOutputStream();
			DataOutputStream Dout = new DataOutputStream(out);
			
			Dout.writeUTF("Server접속이 확인되었습니다");
			Dout.flush();
			
			
			server.close();
			client.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		
		}

	}

}
