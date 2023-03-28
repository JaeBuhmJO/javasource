package shop2;

//import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//allargs 생성하면 기본생성자 사라짐
//@Data // getter,setter,equals,canEqual,hashCode,toString,기본생성자

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ProductDTO {
	private int productId;
	private String pname;
	private int price;
	private String content;

}
