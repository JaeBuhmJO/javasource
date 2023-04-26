package service;

import domain.BookDTO;
import persistence.BookDAO;

public class BookUpdateService {

	public boolean updateBook(BookDTO dto) {
		return new BookDAO().update(dto);
	}
}
