

class ArrayDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = x++; // y gets the value of x (5), then x becomes 6
        System.out.println("x = " + x + ", y = " + y);
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        // System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        int i = 0;
        for (String coffee : copyFrom) {
            if (i < 7) {
                copyTo[i] = coffee;
                i++;
            } else {
                break;
            }
            // System.out.println(Arrays.toString(copyTo));
        }
    }
}
class Array extends ArrayDemo {
    // public static void main(String[] args) {
    //     int[] numbers = { 1, 2, 3, 4, 5 };
    //     int[] numbersCopy = Arrays.copyOf(numbers, 3);
    //     System.out.println(Arrays.toString(numbersCopy));
    // }
}