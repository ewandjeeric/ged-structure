package org.ged.exception;

public class StructureException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StructureException(long Id) {
		super("La structure " + Id + " n'existe pas.");
	}

}
