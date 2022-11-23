/**
* The builder aims to seperate the construction of complex objects so that
* the construction proccess can create diffrent representations. Implementing this
* requires a Concrete Builder to assemble parts and a Director which uses the builder
* interface. Product classes and obejcts represent the product under construction.
* 
* @author Aleksa Zatezalo
* @version 1.0
* @since   2022-11-22 
*/

interface Builder{
    /**
        * An impleementation of the builder interface with two functions
        * buildPart representing one part too be built.
    */
    
    public void buildPart();

}