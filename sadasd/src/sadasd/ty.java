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
				  "���̵�    : " + ID + "\n"
				+ "��ȭ��ȣ : " + Phone + " \n"
				+ "�̸�       : " + Name + " \n");
	}
	public void getDetail(){
		System.out.println("������ ���̵�, �̸�, ��ȭ��ȣ�� �Է����ּ���. \n");
		Scanner input = new Scanner(System.in);
		ID=input.nextLine();
		Phone=input.nextLine();
		Name=input.nextLine();
		System.out.println(
				  "���̵�    : " + ID + "\n"
				+ "��ȭ��ȣ : " + Phone + " \n"
				+ "�̸�       : " + Name + " \n");
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
		System.out.println("����1�� �Է��ϼ��� ");
		emp1.getDetail();
		System.out.println("����2�� �Է��ϼ��� ");
		emp2.getDetail();
		System.out.println("����3�� �Է��ϼ��� ");
		emp3.getDetail();
		int i=1;
		while(i==1){
			System.out.println("� ������ ��ȭ��ȣ�� �ٲ��� �Է��ϼ��� ");
			select = new Scanner(System.in);
			int num = select.nextInt();
			switch (num){
			case 1 :
				System.out.println("����1");
				emp1.emplo();
				break;
			case 2 :
				System.out.println("����2 ������ ");
				emp2.change_number();
				emp2.emplo();
				break;
			case 3 : 
				System.out.println("����3 ������ ");
				emp3.change_number();
				emp3.emplo();
				default :
					System.out.println("�����մϴ�");
					i=0;
					break;
			}
		}
			
		
	}
}

