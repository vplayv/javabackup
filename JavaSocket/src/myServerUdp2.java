import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class myServerUdp2 {
	 public static void main(String args[]) throws Exception      
	 {          
		 System.out.println("UDP SERVER");
		 DatagramSocket serverSocket = new DatagramSocket(32458); //���� ���� ����, ��Ʈ ����           
	 byte[] receiveData;//����Ʈ �迭�� �Է¹���
	 byte[] sendData;//����Ʈ �迭 ������ ����
	 String sentence =null;
	 boolean check1 = false;
	 while(true){
		 sendData = new byte[1024];//�迭 ������ ����
		 receiveData = new byte[1024];//�迭 ������ ����
		 DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);//��Ŷ�� ����
	 serverSocket.receive(receivePacket);//��Ŷ �Է¹���  
	 sentence = new String( receivePacket.getData());//��Ŷ���� ������ ���� ��Ʈ������     
	 System.out.println("RECEIVED: " + sentence);//�޾ҽ��ϴ�.
	 InetAddress IPAddress = receivePacket.getAddress();//��Ŷ�� ���� Ŭ���̾�Ʈ�� ��巹�� ����
	 int port = receivePacket.getPort();//��Ʈ�� ����
	 if(sentence.substring(0, 5).equals("Close")){//���� �ݱ�
		 String endServerSentence = "Server Close";
		 sendData = endServerSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
		 System.out.println("Server Close");
		 serverSocket.close();//���� ����
		 return ;
	 }
	 else if(sentence.substring(0, 4).equals("NAME")){//�̸�
		 String nameServerSentence = "Your Name : " + sentence.substring(5);
		 sendData = nameServerSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
	 }
	 else if(sentence.substring(0, 5).equals("ENAME")){//�����̸�
		 String nameServerSentence = "Your English Name : " + sentence.substring(6);
		 sendData = nameServerSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
	 }
	 else if(sentence.substring(0, 6).equals("NUMBER")){
		 String enameServerSentence = "Your NUMBER : " + sentence.substring(7);
		 sendData = enameServerSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
	 }
	 else if(sentence.substring(0, 5).equals("Hello")){
		 String helloServerSentence = "Hello Socket";
		 sendData =	helloServerSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
	 }
	 else if(sentence.substring(0, 5).equals("UPPER")){//��� �빮�ڷ�
		 String capitalizedSentence = sentence.substring(6).toUpperCase();//��� �빮�ڷ� �ٲ۴�
		 sendData = capitalizedSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
	 }
	 else if(sentence.substring(0, 5).equals("LOWER")){//��� �빮�ڷ�
		 String capitalizedSentence = sentence.substring(6).toLowerCase();//��� �빮�ڷ� �ٲ۴�
		 sendData = capitalizedSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
	 }
	 else {//�׿� ��Ȳ
		 String capitalizedSentence = sentence;//�״�� �ٽú���
		 sendData = capitalizedSentence.getBytes();//����Ʈ ������ ��ȯ�� �迭�� ����ִ´�.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//��ȯ�� �����͸� �ٽ� Ŭ���̾�Ʈ�� ����
		 serverSocket.send(sendPacket);//������.
	 }
	 sentence = null;
	 receivePacket = null;
	 sendData = null; //�迭 ������ ����
	 receiveData = null;//�迭 ������ ����
	 }
	 } 
}
