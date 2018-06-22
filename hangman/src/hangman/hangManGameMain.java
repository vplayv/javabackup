package hangman;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class hangManGameMain {
	ArrayList<String> word = new ArrayList<String>();
	int N;
	protected hangManGameMain(){
		int gamenum;
		while(true){
			Scanner inputSetup = new Scanner(System.in);
			System.out.println("***********************************");
			System.out.println("***********************************");
			System.out.println("*****OOP HomeWork1 HangManGame*****");
			System.out.println("*******20132393 ������ ����***********");
			System.out.println("******* 1�� : Game Setup ***********");
			System.out.println("******* 2�� : Game Start ***********");
			System.out.println("***********************************");
			System.out.println("***********************************");
			System.out.println("***********************************");
			
			System.out.print("Please enter your selection ");
			gamenum = inputSetup.nextInt();
			char select;
			if(gamenum == 1){
				System.out.println("1�� Setup data List ����");
				N = hangManGameSetup();
				//System.out.println("N�� �� " + N);
				System.out.println("Do you want to Continue ? ( y/n )");
				Scanner inputyesorno = new Scanner(System.in);
				select = inputyesorno.nextLine().charAt(0);//sc.nextLine().charAt(0);
				if(select == 'y'){
					System.out.println("ReStart");
					continue;
				}
				else if(select == 'n'){
					System.out.println("End");
					break;
				}
				else{
					System.out.println("Error!");
					break;
				}
			}
			else if(gamenum == 2){
				System.out.println("2�� : Game Start");
				hangManGamePlay(N);
				System.out.println("Do you want to Continue ? ( y/n )");
				Scanner inputyesorno = new Scanner(System.in);
				select = inputyesorno.nextLine().charAt(0);//sc.nextLine().charAt(0);
				if(select == 'y'){
					System.out.println("ReStart ");
					continue;
				}
				else if(select == 'n'){
					System.out.println("End ");
					break;
				}
				else{
					System.out.println("Error!");
					break;
				}
			}
			else{
				System.out.println("Error!");
				continue;
			}
		}
	}
	int hangManGameSetup(){
        System.out.print("What is the size of data list? ");
        Scanner inputsize = new Scanner(System.in);

        int N = inputsize.nextInt();

        System.out.print("Size : " + N + "\n");
        for(int i = 0; i < N ; i++)
        {
            System.out.print("Start Enter the data #" + (i+1) + " : ");
            word.add(inputWord());
          }
        return N;
    }
    public String inputWord( ){
        Scanner wordscanner  = new Scanner(System.in);       
        String wordinput;
        wordinput = wordscanner.nextLine();
        if(wordinput == null){
            wordscanner.skip("[\\r\\n]+");
            wordinput = wordscanner.nextLine();
        }
        return wordinput;
    }
	void hangManGamePlay(int N){
		System.out.println("Game Start!");
		Random r1 = new Random();
		int a = r1.nextInt(N);				 								//��������
		String questionword = word.get(a); 								    //���� ��������
		int lengthTheString = questionword.length();						//���ڿ��� ����
		int checkTheEmpty = 0;												//�ֳ� ���� üũ
		int chance = 5;														//��ȸ
		char check;															//üũ
		int checkTheAnswer = 0;												//����üũ
		char[] charinput1 = new char[lengthTheString];						//�迭 ���� 1
		for(int i = 0; i < lengthTheString ; i++){
			charinput1[i] = questionword.charAt(i);
		}
		//System.out.println(charinput1);
		char[] charinput2 = new char[lengthTheString];						//�迭 ���� 2
		for(int j = 0; j < lengthTheString ; j++){
			charinput2[j] = '_';
		}
		while(true){
			checkTheAnswer = 0;
			for(int answerTheCheck = 0 ; answerTheCheck < lengthTheString ; answerTheCheck++){
				if(charinput1[answerTheCheck] == charinput2[answerTheCheck])
						checkTheAnswer++;
			}
			if(checkTheAnswer == lengthTheString)
			{
				System.out.println("\n");
				System.out.print("Answer : ");
				for(int L = 0 ; L < lengthTheString ; L++){
					System.out.print(charinput2[L] + " ");
				}
				System.out.println("\nYour Win!");
				break;
			}
			if(chance == 5){
				System.out.println("---------");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("/\\       ");
				
				
			}
			else if(chance == 4)
			{
				System.out.println("---------");
				System.out.println("|      | ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("/\\       ");
			}
			else if(chance == 3)
			{
				System.out.println("---------");
				System.out.println("|      | ");
				System.out.println("|      o ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("/\\       ");

			}
			else if(chance == 2)
			{
				System.out.println("---------");
				System.out.println("|      | ");
				System.out.println("|      o ");
				System.out.println("|     ---  ");
				System.out.println("|        ");
				System.out.println("|        ");
				System.out.println("/\\       ");	
				}
			else if(chance == 1)
			{
				System.out.println("---------");
				System.out.println("|      | ");
				System.out.println("|      o ");
				System.out.println("|     ---  ");
				System.out.println("|      |  ");
				System.out.println("|        ");
				System.out.println("/\\       ");
			}
			else if(chance == 0){
				System.out.println("---------");
				System.out.println("|      | ");
				System.out.println("|      o ");
				System.out.println("|     ---  ");
				System.out.println("|      |  ");
				System.out.println("|      /\\  ");
				System.out.println("/\\       ");
				System.out.println("your Die");
				break;
			}
			else
				System.out.println("Error!");
			for(int L = 0 ; L < lengthTheString ; L++){
				System.out.print(charinput2[L] + " ");
			}
			System.out.print("\nPlease Enter a Character : ");
			Scanner inputword = new Scanner(System.in);
			check = inputword.nextLine().charAt(0);
			checkTheEmpty = 0;
			for(int k = 0 ; k < lengthTheString ; k++){
				if(charinput1[k] == check){
					charinput2[k] = check;
					checkTheEmpty++;
				}
			}
			if(checkTheEmpty == 0)
				chance--;//��Ƽ�� 0�̸� ���� ����
			
		}
				
		}
	}
