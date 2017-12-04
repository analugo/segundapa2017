/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author Ana Godínez
 */
public class FavList implements FavoriteList{
    
    private int Favorites,access;
    
    
    public FavList(int Favorites, int access){
        
        super();
        this.Favorites = Favorites;
        this.access = access;
    }
        
    public int getAcces(){
        int e;
        //return e;
        return 0;
    }
        
      
    
    
    
    
    
    @Override
    public void access(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable getFavorites(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
