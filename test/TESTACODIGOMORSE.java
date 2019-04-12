import Morse.Morse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 

public class TESTACODIGOMORSE {
   private Morse morse;
   @BeforeClass
   public void inicializar(){
       morse=new Morse();
       
   } 
   
   @Test 
   public void testaSOS(){
        morse.setMensagem("SOS");
        assertEquals("*** --- ***",morse.codifica() ); 
   }
     @Test
     public void testaADRIANA(){
        morse.setMensagem("ADRIANA");
        assertEquals("*- -** *-* ** *- -* *-",morse.codifica());
      }
    public TESTACODIGOMORSE() {
    }


    }



