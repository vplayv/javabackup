import java.io.*;
import java.net.*;
public class myClientUdp {
	public static void main(String []args) throws Exception{
		 System.out.println("UDP CLIENT");
		String sentence;
		System.out.println("BufferReader");
		BufferedReader inFromUser = 
				new BufferedReader(new InputStreamReader(System.in));//��ǲ ��Ʈ�� (����)
		
		DatagramSocket client = new DatagramSocket();//Ŭ���̾�Ʈ UDP����
		InetAddress IPAddress = InetAddress.getByName("localhost");//����ȣ��Ʈ(�� �ڽ�)
		byte[] sendData;
		byte[] receiveData;
		
		while(true){
			sendData = new byte[1024];//�迭 ������ ����
			receiveData = new byte[1024];//�迭 ������ ����
		System.out.print("�Է��϶� : ");
		sentence = inFromUser.readLine();//���� ���� �б�
		sendData = sentence.getBytes();//����Ʈ�� ��ȯ
		DatagramPacket sendPacket = 
				new DatagramPacket(sendData, sendData.length, IPAddress, 32458);//��Ŷ������
		client.send(sendPacket);
		System.out.println("Send...");
		DatagramPacket receivePacket = 
				new DatagramPacket(receiveData, receiveData.length);
		
		client.receive(receivePacket);//��Ŷ ����!
		System.out.println("Receive!");
		
		String modifiedSentence = new String(receivePacket.getData());//�����͸� ��Ʈ������ ���
		
		if(modifiedSentence.substring(0, 12).equals("Server Close")){//��������
			System.out.println("Server close");
			System.out.println("close Client");
			client.close();
			return ;	
		}
		else{
			System.out.println("From SERVER: "+ modifiedSentence);
		}
		sentence = null;//��� �ʱ�ȭ
		sendData = null;
		receiveData = null;
		}
	}
}
