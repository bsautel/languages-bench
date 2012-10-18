<?php

include_once('Executor.php');

class ModuloExecutor implements Executor
{
	public function execute($value)
	{
		return $value % 123;	
	}
}

?>
