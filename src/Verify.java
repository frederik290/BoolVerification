/**
 * The following small program was written to verify that a boolean formula behave as expected.
 * Let A and B be vertices in a graph.
 * Let r, g, b be colors: red, green and blue respectively.
 * New Ar will be true if Node A is colored red, and so on.
 * The same way for node B. If e.g. Bb is true, node B has the color blue.
 *
 * The formula is: (¬ Ar ∨ ¬ Br) ∧ (¬ Ag ∨ ¬ Bg ) ∧ (¬ Ab ∨ ¬ Bb)
 * It should be true only if the two nodes A and B have different colors
 */

public class Verify {
    public static void main(String[] args) {
        final String[] colors = {"red", "green", "blue"};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                testTruthAssignments(colors[i], colors[j]);
            }
        }
    }

    public static void testTruthAssignments(String color1, String color2){
        boolean ar, ag, ab, br, bg, bb;
        ar = ag = ab = br = bg = bb = false;

        if(color1 == "red") ar = true;
        if(color1 == "green") ag = true;
        if(color1 == "blue") ab = true;
        if(color2 == "red") br = true;
        if(color2 == "green") bg = true;
        if(color2 == "blue") bb = true;

        boolean result = (!ar || !br) && (!ag || ! bg) && (!ab || !bb);

        //String assignment = ar + " " + ag + " " + ab + " " + br + " " + bg + " " + bb;
        System.out.println("Result of assignment: " + "[" + color1 + ", " + color2 + "]" + " is: \n" + result);
    }
}
