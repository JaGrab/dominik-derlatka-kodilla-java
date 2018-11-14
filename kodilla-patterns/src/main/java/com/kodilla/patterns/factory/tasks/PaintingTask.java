package com.kodilla.patterns.factory.tasks;

public class PaintingTask extends TaskSimple {
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        super(taskName);
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String executeTask() {
        executed = true;
        return "Painted " + whatToPaint + " in " + color;
    }
}
