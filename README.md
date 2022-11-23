# Design-Patterns

This Repository contains all the design patterns (plus others) as specified in the legendary book Design Patterns by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.

The patterns will be coded in java and placed in one of three folders based on there classification: creational, structural, and behavioral.
Adding your own design patterns, or ones that exist but are not in the book is highly encouraged. 

## Contributing
Before contributing read through the contribution guidlines found the CONTRIBUTING file. Make sure to abide by the coding styles in this document and include an associated unittest with each Pull Request.

### Code Style
A few key points when contributing to this repo are as follows:
1. Use tabs over spaces.
2. Each function must contain a doc strings formated as such:
    
    ```jdk
    /**
    * DESCRIPTION
    *
    * PARAM 1: DESCRIPTION
    * PARAM 2: DESCRIPTION
    * PARAM 3: DESCRIPTION
    * ...
    * PARAM N: DESCRIPTION 
    */
    ```
3. Do not add spaces between docstring and first function line.
4. Do not go over 200 characters per line.
5. When closing multiline items under brackets('()', '[]', ... etc) put the closing bracket on it's own line.
6. Files should be named using camelCase.

All classes you choose to include in a PR must include a description, your name, date of creation, and a version number at the beggining of the class as follows:

```jdk
/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author Aleksa
* @version 1.0
* @since   2014-03-31 
*/
```

## Code Structure
As mentioned in the description above the folder structure will contain a main folder and three sub folders for each category of class. We will also have a test foldermade up of unit-tests, and

```
.
├── src                     # Source files
    ├── creational          # Creational Classes
    ├── structural          # Structural Classes
    ├── behavioral          # Behavioral files
├── test                    # Automated Testcases for the package
├── CODE_OF_CONDUCT         # An md file containing code of conduct
├── CONTRIBUTING            # Contributing Guidlins
├── LICENSE                 # MIT License
├── README.md               # An md file
└── setup.py                # Instalation
```


## Testing
No tesing approach exists yet. Make sure your code compiles before creating a PR. 
