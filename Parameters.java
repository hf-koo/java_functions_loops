public class Parameters {
    public static void main(String[] args) {
        measureREctangle(4.3, 2.2);
        measureREctangle(3.2, 4.1);
        measureREctangle(3.5, 1.2);
        measureREctangle(1.6, 5.6);
        measureREctangle(10.1, 0.7);
        measureREctangle(20.2, 5.6);
    }

    public static void measureREctangle(double length, double width){
        double area = length * width;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
    }
}
