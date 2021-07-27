/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PizzaDao;
import java.util.ArrayList;
import java.util.List;
import model.Sabor;

/**
 *
 * @author Alethor
 */
public class PizzaController {
    
    public List<String> findFormas(){
        
        PizzaDao pDao = new PizzaDao();
        List<String> formas = new ArrayList<String>();
        
        formas = pDao.findFormas();
        return formas;

    }
    
    public List<Sabor> findSabores(){
         PizzaDao pDao = new PizzaDao();
         List<Sabor> sabores = new ArrayList<Sabor>();
         
         sabores = pDao.findSabores();
         return sabores;
         
    }
}