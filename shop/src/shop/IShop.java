package shop;
//퍼블릭 스태틱 추상 변수만 가질 수 있고, 기본 추상/ 스태틱 디폴트 메소드만 가질 수 있음
public interface IShop {
	void setTitle(String title);
	void genUser();
	void genProduct();
	void start();

}
