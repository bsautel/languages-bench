<?php
function compute($number)
{
	$i = 0;
	while ($i < $number)
	{
		if ($i % 123 == 10)
		{
			$i = $i + 10;
		}
		else
		{
			$i = $i + 1;
		}
	}
	echo "result is " . $i;
}

compute(1000000000);
?>
