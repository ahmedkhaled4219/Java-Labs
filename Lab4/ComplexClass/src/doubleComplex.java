public class doubleComplex implements Complex<Double>{
    Double real;
    Double img;

    doubleComplex(Double r,Double i){
        real=r;
        img=i;
    }
    @Override
    public Double getReal() {
        return real;
    }

    public Double getImage() {
        return img;
    }
    public void setComplex(Double r, Double i){
        real=r;
        img=i;
    }

    @Override
    public Complex<Double> Add(Complex<Double> c1) {

        return new doubleComplex(real+ c1.getReal(),img+ c1.getImage());
    }
    public  Complex<Double> Sub(Complex<Double> c1){
        return new doubleComplex(real - c1.getReal(),img - c1.getImage());
    }

    @Override
    public void print() {
        System.out.print(real);
        if(img>0){
            System.out.print("+"+img+"j");
        }
        else if(img<0){
            System.out.print(img+"j");
        }
        System.out.println();
    }
}
