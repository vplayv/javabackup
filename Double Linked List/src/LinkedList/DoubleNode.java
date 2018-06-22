/*
 * 
 * 교재에 있는 DoubleLinkedSeq 구현하고 (구현 시 Linked Listf를  사용해도 됩니다.) 
 * Demo 프로그램을 작성하여 다양하게 구현된 DoubleLinkedSeq를 활용해볼 수 있도록 하면 됩니다.
 * 제출은
 * - DoubleLinkedSeq 구현 소스
 * - Demo Program 소스
 * - Demo Program 실행화면 
 * 첨부파일은 DoubleLinkedSeq의 스팩 텍스트 파일입니다.
 */
/*
 * 2014년 4월 30일 수요일 
오후 7:30~9:00

장소 :  월 수반 - 203호
          화 목반 - 202호

범위 : 1장 ~ 9장 1절까지(5장, 8장 일부제외)
 */
package LinkedList;
public class DoubleNode {
	private double data;
	private DoubleNode link;
	public DoubleNode(double initialData, DoubleNode initialLink){ //생성자
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
	public static DoubleNode listCopy(DoubleNode source){//리스트 카피 꼬리부분 제외
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
	public static DoubleNode[] listCopyWithTail(DoubleNode source){//리스트 카피 꼬리부분 포함, 배열로 리턴
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
	public static int listLength(DoubleNode head){//노드 길이
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
		//Null 체크 
		if(start == null)
			throw new IllegalArgumentException("스타트가 NULL입니다.");
		if(end == null)
			throw new IllegalArgumentException("엔드가 NULL입니다.");
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
			throw new IllegalArgumentException("포지션이 양수가 아닙니다");
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
