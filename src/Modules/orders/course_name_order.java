package Modules.orders;

import java.util.Comparator;

import Modules.Design.Clases.Service;

public class course_name_order implements Comparator <Service> {

    public int compare (Service s1, Service s2) {
    
        if(s1.getCourse_name().compareTo(s2.getCourse_name())>0)
    
            return 1;
    
        else if(s1.getCourse_name().compareTo(s2.getCourse_name())<0)
    
            return -1;
    
        return 0;
    
    }    
    
}
