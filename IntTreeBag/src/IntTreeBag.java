/*
 * /**
	 * Method
	 * @author 이름
	 * @param 매개변수
	 * @return 결과
	 * <dt><b>Precondition:</b><dd> 인풋
	 * <dt><b>Postcondition:</b><dd> 아웃풋
	 * @exception Throws
	 * 
	 * */
//529pg IntTreeBag , 518pg IntBTNode
public class IntTreeBag implements Cloneable{
	private IntBTNode root;//처음놈
	/**
	 * Constructor 
	 * @author 20132393 유영근
	 * @param 없다.
	 * @return 없다.
	 * <dt><b>Precondition:</b><dd>없다
	 * <dt><b>Postcondition:</b><dd>가방은 비어있어야한다.
	 * @exception 없다.
	 * 
	 */
	public IntTreeBag(){//root는 널 포인터
		System.out.println("가방의 생성자");
		root = null;
	}
	public void printRoot(int depth){
		root.print(depth);
	}
	/**
	 * add Method
	 * @author 20132393 유영근
	 * @param int element 새로운 인트 노드 추가
	 * @return 없다.
	 * <dt><b>Precondition:</b><dd>없다
	 * <dt><b>Postcondition:</b><dd> 새로운 노드가 카피되어 가방에 들어간다.
	 * @exception OutOfMemoryError 메모리가 충분하지 않다.
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
 * @author 20132393 유영근
 * @param int... elements 여러개의 원소가 가방에 추가됌
 * @return 없다.
 * <dt><b>Precondition:</b><dd>없다
 * <dt><b>Postcondition:</b><dd> 여러개의 새로운 노드가 카피되어 가방에 들어간다.
 * @exception OutOfMemoryError 메모리가 충분하지 않다.
 */
	public void addMany(int... elements){
		for(int i = 0 ; i < elements.length ; i++)//for문을 인트형 배열의 길이만큼 반복
		{
			if(root == null){//루트가 없으면 생성
				root = new IntBTNode(elements[i] , null, null);
			}
			else{//add 메서드를 재귀호출
				add(elements[i]);
			}
		}
	}
	/**
	 * addAll Method
	 * 414쪽에 도움이있다.
	 * @author 20132393 유영근
	 * @param IntTreeBag addend
	 * @return 없다.
	 * <dt><b>Precondition:</b><dd> 매개변수인 addAll은 NULL일수 없다.
	 * <dt><b>Postcondition:</b><dd> 이 가방 안에 addend 원소가 들어간다.
	 * @exception OutOfMemoryError 메모리가 충분하지 않다.
	 * 
	 * */
	public void addAll(IntTreeBag addend){
		IntBTNode addroot;
		if (addend == null)
	      {
	         throw new IllegalArgumentException("매개변수가 NULL입니다.");
	      }
	      if (root == addend.root)//기존의 루트와 추가할 루트가 같으면
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
	 * @author 20132393	유영근
	 * @param 없다.
	 * @return IntTreeBag
	 * <dt><b>Precondition:</b><dd> 없다.
	 * <dt><b>Postcondition:</b><dd> 없다.
	 * @exception Throws OutOfMemoryError , CloneNotSupportedException:implements를 안할경우 생김
	 * 
	 * */
	public IntTreeBag clone(){//오버라이딩
		IntTreeBag newBag;
		try{
			newBag = (IntTreeBag) super.clone();
		}
		catch (CloneNotSupportedException e){
			throw new RuntimeException
			("이 클래스는 Cloneable을 Implments를 하지 않았습니다.");
		}
		return newBag;
	}
	/**
	 * countOccurrences Method
	 * @author 20132393 유영근
	 * @param int target : 찾는것
	 * @return int count : 타겟이 몇번 있는지 카운트
	 * <dt><b>Precondition:</b><dd> 없다.
	 * <dt><b>Postcondition:</b><dd> 없다.
	 * @exception 없다.
	 * 
	 * */
	public int countOccurrences(int target){
		int count = 0;
		IntBTNode cursor;
		boolean done = false;
		if(root == null ){
			System.out.println("루트가 NULL입니다");
			return 0;
		}
		cursor = root;
		while(!done){
			if(cursor.isLeaf()){//참이 잎이다.
				if(target == cursor.getData()){
					count++;
					done = true;
				}
				else{
					System.out.println("끝입니다.");
					return count;
				}
			}
			else {//거짓이 잎이 아니다. 증가 연산자를 사용한다.
				if(target > cursor.getData()){//오른쪽으로
					cursor = cursor.getRight();
				}
				else if( target < cursor.getData()){//왼쪽으로
					cursor = cursor.getLeft();
				}
				else if( target == cursor.getData()){//끝
					cursor = cursor.getLeft();
					count++;
				}
			}
		}
		return count;
	}
	/**
	 * remove Method
	 * @author 20132393 유영근
	 * @param int target 삭제할 타겟
	 * @return 지워졌는지 안 지워졌는지 체크
	 * <dt><b>Precondition:</b><dd> 없다.
	 * <dt><b>Postcondition:</b><dd> 타겟을 찾는다. 한개만 존재하고 제거에 성공시 true 반환, 실패시 false 반환하며 트리를 바꾸지 아니한다.
	 * @exception 없다.
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
	 * @author 20132393 유영근
	 * @param 없다.
	 * @return 가방안의 원소의 갯수
	 * <dt><b>Precondition:</b><dd> 없다.
	 * <dt><b>Postcondition:</b><dd> 없다.
	 * @exception 없다.
	 * 
	 * */
	public int size(){
		return IntBTNode.treeSize(root);
	}
	/**
	 * union Method
	 * @author 20132393이름
	 * @param 가방b1, 가방b2
	 * @return b1과 b2를 결합한 또다른 가방
	 * <dt><b>Precondition:</b><dd> b1과 b2 모두 null이면 안됀다.
	 * <dt><b>Postcondition:</b><dd> 없다.
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

class IntBTNode{												//노드 링크드 리스트
	private int data;
	private IntBTNode Left;
	private IntBTNode Right;
	IntBTNode(int initialData, IntBTNode initialLeft, IntBTNode initialRight){
		data = initialData;
		Left = initialLeft;
		Right = initialRight;
	}
	public int getData(){// 노드의 데이터
		return data;
	}
	public IntBTNode getLeft(){ //노드의 왼쪽 리스트
		return Left;
	}
	public int getLeftmostData(){ //노드 최 외곽 데이터
		if(Left == null){
			return data;
		}
		else
			return Left.getLeftmostData();
	}
	public IntBTNode getRight(){  //노드의 오른쪽 리스트
		return Right;
	}
	public int getRightmostData(){ //노드의 최 외곽 데이터
		if(Right == null)
			return data;
		else
			return Right.getRightmostData();
	}
	public void inorderPrint(){// 프린트 방식 왼쪽 끝부터
		if(Left != null){
			Left.inorderPrint();
		}
		System.out.println(data);
		if(Right != null)
			Right.inorderPrint();	
	}
	public boolean isLeaf(){ // 잎의 여부 판단
		return (Left == null)&&(Right == null); 
	}
	public void postorderPrint(){ // 아래놈부터
		if(Left != null){
			Left.postorderPrint();
		}
		if(Right != null)
			Right.postorderPrint();	
		System.out.println(data);
	}
	public void preorderPrint(){//위부터
		System.out.println(data);
		if(Left != null)
			Left.preorderPrint();
		if(Right != null)
			Right.preorderPrint();
	}
	public void print(int depth){//트리 보기
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
	public IntBTNode removeLeftmost(){//왼쪽 삭제
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
