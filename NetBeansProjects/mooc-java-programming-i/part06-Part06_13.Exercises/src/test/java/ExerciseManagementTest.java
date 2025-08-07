import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement manager;

    @Before
    public void setUp() {
        manager = new ExerciseManagement();
    }

    @Test
    public void addingExercisesIncreasesListSize() {
        // Corrected: Added an integer argument
        manager.add("Exercise1", 5); 
        manager.add("Exercise2", 3);
        assertEquals(2, manager.exerciseList().size());
    }

    @Test
    public void markAsCompletedIncrementsCompletedParts() {
        // Corrected: Added an integer argument
        manager.add("Exercise1", 3); 
        assertFalse(manager.isCompleted("Exercise1"));
        
        manager.markAsCompleted("Exercise1"); // 1 of 3 parts completed
        assertFalse(manager.isCompleted("Exercise1"));
        
        manager.markAsCompleted("Exercise1"); // 2 of 3
        assertFalse(manager.isCompleted("Exercise1"));
        
        manager.markAsCompleted("Exercise1"); // 3 of 3 completed
        assertTrue(manager.isCompleted("Exercise1"));
    }

    @Test
    public void isCompletedReturnsFalseForUnknownExercise() {
        assertFalse(manager.isCompleted("NonExistentExercise"));
    }

    @Test
    public void doesNotExceedTotalParts() {
        // Corrected: Added an integer argument
        manager.add("Exercise1", 2); 
        manager.markAsCompleted("Exercise1");
        manager.markAsCompleted("Exercise1");
        manager.markAsCompleted("Exercise1"); // extra call should not increment beyond total parts

        assertTrue(manager.isCompleted("Exercise1"));
    }
}