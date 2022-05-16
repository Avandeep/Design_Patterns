package flyweightpattern;

public class Circle implements Shape {
	
	private String label;
	private int radius;
	private String fillColor;
	private String lineColor;
	
	
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	Circle()
	{
		label="Circle";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a "+label+" with radius "+radius+" and fill color "+ fillColor+" line color "+lineColor);

	}

}
