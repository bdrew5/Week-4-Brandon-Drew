public class Trail
{
    private int[] markers;

    public boolean isLevelTrailSegment(int start, int end) {
        int min = start;
        int max = start;
        for(int i = start +1; i< end+1; i++){
            if (min>markers[i])
                min = markers[i];
            if (max<markers[i])
                max = markers[i];
        }
        if (max-min <= 10)
            return true;
        else
            return false;
    }
    /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
     * elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
     * with 3 or more such changes is rated difficult.
     * @return true if the trail is rated difficult; false otherwise.
     */
    public boolean isDifficult() {
        int count = 0;
        for(int i = 1; i<markers.length; i++){
            if(markers[i-1] - markers[i] >= 30 || markers[i-1] - markers[i] <= -30){
                count++;
            }
        }
        if (count >=3)
            return true;
        else
            return false;
    }
    // There may be instance variables, constructors, and methods that are not shown.
}