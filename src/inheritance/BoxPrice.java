package inheritance;

public class BoxPrice extends BoxWeight{

    int price;
    BoxPrice(){
        super();
        price =-1;
    }

    BoxPrice(int weight, int price){
        super(weight);
        this.price = price;

    }
}
