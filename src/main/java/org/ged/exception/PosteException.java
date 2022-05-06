package org.ged.exception;

public class PosteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PosteException(long Id) {
		super("Le poste " + Id + " n'existe pas.");
	}
}
