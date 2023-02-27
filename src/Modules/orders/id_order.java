package Modules.orders;

import java.util.Comparator;

import Modules.Design.Clases.Service;

public class id_order implements Comparator <Service> {

    public int compare (Service s1, Service s2) {

        if(s1.getId().compareTo(s2.getId())>0)

            return 1;

        else if(s1.getId().compareTo(s2.getId())<0)

            return -1;

        return 0;

    }    

}
