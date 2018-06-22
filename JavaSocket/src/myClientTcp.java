import java.io.*;
import java.net.*;
public class myClientTcp {
	public static void main(String []args) throws Exception{
		System.out.println("TCP Client");
		String sentence;   
		String modifiedSentence;   
		while(true){
			BufferedReader inFromUser = 
					new BufferedReader( new InputStreamReader(System.in));//버퍼 입력대기
			Socket clientSocket = new Socket("localhost", 33790);//서버에 연결 (TCP) 
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());//데이터 입력 받는곳
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));   
			System.out.print("입력 : ");
			sentence = inFromUser.readLine();//문장 입력
			outToServer.writeBytes(sentence + '\n');//공백 문자를 포함하는 문장을 서버에 전송
			modifiedSentence = inFromServer.readLine();//서버가 보낸 문장을 입력받음
			System.out.println("FROM SERVER: " + modifiedSentence);
			if(modifiedSentence.equals("Server close BYE")){
				System.out.println("Client close");
				clientSocket.close();
				return ;
			}
			System.out.println("DEBUG");
		}
	}
}
