public class Main {
    public static void main(String[] args) {
        Window simpleWindow = new SimpleWindow();
        Window borderedWindow = new BorderDecorator(simpleWindow);
        Window scrollableBorderedWindow = new ScrollbarDecorator(borderedWindow);
        simpleWindow.draw();
        System.out.println();
        borderedWindow.draw();
        System.out.println();
        scrollableBorderedWindow.draw();
    }
}
