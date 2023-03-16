package exam;

public class Won2Dollar extends Converter{

	@Override
	public double convert(double src) {
		return Math.round((src/getRatio()*100))/100.0;
	}

	@Override
	public String getSrcString() {
		return super.SrcString;
	}

	@Override
	public String getdestString() {
		return super.destString;
	}

}
