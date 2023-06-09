package OOPJAVA.DZOOP.homework_7;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

	void receiveOffer(String companyName, double salary);

	void receiveVacancy(Job vacancy);
	
}