import executor

class SumExecutor(executor.Executor):
	def execute(self, value):
		return value + 10
