/*
 * /**
	 * Method
	 * @author �̸�
	 * @param �Ű�����
	 * @return ���
	 * <dt><b>Precondition:</b><dd> ��ǲ
	 * <dt><b>Postcondition:</b><dd> �ƿ�ǲ
	 * @exception Throws
	 * 
	 * */
//529pg IntTreeBag , 518pg IntBTNode
public class IntTreeBag implements Cloneable{
	private IntBTNode root;//ó����
	/**
	 * Constructor 
	 * @author 20132393 ������
	 * @param ����.
	 * @return ����.
	 * <dt><b>Precondition:</b><dd>����
	 * <dt><b>Postcondition:</b><dd>������ ����־���Ѵ�.
	 * @exception ����.
	 * 
	 */
	public IntTreeBag(){//root�� �� ������
		System.out.println("������ ������");
		root = null;
	}
	public void printRoot(int depth){
		root.print(depth);
	}
	/**
	 * add Method
	 * @author 20132393 ������
	 * @param int element ���ο� ��Ʈ ��� �߰�
	 * @return ����.
	 * <dt><b>Precondition:</b><dd>����
	 * <dt><b>Postcondition:</b><dd> ���ο� ��尡 ī�ǵǾ� ���濡 ����.
	 * @exception OutOfMemoryError �޸𸮰� ������� �ʴ�.
	 */
	public void add(int element){
		IntBTNode cursor;
		boolean done;

	      if (root == null){ 
	         root = new IntBTNode(element, null, null);
	      }
	      else
	      {
	         cursor = root;
	         done = false;
	         do
	         {
	            if (cursor.getData( ) >= element)
	            {  
	               if (cursor.getLeft( ) == null)
	               {
	                  cursor.setLeft( new IntBTNode(element, null, null) );
	                  done = true;
	               }
	               else
	                  cursor = cursor.getLeft( );
	            }
	            else 
	            {  
	               if (cursor.getRight( ) == null)
	               {
	                  cursor.setRight( new IntBTNode(element, null, null) );
	                  done = true;
	               }
	               else
	                  cursor = cursor.getRight( );
	            }
	         }  while (!done);
	      }      
	}
/**
 * addMany Method
 * @author 20132393 ������
 * @param int... elements �������� ���Ұ� ���濡 �߰���
 * @return ����.
 * <dt><b>Precondition:</b><dd>����
 * <dt><b>Postcondition:</b><dd> �������� ���ο� ��尡 ī�ǵǾ� ���濡 ����.
 * @exception OutOfMemoryError �޸𸮰� ������� �ʴ�.
 */
	public void addMany(int... elements){
		for(int i = 0 ; i < elements.length ; i++)//for���� ��Ʈ�� �迭�� ���̸�ŭ �ݺ�
		{
			if(root == null){//��Ʈ�� ������ ����
				root = new IntBTNode(elements[i] , null, null);
			}
			else{//add �޼��带 ���ȣ��
				add(elements[i]);
			}
		}
	}
	/**
	 * addAll Method
	 * 414�ʿ� �������ִ�.
	 * @author 20132393 ������
	 * @param IntTreeBag addend
	 * @return ����.
	 * <dt><b>Precondition:</b><dd> �Ű������� addAll�� NULL�ϼ� ����.
	 * <dt><b>Postcondition:</b><dd> �� ���� �ȿ� addend ���Ұ� ����.
	 * @exception OutOfMemoryError �޸𸮰� ������� �ʴ�.
	 * 
	 * */
	public void addAll(IntTreeBag addend){
		IntBTNode addroot;
		if (addend == null)
	      {
	         throw new IllegalArgumentException("�Ű������� NULL�Դϴ�.");
	      }
	      if (root == addend.root)//������ ��Ʈ�� �߰��� ��Ʈ�� ������
	      { 
	         addroot = IntBTNode.treeCopy(addend.root);
	         addTree(addroot);
	      }
	      else
	         addTree(addend.root);
	}
	private void addTree(IntBTNode addroot){
		if(addroot != null){
			add(addroot.getData());
			addTree(addroot.getLeft());
			addTree(addroot.getRight());
		}
	}
	/**
	 * Clone Method
	 * @author 20132393	������
	 * @param ����.
	 * @return IntTreeBag
	 * <dt><b>Precondition:</b><dd> ����.
	 * <dt><b>Postcondition:</b><dd> ����.
	 * @exception Throws OutOfMemoryError , CloneNotSupportedException:implements�� ���Ұ�� ����
	 * 
	 * */
	public IntTreeBag clone(){//�������̵�
		IntTreeBag newBag;
		try{
			newBag = (IntTreeBag) super.clone();
		}
		catch (CloneNotSupportedException e){
			throw new RuntimeException
			("�� Ŭ������ Cloneable�� Implments�� ���� �ʾҽ��ϴ�.");
		}
		return newBag;
	}
	/**
	 * countOccurrences Method
	 * @author 20132393 ������
	 * @param int target : ã�°�
	 * @return int count : Ÿ���� ��� �ִ��� ī��Ʈ
	 * <dt><b>Precondition:</b><dd> ����.
	 * <dt><b>Postcondition:</b><dd> ����.
	 * @exception ����.
	 * 
	 * */
	public int countOccurrences(int target){
		int count = 0;
		IntBTNode cursor;
		boolean done = false;
		if(root == null ){
			System.out.println("��Ʈ�� NULL�Դϴ�");
			return 0;
		}
		cursor = root;
		while(!done){
			if(cursor.isLeaf()){//���� ���̴�.
				if(target == cursor.getData()){
					count++;
					done = true;
				}
				else{
					System.out.println("���Դϴ�.");
					return count;
				}
			}
			else {//������ ���� �ƴϴ�. ���� �����ڸ� ����Ѵ�.
				if(target > cursor.getData()){//����������
					cursor = cursor.getRight();
				}
				else if( target < cursor.getData()){//��������
					cursor = cursor.getLeft();
				}
				else if( target == cursor.getData()){//��
					cursor = cursor.getLeft();
					count++;
				}
			}
		}
		return count;
	}
	/**
	 * remove Method
	 * @author 20132393 ������
	 * @param int target ������ Ÿ��
	 * @return ���������� �� ���������� üũ
	 * <dt><b>Precondition:</b><dd> ����.
	 * <dt><b>Postcondition:</b><dd> Ÿ���� ã�´�. �Ѱ��� �����ϰ� ���ſ� ������ true ��ȯ, ���н� false ��ȯ�ϸ� Ʈ���� �ٲ��� �ƴ��Ѵ�.
	 * @exception ����.
	 * 
	 * */
	public boolean remove(int target){
		 IntBTNode parentOfCursor = null;
	     IntBTNode cursor = root;
		 while (cursor != null && target != cursor.getData( ))
		      {
		       parentOfCursor = cursor;
		         if (target < cursor.getData( ))
		            cursor = cursor.getLeft( );
		         else
		            cursor = cursor.getRight( );
		      }
		      
		      if (cursor ==  null)
		         return false;
		      else if (cursor.getLeft( ) == null)
		      {
		         if (parentOfCursor == null)
		            root = cursor.getRight( );
		         else if (cursor == parentOfCursor.getLeft( ))
		            parentOfCursor.setLeft(cursor.getRight( ));
		         else
		            parentOfCursor.setRight(cursor.getRight( ));
		         return true;
		      }
		      else
		      {
		         cursor.setData(cursor.getLeft( ).getRightmostData( ));
		         cursor.setLeft(cursor.getLeft( ).removeRightmost( ));
		         return true;
		      }
	}
	/**
	 * size Method
	 * @author 20132393 ������
	 * @param ����.
	 * @return ������� ������ ����
	 * <dt><b>Precondition:</b><dd> ����.
	 * <dt><b>Postcondition:</b><dd> ����.
	 * @exception ����.
	 * 
	 * */
	public int size(){
		return IntBTNode.treeSize(root);
	}
	/**
	 * union Method
	 * @author 20132393�̸�
	 * @param ����b1, ����b2
	 * @return b1�� b2�� ������ �Ǵٸ� ����
	 * <dt><b>Precondition:</b><dd> b1�� b2 ��� null�̸� �ȉ´�.
	 * <dt><b>Postcondition:</b><dd> ����.
	 * @exception Throws OutOfMemoryError, IllegalArgumentException
	 * 
	 * */
	public static IntTreeBag union(IntTreeBag b1, IntTreeBag b2){
		IntTreeBag answer = new IntTreeBag( );
		if(b1 == null ||b2 == null)
			return null;
	    answer.addAll(b1);
	    answer.addAll(b2);
	    return answer;
	}
}

class IntBTNode{												//��� ��ũ�� ����Ʈ
	private int data;
	private IntBTNode Left;
	private IntBTNode Right;
	IntBTNode(int initialData, IntBTNode initialLeft, IntBTNode initialRight){
		data = initialData;
		Left = initialLeft;
		Right = initialRight;
	}
	public int getData(){// ����� ������
		return data;
	}
	public IntBTNode getLeft(){ //����� ���� ����Ʈ
		return Left;
	}
	public int getLeftmostData(){ //��� �� �ܰ� ������
		if(Left == null){
			return data;
		}
		else
			return Left.getLeftmostData();
	}
	public IntBTNode getRight(){  //����� ������ ����Ʈ
		return Right;
	}
	public int getRightmostData(){ //����� �� �ܰ� ������
		if(Right == null)
			return data;
		else
			return Right.getRightmostData();
	}
	public void inorderPrint(){// ����Ʈ ��� ���� ������
		if(Left != null){
			Left.inorderPrint();
		}
		System.out.println(data);
		if(Right != null)
			Right.inorderPrint();	
	}
	public boolean isLeaf(){ // ���� ���� �Ǵ�
		return (Left == null)&&(Right == null); 
	}
	public void postorderPrint(){ // �Ʒ������
		if(Left != null){
			Left.postorderPrint();
		}
		if(Right != null)
			Right.postorderPrint();	
		System.out.println(data);
	}
	public void preorderPrint(){//������
		System.out.println(data);
		if(Left != null)
			Left.preorderPrint();
		if(Right != null)
			Right.preorderPrint();
	}
	public void print(int depth){//Ʈ�� ����
		int i; 
	      for (i = 1; i <= depth; i++)
	         System.out.print("    ");
	      System.out.println(data);
	      if (Left != null)
	         Left.print(depth+1);
	      else if (Right != null)
	      {
	         for (i = 1; i <= depth+1; i++)
	            System.out.print("    ");
	         System.out.println("--");
	      }
	      if (Right != null)
	         Right.print(depth+1);
	      else if (Left != null)
	      {
	         for (i = 1; i <= depth+1; i++)
	            System.out.print("    ");
	         System.out.println("--");
	      }
	}
	public IntBTNode removeLeftmost(){//���� ����
		if(Left == null)
			return Right;
		else
		{
			Left = Left.removeLeftmost();
			return this;
		}	
	}
	public IntBTNode removeRightmost(){
		if(Right == null)
			return Left;
		else
		{
			return Right.removeRightmost();
		}	
	}
	public void setData(int newData){
		data = newData;
	}
	public void setLeft(IntBTNode newLeft){
		Left = newLeft;
	}
	public void setRight(IntBTNode newRight){
		Right = newRight;
	}
	public static  IntBTNode treeCopy(IntBTNode source){
		IntBTNode leftCopy, rightCopy;
		if(source == null)
			return null;
		else{
			leftCopy = treeCopy(source.Left);
			rightCopy = treeCopy(source.Right);
			return new IntBTNode(source.data, leftCopy, rightCopy);
		}
	}
	public static int treeSize(IntBTNode root){
		if(root == null)
			return 0;
		else{
			return 1 + treeSize(root.Left) + treeSize(root.Right);
		}
	}	
}
