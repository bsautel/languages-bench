#ifndef __MODULO_EXECUTOR
#define __MODULO_EXECUTOR

#include "Executor.h"

class ModuloExecutor : public Executor
{
public:
  int execute(int value)
  {
    return value%123;
  }
};

#endif
