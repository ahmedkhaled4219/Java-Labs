public interface Complex <t extends Number>{
  t getReal();
t getImage();

void setComplex(t r,t i);
Complex<t> Add(Complex<t> c);
 Complex<t> Sub(Complex<t>c);
 void print();

}
