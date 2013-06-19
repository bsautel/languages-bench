var modulo = require('./modulo.js');
var sum = require('./sum.js');

function getExecutors()
{
    var executors = [];
    for (var i = 0; i < 1000000; i++) {
        executors.push(new modulo.ModuloExecutor());
        executors.push(new sum.SumExecutor());
    }
    return executors;
}


function execute(executors)
{
    for (var i = 0; i < 1000; i++) {
        for (var j = 0, length = executors.length; j < length; j++) {
            var executor = executors[j];
            executor.execute(i * 1000);   
        }
    }
}

execute(getExecutors());