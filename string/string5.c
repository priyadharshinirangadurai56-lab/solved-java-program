#include <stdio.h>
int main() {
    char str[100];
    int i = 0, j;
    scanf("%s", str);
    while (str[i] != '\0') {
        i++;
    }
    j = i - 1;
    i = 0;
    while (i < j) {
        if (str[i] != str[j]) {
            printf("Not Palindrome");
            return 0;
        }
        i++;
        j--;
    }
    printf("Palindrome");
    return 0;
}
