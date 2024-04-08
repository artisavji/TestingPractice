package Generic;

import javax.lang.model.element.Name;

// Assignment Of Generic
public class StudentClass {
    private  String name;
    private int mark;

    public StudentClass(String name_,int mark)
    {
     this.name=name_;
     this.mark=mark;

    }
    public String getName()
    {
        return "Name: " + name + ", mark: " + mark;
    }
}