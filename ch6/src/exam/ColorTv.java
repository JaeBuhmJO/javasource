package exam;

public class ColorTv extends Tv{

	private int color;
	
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize()+"인치, "+color+"컬러");
	}
	
	public int getColor() {
		return color;
	}
}
