#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int arr[46];
int fibonacchi(int n) {
	arr[0] = 0;
	arr[1] = 1;
	for (int i = 2; i <= n; i++) {
		arr[i] = arr[i - 1] + arr[i - 2];
	}
	return arr[n];
}

int main(void) {
	int n;
	scanf("%d", &n);
	printf("%d\n", fibonacchi(n));
	return 0;
}