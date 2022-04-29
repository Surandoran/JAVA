package Ch39;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;


public class C01ClientSocket {

	public static void main(String[] args) {

		try {
			Socket client = new Socket("192.168.5.50",5050);
			
			InputStream in = client.getInputStream();
			DataInputStream Din = new DataInputStream(in);
			
			System.out.println("-----서버 메시지 START ----");
			System.out.print(Din.readUTF()+"\n");
			System.out.println("-----서버 메시지 END ----");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
