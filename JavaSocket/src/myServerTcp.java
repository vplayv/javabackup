import java.io.*;
import java.net.*;
public class myServerTcp {
	public static void main(String []args) throws Exception{
		String clientSentence = null;    
		String capitalizedSentence = null;          
		ServerSocket welcomeSocket = new ServerSocket(33790);//TCP ����       
		while(true)//�Է� ���     
		{         
			System.out.println("TCP SERVER");
			clientSentence = null;    
			capitalizedSentence = null;       
			Socket connectionSocket = welcomeSocket.accept();//�Է� �����
			System.out.println("�����!");
			BufferedReader inFromClient =               
					new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));    //���� �Է¹���         
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());   //�Է� �������� �ٽ� Ŭ���̾�Ʈ���� ������        
			clientSentence = inFromClient.readLine();//�ѹ��� �Է�     
			System.out.println("Received: " + clientSentence); //������ üũ
			if(clientSentence.substring(0, 5).equals("Close")){//���� �ݱ�
				System.out.println("TCP Server Close 20132393 ���� ������");
				capitalizedSentence = "Server close BYE";
				outToClient.writeBytes(capitalizedSentence);
				welcomeSocket.close();
				connectionSocket.close();
				return ;
			}
			else if(clientSentence.substring(0, 4).equals("NAME")){//�̸�
				capitalizedSentence = "Your Name is "+ clientSentence.substring(5) + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 5).equals("ENAME")){//�����̸�
				capitalizedSentence = "Your English Name is "+ clientSentence.substring(5) + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 6).equals("NUMBER")){//�й�
				capitalizedSentence = "Your Number is "+ clientSentence.substring(7) + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 5).equals("Hello")){//�λ�
				capitalizedSentence = "Hello Socket" + '\n';
				outToClient.writeBytes(capitalizedSentence);
			}
			else if(clientSentence.substring(0, 5).equals("UPPER")){//�빮��
			capitalizedSentence = clientSentence.substring(6).toUpperCase() + '\n';  
			outToClient.writeBytes(capitalizedSentence);//������ TCP�� ��Ÿ ������ �̹� �������� �����⸸ �ϸ�´�. 
			}
			else if(clientSentence.substring(0, 5).equals("LOWER")){//�ҹ���
				capitalizedSentence = clientSentence.substring(6).toLowerCase() + '\n';        
				outToClient.writeBytes(capitalizedSentence);//������ TCP�� ��Ÿ ������ �̹� �������� �����⸸ �ϸ�´�. 
			}
			else{
				capitalizedSentence = clientSentence + '\n';        
				outToClient.writeBytes(capitalizedSentence);//������ TCP�� ��Ÿ ������ �̹� �������� �����⸸ �ϸ�´�. 
			}
		}
	}
}
