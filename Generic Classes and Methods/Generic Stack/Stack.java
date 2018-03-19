// A generic class represents a Stack.
import java.util.ArrayList;

public class Stack<T>
{
      private final ArrayList<T> elements;

      public Stack()
      {
           this(10);
      }

      public Stack(int capacity)
      {
           int initCapacity = capacity > 0 ? capacity : 10; // validate
           elements = new ArrayList<T>(initCapacity);
      }

      public void push(T pushValue)
      {
           elements.add(pushValue);
      }

      public T pop() throws EmptyStackException
      {
           if(elements.isEmpty())
               throw new EmptyStackException("Stack is empty, cannot pop");

           return elements.remove(elements.size() - 1);
      }
}

class EmptyStackException extends RuntimeException
{
      public EmptyStackException()
      {
           this("Stack is empty");
      }

      public EmptyStackException(String message)
      {
           super(message);
      }
}
