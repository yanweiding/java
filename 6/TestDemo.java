class Calculate{
   private int num1;
   private int num2;

   public int add(){
       return this.num1+this.num2;
   }
    public int sub(){
        return this.num1-this.num2;
    }
    public int mul(){
        return this.num1*this.num2;
    }
    public double div(){
        return this.num1*1.0/this.num2;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.setNum1(1);
        calculate.setNum2(2);
        System.out.println(calculate.add());
        System.out.println(calculate.sub());
        System.out.println(calculate.div());
        System.out.println(calculate.mul());
    }
}
