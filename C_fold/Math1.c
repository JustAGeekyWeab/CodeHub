#include <math.h>

float area_of_square(float);

int main(){


    float side = 5.5;
    float area = area_of_square(side);
    printf("Side = %5.2f Area = %5.2f", side, area);

    return 0;
}

float area_of_square(float side){
    float area = pow(side, 2);
    return area;
}