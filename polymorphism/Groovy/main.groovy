interface Executor {
    def execute(value);
}

class ModuloExecutor implements Executor {
    def execute(value) {
        return value % 123
    }
}

class SumExecutor implements Executor {
    def execute(value) {
        return value + 10
    }
}

def getExecutors()
{
    executors = []
    for (i in 0..1000000) {
        executors.add(new ModuloExecutor());
        executors.add(new SumExecutor());
    }
    return executors;
}


def execute(executors)
{
    for (i in 0..1000) {
        for (Executor executor : executors) {
            executor.execute(i * 1000);
        }
    }
}

execute(getExecutors());