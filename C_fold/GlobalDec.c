// Focuses on talking about global declarations

# include <stdio.h>

int globalVariable;
int globalVariable2 = 5;

int main(){

    printf("1 Global var = %i\n", globalVariable);

    globalVariable = 2; //Does not change

    printf("2 Global var = %i\n", globalVariable);

    globalVariable = 2; //Does not change

    printf("3 Global var = %i", globalVariable2);
    return 0;
}