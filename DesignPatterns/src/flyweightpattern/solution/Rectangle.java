package flyweightpattern.solution;

public class Rectangle extends Shape {
	
	private String label;

	
	
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}



	Rectangle()
	{
		label="Rectangle";
	}

	@Override
	public void draw(int length,int breadth,String fillStyle) {
		// TODO Auto-generated method stub
		System.out.println("Drawing a "+label+" with length "+length+" and breadth "+ breadth+" with fill style "+fillStyle);

	}

}
