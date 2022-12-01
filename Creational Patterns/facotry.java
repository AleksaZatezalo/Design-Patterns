/**
* Provide a class for creating specific objects. Outsource creation to the subclass.
*
* @author Aleksa Zatezalo
* @version 1.0
* @since   2022-11-30 
*/

class Factory{
    /**
        * Factory interface meant to implement two functions 
        * which can support the creation of two diffrent objects, jokingly called
        * Item One and Item Two.
        * 
    */
    
    public ItemOne createItemOne() {
        ItemOne item = new ItemOne();
        return item;
    }

    public ItemTwo createItemTwo() {
        ItemTwo item = new ItemTwo();
        return item;
    }

}

class ItemOne {
    /**
        * Empty class named item one. Used in creation of facotry method.
    */
}


class ItemTwo {
    /**
        * Empty class named item two. Used in creation of facotry method.
    */
}