#include<stdio.h>
#include<string.h>


int main() {

    char str[] = {"sasadfssasasadoskf"};
    int count = 0;

    for (int i = 0; i < strlen(str) - 1; i++) {
        
        if (str[i] == 's' && str[i+1] == 'a') {
            count++;
            i++;
        }
    }    

    printf("%d", count);

    return 0;
}