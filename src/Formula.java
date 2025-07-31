public class Formula {

    private double bases;
    private double hight;
    private double results;
    private final double Half = 0.5;


    public  double area (double bases, double hight){
        this.bases=bases;
        this.hight=hight;

        return results = bases*hight*Half;
    }
    public void  check(){
        if (bases < 0){
            System.out.println("Bases Error");
        }

        else if (hight < 0 ){
            System.out.println("Hight Error");
        }
        else{
            result();
        }

    }
    public void result(){
        System.out.println("Bases: "+bases);
        System.out.println("Hight: "+ hight);
        System.out.println("Half: "+ Half);
        System.out.println("xxxxxxxxxxxxxx");
        System.out.println("Result: "+results);
    }


}