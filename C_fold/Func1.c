# include <stdio.h>

//Forward declaration
int aglobalfunction(), somereturn1(int);
void noreturn1();

int main(){

    printf("All about functions\n");
    int b = aglobalfunction();
    printf("Return value is %i!\n", b);
    b = somereturn1(b);

    printf("Return value is %i!\n", b);

    return 0;
}

//Global function
int aglobalfunction(){
    printf("Speaking from a global function!\n");
    int a = 5;
    return a;
}

void noreturn1(){
    printf("Function that returns nothing!\n");
}

int somereturn1(int b){
    printf("Receive and sending. Adding 1 to %i!\n", b);
    int c = b + 1;
    return c;
}

