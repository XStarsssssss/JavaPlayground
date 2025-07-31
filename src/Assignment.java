public class Assignment {
    private double x;
    private double y;
    private double result;

    public void  xy(double x,double y){
        this.x=x;
        this.y=y;

    }
    public double  calculator(){

        //return result = (x*x)+(5*x*x)-(3*x*x)-10-(3*x*y)-2-(10*y*x)+(y*y)-(x*x);
         return result = Math.pow(x,2)+(5*Math.pow(x,2))-(3*Math.pow(x,2))-10-(3*x*y)-2-(10*y*x)+Math.pow(y,2)-Math.pow(x,2);
    }
    public void check(){
        if (x < 0){
            System.out.println("x is lower 0");
        }
        else if(y < 0){
            System.out.println("y is lower 0");
        }
        else{
            System.out.println("x: "+x);
            System.out.println("y: "+y);
            System.out.println("Result: "+calculator());
        }
    }

}
