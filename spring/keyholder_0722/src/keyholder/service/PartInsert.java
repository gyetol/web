package keyholder.service;

import keyholder.exception.PartException;

public interface PartInsert {
	public abstract void execute(String partName) throws PartException;
}
