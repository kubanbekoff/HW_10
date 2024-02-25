package Home_Work;

public class HW_8_Block {

     int width;
     int length;
     int height;
    int volume;
    int surfaceArea;

HW_8_Block(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];

    }

     int getHeight() {
        return height;
    }

    int getLength() {
        return length;
    }

    int getWidth() {
        return width;
    }
    int getVolume() {

        return  width * length * height;
    }
    int getSurfaceArea() {
        return width * length * 2
                + height * length * 2
                + width * height * 2;
    }
}
