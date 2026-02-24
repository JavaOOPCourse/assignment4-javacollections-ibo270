[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/DPi9QhIt)


==================================================
🇬🇧 ENGLISH VERSION (FULL ORIGINAL)
==================================================

Complex Assignment: Smart University Service System

Scenario

You are developing a University Student Service System that manages:

• Student requests  
• Urgent academic issues  
• Recently performed actions  

The system must simulate how real student services work using:

✅ ArrayList  
✅ LinkedList  
✅ PriorityQueue  
✅ ArrayDeque  

Functional Requirements

1️⃣ Student Database — ArrayList

Create a class:

class Student {

    int id;
    String name;
    double gpa;

}

Tasks

• Store students in an ArrayList<Student>  
• Add at least 5 students  
• Remove students with GPA < 2.0  
• Find and print the student with the highest GPA  
• Insert a new student at index 2  
• Print all students using an iterator  

2️⃣ Daily Appointment Queue — LinkedList

Students book advisor meetings.

Use:

LinkedList<String> appointments  

Tasks

• Add 3 normal appointments  
• Add 1 urgent appointment at the beginning  
• Cancel the last appointment  
• Show:
  o First appointment  
  o Last appointment  
• Traverse using Iterator  

3️⃣ Emergency Academic Issues — PriorityQueue

Create:

class Issue implements Comparable<Issue> {

    String description;
    int urgencyLevel; // 1 = most urgent

}

Use:

PriorityQueue<Issue>

Tasks

• Add at least 5 issues  
• Show the most urgent issue  
• Resolve (remove) 2 issues  
• Print remaining issues using iterator  

4️⃣ Student Action History — ArrayDeque

Track recent actions like:

• "Submitted Assignment"  
• "Dropped Course"  
• "Registered Course"  
• "Updated Profile"  

Use:

ArrayDeque<String> actions  

Tasks

• Add 4 actions  
• Undo last action  
• Add new action: "Requested Transcript"  
• Show:
  o First action  
  o Last action  
• Iterate through history  

⭐ Final Integration Task

Create a menu-driven system:

1. Show Students  
2. Show Appointments  
3. Show Emergency Issues  
4. Show Action History  
5. Add New Issue  
6. Undo Action  
7. Exit  

Use appropriate data structures for each option.
