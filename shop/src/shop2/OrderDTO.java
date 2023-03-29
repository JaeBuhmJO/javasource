package shop2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class OrderDTO {
	int orderId;
	int userId;
	int productId;
	Date orderDate;
	
	private UserDTO userDTO;
	private ProductDTO productDTO;
	private PayType payType;
}


