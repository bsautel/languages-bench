require "./ModuloExecutor.rb"
require "./SumExecutor.rb"

def getExecutors()
    executors = [] 
    for i in 0..1000000
        executors << ModuloExecutor.new()
        executors << SumExecutor.new()
    end
    return executors
end

def execute(executors)
    for i in 0..1000
        for executor in executors
            executor.execute(i + 1000)
        end
    end
end

execute(getExecutors())