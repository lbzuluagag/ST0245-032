
/**
 * Write a description of class Fecha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fecha
{
    private int mes;
    private int dia;
    private int año;
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;        
        this.año=año;
    }
    
    public int getmes(){return mes;}
    
    public int getdia(){return dia;}
    
    public int getaño(){return año;}
      
}