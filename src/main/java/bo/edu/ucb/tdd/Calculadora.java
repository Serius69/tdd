package bo.edu.ucb.tdd;

public class Calculadora {

    private final int MAX = 1000;
    public String suma(String sumandos) throws Exception {
//        return new String();

        if(sumandos!=null &&  sumandos.equals("")){
            return "0";
        }

        int total=0;

        String[] sums =sumandos.split(",");
        for(int i =0;i<sums.length;i++){
            total=total+Integer.parseInt(sums[i]);
            int s=Integer.parseInt(sums[i]);
            if(s<=MAX){
                total=total+s;
            }
            if(s<0){
                throw new Exception("El numero es negativo");
            }
        }
        return (new Integer(total)).toString();
    }
}
