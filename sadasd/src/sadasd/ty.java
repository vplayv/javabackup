package sadasd;



import java.util.Scanner;
/*Question 5

Implement a class Employee.
 An employee has a name, ID and a phone_number, for example new Employee 
 ("John Smith", 1001244888, 010-8818-8818). 
 Supply methods 
 getDetail()
 and 
 change_number(). 
 Create a program EmployeeReader that makes THREE employees, 
 and invoke getDetail() to prints the name, 
 ID and phone number. 
 Invoke the change_number() methods to change the number and call invoke getDetail() 
 again to print the details again.*/
class employee{
	String ID;
	String Phone;
	String Name;
	private Scanner rep;

	public employee(){
	}
	public void emplo(){
		System.out.println(
				  "아이디    : " + ID + "\n"
				+ "전화번호 : " + Phone + " \n"
				+ "이름       : " + Name + " \n");
	}
	public void getDetail(){
		System.out.println("직원의 아이디, 이름, 전화번호를 입력해주세요. \n");
		Scanner input = new Scanner(System.in);
		ID=input.nextLine();
		Phone=input.nextLine();
		Name=input.nextLine();
		System.out.println(
				  "아이디    : " + ID + "\n"
				+ "전화번호 : " + Phone + " \n"
				+ "이름       : " + Name + " \n");
		//input.close();
	}
	public String change_number(){
	    rep = new Scanner(System.in);
		Phone=rep.nextLine();
		return Phone;
	}
	
}
public class ty {

	private static Scanner select;

	public static void main(String []args){
		employee emp1 = new employee();
		employee emp2 = new employee();
		employee emp3 = new employee();
		System.out.println("직원1을 입력하세요 ");
		emp1.getDetail();
		System.out.println("직원2을 입력하세요 ");
		emp2.getDetail();
		System.out.println("직원3을 입력하세요 ");
		emp3.getDetail();
		int i=1;
		while(i==1){
			System.out.println("어떤 직원의 전화번호를 바꿀지 입력하세요 ");
			select = new Scanner(System.in);
			int num = select.nextInt();
			switch (num){
			case 1 :
				System.out.println("직원1");
				emp1.emplo();
				break;
			case 2 :
				System.out.println("직원2 수정후 ");
				emp2.change_number();
				emp2.emplo();
				break;
			case 3 : 
				System.out.println("직원3 수정후 ");
				emp3.change_number();
				emp3.emplo();
				default :
					System.out.println("종료합니다");
					i=0;
					break;
			}
		}
			
		
	}
}

