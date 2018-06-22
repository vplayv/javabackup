import java.io.*;
import java.net.*;
public class myClientTcp {
	public static void main(String []args) throws Exception{
		System.out.println("TCP Client");
		String sentence;   
		String modifiedSentence;   
		while(true){
			BufferedReader inFromUser = 
					new BufferedReader( new InputStreamReader(System.in));//���� �Է´��
			Socket clientSocket = new Socket("localhost", 33790);//������ ���� (TCP) 
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());//������ �Է� �޴°�
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));   
			System.out.print("�Է� : ");
			sentence = inFromUser.readLine();//���� �Է�
			outToServer.writeBytes(sentence + '\n');//���� ���ڸ� �����ϴ� ������ ������ ����
			modifiedSentence = inFromServer.readLine();//������ ���� ������ �Է¹���
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
