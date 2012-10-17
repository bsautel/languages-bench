public class ModuloExecutor
    implements Executor
{
    @Override
    public int execute(int value)
    {
        int i = 0;
        while (i < value) {
            if (i % 123 == 0) {
                i += 10;
            }
            else {
                i++;
            }
        }
        return i;
    }
}
