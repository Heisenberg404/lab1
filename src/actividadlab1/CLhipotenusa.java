

package actividadlab1;


public class CLhipotenusa {
    private float c1,c2,hp;
    
    public CLhipotenusa() {
    }
    
    public float calcularHipotenusa(float cat1, float cat2){
    c1=cat1;
    c2=cat2;
    hp=(float)Math.sqrt((Math.pow(c1, 2))+(Math.pow(c2, 2)));
    return hp;
    }
}
