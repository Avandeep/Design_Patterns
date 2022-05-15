package flyweightpattern;

public class PaintApp {
	
	public void render(int numberOfShapes)
	{
		Shape[] shapes=new Shape[numberOfShapes+1];
		
		for(int i=1;i<=numberOfShapes;i++)
		{
			if(i%2==0)
			{
				shapes[i]=new Circle();//every time initiating new object;need to solve this problem
				((Circle)shapes[i]).setRadius(i);
				((Circle)shapes[i]).setFillColor("White");
				((Circle)shapes[i]).setLineColor("Red");	
				shapes[i].draw();
			}
			else
			{
				shapes[i]=new Rectangle();//every time initiating new object;need to solve this problem
				((Rectangle)shapes[i]).setLength(i);
				((Rectangle)shapes[i]).setBreadth(i+i);
				((Rectangle)shapes[i]).setFillStyle("dotted");		
				shapes[i].draw();
			}
			//there will be no of objects in memory so we have to fix the problem using fly weight
			
		}
	}

}
