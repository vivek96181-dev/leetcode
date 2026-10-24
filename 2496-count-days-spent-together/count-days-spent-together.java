class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob,   String leaveBob) {
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        int am1 = Integer.parseInt(arriveAlice.substring(0,2)),
            ad1 = Integer.parseInt(arriveAlice.substring(3,5));
        int lm1 = Integer.parseInt(leaveAlice.substring(0,2)),
            ld1 = Integer.parseInt(leaveAlice.substring(3,5));
        int am2 = Integer.parseInt(arriveBob.substring(0,2)),
            ad2 = Integer.parseInt(arriveBob.substring(3,5));
        int lm2 = Integer.parseInt(leaveBob.substring(0,2)),
            ld2 = Integer.parseInt(leaveBob.substring(3,5));

        int startMonth = Math.max(am1, am2);
        int endMonth   = Math.min(lm1, lm2);
        int c = 0;

        for (int m = startMonth; m <= endMonth; m++) {
            int lo = 1, hi = arr[m-1];
            // arrival day only constrains that person's arrival month
            if (m == am1) lo = Math.max(lo, ad1);
            if (m == am2) lo = Math.max(lo, ad2);
            // leave day only constrains that person's leave month
            if (m == lm1) hi = Math.min(hi, ld1);
            if (m == lm2) hi = Math.min(hi, ld2);
            if (lo <= hi) c += hi - lo + 1;
        }
        return c;
    }
}