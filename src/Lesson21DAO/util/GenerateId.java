package Lesson21DAO.util;

public final class GenerateId {
	
	private GenerateId() {}
	
	private static int nextId = 1;
	
	public static int nextId() {
		return nextId++;
	}

}
