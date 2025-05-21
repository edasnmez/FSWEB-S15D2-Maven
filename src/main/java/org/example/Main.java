package org.example;
import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Task t1 = new Task("ProjA", "Login ekranı", "Ann", Priority.HIGH, Status.ASSIGNED);
        Task t2 = new Task("ProjA", "Login ekranı", "Bob", Priority.HIGH, Status.ASSIGNED);
        Task t3 = new Task("ProjB", "Database optimizasyonu", "Carol", Priority.MED, Status.IN_PROGRESS);
        Task t4 = new Task("ProjC", "UI tasarımı", null, Priority.LOW, Status.IN_QUEUE);
        Task t5 = new Task("ProjD", "API geliştirme", "Bob", Priority.HIGH, Status.IN_PROGRESS);

        Set<Task> ann = new HashSet<>(Set.of(t1));
        Set<Task> bob = new HashSet<>(Set.of(t2, t5));
        Set<Task> carol = new HashSet<>(Set.of(t3));
        Set<Task> unassigned = new HashSet<>(Set.of(t4));

        TaskData taskData = new TaskData(ann, bob, carol, unassigned);

        System.out.println("Tüm çalışanların task'ları:");
        taskData.getTasks("all").forEach(System.out::println);

        System.out.println("\nAnn'in task'ları:");
        taskData.getTasks("ann").forEach(System.out::println);

        System.out.println("\nUnassigned task'lar:");
        taskData.getUnassignedTasks().forEach(System.out::println);

        System.out.println("\nBirden fazla kişiye atanmış task'lar:");
        taskData.getCommonTasksAssignedToMultiple().forEach(System.out::println);
    }
}