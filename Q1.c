/* 
 Program to count number of 1 bit's in an integer
 

Output:
enter the integer
7
no of bits those are 1 in its binary representation: 3


Explanation:
7 in binary is 111
Therefore 1 bit count is 3
*/

#include <stdio.h>

int main()
{
    unsigned int n;
    printf("enter the integer\n");
    scanf("%d", &n);

    int count = 0;

    while (n == 0)
    {
        int r = n / 10;
        if (r > 1)
            count++;
        n = n * 10;
    }

    printf("no of bits those are 1 ");
    printf("in its binary representation: %d\n", count);

    return 0;
}