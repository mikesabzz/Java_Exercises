import java.util.*;

public class TwoDimArray {
    public static void main(String[] args) throws Exception {
        int[][] twoD_arr = 
        {
            {0,1,1,1,1},
            {0,1,0,0,0},
            {0,0,0,1,0},
            {1,1,1,1,0},
            {1,0,0,1,0},
        };
        TwoDimArray twoDArr = new TwoDimArray();
        twoDArr.solution(twoD_arr);
    
    }
// When planting flowers in a pot, it's important to make sure that whenever you water your plant
// any water that doesnt get absorbed by the roots drains out the bottom of the pot. Otherwise, the
// water will pool in the bottom of the pot and cause your plant to rot.

// Using a 2D array to represent your pot, individual pieces of gravel are notated with a 1 and empty 
// spaces between gravel are notated with a 0.

// Write a function to determine whether the water can fall from the top row to the bottom, moving
// through the spaces between the gravel.
    public void solution(int[][] pot){
        
    }

}
