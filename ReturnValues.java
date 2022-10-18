public class ReturnValues {
    public static void main(String[] args) {
            double measure1 = measureREctangle(4.3, 2.2);
            double measure2 = measureREctangle(3.2, 4.1);
            double measure3 = measureREctangle(3.5, 1.2);
            double measure4 =measureREctangle(1.6, 5.6);
            double measure5 =measureREctangle(10.1, 0.7);
            double measure6 =measureREctangle(20.2, 5.6);

            stringPrinter(4.3, 2.2, measure1);
            stringPrinter(3.2, 4.1, measure2);
            stringPrinter(3.5, 1.2, measure3);
            stringPrinter(1.6, 5.6, measure4);
            stringPrinter(10.1, 0.7, measure5);
            stringPrinter(20.2, 5.6, measure6);
        }
    
        public static double measureREctangle(double length, double width){
            double area = length * width;
            return area;
        
        }

        public static void stringPrinter(double length, double width, double area){
            System.out.println("The area of a rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
        }
}
