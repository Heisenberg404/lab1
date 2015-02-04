

package actividadlab1;

public class CLresistencias {
    private float r1,r2,r3,rt;
    
    public CLresistencias() {
    }
    public float calcularParalelo(float re1, float re2, float re3)
    {
        r1=re1;
        r2=re2;
        r3=re3;
        rt=1/((1/r1)+(1/r2)+(1/r3));
        return rt;
    }
    
    public float calcularSerie(float re1, float re2, float re3)
    {
        r1=re1;
        r2=re2;
        r3=re3;
        rt=r1+r2+r3;
        return rt;
    }
}
