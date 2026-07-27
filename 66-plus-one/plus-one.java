class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[4];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }
        int[] result = plusOne(digits);
        System.out.println(result);

    }
}