#include <stdio.h>


int totalize(int, int);


int main(){
    printf("Input something\n");

    int price, qty, ttl;
    price = 100;
    qty = 5;
    ttl = price * qty;
    printf("Total of buying a %i product %i times is %d:",price, qty, ttl);

    printf("\nNow enter price and quantity: ");
    scanf("%d %d", &price, &qty);

    printf("\nNew total is %d", totalize(price, qty));

    return 0;
}

int totalize(int a, int b){
    return a * b;
}