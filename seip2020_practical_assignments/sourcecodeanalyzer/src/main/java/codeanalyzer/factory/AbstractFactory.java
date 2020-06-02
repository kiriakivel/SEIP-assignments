package codeanalyzer.factory;

/**
* The AbstractFactory interface represents an
* entity which receives a String, which indicates
* a type of object from a specified category.
* It creates the said object type.
*
* @author  kiriakivel 
*/
public interface AbstractFactory<T>{
	
	T create(String type) ;
	
}