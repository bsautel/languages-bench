function compute(number) {
	var i = 0;
	while (i < number) {
		if (i % 123 == 0) {
			i = i + 10;
		} else {
			i = i + 1;
		}
	}
	console.log("result is " + i);
}

compute(1000000000);
