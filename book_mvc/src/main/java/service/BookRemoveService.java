package service;

import persistence.BookDAO;

public class BookRemoveService {
	public boolean remove(int code) {
		return new BookDAO().remove(code);
	}
}
