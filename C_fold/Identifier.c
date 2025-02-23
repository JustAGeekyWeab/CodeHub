#include <stdio.h>
int marks1 = 50; //External identifier

float avefind(int, int);

//Example of a user defined type identifier
struct student{
    int rollno;
    char *name;
    int m1, m2, m3;
    float percent;
};
typedef struct student STUDENT;
STUDENT s1 = {1, "Bob", 50, 60, 70, 60.00};
enum week{Mon=10, Tue, Wed, Thur, Fri=10, Sat=16, Sun};

int main(){
    int marks2 = 60; //Internal identifier

    float avg = (float) (marks1 + marks2) / 2;//Variable identifier

    printf("Avg 1 :%f\n",avg);
    avg = avefind(marks1, marks2);
    printf("Avg 2 :%f\n",avg);

    printf("Making a student!\n");
    //println("Making a student with space!\n");//Doesnt work. Println not recognized
    STUDENT s2 = {2, "Raju", 50, 70, 90, 70.00};

    //Label Identifier
    int x = 0;
    begin:
    x++;
    if (x>=10)
        goto end;
    printf("%d\n", x);
    goto begin;
    end:
        printf("Enum for Mon: %d\n", Mon);
        printf("Enum for Tue: %d\n", Tue);
        printf("Enum for Wed: %d\n", Wed);
        printf("Enum for Thur: %d\n", Thur); //If written Thu, error 
        printf("Enum for Fri: %d\n", Fri);
        //Will print out 10,11,12,13, 10
        return 0;

        

}

float avefind(int marks1, int marks2){
    return (float) (marks1 + marks2) / 2;
}