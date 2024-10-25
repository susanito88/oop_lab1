package lab1.task3;

import lab1.task1.Display;
import java.util.ArrayList;
import java.util.List;

public class Assistant {
     private String assistantName;
     private List<Display> assignedDisplays;

     public Assistant(String name) {
          this.assistantName = name;
          this.assignedDisplays = new ArrayList<>();
     }

     public void assignDisplay(Display d) {
          assignedDisplays.add(d);
          System.out.println("Assigned display: " + d);
     }

     public void assist() {
          if (assignedDisplays.size() < 2) {
               System.out.println("Need at least two displays to compare.");
               return;
          }
          System.out.println("Assisting with display comparison...");

          for (int i = 0; i < assignedDisplays.size() - 1; i++) {
               Display currentDisplay = assignedDisplays.get(i);

               for (int j = i + 1; j < assignedDisplays.size(); j++) {
                    Display nextDisplay = assignedDisplays.get(j);
                    System.out.println("\nComparing " + currentDisplay + " with " + nextDisplay);
                    currentDisplay.compareWithMonitor(nextDisplay);
               }
          }
     }


     public Display buyDisplay(Display d) {
          System.out.println("I want to purchase display " + d);
          if (assignedDisplays.remove(d)) {
               System.out.println("Purchased display: " + d);
               return d;
          } else {
               System.out.println("Display not found, already sold.");
               return null;
          }
     }
}
