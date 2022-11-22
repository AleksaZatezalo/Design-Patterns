/**
* Provide an interface for creating families of related or dependant objects
* without specifying a concrete class.
*
* @author Aleksa Zatezalo
* @version 1.0
* @since   2022-11-21 
*/

interface AbstractFactory{
    /**
        * Abstract factory interface meant to implement two functions 
        * which can support the creation of two diffrent objects, jokingly called
        * Thing One and Thing Two.
        * 
    */
    
    public void createThingOne();
    public void createThingTwo();

}