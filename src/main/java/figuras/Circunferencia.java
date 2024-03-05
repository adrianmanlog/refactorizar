package figuras;

public class Circunferencia {

    public double radio;
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        System.out.println("Di�metro: " + (2 * getRad()));
        System.out.println("Color: " + "rojo");
        double area = 2 * 3.1416 * getRad() * getRad();
        System.out.println(area);
    }
    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.getRad();
        double radio2 = otro.getRad();
        if (considerarDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * @param rad the radio to set
     */
    public void setRad(double rad) {
        this.radio = rad;
    }

    /**
     * @return the radio
     */
    public double getRad() {
        return radio;
    }
}
