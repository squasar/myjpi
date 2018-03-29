/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.observer;

/**
 *
 * @author Suleyman
 */
public interface Gazete {
    
    void aboneEkle(Abone abone);
    void aboneSil(Abone abone);
    void gazeteGonder();
}