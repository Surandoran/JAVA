package Ch39;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class C03ClientSocket {

	public static void main(String[] args) {

		try {
			Socket client = new Socket("192.168.5.50",6060);
			
			OutputStream out = client.getOutputStream();
			DataOutputStream Dout = new DataOutputStream(out);

			Scanner sc = new Scanner(System.in);
			System.out.print("전달 메시지 : ");
			String message = sc.next();
			Dout.writeUTF("[본인이름] : "+message);
			Dout.flush();
			client.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
