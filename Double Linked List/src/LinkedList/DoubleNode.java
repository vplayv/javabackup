/*
 * 
 * ���翡 �ִ� DoubleLinkedSeq �����ϰ� (���� �� Linked Listf��  ����ص� �˴ϴ�.) 
 * Demo ���α׷��� �ۼ��Ͽ� �پ��ϰ� ������ DoubleLinkedSeq�� Ȱ���غ� �� �ֵ��� �ϸ� �˴ϴ�.
 * ������
 * - DoubleLinkedSeq ���� �ҽ�
 * - Demo Program �ҽ�
 * - Demo Program ����ȭ�� 
 * ÷�������� DoubleLinkedSeq�� ���� �ؽ�Ʈ �����Դϴ�.
 */
/*
 * 2014�� 4�� 30�� ������ 
���� 7:30~9:00

��� :  �� ���� - 203ȣ
          ȭ ��� - 202ȣ

���� : 1�� ~ 9�� 1������(5��, 8�� �Ϻ�����)
 */
package LinkedList;
public class DoubleNode {
	private double data;
	private DoubleNode link;
	public DoubleNode(double initialData, DoubleNode initialLink){ //������
		data = initialData;
		link = initialLink;
	}
	public void addNodeAfter(double element){
		link = new DoubleNode(element, link);
	}
	public double getData(){
		return data;
	}
	public DoubleNode getLink(){
		return link;
	}
	public static DoubleNode listCopy(DoubleNode source){//����Ʈ ī�� �����κ� ����
		DoubleNode copyHead;
		DoubleNode copyTail;
		if(source == null)
			return null;
		copyHead = new DoubleNode(source.data, null);
		copyTail = copyHead;
		while(source.link != null){
			source = source.link;
			copyTail.addNodeAfter(source.data);
			copyTail = copyTail.link;
		}
		return copyHead;
	}
	public static DoubleNode[] listCopyWithTail(DoubleNode source){//����Ʈ ī�� �����κ� ����, �迭�� ����
		DoubleNode copyHead;
		DoubleNode copyTail;
		DoubleNode[] answer = new DoubleNode[2];
		
		if(source == null)
			return answer;
		copyHead = new DoubleNode(source.data, null);
		copyTail = copyHead;
		
		while(source.link != null){
			source = source.link;
			copyTail.addNodeAfter(source.data);
			copyTail = copyTail.link;
		}
		answer[0] = copyHead;
		answer[1] = copyTail;
		return answer;
	}
	public static int listLength(DoubleNode head){//��� ����
		DoubleNode cursor;
		int answer;
		
		answer = 0;
		for(cursor = head; cursor != null ; cursor = cursor.link){
			answer++;
		}
		return answer;
	}
	public static DoubleNode[] listPart(DoubleNode start, DoubleNode end){
		DoubleNode copyHead;
		DoubleNode copyTail;
		DoubleNode[] answer = new DoubleNode[2];
		//Null üũ 
		if(start == null)
			throw new IllegalArgumentException("��ŸƮ�� NULL�Դϴ�.");
		if(end == null)
			throw new IllegalArgumentException("���尡 NULL�Դϴ�.");
		copyHead = new DoubleNode(start.data, null);
		copyTail = copyHead;
		
		while(start != end){
			start = start.link;
			if(start == null)
				throw new IllegalArgumentException("end node was not Found on the list");
			copyTail.addNodeAfter(start.data);
			copyTail = copyTail.link;
		}
		answer[0] = copyHead;
		answer[1] = copyTail;
		return answer;
		
	}
	public static DoubleNode listPosition(DoubleNode head, int position){//227
		DoubleNode cursor;
		int i;
		if(position <= 0){
			throw new IllegalArgumentException("�������� ����� �ƴմϴ�");
		}
		cursor = head;
		for(i = 1; (i<position)&&(cursor != null); i++)
			cursor = cursor.link;
		return cursor;
	}
	public static DoubleNode listSearch(DoubleNode head, double target){//226
		DoubleNode cursor;
		
		for(cursor = head; cursor != null; cursor = cursor.link)
			if(target == cursor.data)
				return cursor;
		return null;
	}
	public void removeNodeAfter(){
		link = link.link;
	}
	public void setData(double element){
		data = element;
	}
	public void setLink(DoubleNode newLink){
		link = newLink;
	}
}
