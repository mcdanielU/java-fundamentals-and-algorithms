package Collection;
import java.util.*;

public class SetMegaDemo {
    public static void main(String[] args) {
        System.out.println("=== BASIC SET DEMO ===");

        List<String> features = Arrays.asList(
                "A I", "Voice Notes", "Summarization", "Reminders", "AI", "Voice Notes", "Memory Recall"
        );

        // HashSet: Unordered
        Set<String> hashSet = new HashSet<>(features);
        System.out.println("HashSet (no order): " + hashSet);

        // LinkedHashSet: Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>(features);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        // TreeSet: Sorted order
        Set<String> treeSet = new TreeSet<>(features);
        System.out.println("TreeSet (sorted order): " + treeSet);

        System.out.println("\n=== CUSTOM OBJECTS IN TREESET ===");

        Set<ChimeTask> taskSet = new TreeSet<>(Comparator.comparingInt(ChimeTask::getPriority));
        taskSet.add(new ChimeTask("Transcribe Meeting", 3));
        taskSet.add(new ChimeTask("Summarize Notes", 2));
        taskSet.add(new ChimeTask("Generate Mind Map", 4));
        taskSet.add(new ChimeTask("Summarize Notes", 2)); // Duplicate priority & task name

        for (ChimeTask task : taskSet) {
            System.out.println(task);
        }

        // Optional: Change comparator to sort by name
        System.out.println("\nSorted by task name:");
        Set<ChimeTask> taskByName = new TreeSet<>(Comparator.comparing(ChimeTask::getName));
        taskByName.addAll(taskSet);
        for (ChimeTask task : taskByName) {
            System.out.println(task);
        }
        System.out.println(taskSet.size());
    }
}

// Custom class representing a ChimeVox task
class ChimeTask {
    private final String name;
    private final int priority;

    public ChimeTask(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }

    // Needed if you want to use TreeSet without custom Comparator
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChimeTask)) return false;
        ChimeTask task = (ChimeTask) o;
        return priority == task.priority && Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }
}