import java.lang.reflect.Array;

/**
* Delegates the object duplication to the objects being cloned. 

* @author Aleksa Zatezalo
* @version 1.0
* @since   2022-11-21 
*/

interface prototype {
    /**
     * An interface that provides a cloning method.
    * */
    public void cloned();
    
}

abstract class prototypeRegistry {
    Array items;

    public void addItem(String item){
        /**
        * Adds prototype to repository of prototypes.
        * */
    }

    public void getByField(){
        /**
        * Gets prototype from array of items. 
        * */
    }

}