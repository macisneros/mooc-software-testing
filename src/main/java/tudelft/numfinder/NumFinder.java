package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        try {
            for(int n : nums) {

                if(n < smallest)
                    smallest = n;
                if (n > largest) {
                    largest = n;
                }
            }
        } catch (Exception e) {
            System.out.println("Input is not valid");
            largest = 0;
            smallest = 0;
        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
