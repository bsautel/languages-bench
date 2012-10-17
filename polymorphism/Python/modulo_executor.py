import executor

class ModuloExecutor(executor.Executor):
	def execute(self, value):
		return value % 123
