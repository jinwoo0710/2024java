package report;

abstract class Box {
	protected int size;
	public Box(int size) {this.size = size;}
	public boolean isEmpty() { return size == 0; } 
	public abstract boolean consume(); 
	public abstract Void print(); 
}

class IngredientBox extends Box{
	String name;
	public IngredientBox(String name, int size) {
		super(size);
		this.name = name;
	}
	
	public boolean consume() {
		
		return false;
	}
	
	public Void print() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Report8 {
	public static void main(String[] args) {
		//3개의 박스객체를 생성
		//4가 들어올때까지 반복
		//박스 비었는지 먼저 확
		//각 수에 맞는 객체의 박스재료 소모
		//출력
		
	}
}
