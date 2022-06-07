package org.ged.exception;

public class GroupeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public GroupeException(long id) {
        super("Le groupe id: " + id + " n'existe pas.");
    }
}
