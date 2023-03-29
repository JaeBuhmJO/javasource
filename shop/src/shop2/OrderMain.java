package shop2;

public class OrderMain {

	public static void main(String[] args) {
		// OrderDTO 사용하기

		OrderDTO orderDTO = new OrderDTO();

		// 프로퍼티 값 세팅 => 1) 생성자 2) setter
		orderDTO.setOrderId(1000);

//		orderDTO.setUserDTO(new UserDTO(100, "hong", 1, "card"));
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(100);
		userDTO.setName("hong");
		userDTO.setPayno(1);
		userDTO.setType("card");
		orderDTO.setUserDTO(userDTO);

		// 프로퍼티 값 조회
		System.out.println(orderDTO.getOrderId());

		UserDTO getUser = orderDTO.getUserDTO();
		System.out.println(getUser.getUserid());
		System.out.println(getUser.getName());
		System.out.println(getUser.getPayno());
		System.out.println(getUser.getType());
		
		System.out.println(orderDTO.getUserDTO().getName());

	}

}
