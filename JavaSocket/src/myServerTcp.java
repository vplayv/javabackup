import java.io.*;
import java.net.*;
public class myServerTcp {
	public static void main(String []args) throws Exception{
		String clientSentence = null;    
		String capitalizedSentence = null;          
		ServerSocket welcomeSocket = new ServerSocket(33790);//TCP 소켓       
		while(true)//입력 대기     
		{         
			System.out.println("TCP SERVER");
			clientSentence = null;    
			capitalizedSentence = null;       
			Socket connectionSocket = welcomeSocket.accept();//입력 대기중
			System.out.println("연결됌!");
			BufferedReader inFromClient =               
					new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));    //버퍼 입력받음         
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());   //입력 받은것을 다시 클라이언트에게 재전송        
			clientSentence = inFromClient.readLine();//한문장 입력     
			System.out.println("Received: " + clientSentence); //받은지 체크
			if(clientSentence.substring(0, 5).equals("Close")){//서버 닫기
				System.out.println("TCP Server Close 20132393 가반 유영근");
				capitalizedSentence = "Server close BYE";
				outToClient.writeBytes(capitalizedSentence);
				welcomeSocket.close();
				connectionSocket.close();
				return ;
			}
			else if(clientSentence.substring(0, 4).equals("NAME")){//이름
				capitalizedSentence = "Your Name is "+ clientSentence.substring(5) + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 5).equals("ENAME")){//영어이름
				capitalizedSentence = "Your English Name is "+ clientSentence.substring(5) + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 6).equals("NUMBER")){//학번
				capitalizedSentence = "Your Number is "+ clientSentence.substring(7) + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 5).equals("Hello")){//인사
				capitalizedSentence = "Hello Socket" + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 5).equals("UPPER")){//대문자
			capitalizedSentence = clientSentence.substring(6).toUpperCase() + '\n';  
			outToClient.writeBytes(capitalizedSentence);//재전송 TCP라 기타 사항은 이미 적혀있음 보내기만 하면됀다. 
			}
			else if(clientSentence.substring(0, 5).equals("LOWER")){//소문자
				capitalizedSentence = clientSentence.substring(6).toLowerCase() + '\n';        
				outToClient.writeBytes(capitalizedSentence);//재전송 TCP라 기타 사항은 이미 적혀있음 보내기만 하면됀다. 
			}
			else{
				capitalizedSentence = clientSentence + '\n';        
				outToClient.writeBytes(capitalizedSentence);//재전송 TCP라 기타 사항은 이미 적혀있음 보내기만 하면됀다. 
			}
		}
	}
}
