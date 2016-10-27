//https://www.hackerrank.com/challenges/calculating-volume

class Calculate {
    private Scanner in = new Scanner(System.in);
    Calculator output = new Calculator();
    
    int get_int_val() throws IOException {return in.nextInt();}
    double get_double_val() throws IOException {return in.nextDouble();}
    
    static Calculator do_calc(){
        return new Calculator();
    }
    
    static void checker(int... nums) {
        for(int i : nums){
            if(i <= 0) throw new NumberFormatException("All the values must be positive");  
        }
    }
        
    static void checker(double... nums) {
        for(double i : nums){
            if(i <= 0) throw new NumberFormatException("All the values must be positive");  
        }
    }
    
    static class Calculator {
        void display(double num) {
            System.out.printf("%.3f\n", num);
        }
        
        double get_volume(int a) {
            checker(a);
            return Math.pow(a, 3);
        }
        
        double get_volume(int l, int b, int h) {
            checker(l, b, h);
            return l*b*h;
        }
        
        double get_volume(double r) {
            checker(r);
            return 4.0*Math.PI*Math.pow(r, 3)/6.0;
        }
        
        double get_volume(double r, double h) {
            checker(r, h);
            return Math.PI*Math.pow(r, 2)*h;
        }
    }
}