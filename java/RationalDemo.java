class Rational{
    private int numerator;
    private int denominator;
    Rational(){
        numerator = 0;
        denominator = 0;
    }
    Rational(int n,int d){
        numerator = n;
        denominator = d;
    }
    public void display(){
        System.out.println(numerator+"/"+denominator);
    }
    public void add(Rational a){
        this.numerator=(this.numerator*a.denominator )+ (a.numerator*this.denominator);
        this.denominator=this.denominator*a.denominator;
        display();
    }
    public void sub(Rational a){
        this.numerator = (this.numerator*a.denominator )- (a.numerator*this.denominator);
        this.denominator = this.denominator*a.denominator;
        display();
    }
    public void mul(Rational a){
        this.numerator = this.numerator*a.numerator;
        this.denominator = this.denominator*a.denominator;
        display();
    }
    public void div(Rational a){
        this.numerator = this.numerator*a.denominator;
        this.denominator = this.denominator*a.numerator;
        display();
    }
}

public class RationalDemo{
    public static void main(String[] args){
        Rational r = new Rational(5,2);
        Rational r1 = new Rational(4,3);
        r.add(r1);
        r.sub(r1);
        r.mul(r1);
        r.div(r1);
    }
}