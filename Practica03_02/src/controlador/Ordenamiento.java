/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Casa;

/**
 *
 * @author User
 */
public class Ordenamiento<T> {

    int aux;

    public List<Casa> ordenarAscendenteBurbuja(List<Casa> l) {
        List<Casa> li = l;
        /*int i=0;
        for (Casa t : li.subList(0, 3)) {
        int e= t.getId();
        if (e>t.getId()) {
        Casa aux=l.get(i);
        l.get(0)=aux;
        
        }
        i++;
        }*/

        for (int i = 0; i < li.size(); i++) {
            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(i).getId() > li.get(j).getId()) {

                    //aux = v[i];
                    //v[i] = v[j];
                    //v[j] = aux;

                }
            }
        }  
        return li;

    }

}
