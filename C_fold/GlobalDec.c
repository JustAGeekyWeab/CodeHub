// Focuses on talking about global declarations

# include <stdio.h>

//Global variables
int globalVariable; //External identifier
float globalVariable2 = 5.41232; //Wrong format

#define AVAL 3.14159

int main(){


    printf("1 Global var = %i\n", globalVariable);

    globalVariable = 2; //Functions as an internal identifier

    printf("2 Global var = %i\n", globalVariable);

    printf("3 Global var = %f\n", globalVariable2); 

    globalVariable2 = 3.0; //Does not change

    printf("3 Global var = %f\n", globalVariable2); //It will print to 0, if you set an int as a float. IE int globalVariable2 = 4.2



    printf("Defined value: %f\n", AVAL); //Same even if it's aVal
    printf("1 2 3 an dDEfined displays 0, 2, 5, and -big number if it's at percent signi\n");
    //Otherwise it's 0, 0, 0 and 3.14590

    float radius = 5;
    float area = AVAL * radius * radius;
    printf("Area: %f\n", area);
    //printf("A circle with a radius of %i!",radius," has an area of %f", area); //Will only print out (A circle with a radius of 0!)
    printf("A circle with a radius of %i. It has an area of %f\n", radius, area); //Will only print out (A circle with a radius of 0! has an area of 2.000000) //This is due to wrong specifier
    printf("A circle has a radius of %f\n", radius); 
    printf("And the area is %f", area);
    return 0;
}