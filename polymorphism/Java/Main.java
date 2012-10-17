import java.util.LinkedList;
import java.util.List;


public class Main
{
    public static void main(String[] args)
    {
        execute(getExecutors());
    }


    private static List<Executor> getExecutors()
    {
        List<Executor> executors = new LinkedList<Executor>();
        for (int i = 0; i < 10; i++) {
            executors.add(new ModuloExecutor());
            executors.add(new SumExecutor());
        }
        return executors;
    }


    private static void execute(List<Executor> executors)
    {
        for (int i = 0; i < 1000; i++) {
            for (Executor executor : executors) {
                executor.execute(i * 1000);
            }
        }
    }
}
