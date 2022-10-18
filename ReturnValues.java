public class ReturnValues {
    public static void main(String[] args) {
            double measure1 = measureRectangle(4.3, 2.2, "area");
            double measure2 = measureRectangle(3.2, 4.1, "perimeter");
            

            stringPrinter(4.3, 2.2, measure1, "area");
            stringPrinter(3.2, 4.1, measure2, "perimeter");
           
        }
    
        public static double measureRectangle(double length, double width, String option){
            switch(option){
                case "area": return length * width;
                case "perimeter": return 2 * (length + width);
                default: return 404;
            }
          
        }

        public static void stringPrinter(double length, double width, double area, String option){
            System.out.println("The " + option + " of a rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
        }
}
