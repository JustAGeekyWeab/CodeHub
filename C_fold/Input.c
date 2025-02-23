#include <stdio.h>


int totalize(int, int);
void basicInput(), complexInput();

int main(){
    
    //basicInput(); //Basic section here
    complexInput(); //More complex section here

    return 0;
}

void complexInput(){
    char ch1, ch2;
    printf("Enter a single character: ");
    scanf(" %c", &ch1); //If you type in 12, it outputs 1
    printf("\nCharacter: %c\n", ch1); 
    printf("Enter two characters: ");
    scanf(" %c %c", &ch1, &ch2);
    //If you type in 12, it outputs 2 and then 1. 3 5? It outputs 5 and then 3. But 3 and then 5? 3 and 5
    //If you type in ab, it outputs a and then b.
    printf("\nCharacters: %c and %c\n", ch1, ch2);

    int int1;
    float float1;

    printf("Enter an int and then a float: ");
    scanf(" %i %f", &int1, &float1); //If you type in 12, it outputs 1
    printf("\nInt is: %i while float is %f\n", int1, float1); 
    //If you input 3.0 and then 3, it prints out 3 and then 0.0000
    //If you input 3.1, int is registered as 1 and float is 3.1


}

void basicInput(){
    printf("\nBasic Input here\n");

    int price, qty, ttl;
    price = 100;
    qty = 5;
    ttl = price * qty;
    printf("Total of buying a %i product %i times is %d:",price, qty, ttl);

    printf("\nNow enter price and quantity: ");
    scanf("%d %d", &price, &qty);
    //If you type in a non-integer value, it becomes 0. Nothing happens. Output ends up staying

    printf("\nYou entered two integers : %d and %d!", price, qty);
    printf("\nNew total is %d", totalize(price, qty));
}

int totalize(int a, int b){
    return a * b;
}