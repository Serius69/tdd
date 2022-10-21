package bo.edu.ucb.tdd;

import java.util.Scanner;

public class Ascensor {

    private char[][] pisos =
                            {{'0'},
                            {'0'},
                            {'0'},
                            {'0'},
                            {'0'},
                            {'0'},
                            {'0'}};

    private int pisoaleatorio = 0;

    public String CrearPersona(int x) throws Exception{

        int pisosalida = 0;
        int pisollegada = 0;

        pisosalida = (1 + (int) (Math.random() * ((7 - 1) + 1)));
        asignarPosicion(x,pisosalida);

        Scanner reader = new Scanner(System.in);

        pisollegada = reader.nextInt();
        verificarUnaSolaPersona(x);



        return "hay mas de una persona";
    }


    private void verificarUnaSolaPersona(int persona) throws Exception{
        //verificar que la persona sea una sola
        if(persona==1){
            throw new Exception("Solo hay una persona");
        }
    }

    private void verificarPiso(int piso) throws Exception{
        if(piso < 1 || piso >3) {
            throw new Exception("El piso "+piso+" esta fuera del edificio");
        }
    }

    private void asignarPosicion(int x, int persona ) throws Exception{
        if(pisos[x-1][y-1]!='0') {
            throw new Exception("La posicion ya esta ocupada");
        } else {
            System.out.println("Asignando piso: "+x+" persona: "+persona);
            pisos[x-1][y-1] = persona;
        }
    }

    private void verificarquelospisosseandistintos(int salida, int llegada) throws Exception{
        //verificar que los pisos sean distintos
        if(salida!=llegada){
            throw new Exception("Solo hay una persona");
        }
    }

    private void verificarqueseaelpiso1(int salida) throws Exception{
        //verificar que los pisos sean distintos
        if(salida==1){
            throw new Exception("Solo hay una persona");
        }
    }

}
