package ar.edu.unlp.oo1.ejercicio4;

public class Cuerpo3D {

    private double altura;
        private Cuerpo2D caraBasal;
        
        public void setAltura(double valor){
                this.altura=valor;
        }
    
        public double getAltura(){
            return this.altura;
        }
    
        public void setCaraBasal(Cuerpo2D cara){
            this.caraBasal=cara;
    }
        public double getVolumen(){
            return this.caraBasal.getArea()* this.getAltura();
        }
        

        public double getSuperficieExterior(){
            return (2* this.caraBasal.getArea() )+ this.caraBasal.getPerimetro()* this.getAltura();
        }

}
