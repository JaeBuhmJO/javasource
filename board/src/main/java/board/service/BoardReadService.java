package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReadService {
	public BoardDTO read(int bno) {
		return new BoardDAO().getRow(bno);
	}
}
