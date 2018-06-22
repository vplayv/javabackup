package LinkedList;

import java.util.Scanner;

public class DoubleLinkedSeqMain {
	public static void main(String []args){
		DoubleLinkedSeq s1 = new DoubleLinkedSeq();
		DoubleLinkedSeq s2 = null;
		int selectNum = 0;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("20132393 유영근 더블타입 링크드 리스트 프로그램");
			System.out.print(" 1.addAfter");
			System.out.print(" 2.addBefore");
			System.out.print(" 3.addAll");
			System.out.print(" 4.advance");
			System.out.print(" 5.clone");
			System.out.print(" 6.concatenation");
			System.out.print(" 7.getCurrent");
			System.out.print(" 8.isCurrent");
			System.out.print(" 9.size");
			System.out.print(" 10.removeCurret");
			System.out.print(" 11.start \n");
			selectNum = sc.nextInt();
			switch(selectNum){
				case 1 :
					  for(double i=0;i<10;i++){
						  s1.addAfter(i);
						  System.out.println(i-0.5 + "번째 데이터 " + s1.getCurrent());
					  }
					break;
				case 2 :
					  for(double i=10;i>0;i--){
						  System.out.println( "데이터 " + s1.getCurrent());
						  s1.addBefore(i);
					  }
					  break;
				case 3 :
					s1.addAll(s1);
					break;
				case 4 :
					s1.advance();
					System.out.println("현재 데이터 : " + s1.getCurrent());
					break;
				case 5 :
					s1.clone();
					break;
				case 6 :
					s1.catenation(s1, s1);
					break;
				case 7 :
					System.out.println(s1.getCurrent());
					break;
				case 8 :
					System.out.println(s1.isCurrent());
					break;
				case 9 :
					System.out.println(s1.size());
					break;
				case 10 :
					s1.removeCurrent();
					break;
				case 11 :
					s1.start();
					break;
					default :
						System.out.println("프로그램 종료");
						break;
					
			}
	
		}
	}
}
/*
 * public class DoubleLinkedSeqTest {
     
       public static void main(String[] args) {
	   DoubleLinkedSeqTest test=new DoubleLinkedSeqTest();

	   System.out.println("    creating a new sequence s1......");
	     DoubleLinkedSeq s1=new DoubleLinkedSeq();
    
	     System.out.println("    adding values from 4 to 10 to s1......");
	      for(double i=4;i<=10;i++)
		  s1.addAfter(i);

	     System.out.println(" s1.getCurrent()="+s1.getCurrent()+" should return 10.0");
	    
	     System.out.println("     setting the current position to s1.start()......");
	         s1.start();
		
	       System.out.println(" s1.getCurrent()="+s1.getCurrent()+" should return 4.0");
		
	       System.out.println("     adding values from 1 to 3, before value 4 in sequence ,to s1......");
	         for(double i=3;i>=1;i--)
		     s1.addBefore(i);

		
		System.out.println(" s1.size()="+s1.size()+" should return 10");
		
		System.out.println(" s1.getCurrent()="+s1.getCurrent()+" should return 1.0");
		
		System.out.println("    displaying the values in s1 from 1.0 to 10.0 using s1.advance()......");
		  test.displaySeq(s1);
		  s1.start();
		
		System.out.println("    creating a new sequence s2=s1.clone()......");
		  DoubleLinkedSeq s2 ;
		    s2=(DoubleLinkedSeq)s1.clone();
		  
	       	 System.out.println("    displaying the values in s2 ..should be same as above.....");
		 test.displaySeq(s2);
		 s2.start();

		System.out.println("   removing the first element from s1 i.e 1.0......");
		   s1.start();
		   s1.removeCurrent();

		   System.out.println(" s1.size()= "+s1.size()+" should return 9");   
		System.out.println("   now displaying s1 :  should display from second value 2.0 to 10.0  ");
		   test.displaySeq(s1);

		  System.out.println(" s2.size()= "+s2.size()+" should return 10");    
		System.out.println(" now displaying  s2 :  there should be no change in s2  ");
		test.displaySeq(s2);
		   
		System.out.println("    creating another sequence s3......");
		DoubleLinkedSeq s3=new DoubleLinkedSeq();
		
		System.out.println(" s3.size()="+s3.size()+"  should return 0");
		
		System.out.println("    adding s2 to s3......");
		s3.addAll(s2);
		
		System.out.println(" s3.size()="+s3.size()+"  should return 10");
		
		System.out.println("    creating a new  sequence s4=concatenation of s2 and s3...... ");
		DoubleLinkedSeq s4=DoubleLinkedSeq.catenation(s2,s3);
		System.out.println("   displaying s4..,.should be 1.0 ..to. 10.0 1.0 .to.. 10.0");
		test.displaySeq(s4);
		s4.start();
		System.out.println(" s4.size()="+s4.size()+"  should retrun 20");
    }
    
               public void displaySeq(DoubleLinkedSeq s)
                 {
		     s.start();
		     while(s.isCurrent())
			 {
			 System.out.print("  "+s.getCurrent());
			 s.advance();
			 }
		     System.out.println(" ");
		 }
		 */
