package edu.cnm.deepdive;

import java.util.Arrays;

public class CardExtractor
{

  private static final int[] DECK_OF_CARDS ={7, 8, 12, 2, 1, 13, 9, 6, 11, 5, 10, 3, 4};
  public static void main(String[] args)
  {
    int start = Integer.parseInt(args[0]); // parse element 0 of args (String) as an int.
    int end = Integer.parseInt(args[1]); // parse element 1 of args (String) as an int.
    System.out.println(start); //write the value of start to the console.
    System.out.println(end); //write the value of end to the console.
    int[] extract = extracted(start, end);
    String prettyExtract = Arrays.toString(extract); //use arrays class to get a prettified version of the array.
   // System.out.println(Arrays.toString(extracted(start, end)));
    System.out.println(prettyExtract); //write prettified version to console.

    /**
     * Create and returns an int[], containing some (or all) of DECK_OF_CARDS
     * @param start starting position (inclusive) of extraction.
     * @param end ending position (exclusive) of extraction
     * @return Copy of sub-arrays of DECK_OF_CARDS
     */



  }
  private static int[] extracted(int start, int end) //since this function is an int, it'll be returning extracted
  {
    int[] extracted = new int[end - start]; //Allocate space for new array of int[].

    for(int i = start; i < end; i++) //first part of the for loop is establishing a value for the new i, second is the
      //condition under which it stops. the third is the increment by which i bumps itself up.
    {
      extracted[i-start] = DECK_OF_CARDS[i];
    }
    return extracted;
  }

}
