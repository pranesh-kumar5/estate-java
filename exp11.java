
class Property
{
    Object propertyLock = new Object();
    Object buyerLock = new Object();

    void listProperty()
    {
        synchronized (propertyLock)
        {
            System.out.println("Owner Thread: Got Property lock");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            System.out.println("Owner Thread: Waiting for Buyer lock");

            synchronized (buyerLock)
            {
                System.out.println("Owner Thread: Got Buyer lock");
            }
        }
    }

    void purchaseProperty()
    {
        synchronized (buyerLock)
        {
            System.out.println("Buyer Thread: Got Buyer lock");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            System.out.println("Buyer Thread: Waiting for Property lock");

            synchronized (propertyLock)
            {
                System.out.println("Buyer Thread: Got Property lock");
            }
        }
    }
}

public class exp11
{
    public static void main(String[] args)
    {
        Property p = new Property();

        Thread ownerThread = new Thread(() -> p.listProperty());
        Thread buyerThread = new Thread(() -> p.purchaseProperty());

        ownerThread.start();
        buyerThread.start();
    }
}
