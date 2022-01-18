/*
 *  Created by @DiasOrazbaev
 *  2022.01.18
 */
package org.organ.newproject;

/**
 *
 * @author serge
 */
public class Sheep extends Unit implements IBeEated{
    
    public Sheep(String name) {
        super(name);
    }
    
    public void eat(String food) {
        System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " eats " + food);
    }
}
