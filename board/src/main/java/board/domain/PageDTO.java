package board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@AllArgsConstructor @NoArgsConstructor
public class PageDTO {
	private String criteria;
	private String keyword;
	private int page; //사용자가 요청한 페이지 번호
	private int amount; //페이지당 보여줄 게시물 수

	public PageDTO(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
}
