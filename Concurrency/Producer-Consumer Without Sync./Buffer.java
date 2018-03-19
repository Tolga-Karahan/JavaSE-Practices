// Buffer interface specifies methos called by Producer and Consumer.
/*Interface Buffer declares methods blockingPut and blockingGet
that a Buffer must implement to enable the Producer thread put a value
into Buffer and Consumer thread retrieve a value from Buffer*/

public interface Buffer
{
    // place an int value to buffer
    /* In examples blockingPut and blockingGet methods call methods that
    throws InterruptedException, so we declare this methods with proper
    throws clause*/
    public void blockingPut(int value) throws InterruptedException;

    // return an int value from buffer
    public int blockingGet() throws InterruptedException;
}
