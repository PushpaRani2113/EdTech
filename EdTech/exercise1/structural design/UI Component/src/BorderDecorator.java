public class BorderDecorator extends WindowDecorator {
    public BorderDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw() {
        super.draw();
        addBorder();
    }

    private void addBorder() {
        System.out.println("Adding border.");
    }
}