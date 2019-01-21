public class Colors {
    public static void main(String[] args) {
        String green[] = {"lime", "forest green", "olive", "pale green", "spring green"};
        String red[] = {"orange red", "red", "tomato"};
        String pink[] = {"orchid", "violet", "pink", "hot pink"};
        String colors1[][] = {{"lime", "forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};

        for (int i = 0; i < colors1.length; i ++) {
            String subArray[] = colors1[i];
            System.out.println( "Length of array " + i + " is " + subArray.length );
            for (int j = 0; j < subArray.length; j ++) {
                String item = subArray[j];
                System.out.println( "  Item " +j + " is " + item ); //http://grails.asia/two-dimensional-string-array-in-java
            }
        }
    }
}


// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`