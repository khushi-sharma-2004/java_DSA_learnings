class pattern2 {
    public static void main(String[] args) {
        print(4, 0);
    }

    // r = number of rows left
    // c = number of stars printed in current row
    public static void print(int r, int c) {
        if (r == 0) {                 // No rows left
            return;
        }

        if (c < r) {                  // Print stars in the row
            System.out.print("*");
            print(r, c + 1);
        } else {                      // Move to next row
            System.out.println();
            print(r - 1, 0);
        }
    }
}
