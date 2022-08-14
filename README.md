
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
