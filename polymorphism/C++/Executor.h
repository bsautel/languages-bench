#ifndef __EXECUTOR
#define __EXECUTOR

class Executor
{
public:
  ~Executor(){}
  
  virtual int execute(int value) = 0;
};

#endif
