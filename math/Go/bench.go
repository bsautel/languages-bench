package main

import "fmt"

func compute(number int) {
	i := 0
	for i < number {
		if i % 123 == 0 {
			i = i + 10
		} else {
			i = i + 1
		}
	}
	fmt.Println("result is", i)
}

func main() {
	compute(1000000000)
}
