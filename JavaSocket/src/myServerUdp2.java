import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class myServerUdp2 {
	 public static void main(String args[]) throws Exception      
	 {          
		 System.out.println("UDP SERVER");
		 DatagramSocket serverSocket = new DatagramSocket(32458); //서버 소켓 생성, 포트 지정           
	 byte[] receiveData;//바이트 배열에 입력받음
	 byte[] sendData;//바이트 배열 단위로 보냄
	 String sentence =null;
	 boolean check1 = false;
	 while(true){
		 sendData = new byte[1024];//배열 포인터 설정
		 receiveData = new byte[1024];//배열 포인터 설정
		 DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);//패킷을 받음
	 serverSocket.receive(receivePacket);//패킷 입력받음  
	 sentence = new String( receivePacket.getData());//패킷에서 데이터 추출 스트링으로     
	 System.out.println("RECEIVED: " + sentence);//받았습니다.
	 InetAddress IPAddress = receivePacket.getAddress();//패킷을 보낸 클라이언트의 어드레스 추출
	 int port = receivePacket.getPort();//포트도 추출
	 if(sentence.substring(0, 5).equals("Close")){//서버 닫기
		 String endServerSentence = "Server Close";
		 sendData = endServerSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
		 System.out.println("Server Close");
		 serverSocket.close();//서버 닫음
		 return ;
	 }
	 else if(sentence.substring(0, 4).equals("NAME")){//이름
		 String nameServerSentence = "Your Name : " + sentence.substring(5);
		 sendData = nameServerSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
	 }
	 else if(sentence.substring(0, 5).equals("ENAME")){//영어이름
		 String nameServerSentence = "Your English Name : " + sentence.substring(6);
		 sendData = nameServerSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
	 }
	 else if(sentence.substring(0, 6).equals("NUMBER")){
		 String enameServerSentence = "Your NUMBER : " + sentence.substring(7);
		 sendData = enameServerSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
	 }
	 else if(sentence.substring(0, 5).equals("Hello")){
		 String helloServerSentence = "Hello Socket";
		 sendData =	helloServerSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
	 }
	 else if(sentence.substring(0, 5).equals("UPPER")){//모두 대문자로
		 String capitalizedSentence = sentence.substring(6).toUpperCase();//모두 대문자로 바꾼다
		 sendData = capitalizedSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
	 }
	 else if(sentence.substring(0, 5).equals("LOWER")){//모두 대문자로
		 String capitalizedSentence = sentence.substring(6).toLowerCase();//모두 대문자로 바꾼다
		 sendData = capitalizedSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
	 }
	 else {//그외 상황
		 String capitalizedSentence = sentence;//그대로 다시보냄
		 sendData = capitalizedSentence.getBytes();//바이트 단위로 변환후 배열에 집어넣는다.
		 DatagramPacket sendPacket =  
				 new DatagramPacket(sendData, sendData.length, IPAddress, port);//변환한 데이터를 다시 클라이언트에 전송
		 serverSocket.send(sendPacket);//보낸다.
	 }
	 sentence = null;
	 receivePacket = null;
	 sendData = null; //배열 포인터 해제
	 receiveData = null;//배열 포인터 해제
	 }
	 } 
}
