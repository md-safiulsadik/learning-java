public class Exercise {
    private String name;
    private int parts;
    private int completedParts;

    public Exercise(String name, int parts) {
        this.name = name;
        this.parts = parts;
        this.completedParts = 0;
    }

    public String getName() {
        return this.name;
    }

    public void incrementCompletedParts() {
        if (this.completedParts < this.parts) {
            this.completedParts++;
        }
    }

    public boolean isCompleted() {
        return this.completedParts == this.parts;
    }
}