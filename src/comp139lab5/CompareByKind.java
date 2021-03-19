/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp139lab5;

import animals.*;
import java.util.Comparator;

/**
 *
 * @author willp
 */
public class CompareByKind<Animal> implements Comparator<Animal> {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int compare(Animal a, Animal b) {
        if (a instanceof Mammals && b instanceof Mammals) {
            return 0;
        } else if (a instanceof Mammals && b instanceof Reptiles) {
            return -1;
        } else {
            return 1;
        }
    }
}
