package workshop.w1.paata_shvelidze_1;


/**
 * Find two packages inside this package.
 * Create classes A and B inside first and the second package accordingly
 * 1 point
*/
import workshop.w1.paata_shvelidze_1.first.A;
import workshop.w1.paata_shvelidze_1.second.B;

public class Assignment02 {
    public static void main(String[] args) {
        A classA = new A();
        B classB = new B();

        // Call methods from class A and class B
        classA.displayA();
        classB.displayB();

        System.out.println("This text is just for example");
    }
}
