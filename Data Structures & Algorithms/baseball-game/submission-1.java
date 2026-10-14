class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int size = 0;
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("+")) {
                scores[size] = scores[size - 1] + scores[size-2];
                size++;
            } 
            else if (op.equals("D")) {
                scores[size] = 2 * scores[size - 1];
                size++;
            } 
            else if (op.equals("C")) {
                size--;
            } 
            else {
                scores[size] = Integer.parseInt(op);
                size++;
            }
        }
        for (int i = 0; i < size; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
