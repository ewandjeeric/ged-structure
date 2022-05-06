package org.ged.exception;

public class PosteEmployeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PosteEmployeException(long id) {
		super("Le poste de l'employe " + id + " n'existe pas.");
	}
}
