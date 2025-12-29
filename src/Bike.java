public class Bike {
    String band_name,model,color;
    int cc,price;

    void printinformation(){
        System.out.println("Name :"+band_name);
        System.out.println("Model :"+model);
        System.out.println("Color :"+color);
        System.out.println("CC :"+cc);
        System.out.println("Price :"+price);
        System.out.println();
    }
public static void main(String[] args) {
    System.out.println("Lets talk about Bike");

     Bike b1=new Bike();
     b1.band_name="Yamaha";
     b1.model="FZX V-3";
     b1.color="Red";
     b1.cc=150;
     b1.price=243000;
     b1.printinformation();

     Bike b2=new Bike();
     b2.band_name="Suzuki";
     b2.model="Gixxer Monotune";
     b2.color="Black";
     b2.cc=150;
     b2.price=210000;
     b2.printinformation();

     Bike b3=new Bike();
     b3.band_name="Honda";
     b3.model="Hornet";
     b3.color="Orange";
     b3.cc=160;
     b3.price=215000;
     b3.printinformation();

    }
}
