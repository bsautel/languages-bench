#include <iostream>


void compute(int number)
{
	int i = 0;
	while (i < number)
	{
		if (i % 123 == 0)
		{
		    i = i + 10;
		}
		else
		{
		    i = i + 1;
		}
	}
	std::cout << "result is " << i << std::endl;
}

int main(int argc, char **argv) {
    compute(1000000000);
    return 0;
}

