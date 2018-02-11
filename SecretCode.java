import java.util.Scanner;
public class SecretCode
{
    private Scanner teclado;
    private String[] mensajes;
    
    public void cargar()
    {
        teclado=new Scanner(System.in);
        mensajes=new String[2];
        for(int f=0;f<2;f++) {
            System.out.print("Ingrese le mensaje en numeros:");
            mensajes[f]=teclado.next();
        }   
    }
    
    public void imprimir() {
        char [] Caracteres = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println(Caracteres); 
        for(int f=0;f<2;f++) {          
            String str= mensajes[f];
            int largo = str.length();
            System.out.print("mensaje decodificado ");
            
            for (int i=0;i<largo;i+=2){
            int letra = Integer.parseInt(str.substring(i,i+2));
            System.out.print(Caracteres[letra]);
            }
            System.out.println();
            
        }
    }

    public static void main(String[] ar) {
        SecretCode pv=new SecretCode();
        pv.cargar();
        pv.imprimir();
    }

}
