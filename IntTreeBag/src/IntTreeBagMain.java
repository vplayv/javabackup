import java.util.Scanner;


public class IntTreeBagMain {
	public static void main(String []args){
		Scanner whilenumber = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		IntTreeBag T1 = new IntTreeBag();
		IntTreeBag T2 = new IntTreeBag();
		T2.add(10);
		T2.addMany(12, 18, 23, 19, 21, 8, 17, 42);
		System.out.println("=========================================================");
		System.out.println("======    20132393 ������ �ڷᱸ�� ����  IntTreeBag       =====");
		System.out.println("======    1. add Method                             =====");
		System.out.println("======    2. addMany Method                         =====");
		System.out.println("======    3. addAll Method                          =====");
		System.out.println("======    4. clone Method                           =====");
		System.out.println("======    5. countOccurrences Method                =====");
		System.out.println("======    6. remove Method                          =====");
		System.out.println("======    7. size   Method                          =====");
		System.out.println("======    8. union Method                           =====");
		System.out.println("======    9. Print Method                           =====");
		System.out.println("=========================================================");
		while(true){
			System.out.println("��ȣ�� �Է��ϼ���");
			int i = whilenumber.nextInt();
			switch(i){
			case 1:
				System.out.println("���� �ȿ� ������� ���ڸ� �Է��ϼ��� (������)");
				int case1 = input.nextInt();
				T1.add(case1);
				break;
			case 2:
				System.out.println("���� �ȿ� ������� ���ڸ� 3�� �Է��ϼ��� (������)");
				int case2_1 = input.nextInt();
				int case2_2 = input.nextInt();
				int case2_3 = input.nextInt();
				T1.addMany(case2_1, case2_2, case2_3);
				break;
			case 3:
				System.out.println("T2�� T1�� �ֽ��ϴ�.");
				T1.addAll(T2);
				break;
			case 4:
				System.out.println("T1�� ���� �մϴ�.");
				System.out.println("T1");
				T1.printRoot(10);
				System.out.println("T3");
				IntTreeBag T3 = T1.clone();
				T3.printRoot(10);
				break;
			case 5:
				System.out.println("ã������? : ");
				int case5 = input.nextInt();
				int case5_2 = T1.countOccurrences(case5);
				System.out.println("ã���� : " + case5 +"���� : " + case5_2);
				break;
			case 6:
				System.out.println("������ ����? : ");
				int case6 = input.nextInt();
				boolean case6_TF = T1.remove(case6);
				if(case6_TF)
					System.out.println("��������");
				else
					System.out.println("��������");
				break;
			case 7:
				int case7 = T1.size();
				System.out.println("T1�� ������ : " + case7);
				break;
			case 8:
				System.out.println("T1�� T2���� = T4");
				IntTreeBag T4;
				T4 = IntTreeBag.union(T1, T2);
				T4.printRoot(10);
				break;
			case 9:
				System.out.println("����Ʈ - ��Ʈ, ���̸� �Է����ּ��� : ");
				int case9 = input.nextInt();
				T1.printRoot(case9);
			default :
					System.out.println("�ش� ���ڰ� �����ϴ�. ó������ ���ư��ϴ�.");
					break;
			
			}
		}
	}
}
