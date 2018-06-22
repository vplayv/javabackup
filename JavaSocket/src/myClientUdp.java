import java.io.*;
import java.net.*;
public class myClientUdp {
	public static void main(String []args) throws Exception{
		 System.out.println("UDP CLIENT");
		String sentence;
		System.out.println("BufferReader");
		BufferedReader inFromUser = 
				new BufferedReader(new InputStreamReader(System.in));//인풋 스트림 (버퍼)
		
		DatagramSocket client = new DatagramSocket();//클라이언트 UDP소켓
		InetAddress IPAddress = InetAddress.getByName("localhost");//로컬호스트(나 자신)
		byte[] sendData;
		byte[] receiveData;
		
		while(true){
			sendData = new byte[1024];//배열 포인터 설정
			receiveData = new byte[1024];//배열 포인터 설정
		System.out.print("입력하라 : ");
		sentence = inFromUser.readLine();//버퍼 한줄 읽기
		sendData = sentence.getBytes();//바이트로 변환
		DatagramPacket sendPacket = 
				new DatagramPacket(sendData, sendData.length, IPAddress, 32458);//패킷보내기
		client.send(sendPacket);
		System.out.println("Send...");
		DatagramPacket receivePacket = 
				new DatagramPacket(receiveData, receiveData.length);
		
		client.receive(receivePacket);//패킷 받음!
		System.out.println("Receive!");
		
		String modifiedSentence = new String(receivePacket.getData());//데이터를 스트링으로 출력
		
		if(modifiedSentence.substring(0, 12).equals("Server Close")){//서버닫음
			System.out.println("Server close");
			System.out.println("close Client");
			client.close();
			return ;	
		}
		else{
			System.out.println("From SERVER: "+ modifiedSentence);
		}
		sentence = null;//모두 초기화
		sendData = null;
		receiveData = null;
		}
	}
}
