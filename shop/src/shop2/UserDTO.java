package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
	private int userid;
	private String name;
	private int payno;
	
	//card, cash 정보 담을 변수
	private String type;
}
