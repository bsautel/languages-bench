<?php

include_once('Executor.php');

class SumExecutor implements Executor
{

	public function execute($value)
	{
		return $value + 10;
	}

}


?>
