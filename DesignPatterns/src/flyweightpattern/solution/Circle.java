package flyweightpattern.solution;

public class Circle extends Shape {
	
	private String label;
	
	
	
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	

	Circle()
	{
		label="Circle";
	}

	@Override
	public void draw(int radius,String fillColor,String lineColor) {
		// TODO Auto-generated method stub
		System.out.println("Drawing a "+label+" with radius "+radius+" and fill color "+ fillColor+" line color "+lineColor);

	}

}
