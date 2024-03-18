import decorator.Ingredient;
import decorator.base.ChocoCone;
import decorator.custom.ChocoChip;
import decorator.custom.MangoScoop;
import decorator.custom.StrawberrySyrup;

public class DecoratorClient {
    public static void main(String[] args) {
        Ingredient newIceCream =
                new ChocoChip(
                  new StrawberrySyrup(
                          new MangoScoop(
                                  new ChocoCone()
                          )
                  )
                );
        System.out.println("Total Cost: " +newIceCream.getCost());
        System.out.println("IceCream Description: "+newIceCream.getDescription());
    }
}
