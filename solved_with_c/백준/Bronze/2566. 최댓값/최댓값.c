#include <stdio.h>

int main(void)
{
    int arr[9][9];
    int max;
    int i;
    int j;
    int max_i;
    int max_j;
    
    i = 0;
    while (i < 9)
    {
        j = 0;
        while (j < 9)
        {
            scanf("%d", &arr[i][j]);
            j++;
        }
        i++;
    }
    
    max = arr[0][0];
    max_i = 0;
    max_j = 0;
    i = 0;
    while (i < 9)
    {
        j = 0;
        while (j < 9)
        {
            if (arr[i][j] >= max)
            {
                max = arr[i][j];
                max_i = i;
                max_j = j;
            }
            j++;
        }
        i++;
    }
    
    printf("%d\n%d %d\n", max, max_i + 1, max_j + 1);
    
    return (0);
}