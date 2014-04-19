//cci150 1.6

public class ImageUtil {
    
    /**
     * rotate 90 degrees clockwise. 1st fold along the
     * horizontal middle line, then fold along the line
     * connecting left top corner and bottom right corner
     *
     * @param image a NxN 2d Pixel array
     */
    public static void rotate(Pixel[][] image) {
        if(image == null || image.length == 0
            || image[0].length != image.length) return;

        int n = image.length;
        for(int i = 0; i < n/2; i++) {
            for(int j = 0; j < n; j++) {
                Pixel t = image[i][j];
                image[i][j] = image[n-1-i][j];
                image[n-1-i][j] = t;
            }
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                Pixel t = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = t;
            }
        }
    }
    public static class Pixel {
        private int data; //4 bytes data
        public int get() { return data;}
        public void set(int v) {data = v;}
    }
}
