package bo.edu.ucb.tdd;

import java.util.Scanner;

public class Ascensor {

    private char[] pisos =  {'0'
            ,'0'
            ,'0'
            ,'0'
            ,'0'
            ,'0'};

    public String CrearPersona(int persona,int pisollegada) throws Exception{
        int pisosalida = 0;
        pisosalida = (1 + (int) (Math.random() * ((7 - 1) + 1)));

        verificarUnaSolaPersona(persona);
        verificarqueseaelpiso1(pisosalida,pisollegada);
        verificarquelospisosseandistintos(pisosalida,pisollegada);
//
        System.out.println("El piso salida es "+pisosalida+" el piso llegada es "+pisollegada);

        boolean verificar=subidaobajada(pisosalida,pisollegada);
        if(verificar){
            return "El ascensor sube";
        }
        return "El ascensor baja";
    }
    private boolean subidaobajada(int pisosalida, int pisollegada) throws Exception{
        //verificar que la persona sea una sola



        if(pisollegada>pisosalida){
            //ascensor sube
            return true;
        }
        //ascensor baja
        return false;
    }
    private void verificarUnaSolaPersona(int persona) throws Exception{
        //verificar que la persona sea una sola
        if(persona!=1){
            throw new Exception("Hay mas de una persona");
        }
    }
    private void verificarPiso(int piso) throws Exception {
        if (piso < 0 && piso > 7) {
            System.out.println("El piso"+piso+"no existe");
            throw new Exception("El piso " + piso + " esta fuera del edificio");
        }
    }
    private void verificarquelospisosseandistintos(int salida, int llegada) throws Exception{
        //verificar que los pisos sean distintos
        verificarPiso(salida);
        if(salida==llegada){
            System.out.println("El piso "+salida+" es igual al piso "+llegada);
            throw new Exception("Los pisos son iguales");
        }
    }
    private void verificarqueseaelpiso1(int salida, int llegada) throws Exception{
        //verificar que los pisos sean distintos
//        if(salida!=1){
//            System.out.println("El piso salida "+salida+" no es igual 1 ");
//            throw new Exception("El piso salida no es 1");
//        }
        if(salida==1){
            System.out.println("El piso salida "+salida+" es igual 1 ");
            System.out.println("El ascensor se mantiene en el piso 1 para abordar a la persona");
//            throw new Exception("El piso salida es 1");
        }
        else{
            boolean verificar=subidaobajada(salida,llegada);
            if(verificar){
                System.out.println("El ascensor sube para abordar a la persona");
            }else {
                System.out.println("El ascensor baja para abordar a la persona");
            }

        }

    }

}