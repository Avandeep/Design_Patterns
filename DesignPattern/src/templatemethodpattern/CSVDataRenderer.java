package templatemethodpattern;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		// TODO Auto-generated method stub
		return "CSV Data";
	}

	@Override
	public String processData(String data) {
		// TODO Auto-generated method stub
		return "Processed "+data;
	}

}
