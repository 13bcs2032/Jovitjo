#include <stdio.h>
#include<conio.h>
int main()
{
int n, revNum=0,rem;
printf("Enter an integer: ");
scanf("%d", &n);
while(n != 0)
    {
    rem= n%10;
    revNum= revNum*10 + rem;
    n /= 10;
    }
printf("Reversed Number = %d",revNum);
return 0;
}
