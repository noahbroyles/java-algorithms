package linkedList;

public class Cell {
	
	private Cell next;
	private Object element;
	
	public Cell(Cell next, Object element) {
		this.next = next;
		this.element = element;
	}
	
	public Cell(Object element) {
		this.element = element;
	}

	public Cell getNext() {
		return next;
	}

	public void setNext(Cell next) {
		this.next = next;
	}

	public Object getElement() {
		return element;
	}
	
	

}
