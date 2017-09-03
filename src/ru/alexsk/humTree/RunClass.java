package ru.alexsk.humTree;

import java.util.*;

public class RunClass {

  public static void main (String [] arg) {
      List<Human> humans = new ArrayList<>();
      humans.add(new Human(2,1,"asdasd", "asdasd"));
      humans.add(new Human(3,1,"asdasd", "asdasd"));
      humans.add(new Human(4,1,"asdasd", "asdasd"));
      humans.add(new Human(5,4,"asdasd", "asdasd"));
      humans.add(new Human(6,4,"asdasd", "asdasd"));
      humans.add(new Human(7,6,"asdas", "asdasd"));
      humans.add(new Human(8,6,"asdasd", "asdasd"));
      humans.add(new Human(9,6,"asdasd", "asdasd"));
      humans.add(new Human(10,5,"asdasd", "asdasd"));
      humans.add(new Human(11,5,"asdasd", "asdasd"));
      humans.add(new Human(1,null,"asdas", "asdasd"));
      buildTree(humans);
  }

  public static Human buildTree (List<Human> list) {

      Map<Integer,List<Human>> splitArray = new HashMap<>();
      for (Human human : list) {
          List<Human> humanList= splitArray.get(human.get_parent_id());
          if (humanList == null) {
              List<Human> temp = new ArrayList<>();
              if (temp.add(human)) splitArray.put(human.get_parent_id(),temp);
          } else {
              humanList.add(human);
          }
      }

      for (Human human: list) {
          human.setChilds(splitArray.get(human.get_id()));
      }

      return splitArray.get(null).get(0);
  }

}
