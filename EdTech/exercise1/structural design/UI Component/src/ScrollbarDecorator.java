public class ScrollbarDecorator extends WindowDecorator {
    public ScrollbarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw() {
        super.draw();
        addScrollbar();
    }

    private void addScrollbar() {
        System.out.println("Adding scrollbar.");
    }
}
