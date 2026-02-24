package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Server outage in computer lab", 1));
        issues.add(new Issue("Missing assignment submission", 3));
        issues.add(new Issue("Scholarship document delay", 2));
        issues.add(new Issue("Course registration conflict", 2));
        issues.add(new Issue("Transcript processing request", 4));
    }

    public void showMostUrgent() {
        if (issues.isEmpty()) {
            System.out.println("No emergency issues available.");
            return;
        }
        System.out.println("Most urgent issue: " + issues.peek());
    }

    public void resolveIssues() {
        for (int i = 0; i < 2; i++) {
            if (!issues.isEmpty()) {
                Issue resolved = issues.poll();
                System.out.println("Resolved: " + resolved);
            }
        }
    }

    public void printRemainingIssues() {
        if (issues.isEmpty()) {
            System.out.println("No remaining issues.");
            return;
        }

        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    } 

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
        System.out.println("Issue added successfully.");
    }
}
