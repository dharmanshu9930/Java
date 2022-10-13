class SolveHanoi {
    static void solHanoi(int n, char ori, char dest, char aux){
        if (n == 0) {
            return;
        }
        solHanoi(n - 1, ori, aux, dest);
        System.out.println("Move " + n + " from "+ ori + " to "+ dest);
        solHanoi(n - 1, aux, dest, ori);
    }

    public static void main(String args[]){
        int N = 3; // change N disks.

        int moves = (int) (Math.pow(2, N)-1);
 
        solHanoi(N, 'A', 'C', 'B');
        System.out.println("In "+moves+" moves.");
    }
}
