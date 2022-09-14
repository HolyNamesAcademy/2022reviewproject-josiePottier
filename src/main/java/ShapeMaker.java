
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        String squ = "";
        for(int i = 0; i < size; i ++ ){
            for(int j = 0; j < size; j ++ ){
                squ += ("* ");
            }
            squ += ("\n");
        }

        return squ;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        String rec = "";
        for(int i = 0; i < height; i ++ ){
            for(int j = 0; j < length; j ++ ){
                rec += ("* ");
            }
            rec += ("\n");
        }

        return rec;
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        String tri = "";
        for(int i = 1; i <= height; i ++ ){
            for(int j = 0; j < i; j++){
                tri += ("* ");
            }
            tri += ("\n");
        }
        return tri;
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        String tri2 = "";
        for(int i = 0; i < height; i ++ ){
            for(int j = height; j > i; j--){
                tri2 += ("* ");
            }
            tri2 += ("\n");
        }
        return tri2;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        String tri3 = "";
        for(int i = 0; i < height; i ++ ){
            for(int j = height; j > i; j--) {
                for (int x = j - 1 - i; x > 0; x--) {
                    tri3 += (" ");
                }
                for (int y = i + 1; y > j - height; y--) {
                    tri3 += (" *");
                }
            }
                tri3 += ("\n");
            }
            return tri3;
    }


    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        // write your code here
        return "";
    }
}
