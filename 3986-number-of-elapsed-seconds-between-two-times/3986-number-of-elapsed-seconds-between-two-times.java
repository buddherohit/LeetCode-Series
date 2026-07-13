class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start = toSeconds(startTime);
        int end = toSeconds(endTime);

        if (end < start) {
            end += 24 * 3600;
        }

        return end - start;
    }

    private int toSeconds(String s) {
        int hou = Integer.parseInt(s.substring(0, 2));
        int minu = Integer.parseInt(s.substring(3, 5));
        int sec = Integer.parseInt(s.substring(6, 8));

        return hou * 3600 + minu * 60 + sec;
    }
}