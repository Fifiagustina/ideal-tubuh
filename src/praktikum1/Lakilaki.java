/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fifi Agustina
 */
  public class Lakilaki extends Manusia {
    public Lakilaki(double TB){
        this.TinggiBadan=TB;
    }

    @Override
    public double htgbbi(){
        return((TinggiBadan - 100) - ((TinggiBadan - 100) * 10/100));
    }
}
