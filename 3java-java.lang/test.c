#include <stdio.h>

int main(void)
{
	char nombre[5] = "Alura";
	printf("%s\n", nombre);
	
	for (int i = 0; i < 20; i++)
	{
		printf("%c\n", nombre[i]);
	}
}
