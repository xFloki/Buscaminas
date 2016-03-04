
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Boton extends JButton {
    private int mina = 0 ;
    int x;
    int y;
    private int numeroMinasAlrededor;
    public Boton (int _x, int _y){
        this.x=_x;
        this.y=_y;
    }

    public int getMina() {
        return mina;
    }

    public void setMina(int mina) {
        this.mina = mina;
    }

    public int getNumeroMinasAlrededor() {
        return numeroMinasAlrededor;
    }

    public void setNumeroMinasAlrededor(int numeroMinasAlrededor) {
        this.numeroMinasAlrededor = numeroMinasAlrededor;
    }
    

    
   
           
}
