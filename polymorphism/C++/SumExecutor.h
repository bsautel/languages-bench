#ifndef __SUM_EXECUTOR
#define __SUM_EXECUTOR

#include "Executor.h"

class SumExecutor : public Executor
{
public:
  int execute(int value)
  {
    return value + 10;
  }
};

#endif
