/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppalparrafo;

/**
 *
 * @author jdavi
 */
public class Parrafo {
    
   private String texto, buscar;
   private int cont,cont2,cont3;
    
   
   public Parrafo(){
      
   }
   
   public Parrafo(String a, String b){    
       this.texto = a;
       this.buscar = b;
   }
   
   public String getParrafo(){
     return this.texto;   
   }
   
   public void setParrafo(String a){
       
       this.texto = a;
   }
   
   public String getbuscar(){
     return this.buscar;   
   }
   
   public void setbuscar(String b){
       
       this.buscar = b;
   }
   
   
   public int nvocales(){
        for(int x=0;x<this.texto.length();x++) {
       if ((this.texto.charAt(x)=='a') || (this.texto.charAt(x)=='e') || (this.texto.charAt(x)=='i') 
         || (this.texto.charAt(x)=='o') || (this.texto.charAt(x)=='u')){
           
            this.cont++;
           }
       }
       return this.cont;
    }
  public int nconsonantes(){
        for(int x=0;x<this.texto.length();x++) {
       if ((this.texto.charAt(x)=='b') || (this.texto.charAt(x)=='c') || (this.texto.charAt(x)=='d') 
         || (this.texto.charAt(x)=='f') || (this.texto.charAt(x)=='g') || (this.texto.charAt(x)=='h')
                || (this.texto.charAt(x)=='j') || (this.texto.charAt(x)=='k') || (this.texto.charAt(x)=='l')
                || (this.texto.charAt(x)=='m') || (this.texto.charAt(x)=='n') || (this.texto.charAt(x)=='ñ') 
                || (this.texto.charAt(x)=='p') || (this.texto.charAt(x)=='q') || (this.texto.charAt(x)=='r') 
                || (this.texto.charAt(x)=='s') || (this.texto.charAt(x)=='t') || (this.texto.charAt(x)=='v') 
                || (this.texto.charAt(x)=='w') || (this.texto.charAt(x)=='x') || (this.texto.charAt(x)=='x') 
               || (this.texto.charAt(x)=='y') || (this.texto.charAt(x)=='z')){
           
            this.cont2++;
           }
       }
       return this.cont2;
    }
  
  public int nsimbolos(){
        for(int x=0;x<this.texto.length();x++) {
       if ((this.texto.charAt(x) !='a') && (this.texto.charAt(x)!='e') && (this.texto.charAt(x)!='i') 
                && (this.texto.charAt(x)!='o') && (this.texto.charAt(x)!='u')&&(this.texto.charAt(x)!='b') 
                && (this.texto.charAt(x)!='c') && (this.texto.charAt(x)!='d') 
                && (this.texto.charAt(x)!='f') && (this.texto.charAt(x)!='g') && (this.texto.charAt(x)!='h')
                && (this.texto.charAt(x)!='j') && (this.texto.charAt(x)!='k') && (this.texto.charAt(x)!='l')
                && (this.texto.charAt(x)!='m') && (this.texto.charAt(x)!='n') && (this.texto.charAt(x)!='ñ') 
                && (this.texto.charAt(x)!='p') && (this.texto.charAt(x)!='q') && (this.texto.charAt(x)!='r') 
                && (this.texto.charAt(x)!='s') && (this.texto.charAt(x)!='t') && (this.texto.charAt(x)!='v') 
                && (this.texto.charAt(x)!='w') && (this.texto.charAt(x)!='x') && (this.texto.charAt(x)!='x') 
                && (this.texto.charAt(x)!='y') && (this.texto.charAt(x)!='z') && (this.texto.charAt(x)!=' ')){
           
            this.cont3++;
           }
       }
       return this.cont3;
    }
  
   public int palabra(){
      this.cont = 0;
       while (this.texto.indexOf(this.buscar) > -1) {
      this.texto = this.texto.substring(this.texto.indexOf(this.buscar)+this.buscar.length(),this.texto.length());
      this.cont++; 
}
      
      return this.cont;
}
    
    }
   
   
   



