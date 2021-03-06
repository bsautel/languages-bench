#include "ModuloExecutor.h"
#include "SumExecutor.h"
#include <list>

std::list<Executor*> getExecutors()
{
  std::list<Executor*> executors;
  for (int i = 0; i < 1000000; ++i)
    {
      executors.push_back(new ModuloExecutor());
      executors.push_back(new SumExecutor());
    }
  return executors;
}

void execute(std::list<Executor*>& executors)
{
  for (int i = 0; i < 1000; ++i)
    {
      for(std::list<Executor*>::iterator it = executors.begin(); it != executors.end(); ++it)
        {
          (*it)->execute(i*1000);
        }
    }
}

void free(std::list<Executor*>& executors)
{
  for(std::list<Executor*>::iterator it = executors.begin(); it != executors.end(); ++it)
  {
    delete *it;
  }
}

int main(int argc, char **argv)
{
  std::list<Executor*> executors = getExecutors();
  execute(executors);
  free(executors);
  return 0;
}
