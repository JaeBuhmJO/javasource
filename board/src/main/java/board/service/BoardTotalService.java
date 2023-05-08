package board.service;

import board.domain.PageDTO;
import board.persistence.BoardDAO;

public class BoardTotalService {
	public int getTotalRow(PageDTO pageDTO) {
		return new BoardDAO().totalRows(pageDTO);
	}
}
