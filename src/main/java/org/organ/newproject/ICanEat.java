/*
 *  Created by @DiasOrazbaev
 *  2022.01.18
 */
package org.organ.newproject;

/**
 *
 * @author serge
 */
public interface ICanEat {
    default public void eat(Unit unit) {
        System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " eats " + unit.getClass().getSimpleName() + " " + unit.getName());
    }

    public String getName();
}
