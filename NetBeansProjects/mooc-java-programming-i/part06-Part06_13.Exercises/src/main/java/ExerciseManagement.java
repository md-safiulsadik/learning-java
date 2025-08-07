import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {

    private List<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public List<Exercise> exerciseList() {
        return this.exercises;
    }

    public void add(String name, int parts) {
        this.exercises.add(new Exercise(name, parts));
    }

    public void markAsCompleted(String exerciseName) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName)) {
                exercise.incrementCompletedParts();
                return;
            }
        }
    }

    public boolean isCompleted(String exerciseName) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }
}