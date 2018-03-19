// Executing Runnables with an ExecutorService
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor
{
    public static void main(String[] args)
    {
         // create and name Runnables
         PrintTask task1 = new PrintTask("task1");
         PrintTask task2 = new PrintTask("task2");
         PrintTask task3 = new PrintTask("task3");

         System.out.println("Starting Executor\n");

         // create ExecutorService to manage threads
         ExecutorService executorService = Executors.newCachedThreadPool();

         // start tasks
         executorService.execute(task1);
         executorService.execute(task2);
         executorService.execute(task3);

         // shut down ExecutorService
         // ExecutorService itself decides when to shut down threads
         executorService.shutdown();

         System.out.println("Tasks started, main ends\n");
    }
}
