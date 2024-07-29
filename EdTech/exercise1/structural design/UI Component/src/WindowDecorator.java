public abstract class WindowDecorator implements Window {
    protected Window decoratedWindow;

    public WindowDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    public void draw() {
        decoratedWindow.draw();
    }
}
