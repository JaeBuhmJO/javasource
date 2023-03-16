package exam;

public class IpTv extends ColorTv {
	//멤버 꼭 private으로
	private String ipAddress;

	public IpTv(int size, int color, String ipAddress) {
		super(size, color);
		this.ipAddress = ipAddress;
	}
	
	@Override
	public void printProperty() {
		System.out.printf("나의 IpTv는 %d인치 %d컬러, 주소는 %s입니다.",getSize(),getColor(),ipAddress);
	}

}
