#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int find_prime(int value) {
	int cnt = 0;
	for (int i = 1; i <= value; i++) {
		if (value % i == 0) cnt++;
	}
	if (cnt == 2) return 1;
	else return 0;
}
int main(void) {
	int n;
	scanf("%d", &n);
	int* arr = (int*)malloc(sizeof(int) * n);
	int count = 0;
	// 입력받은 수 배열에 저장하기
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}
	// 배열을 순회하며 소수 찾기
	for (int i = 0; i < n; i++) {
		int result = find_prime(arr[i]);
		if (result != 0) count++;
	}
	printf("%d", count);
	return 0;
}