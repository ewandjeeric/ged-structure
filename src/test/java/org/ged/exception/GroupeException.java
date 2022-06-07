package org.ged.exception;

public class GroupeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public GroupeException(long Id) {
        super("Le groupe " + Id + " n'existe pas.");
    }
}
