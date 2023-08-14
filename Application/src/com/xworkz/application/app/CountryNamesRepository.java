package com.xworkz.application.app;

public interface CountryNamesRepository {
	
	int COUNT=10;
	
	void save(String name);
	default void display()
	{
		System.out.println("Running diaplay method in CountryNamesRepository");
	}
	
	default boolean isExist(String name)
	{
		return false;
	}
	default String findReturnUpperCase(String name)
	{
		return null;
	}
	default String[] findStartsWith(String name)
	{
		return null;
	}
	default String[] findEndsWith(String name)
	{
		return null;
	} 
	default String[] findMatching(String name)
	{
		return null;
	}
	default int savedCount()
	{
		return 0;
		
	}
	default String[] orderDesc()
	{
		return null;
		
	}
	default String[] orderAsc()
	{
		return null;
	}
	

}
