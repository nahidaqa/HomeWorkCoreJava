package hw10Abstraction;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	default void dorm() {

	}

	public static void studyRoom() {

	}

}
