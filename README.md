
This repo contains all the important java concepts to use in daily programming

## Local Variable Type Inference

![Screenshot](img/lvtii.png)

Note:
It is ok to assign a null object to LVTI variable but not literal null

Below code compiles fine
````
Object nullObject = null;
var var = nullObject;
````

Below code gives compile error
````
var var = null;
````
### Invalid Var Declarations

// cannot use var declaration in a compound statement
````
var j = 0, k = 0;
````

// again, cannot use var declaration in a compound statement
````
var m, n = 0;
````

// An array can be assigned to an LVTI variable
````
var aVarArray = new int[3];
````

// Cannot declare a var variable without also initializing it
````
var someObject;
````

// Cannot assign null to var variable, type cannot be inferred
````
var newvar = null;
```` 

// Cannot use array initializer in var declaration/initialization
````
var myArray = {"A", "B"};
````

// Cannot have an array of var
````
var[]newarray = new int[2]; 
````
