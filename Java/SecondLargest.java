class SecondLargest {
    static int print2largest(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            return -1; // Not enough elements
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        System.out.println("Second largest element: " + print2largest(arr));
    }
}
