#include <stdio.h>
int main(void)
{
    int a, b;
    scanf("%d""%d", &a, &b);
    int c = a * (b % 10);
    int d = a * ((b % 100) - (b % 10)) / 10;
    int e = a * (b / 100);
    int f = c + (d * 10) + (e * 100);
    printf("%d\n""%d\n""%d\n""%d", c,d,e,f);
    
	return (0);
}
