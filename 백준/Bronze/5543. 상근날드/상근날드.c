#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define max 2001

int main() {
    int cheap_food = max;
    int cheap_bev = max;
    int set = 0;
    for (int i = 0; i < 3; i++) {
        int n;
        scanf("%d", &n);
        if (n < cheap_food) cheap_food = n;
    }
    for (int i = 0; i < 2; i++) {
        int n;
        scanf("%d", &n);
        if (n < cheap_bev) cheap_bev = n;
    }
    set = cheap_food + cheap_bev - 50;
    printf("%d\n", set);




    return 0;
}