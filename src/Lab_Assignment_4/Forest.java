package Lab_Assignment_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Forest {
    private String name;
    private String county;
    private ArrayList<Tree> trees;

    public Forest(String name, String county) {
        this.name = name;
        this.county = county;
        this.trees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public ArrayList<Tree> getTrees() {
        return trees;
    }

    public void setTrees(ArrayList<Tree> trees) {
        this.trees = trees;
    }

    public void AddTree(Tree t) {
        //Adds Tree T to ArrayList.
        trees.add(t);
    }

    public void FindTree(Tree t) {
        if (trees.contains(t)){
            t.Print();
        }else {
            System.out.println("An "+t.getName()+" tree is not found");
        }
    }

    public void RemoveFruitfulTrees() {
        Iterator<Tree> itrTree = trees.iterator();
        Tree t;
        while (itrTree.hasNext()){
             {     // The Original Approach, this causes an "Exception in thread "main" ".
                    // Uncomment this block and comment the below in order to run.
            t= itrTree.next();
            if (t.isFruitful()){
                itrTree.remove();
            }
            }

           /* if (itrTree.next().isFruitful() ){ // A different approach that works
                trees.removeIf(Tree::isFruitful);
            }*/
        }
    }
}
