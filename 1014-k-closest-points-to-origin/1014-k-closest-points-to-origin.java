class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // sort the array based on
       // the length of the straight line between two points
       // from the origin
       Arrays.sort(points,(point1,point2)->{
        // calculate the squared distance for the first point of the origin
        int distance1 = point1[0]*point1[0] + point1[1]*point1[1];
        // calculate the squared distance for the second point of the origin
        int distance2 = point2[0]*point2[0] + point2[1]*point2[1];
        // compare the two distance
        return distance1-distance2;
       });

       // return the first k element of the sorted array,
       // whiche are the k closest points to the origin
       return Arrays.copyOfRange(points,0,k);

    }
}