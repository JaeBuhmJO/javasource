package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

public class BookSearchService {
	public List<BookDTO> search(String criteria, String keyword) {
		return new BookDAO().searchList(criteria, keyword);
	}
}
