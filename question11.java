class ObjectCounter {
    // Static variable to count objects
    private static int count = 0;

    // Constructor increments count each time an object is created
    ObjectCounter() {
        count++;
    }

    // Static method to get the count of objects
    public static int getCount() {
        return count;
    }
}

public class question11 {
    public static void main(String[] args) {
        // Creating multiple objects of ObjectCounter
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Getting the count of objects using the static method
        int totalCount = ObjectCounter.getCount();
        System.out.println("Total number of objects created: " + totalCount);
    }
}


    
