import executor
import sum_executor
import modulo_executor

def getExecutors():
	executors = [] 
	for i in range(0, 1000000):
		executors.append(modulo_executor.ModuloExecutor())
		executors.append(sum_executor.SumExecutor())
	return executors

def execute(executors):
	for i in range(0, 1000):
		for executor in executors:
			executor.execute(i + 1000)


if __name__ == '__main__':
	execute(getExecutors()) 
