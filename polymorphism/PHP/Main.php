<?php

include_once('ModuloExecutor.php');
include_once('SumExecutor.php');

function get_executors()
{
	$executors = array();
	for ($i = 0; $i < 1000000; $i++)
	{
		$executors[] = new ModuloExecutor();
		$executors[] = new SumExecutor();
	}
	return $executors;
}

function execute($executors)
{
	for ($i = 0; $i < 1000; $i++)
	{
		foreach ($executors as $executor)
		{
			$executor->execute($i * 1000);
		}
	}
}

execute(get_executors());

?>
