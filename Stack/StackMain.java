package Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(6);
        stack.pushData(45);
        stack.pushData(73);
        stack.pushData(88);
        stack.pushData(29);
        stack.pushData(67);
        stack.pushData(14);
        stack.pushData(22);

        System.out.println(stack.popData());
        System.out.println(stack.popData());
        System.out.println(stack.popData());
        System.out.println(stack.popData());
        System.out.println(stack.popData());
        System.out.println(stack.popData());
        System.out.println(stack.popData());
        System.out.println(stack.popData());
    }
}
