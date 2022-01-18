/*
 *  Created by @DiasOrazbaev
 *  2022.01.18
 */
package org.organ.newproject;

/**
 *
 * @author serge
 */
public interface IBeEated extends ICanEat{
    default public void beEaten(Unit unit) {
        System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " was eaten by " + unit.getClass().getSimpleName() + " " + unit.getName());
        System.out.println(unit.getClass().getSimpleName() + " " + unit.getName() + " eats " + this.getClass().getSimpleName() + " " + this.getName());
    }
    
    public String getName();
}
